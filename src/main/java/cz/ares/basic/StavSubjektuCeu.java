
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
 *         &lt;element name="Stav_konkurzu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_upadce_CEU"/>
 *         &lt;element name="Stav_vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_upadce_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stav_subjektu_ceu", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "stavKonkurzu",
    "stavVyrovnani"
})
public class StavSubjektuCeu {

    @XmlElement(name = "Stav_konkurzu", required = true)
    protected StavUpadceCEU stavKonkurzu;
    @XmlElement(name = "Stav_vyrovnani", required = true)
    protected StavUpadceCEU stavVyrovnani;

    /**
     * Gets the value of the stavKonkurzu property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getStavKonkurzu() {
        return stavKonkurzu;
    }

    /**
     * Sets the value of the stavKonkurzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setStavKonkurzu(StavUpadceCEU value) {
        this.stavKonkurzu = value;
    }

    /**
     * Gets the value of the stavVyrovnani property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getStavVyrovnani() {
        return stavVyrovnani;
    }

    /**
     * Sets the value of the stavVyrovnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setStavVyrovnani(StavUpadceCEU value) {
        this.stavVyrovnani = value;
    }

}
