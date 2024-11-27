
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for res_monitoringPermohonanWp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="res_monitoringPermohonanWp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NPWP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_CABANG" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NO_DOKUMEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_JNS_SURAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FG_STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CREATION_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ID_MASALAH" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NOMOR_CM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TGL_CM" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CURRENTWORKFLOWID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CURRENTACTIVITYSEQUENCE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="NOMOR_DOKUMEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TANGGAL_DOKUMEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STS_PRODUK_HUKUM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "res_monitoringPermohonanWp", propOrder = {
    "npwp",
    "idcabang",
    "nodokumen",
    "idjnssurat",
    "fgstatus",
    "creationdate",
    "idmasalah",
    "nomorcm",
    "tglcm",
    "currentworkflowid",
    "currentactivitysequence",
    "nomordokumen",
    "tanggaldokumen",
    "stsprodukhukum",
    "status"
})
public class ResMonitoringPermohonanWp {

    @XmlElement(name = "NPWP", required = true, nillable = true)
    protected String npwp;
    @XmlElement(name = "ID_CABANG", required = true, nillable = true)
    protected BigDecimal idcabang;
    @XmlElement(name = "NO_DOKUMEN", required = true, nillable = true)
    protected String nodokumen;
    @XmlElement(name = "ID_JNS_SURAT", required = true, nillable = true)
    protected BigDecimal idjnssurat;
    @XmlElement(name = "FG_STATUS", required = true, nillable = true)
    protected String fgstatus;
    @XmlElement(name = "CREATION_DATE", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationdate;
    @XmlElement(name = "ID_MASALAH", required = true, nillable = true)
    protected BigDecimal idmasalah;
    @XmlElement(name = "NOMOR_CM", required = true, nillable = true)
    protected String nomorcm;
    @XmlElement(name = "TGL_CM", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tglcm;
    @XmlElement(name = "CURRENTWORKFLOWID", required = true, nillable = true)
    protected String currentworkflowid;
    @XmlElement(name = "CURRENTACTIVITYSEQUENCE", required = true, nillable = true)
    protected BigDecimal currentactivitysequence;
    @XmlElement(name = "NOMOR_DOKUMEN", required = true, nillable = true)
    protected String nomordokumen;
    @XmlElement(name = "TANGGAL_DOKUMEN", required = true, nillable = true)
    protected String tanggaldokumen;
    @XmlElement(name = "STS_PRODUK_HUKUM", required = true, nillable = true)
    protected String stsprodukhukum;
    @XmlElement(name = "STATUS", required = true, nillable = true)
    protected String status;

    /**
     * Gets the value of the npwp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPWP() {
        return npwp;
    }

    /**
     * Sets the value of the npwp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPWP(String value) {
        this.npwp = value;
    }

    /**
     * Gets the value of the idcabang property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIDCABANG() {
        return idcabang;
    }

    /**
     * Sets the value of the idcabang property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIDCABANG(BigDecimal value) {
        this.idcabang = value;
    }

    /**
     * Gets the value of the nodokumen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNODOKUMEN() {
        return nodokumen;
    }

    /**
     * Sets the value of the nodokumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNODOKUMEN(String value) {
        this.nodokumen = value;
    }

    /**
     * Gets the value of the idjnssurat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIDJNSSURAT() {
        return idjnssurat;
    }

    /**
     * Sets the value of the idjnssurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIDJNSSURAT(BigDecimal value) {
        this.idjnssurat = value;
    }

    /**
     * Gets the value of the fgstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGSTATUS() {
        return fgstatus;
    }

    /**
     * Sets the value of the fgstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGSTATUS(String value) {
        this.fgstatus = value;
    }

    /**
     * Gets the value of the creationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATIONDATE() {
        return creationdate;
    }

    /**
     * Sets the value of the creationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATIONDATE(XMLGregorianCalendar value) {
        this.creationdate = value;
    }

    /**
     * Gets the value of the idmasalah property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIDMASALAH() {
        return idmasalah;
    }

    /**
     * Sets the value of the idmasalah property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIDMASALAH(BigDecimal value) {
        this.idmasalah = value;
    }

    /**
     * Gets the value of the nomorcm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMORCM() {
        return nomorcm;
    }

    /**
     * Sets the value of the nomorcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMORCM(String value) {
        this.nomorcm = value;
    }

    /**
     * Gets the value of the tglcm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTGLCM() {
        return tglcm;
    }

    /**
     * Sets the value of the tglcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTGLCM(XMLGregorianCalendar value) {
        this.tglcm = value;
    }

    /**
     * Gets the value of the currentworkflowid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTWORKFLOWID() {
        return currentworkflowid;
    }

    /**
     * Sets the value of the currentworkflowid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTWORKFLOWID(String value) {
        this.currentworkflowid = value;
    }

    /**
     * Gets the value of the currentactivitysequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCURRENTACTIVITYSEQUENCE() {
        return currentactivitysequence;
    }

    /**
     * Sets the value of the currentactivitysequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCURRENTACTIVITYSEQUENCE(BigDecimal value) {
        this.currentactivitysequence = value;
    }

    /**
     * Gets the value of the nomordokumen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMORDOKUMEN() {
        return nomordokumen;
    }

    /**
     * Sets the value of the nomordokumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMORDOKUMEN(String value) {
        this.nomordokumen = value;
    }

    /**
     * Gets the value of the tanggaldokumen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTANGGALDOKUMEN() {
        return tanggaldokumen;
    }

    /**
     * Sets the value of the tanggaldokumen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTANGGALDOKUMEN(String value) {
        this.tanggaldokumen = value;
    }

    /**
     * Gets the value of the stsprodukhukum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTSPRODUKHUKUM() {
        return stsprodukhukum;
    }

    /**
     * Sets the value of the stsprodukhukum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTSPRODUKHUKUM(String value) {
        this.stsprodukhukum = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUS(String value) {
        this.status = value;
    }

}
