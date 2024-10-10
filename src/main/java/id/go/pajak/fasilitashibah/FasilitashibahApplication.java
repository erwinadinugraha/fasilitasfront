package id.go.pajak.fasilitashibah;

import id.go.pajak.fasilitashibah.config.AuthProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.Resource;

@SpringBootApplication
@EnableConfigurationProperties({AuthProperties.class})
public class FasilitashibahApplication {

    @Resource
    AuthProperties authProperties;

    public static void main(String[] args) {
        SpringApplication.run(FasilitashibahApplication.class, args);
    }

}
