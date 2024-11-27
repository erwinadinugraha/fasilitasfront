
package id.go.pajak.fasilitashibah.soa.insertfasilitashibahsoa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for res_getBpeColl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="res_getBpeColl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kd_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ket_status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="res_getBpe" type="{http://soa.pajak.go.id/DjpOnline/fasilitasPajak}res_getBpeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "res_getBpeColl", propOrder = {
    "kdStatus",
    "ketStatus",
    "resGetBpe"
})
public class ResGetBpeColl {

    @XmlElement(name = "kd_status", required = true)
    protected String kdStatus;
    @XmlElement(name = "ket_status", required = true)
    protected String ketStatus;
    @XmlElement(name = "res_getBpe")
    protected List<ResGetBpeType> resGetBpe;

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
     * Gets the value of the resGetBpe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resGetBpe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResGetBpe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResGetBpeType }
     * 
     * 
     */
    public List<ResGetBpeType> getResGetBpe() {
        if (resGetBpe == null) {
            resGetBpe = new ArrayList<ResGetBpeType>();
        }
        return this.resGetBpe;
    }

}
