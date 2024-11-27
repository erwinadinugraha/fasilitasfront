
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for res_getProdukHukumFasilitasCMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="res_getProdukHukumFasilitasCMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NPWP15" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAMA_WP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ALAMAT_WP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NO_BPS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TGL_BPS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NOMOR_SURAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TGL_SURAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MASA_PAJAK_AWAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MASA_PAJAK_AKHIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TAHUN_PAJAK" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KETERANGAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KETERANGAN_TAMBAHAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KPP_ADM_PENERIMA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAMA_KPP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAMA_KANWIL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ALAMAT_KPP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TELP_KPP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FAX_KPP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ID_REF_JNS_SURAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DOCID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ALASAN_TOLAK" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "res_getProdukHukumFasilitasCMType", propOrder = {
    "npwp15",
    "namawp",
    "alamatwp",
    "nobps",
    "tglbps",
    "nomorsurat",
    "tglsurat",
    "masapajakawal",
    "masapajakakhir",
    "tahunpajak",
    "keterangan",
    "keterangantambahan",
    "kppadmpenerima",
    "namakpp",
    "namakanwil",
    "alamatkpp",
    "telpkpp",
    "faxkpp",
    "idrefjnssurat",
    "docid",
    "alasantolak"
})
public class ResGetProdukHukumFasilitasCMType {

    @XmlElement(name = "NPWP15", required = true, nillable = true)
    protected String npwp15;
    @XmlElement(name = "NAMA_WP", required = true, nillable = true)
    protected String namawp;
    @XmlElement(name = "ALAMAT_WP", required = true, nillable = true)
    protected String alamatwp;
    @XmlElement(name = "NO_BPS", required = true, nillable = true)
    protected String nobps;
    @XmlElement(name = "TGL_BPS", required = true, nillable = true)
    protected String tglbps;
    @XmlElement(name = "NOMOR_SURAT", required = true, nillable = true)
    protected String nomorsurat;
    @XmlElement(name = "TGL_SURAT", required = true, nillable = true)
    protected String tglsurat;
    @XmlElement(name = "MASA_PAJAK_AWAL", required = true, nillable = true)
    protected String masapajakawal;
    @XmlElement(name = "MASA_PAJAK_AKHIR", required = true, nillable = true)
    protected String masapajakakhir;
    @XmlElement(name = "TAHUN_PAJAK", required = true, nillable = true)
    protected BigDecimal tahunpajak;
    @XmlElement(name = "KETERANGAN", required = true, nillable = true)
    protected String keterangan;
    @XmlElement(name = "KETERANGAN_TAMBAHAN", required = true, nillable = true)
    protected String keterangantambahan;
    @XmlElement(name = "KPP_ADM_PENERIMA", required = true, nillable = true)
    protected String kppadmpenerima;
    @XmlElement(name = "NAMA_KPP", required = true, nillable = true)
    protected String namakpp;
    @XmlElement(name = "NAMA_KANWIL", required = true, nillable = true)
    protected String namakanwil;
    @XmlElement(name = "ALAMAT_KPP", required = true, nillable = true)
    protected String alamatkpp;
    @XmlElement(name = "TELP_KPP", required = true, nillable = true)
    protected String telpkpp;
    @XmlElement(name = "FAX_KPP", required = true, nillable = true)
    protected String faxkpp;
    @XmlElement(name = "ID_REF_JNS_SURAT", required = true, nillable = true)
    protected String idrefjnssurat;
    @XmlElement(name = "DOCID", required = true, nillable = true)
    protected String docid;
    @XmlElement(name = "ALASAN_TOLAK", required = true, nillable = true)
    protected String alasantolak;

    /**
     * Gets the value of the npwp15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPWP15() {
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
    public void setNPWP15(String value) {
        this.npwp15 = value;
    }

    /**
     * Gets the value of the namawp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMAWP() {
        return namawp;
    }

    /**
     * Sets the value of the namawp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMAWP(String value) {
        this.namawp = value;
    }

    /**
     * Gets the value of the alamatwp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALAMATWP() {
        return alamatwp;
    }

    /**
     * Sets the value of the alamatwp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALAMATWP(String value) {
        this.alamatwp = value;
    }

    /**
     * Gets the value of the nobps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOBPS() {
        return nobps;
    }

    /**
     * Sets the value of the nobps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOBPS(String value) {
        this.nobps = value;
    }

    /**
     * Gets the value of the tglbps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTGLBPS() {
        return tglbps;
    }

    /**
     * Sets the value of the tglbps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTGLBPS(String value) {
        this.tglbps = value;
    }

    /**
     * Gets the value of the nomorsurat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMORSURAT() {
        return nomorsurat;
    }

    /**
     * Sets the value of the nomorsurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMORSURAT(String value) {
        this.nomorsurat = value;
    }

    /**
     * Gets the value of the tglsurat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTGLSURAT() {
        return tglsurat;
    }

    /**
     * Sets the value of the tglsurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTGLSURAT(String value) {
        this.tglsurat = value;
    }

    /**
     * Gets the value of the masapajakawal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMASAPAJAKAWAL() {
        return masapajakawal;
    }

    /**
     * Sets the value of the masapajakawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMASAPAJAKAWAL(String value) {
        this.masapajakawal = value;
    }

    /**
     * Gets the value of the masapajakakhir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMASAPAJAKAKHIR() {
        return masapajakakhir;
    }

    /**
     * Sets the value of the masapajakakhir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMASAPAJAKAKHIR(String value) {
        this.masapajakakhir = value;
    }

    /**
     * Gets the value of the tahunpajak property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTAHUNPAJAK() {
        return tahunpajak;
    }

    /**
     * Sets the value of the tahunpajak property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTAHUNPAJAK(BigDecimal value) {
        this.tahunpajak = value;
    }

    /**
     * Gets the value of the keterangan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKETERANGAN() {
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
    public void setKETERANGAN(String value) {
        this.keterangan = value;
    }

    /**
     * Gets the value of the keterangantambahan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKETERANGANTAMBAHAN() {
        return keterangantambahan;
    }

    /**
     * Sets the value of the keterangantambahan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKETERANGANTAMBAHAN(String value) {
        this.keterangantambahan = value;
    }

    /**
     * Gets the value of the kppadmpenerima property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPPADMPENERIMA() {
        return kppadmpenerima;
    }

    /**
     * Sets the value of the kppadmpenerima property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPPADMPENERIMA(String value) {
        this.kppadmpenerima = value;
    }

    /**
     * Gets the value of the namakpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMAKPP() {
        return namakpp;
    }

    /**
     * Sets the value of the namakpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMAKPP(String value) {
        this.namakpp = value;
    }

    /**
     * Gets the value of the namakanwil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMAKANWIL() {
        return namakanwil;
    }

    /**
     * Sets the value of the namakanwil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMAKANWIL(String value) {
        this.namakanwil = value;
    }

    /**
     * Gets the value of the alamatkpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALAMATKPP() {
        return alamatkpp;
    }

    /**
     * Sets the value of the alamatkpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALAMATKPP(String value) {
        this.alamatkpp = value;
    }

    /**
     * Gets the value of the telpkpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELPKPP() {
        return telpkpp;
    }

    /**
     * Sets the value of the telpkpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELPKPP(String value) {
        this.telpkpp = value;
    }

    /**
     * Gets the value of the faxkpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAXKPP() {
        return faxkpp;
    }

    /**
     * Sets the value of the faxkpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAXKPP(String value) {
        this.faxkpp = value;
    }

    /**
     * Gets the value of the idrefjnssurat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDREFJNSSURAT() {
        return idrefjnssurat;
    }

    /**
     * Sets the value of the idrefjnssurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDREFJNSSURAT(String value) {
        this.idrefjnssurat = value;
    }

    /**
     * Gets the value of the docid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCID() {
        return docid;
    }

    /**
     * Sets the value of the docid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCID(String value) {
        this.docid = value;
    }

    /**
     * Gets the value of the alasantolak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALASANTOLAK() {
        return alasantolak;
    }

    /**
     * Sets the value of the alasantolak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALASANTOLAK(String value) {
        this.alasantolak = value;
    }

}
