
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for req_monitoringPermohonanWp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="req_monitoringPermohonanWp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="npwp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noBps" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "req_monitoringPermohonanWp", propOrder = {
    "npwp",
    "noBps"
})
public class ReqMonitoringPermohonanWp {

    @XmlElement(required = true, nillable = true)
    protected String npwp;
    @XmlElement(required = true, nillable = true)
    protected String noBps;

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

}
