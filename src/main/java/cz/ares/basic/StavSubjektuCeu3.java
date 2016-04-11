
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * z Hlavní tabulky úpadcù - slouží zejména pro rozlišení, o jakého úpadce se jedná
 * 
 * <p>Java class for stav_subjektu_ceu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stav_subjektu_ceu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_upadce_CEU"/>
 *         &lt;element name="SVY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_upadce_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stav_subjektu_ceu", propOrder = {
    "sko",
    "svy"
})
public class StavSubjektuCeu3 {

    @XmlElement(name = "SKO", required = true)
    protected StavUpadceCEU3 sko;
    @XmlElement(name = "SVY", required = true)
    protected StavUpadceCEU3 svy;

    /**
     * Gets the value of the sko property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public StavUpadceCEU3 getSKO() {
        return sko;
    }

    /**
     * Sets the value of the sko property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public void setSKO(StavUpadceCEU3 value) {
        this.sko = value;
    }

    /**
     * Gets the value of the svy property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public StavUpadceCEU3 getSVY() {
        return svy;
    }

    /**
     * Sets the value of the svy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public void setSVY(StavUpadceCEU3 value) {
        this.svy = value;
    }

}
