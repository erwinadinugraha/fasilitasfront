package id.go.pajak.fasilitashibah.soa;


import id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa.ObjectFactory;
import id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa.ReqInsertFasilitasType;
import id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa.ResGetBpeColl;
import id.go.pajak.fasilitashibah.util.exception.CustomValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBElement;

@Component
public class SoaService {

    private final WebServiceTemplate webServiceTemplate;
    private final ObjectFactory objectFactory = new ObjectFactory();


    @Value("${soa.fasilitaspajak.url}")
    private String WSDL_URL;

    @Autowired
    public SoaService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }


    /**
     * Get data by NPWP 15 soa service
     *
     * @param npwp
     * @return DataLoginWpType
     */
//    public DataLoginWpType getDataByNpwp15(String npwp) {
//        JAXBElement<DataLoginWpInputType> request = objectFactoryDataLogin.createReqDataLoginWp(new DataLoginWpInputType(npwp));
//        JAXBElement<DataLoginWpOutputType> response = (JAXBElement<DataLoginWpOutputType>) webServiceTemplate.marshalSendAndReceive(prop.getWsdlNpwp16(), request);
//
//        if (response.getValue().getKodeStatus().equals("0")) {
//            throw new CustomValidationException(HttpStatus.NOT_FOUND, CommonUtils.FAILED_CODE, response.getValue().getStatus());
//        }
//        return response.getValue().getDataLoginWp();
//
//    }


    /**
     * Get data BPS Ganti Batal Fasilitasi NPWP soa service
     *
     * @param ReqInsertGantiBatalFasilitasType
     * @return ResInsertGantiBatalFasilitasColl
     */
//    public ResInsertGantiBatalFasilitasColl insertGantiBatalFasilitas(ReqInsertGantiBatalFasilitasType req) {
//
//        JAXBElement<ReqInsertGantiBatalFasilitasType> request = objectFactoryGantiBatal.createReqInsertGantiBatalFasilitas(req);
//        JAXBElement<ResInsertGantiBatalFasilitasColl> response = (JAXBElement<ResInsertGantiBatalFasilitasColl>) webServiceTemplate.marshalSendAndReceive(prop.getWsdlGantiBatalFasilitas(), request);
//
//        if (response.getValue().getKdStatus().equals("0")) {
//            throw new CustomValidationException(HttpStatus.NOT_FOUND, CommonUtils.FAILED_CODE, response.getValue().getKetStatus());
//        }
//
//        return response.getValue();
//
//    }

        public Object getBpe(ReqInsertFasilitasType req) {

            JAXBElement<ReqInsertFasilitasType> request = objectFactory.createReqInsertFasilitas(req);
            JAXBElement<ResGetBpeColl> response = (JAXBElement<ResGetBpeColl>) webServiceTemplate.marshalSendAndReceive(WSDL_URL, request);

//            if (response.getValue().getKdStatus().equals("0")) {
//                throw new CustomValidationException(HttpStatus.NOT_FOUND, "0", response.getValue().getKetStatus());
//            }
            return response.getValue();
        }


}
