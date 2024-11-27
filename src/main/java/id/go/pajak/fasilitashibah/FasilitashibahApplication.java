package id.go.pajak.fasilitashibah;

import id.go.pajak.fasilitashibah.config.AuthProperties;
import id.go.pajak.fasilitashibah.soa.SoaService;
import id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa.ReqInsertFasilitasType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.Resource;
import java.time.LocalDate;

@SpringBootApplication
@EnableConfigurationProperties({AuthProperties.class})
public class FasilitashibahApplication {

    @Resource
    AuthProperties authProperties;

    @Autowired
    SoaService soaService;

    public static void main(String[] args) {

        SpringApplication.run(FasilitashibahApplication.class, args);


    }

}
