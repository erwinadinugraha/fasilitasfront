
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for res_monitoringPermohonanWpColl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="res_monitoringPermohonanWpColl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kd_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ket_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="res_monitoringPermohonanWp" type="{http://soa.pajak.go.id/DjpOnline/fasilitasPajak}res_monitoringPermohonanWp" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "res_monitoringPermohonanWpColl", propOrder = {
    "kdStatus",
    "ketStatus",
    "resMonitoringPermohonanWp"
})
public class ResMonitoringPermohonanWpColl {

    @XmlElement(name = "kd_status", required = true)
    protected String kdStatus;
    @XmlElement(name = "ket_status", required = true)
    protected String ketStatus;
    @XmlElement(name = "res_monitoringPermohonanWp")
    protected List<ResMonitoringPermohonanWp> resMonitoringPermohonanWp;

    /**
     * Gets the value of the kdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKdStatus() {
        return kdStatus;
    }

    /**
     * Sets the value of the kdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKdStatus(String value) {
        this.kdStatus = value;
    }

    /**
     * Gets the value of the ketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKetStatus() {
        return ketStatus;
    }

    /**
     * Sets the value of the ketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKetStatus(String value) {
        this.ketStatus = value;
    }

    /**
     * Gets the value of the resMonitoringPermohonanWp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resMonitoringPermohonanWp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResMonitoringPermohonanWp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResMonitoringPermohonanWp }
     * 
     * 
     */
    public List<ResMonitoringPermohonanWp> getResMonitoringPermohonanWp() {
        if (resMonitoringPermohonanWp == null) {
            resMonitoringPermohonanWp = new ArrayList<ResMonitoringPermohonanWp>();
        }
        return this.resMonitoringPermohonanWp;
    }

}
