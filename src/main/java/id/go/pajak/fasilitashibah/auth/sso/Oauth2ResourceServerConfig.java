package id.go.pajak.fasilitashibah.auth.sso;

import id.go.pajak.fasilitashibah.auth.AuthService;
import id.go.pajak.fasilitashibah.config.AuthProperties;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;
import org.springframework.security.web.AuthenticationEntryPoint;

@Configuration
@EnableResourceServer
@AllArgsConstructor
public class Oauth2ResourceServerConfig extends ResourceServerConfigurerAdapter {


    private final AuthProperties authProperties;
    private final AuthService authService;

    @Bean
    public AuthenticationEntryPoint oauthAuthenticationEntryPoint() {
        return new OAuth2AuthenticationEntryPoint();
    }

    @Bean
    public AuthenticationEntryPoint clientAuthenticationEntryPoint() {
        OAuth2AuthenticationEntryPoint auth = new OAuth2AuthenticationEntryPoint();
        auth.setRealmName("springsec/client");
        auth.setTypeName("Basic");
        return auth;
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resource) {
        resource.resourceId(authProperties.getResourceId()).tokenServices(authService);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/assets/**").permitAll()
                .antMatchers("/err/**").permitAll()
                .antMatchers("/").permitAll()
                .and().exceptionHandling();
//                .accessDeniedHandler(new CustomAccessDeniedHandler())
//                .accessDeniedPage("/err/403")
//                .authenticationEntryPoint(new CustomAuthenticationEntryPoint());

        http.headers().frameOptions().sameOrigin();
        http.sessionManagement()
                .sessionFixation().none();
    }
}
