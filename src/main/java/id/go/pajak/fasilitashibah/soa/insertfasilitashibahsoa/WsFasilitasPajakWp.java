
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ws_fasilitasPajakWp", targetNamespace = "http://soa.pajak.go.id/sca/soapservice/DjpOnline/comp_fasilitiasPajak/ws_fasilitasPajakWp", wsdlLocation = "http://10.254.214.193/konfirmasi/fasilitasPajakWp?wsdl")
public class WsFasilitasPajakWp
    extends Service
{

    private final static URL WSFASILITASPAJAKWP_WSDL_LOCATION;
    private final static WebServiceException WSFASILITASPAJAKWP_EXCEPTION;
    private final static QName WSFASILITASPAJAKWP_QNAME = new QName("http://soa.pajak.go.id/sca/soapservice/DjpOnline/comp_fasilitiasPajak/ws_fasilitasPajakWp", "ws_fasilitasPajakWp");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.254.214.193/konfirmasi/fasilitasPajakWp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSFASILITASPAJAKWP_WSDL_LOCATION = url;
        WSFASILITASPAJAKWP_EXCEPTION = e;
    }

    public WsFasilitasPajakWp() {
        super(__getWsdlLocation(), WSFASILITASPAJAKWP_QNAME);
    }

    public WsFasilitasPajakWp(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSFASILITASPAJAKWP_QNAME, features);
    }

    public WsFasilitasPajakWp(URL wsdlLocation) {
        super(wsdlLocation, WSFASILITASPAJAKWP_QNAME);
    }

    public WsFasilitasPajakWp(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSFASILITASPAJAKWP_QNAME, features);
    }

    public WsFasilitasPajakWp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsFasilitasPajakWp(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FasilitasPajakWpPtt
     */
    @WebEndpoint(name = "fasilitasPajakWp_pt")
    public FasilitasPajakWpPtt getFasilitasPajakWpPt() {
        return super.getPort(new QName("http://soa.pajak.go.id/sca/soapservice/DjpOnline/comp_fasilitiasPajak/ws_fasilitasPajakWp", "fasilitasPajakWp_pt"), FasilitasPajakWpPtt.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FasilitasPajakWpPtt
     */
    @WebEndpoint(name = "fasilitasPajakWp_pt")
    public FasilitasPajakWpPtt getFasilitasPajakWpPt(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa.pajak.go.id/sca/soapservice/DjpOnline/comp_fasilitiasPajak/ws_fasilitasPajakWp", "fasilitasPajakWp_pt"), FasilitasPajakWpPtt.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSFASILITASPAJAKWP_EXCEPTION!= null) {
            throw WSFASILITASPAJAKWP_EXCEPTION;
        }
        return WSFASILITASPAJAKWP_WSDL_LOCATION;
    }

}