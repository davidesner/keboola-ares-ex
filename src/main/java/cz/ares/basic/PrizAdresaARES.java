
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pøíznak úspìšnosti provedení standardizace adresy.
 * 
 * <p>Java class for priz_adresa_ARES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priz_adresa_ARES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Priznaky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}priznaky_adresa_ARES"/>
 *         &lt;element name="Vstup" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vstup_adresa_ARES"/>
 *         &lt;element name="Vystup" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vystup_adresa_ARES"/>
 *         &lt;element name="Prirazeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}prirazeni_adresa_ARES"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priz_adresa_ARES", propOrder = {
    "priznaky",
    "vstup",
    "vystup",
    "prirazeni"
})
public class PrizAdresaARES {

    @XmlElement(name = "Priznaky", required = true)
    protected String priznaky;
    @XmlElement(name = "Vstup", required = true)
    protected String vstup;
    @XmlElement(name = "Vystup", required = true)
    protected String vystup;
    @XmlElement(name = "Prirazeni", required = true)
    protected String prirazeni;

    /**
     * Gets the value of the priznaky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriznaky() {
        return priznaky;
    }

    /**
     * Sets the value of the priznaky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriznaky(String value) {
        this.priznaky = value;
    }

    /**
     * Gets the value of the vstup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVstup() {
        return vstup;
    }

    /**
     * Sets the value of the vstup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVstup(String value) {
        this.vstup = value;
    }

    /**
     * Gets the value of the vystup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystup() {
        return vystup;
    }

    /**
     * Sets the value of the vystup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystup(String value) {
        this.vystup = value;
    }

    /**
     * Gets the value of the prirazeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrirazeni() {
        return prirazeni;
    }

    /**
     * Sets the value of the prirazeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrirazeni(String value) {
        this.prirazeni = value;
    }

}
