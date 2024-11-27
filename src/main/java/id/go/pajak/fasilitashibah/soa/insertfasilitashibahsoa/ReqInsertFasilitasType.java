
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for req_insertFasilitasType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="req_insertFasilitasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="npwp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idRefJenisSurat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idRefJenisPemberitahuan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keterangan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keteranganTambahan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masaPjkAwal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="masaPjkAkhir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tahunPajak" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noSuratWp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "req_insertFasilitasType", propOrder = {
    "npwp",
    "idRefJenisSurat",
    "idRefJenisPemberitahuan",
    "keterangan",
    "keteranganTambahan",
    "masaPjkAwal",
    "masaPjkAkhir",
    "tahunPajak",
    "noSuratWp",
    "data"
})
public class ReqInsertFasilitasType {

    @XmlElement(required = true)
    protected String npwp;
    @XmlElement(required = true)
    protected String idRefJenisSurat;
    protected String idRefJenisPemberitahuan;
    protected String keterangan;
    protected String keteranganTambahan;
    @XmlElement(required = true)
    protected String masaPjkAwal;
    @XmlElement(required = true)
    protected String masaPjkAkhir;
    @XmlElement(required = true)
    protected String tahunPajak;
    protected String noSuratWp;
    protected Object data;

    /**
     * Gets the value of the npwp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNpwp() {
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
    public void setNpwp(String value) {
        this.npwp = value;
    }

    /**
     * Gets the value of the idRefJenisSurat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRefJenisSurat() {
        return idRefJenisSurat;
    }

    /**
     * Sets the value of the idRefJenisSurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRefJenisSurat(String value) {
        this.idRefJenisSurat = value;
    }

    /**
     * Gets the value of the idRefJenisPemberitahuan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRefJenisPemberitahuan() {
        return idRefJenisPemberitahuan;
    }

    /**
     * Sets the value of the idRefJenisPemberitahuan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRefJenisPemberitahuan(String value) {
        this.idRefJenisPemberitahuan = value;
    }

    /**
     * Gets the value of the keterangan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * Sets the value of the keterangan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeterangan(String value) {
        this.keterangan = value;
    }

    /**
     * Gets the value of the keteranganTambahan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeteranganTambahan() {
        return keteranganTambahan;
    }

    /**
     * Sets the value of the keteranganTambahan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeteranganTambahan(String value) {
        this.keteranganTambahan = value;
    }

    /**
     * Gets the value of the masaPjkAwal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasaPjkAwal() {
        return masaPjkAwal;
    }

    /**
     * Sets the value of the masaPjkAwal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasaPjkAwal(String value) {
        this.masaPjkAwal = value;
    }

    /**
     * Gets the value of the masaPjkAkhir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasaPjkAkhir() {
        return masaPjkAkhir;
    }

    /**
     * Sets the value of the masaPjkAkhir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasaPjkAkhir(String value) {
        this.masaPjkAkhir = value;
    }

    /**
     * Gets the value of the tahunPajak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahunPajak() {
        return tahunPajak;
    }

    /**
     * Sets the value of the tahunPajak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahunPajak(String value) {
        this.tahunPajak = value;
    }

    /**
     * Gets the value of the noSuratWp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSuratWp() {
        return noSuratWp;
    }

    /**
     * Sets the value of the noSuratWp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSuratWp(String value) {
        this.noSuratWp = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setData(Object value) {
        this.data = value;
    }

}
