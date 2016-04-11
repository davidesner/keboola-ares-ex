
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dalsi_udaje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dalsi_udaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DRK" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="DRZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="TUK" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="TU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dalsi_udaje", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "drk",
    "drz",
    "tuk",
    "tu"
})
public class DalsiUdaje2 {

    @XmlElement(name = "DRK")
    protected Short drk;
    @XmlElement(name = "DRZ")
    protected String drz;
    @XmlElement(name = "TUK")
    protected Short tuk;
    @XmlElement(name = "TU")
    protected String tu;

    /**
     * Gets the value of the drk property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDRK() {
        return drk;
    }

    /**
     * Sets the value of the drk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDRK(Short value) {
        this.drk = value;
    }

    /**
     * Gets the value of the drz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRZ() {
        return drz;
    }

    /**
     * Sets the value of the drz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRZ(String value) {
        this.drz = value;
    }

    /**
     * Gets the value of the tuk property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTUK() {
        return tuk;
    }

    /**
     * Sets the value of the tuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTUK(Short value) {
        this.tuk = value;
    }

    /**
     * Gets the value of the tu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTU() {
        return tu;
    }

    /**
     * Sets the value of the tu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTU(String value) {
        this.tu = value;
    }

}
