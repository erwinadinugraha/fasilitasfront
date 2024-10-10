/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.go.pajak.fasilitashibah.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Properties;

@Configuration
public class AppConfig {


    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(10000);
        factory.setReadTimeout(10000);
        return new RestTemplate(factory);
    }

//    @Bean
//    public DefaultKaptcha getCaptchaProducer() {
//        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
//        Properties prop = new Properties();
//        prop.setProperty("kaptcha.border", "yes");
//        prop.setProperty("kaptcha.border.color", "105,179,90");
//        prop.setProperty("kaptcha.textproducer.font.color", "red");
//        prop.setProperty("kaptcha.image.width", "130");
//        prop.setProperty("kaptcha.textproducer.font.size", "35");
//        prop.setProperty("kaptcha.image.height", "50");
//        prop.setProperty("kaptcha.session.key", "code");
//        prop.setProperty("kaptcha.textproducer.char.length", "4");
//        prop.setProperty("kaptcha.textproducer.font.names", "Arial, Arial, Microsoft Accor");
//        Config config = new Config(prop);
//        defaultKaptcha.setConfig(config);
//        return defaultKaptcha;
//    }
}
