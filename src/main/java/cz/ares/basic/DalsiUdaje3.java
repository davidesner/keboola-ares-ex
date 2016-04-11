
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
 *         &lt;element name="Druh_zrizovatele_kod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Druh_zrizovatele" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dalsi_udaje", propOrder = {
    "drk",
    "drz",
    "druhZrizovateleKod",
    "druhZrizovatele"
})
public class DalsiUdaje3 {

    @XmlElement(name = "DRK")
    protected Short drk;
    @XmlElement(name = "DRZ")
    protected String drz;
    @XmlElement(name = "Druh_zrizovatele_kod")
    protected Integer druhZrizovateleKod;
    @XmlElement(name = "Druh_zrizovatele")
    protected String druhZrizovatele;

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
     * Gets the value of the druhZrizovateleKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDruhZrizovateleKod() {
        return druhZrizovateleKod;
    }

    /**
     * Sets the value of the druhZrizovateleKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDruhZrizovateleKod(Integer value) {
        this.druhZrizovateleKod = value;
    }

    /**
     * Gets the value of the druhZrizovatele property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhZrizovatele() {
        return druhZrizovatele;
    }

    /**
     * Sets the value of the druhZrizovatele property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhZrizovatele(String value) {
        this.druhZrizovatele = value;
    }

}
