//package id.go.pajak.fasilitashibah.auth.sso;
//
//import id.go.pajak.fasilitashibah.config.AuthProperties;
//import lombok.AllArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//@AllArgsConstructor
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class Oauth2SecurityConfig {
//    private final AuthProperties authProperties;
//
//    @Bean
//    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/assets/**").permitAll()
//                .antMatchers("/err/**").permitAll()
//                .antMatchers("/auth/cek").permitAll()
//                .antMatchers("/auth/logout").permitAll()
//                .antMatchers("/").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login()
//                .loginPage("/auth/login")
//                .permitAll()
//                .and()
//                .logout()
//                .invalidateHttpSession(true)
//                .deleteCookies("JSESSIONID")
//                .clearAuthentication(true)
//                .logoutUrl("/auth/logout")
//                .logoutSuccessUrl("/auth/login?logout")
//                .permitAll()
//                .and()
//                .exceptionHandling();
////                .accessDeniedHandler(new CustomAccessDeniedHandler())
////                .accessDeniedPage("/err/403")
////                .authenticationEntryPoint(new CustomAuthenticationEntryPoint());
//
//        http.headers().frameOptions().sameOrigin();
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
//
//        http.securityContext(securityContext ->
//                securityContext.securityContextRepository(new HttpSessionSecurityContextRepository())
//        );
//        return http.build();
//    }
//
//
//        @Bean
//        public ClientRegistrationRepository clientRegistrationRepository() {
//            ClientRegistration djpconnect = ClientRegistration.withRegistrationId("djponline")
//                    .clientId(authProperties.getClientId())
//                    .clientSecret(authProperties.getClientSecret())
//                    .authorizationUri(authProperties.getAuthEndpoint())
//                    .tokenUri(authProperties.getTokenEndpoint())
//                    .redirectUri(authProperties.getRedirectUri())
//                    .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                    .scope("read", "write")
//                    .build();
//            return new InMemoryClientRegistrationRepository(djpconnect);
//        }
//
//
//}
