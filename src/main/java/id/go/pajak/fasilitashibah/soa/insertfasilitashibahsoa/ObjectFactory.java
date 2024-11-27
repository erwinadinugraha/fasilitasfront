
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the id.go.pajak.fasilitashibah.soa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReqGetBpe_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "req_getBpe");
    private final static QName _ResGetBpe_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "res_getBpe");
    private final static QName _ReqInsertFasilitas_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "req_insertFasilitas");
    private final static QName _ReqGetProdukHukumFasilitasCM_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "req_getProdukHukumFasilitasCM");
    private final static QName _ResMonitoringPermohonanWp_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "res_monitoringPermohonanWp");
    private final static QName _ResGetProdukHukumFasilitasCM_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "res_getProdukHukumFasilitasCM");
    private final static QName _ReqMonitoringPermohonanWp_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "req_monitoringPermohonanWp");
    private final static QName _ResInsertFasilitas_QNAME = new QName("http://soa.pajak.go.id/DjpOnline/fasilitasPajak", "res_insertFasilitas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: id.go.pajak.fasilitashibah.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReqGetBpeType }
     * 
     */
    public ReqGetBpeType createReqGetBpeType() {
        return new ReqGetBpeType();
    }

    /**
     * Create an instance of {@link ResGetBpeColl }
     * 
     */
    public ResGetBpeColl createResGetBpeColl() {
        return new ResGetBpeColl();
    }

    /**
     * Create an instance of {@link ReqInsertFasilitasType }
     * 
     */
    public ReqInsertFasilitasType createReqInsertFasilitasType() {
        return new ReqInsertFasilitasType();
    }

    /**
     * Create an instance of {@link ReqGetProdukHukumFasilitasCMType }
     * 
     */
    public ReqGetProdukHukumFasilitasCMType createReqGetProdukHukumFasilitasCMType() {
        return new ReqGetProdukHukumFasilitasCMType();
    }

    /**
     * Create an instance of {@link ResMonitoringPermohonanWpColl }
     * 
     */
    public ResMonitoringPermohonanWpColl createResMonitoringPermohonanWpColl() {
        return new ResMonitoringPermohonanWpColl();
    }

    /**
     * Create an instance of {@link ResGetProdukHukumFasilitasCMColl }
     * 
     */
    public ResGetProdukHukumFasilitasCMColl createResGetProdukHukumFasilitasCMColl() {
        return new ResGetProdukHukumFasilitasCMColl();
    }

    /**
     * Create an instance of {@link ReqMonitoringPermohonanWp }
     * 
     */
    public ReqMonitoringPermohonanWp createReqMonitoringPermohonanWp() {
        return new ReqMonitoringPermohonanWp();
    }

    /**
     * Create an instance of {@link ResInsertFasilitasColl }
     * 
     */
    public ResInsertFasilitasColl createResInsertFasilitasColl() {
        return new ResInsertFasilitasColl();
    }

    /**
     * Create an instance of {@link ResInsertFasilitasType }
     * 
     */
    public ResInsertFasilitasType createResInsertFasilitasType() {
        return new ResInsertFasilitasType();
    }

    /**
     * Create an instance of {@link ResMonitoringPermohonanWp }
     * 
     */
    public ResMonitoringPermohonanWp createResMonitoringPermohonanWp() {
        return new ResMonitoringPermohonanWp();
    }

    /**
     * Create an instance of {@link ResGetProdukHukumFasilitasCMType }
     * 
     */
    public ResGetProdukHukumFasilitasCMType createResGetProdukHukumFasilitasCMType() {
        return new ResGetProdukHukumFasilitasCMType();
    }

    /**
     * Create an instance of {@link ResGetBpeType }
     * 
     */
    public ResGetBpeType createResGetBpeType() {
        return new ResGetBpeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqGetBpeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "req_getBpe")
    public JAXBElement<ReqGetBpeType> createReqGetBpe(ReqGetBpeType value) {
        return new JAXBElement<ReqGetBpeType>(_ReqGetBpe_QNAME, ReqGetBpeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResGetBpeColl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "res_getBpe")
    public JAXBElement<ResGetBpeColl> createResGetBpe(ResGetBpeColl value) {
        return new JAXBElement<ResGetBpeColl>(_ResGetBpe_QNAME, ResGetBpeColl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqInsertFasilitasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "req_insertFasilitas")
    public JAXBElement<ReqInsertFasilitasType> createReqInsertFasilitas(ReqInsertFasilitasType value) {
        return new JAXBElement<ReqInsertFasilitasType>(_ReqInsertFasilitas_QNAME, ReqInsertFasilitasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqGetProdukHukumFasilitasCMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "req_getProdukHukumFasilitasCM")
    public JAXBElement<ReqGetProdukHukumFasilitasCMType> createReqGetProdukHukumFasilitasCM(ReqGetProdukHukumFasilitasCMType value) {
        return new JAXBElement<ReqGetProdukHukumFasilitasCMType>(_ReqGetProdukHukumFasilitasCM_QNAME, ReqGetProdukHukumFasilitasCMType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResMonitoringPermohonanWpColl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "res_monitoringPermohonanWp")
    public JAXBElement<ResMonitoringPermohonanWpColl> createResMonitoringPermohonanWp(ResMonitoringPermohonanWpColl value) {
        return new JAXBElement<ResMonitoringPermohonanWpColl>(_ResMonitoringPermohonanWp_QNAME, ResMonitoringPermohonanWpColl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResGetProdukHukumFasilitasCMColl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "res_getProdukHukumFasilitasCM")
    public JAXBElement<ResGetProdukHukumFasilitasCMColl> createResGetProdukHukumFasilitasCM(ResGetProdukHukumFasilitasCMColl value) {
        return new JAXBElement<ResGetProdukHukumFasilitasCMColl>(_ResGetProdukHukumFasilitasCM_QNAME, ResGetProdukHukumFasilitasCMColl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReqMonitoringPermohonanWp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "req_monitoringPermohonanWp")
    public JAXBElement<ReqMonitoringPermohonanWp> createReqMonitoringPermohonanWp(ReqMonitoringPermohonanWp value) {
        return new JAXBElement<ReqMonitoringPermohonanWp>(_ReqMonitoringPermohonanWp_QNAME, ReqMonitoringPermohonanWp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResInsertFasilitasColl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.pajak.go.id/DjpOnline/fasilitasPajak", name = "res_insertFasilitas")
    public JAXBElement<ResInsertFasilitasColl> createResInsertFasilitas(ResInsertFasilitasColl value) {
        return new JAXBElement<ResInsertFasilitasColl>(_ResInsertFasilitas_QNAME, ResInsertFasilitasColl.class, null, value);
    }

}
