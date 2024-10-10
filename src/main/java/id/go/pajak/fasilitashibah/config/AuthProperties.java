package id.go.pajak.fasilitashibah.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "auth")
@Data
public class AuthProperties {
    private String authEndpoint;
    private String tokenEndpoint;
    private String checkTokenEndpoint;
    private String logoutUri;
    private String apphost;
    private String redirectUri;
    private String resourceId;
    private String clientId;
    private String clientSecret;
    private String sso;
    private String account;

}
