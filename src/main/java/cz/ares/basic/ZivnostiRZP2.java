
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o všech živnostech subjektu
 * 
 * <p>Java class for zivnosti_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zivnosti_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PZI" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Z" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zivnost" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zivnosti_RZP", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "pzi",
    "z"
})
public class ZivnostiRZP2 {

    @XmlElement(name = "PZI")
    protected Short pzi;
    @XmlElement(name = "Z")
    protected List<Zivnost2> z;

    /**
     * Gets the value of the pzi property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPZI() {
        return pzi;
    }

    /**
     * Sets the value of the pzi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPZI(Short value) {
        this.pzi = value;
    }

    /**
     * Gets the value of the z property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the z property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zivnost2 }
     * 
     * 
     */
    public List<Zivnost2> getZ() {
        if (z == null) {
            z = new ArrayList<Zivnost2>();
        }
        return this.z;
    }

}
