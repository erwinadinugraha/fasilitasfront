package id.go.pajak.fasilitashibah.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa.ObjectFactory;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // Set the root class of the generated SOAP classes
        marshaller.setClassesToBeBound(ObjectFactory.class);
        // Set the package where your generated SOAP classes are located
//        marshaller.setContextPath("pajak.go.id.fasilitasgantibatal.util.soa.dataloginwp");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        return webServiceTemplate;
    }

}
