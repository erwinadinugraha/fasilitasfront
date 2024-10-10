package id.go.pajak.fasilitashibah.auth;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import id.go.pajak.fasilitashibah.auth.sso.CustomAccessTokenConverter;
import id.go.pajak.fasilitashibah.config.AuthProperties;
import id.go.pajak.fasilitashibah.domain.dto.UserAuth;
import id.go.pajak.fasilitashibah.domain.dto.UserData;
import id.go.pajak.fasilitashibah.util.CommonUtil;
import lombok.AllArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
public class AuthService implements ResourceServerTokenServices {

    private final AuthProperties authProperties;
    private final CommonUtil common;

    @Override
    public OAuth2Authentication loadAuthentication(String accessToken) throws AuthenticationException, InvalidTokenException {
        AccessTokenConverter tokenConverter = new CustomAccessTokenConverter();
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("token", accessToken);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", getAuthorizationHeader(authProperties.getClientId(), authProperties.getClientSecret()));
        Map<String, Object> map = postForMap(authProperties.getCheckTokenEndpoint(), formData, headers);

        if (map.containsKey("error")) {
            System.out.println("load_authentication returned error: " + map.get("error"));
            throw new InvalidTokenException(accessToken);
        }

        Assert.state(map.containsKey("client_id"), "Client id must be present in response from auth server");

        //set security context
        OAuth2Authentication authentication = tokenConverter.extractAuthentication(map);
        Gson gson = new Gson();
        JsonObject jsonObject = common.objectToJson(authentication.getDetails());
        UserData userData = gson.fromJson(jsonObject, UserData.class);


        Map<String, Object> userAttributes = new HashMap<>();
        userAttributes.put("username", userData.getUsername());
        userAttributes.put("npwp", userData.getNpwp16());

        OAuth2User oAuth2User = new DefaultOAuth2User(authentication.getAuthorities(), userAttributes, "username");
        OAuth2AuthenticationToken auth = new OAuth2AuthenticationToken(oAuth2User, authentication.getAuthorities(), authProperties.getClientId());
        SecurityContextHolder.getContext().setAuthentication(auth);
        //set security context

        return authentication;
    }

    @Override
    public OAuth2AccessToken readAccessToken(String accessToken) {
        throw new UnsupportedOperationException("Not supported: read access token");
    }

    public UserAuth getToken(String code) throws AuthenticationException, InvalidTokenException {
        RestTemplate restTemplate = new RestTemplate();

        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("grant_type", "authorization_code");
        formData.add("code", code);
        formData.add("redirect_uri", authProperties.getRedirectUri());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.set("Authorization", getAuthorizationHeader(authProperties.getClientId(), authProperties.getClientSecret()));
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(formData, headers);
        return restTemplate.exchange(authProperties.getTokenEndpoint(), HttpMethod.POST, request, UserAuth.class).getBody();
    }


    private String getAuthorizationHeader(String clientId, String clientSecret) {
        String creds = String.format("%s:%s", clientId, clientSecret);
        try {
            return "Basic " + new String(Base64.encode(creds.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Could not convert String");
        }
    }

    private Map<String, Object> postForMap(String path, MultiValueMap<String, String> formData, HttpHeaders headers) {
        RestTemplate restTemplate = new RestTemplate();

        if (headers.getContentType() == null) {
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        }
        @SuppressWarnings("rawtypes")
        Map map = restTemplate.exchange(path, HttpMethod.POST, new HttpEntity<>(formData, headers), Map.class)
                .getBody();
        @SuppressWarnings("unchecked")
        Map<String, Object> result = map;
        return result;
    }


}
