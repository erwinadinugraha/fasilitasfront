
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for req_getProdukHukumFasilitasCMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="req_getProdukHukumFasilitasCMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="npwp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nobps" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "req_getProdukHukumFasilitasCMType", propOrder = {
    "npwp",
    "nobps"
})
public class ReqGetProdukHukumFasilitasCMType {

    @XmlElement(required = true, nillable = true)
    protected String npwp;
    @XmlElement(required = true, nillable = true)
    protected String nobps;

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
     * Gets the value of the nobps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNobps() {
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
    public void setNobps(String value) {
        this.nobps = value;
    }

}
