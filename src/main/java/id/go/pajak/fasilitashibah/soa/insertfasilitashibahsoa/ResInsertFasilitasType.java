
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for res_insertFasilitasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="res_insertFasilitasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="no_bps" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="no_suket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kode_verifikasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="npwp15" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="npwp16" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nitku" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "res_insertFasilitasType", propOrder = {
    "noBps",
    "noSuket",
    "kodeVerifikasi",
    "npwp15",
    "npwp16",
    "nitku"
})
public class ResInsertFasilitasType {

    @XmlElement(name = "no_bps", required = true, nillable = true)
    protected String noBps;
    @XmlElement(name = "no_suket", required = true, nillable = true)
    protected String noSuket;
    @XmlElement(name = "kode_verifikasi", required = true, nillable = true)
    protected String kodeVerifikasi;
    @XmlElement(required = true, nillable = true)
    protected String npwp15;
    @XmlElement(required = true, nillable = true)
    protected String npwp16;
    @XmlElement(required = true, nillable = true)
    protected String nitku;

    /**
     * Gets the value of the noBps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoBps() {
        return noBps;
    }

    /**
     * Sets the value of the noBps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoBps(String value) {
        this.noBps = value;
    }

    /**
     * Gets the value of the noSuket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSuket() {
        return noSuket;
    }

    /**
     * Sets the value of the noSuket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSuket(String value) {
        this.noSuket = value;
    }

    /**
     * Gets the value of the kodeVerifikasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeVerifikasi() {
        return kodeVerifikasi;
    }

    /**
     * Sets the value of the kodeVerifikasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeVerifikasi(String value) {
        this.kodeVerifikasi = value;
    }

    /**
     * Gets the value of the npwp15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpwp15() {
        return npwp15;
    }

    /**
     * Sets the value of the npwp15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpwp15(String value) {
        this.npwp15 = value;
    }

    /**
     * Gets the value of the npwp16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpwp16() {
        return npwp16;
    }

    /**
     * Sets the value of the npwp16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNpwp16(String value) {
        this.npwp16 = value;
    }

    /**
     * Gets the value of the nitku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitku() {
        return nitku;
    }

    /**
     * Sets the value of the nitku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitku(String value) {
        this.nitku = value;
    }

}
