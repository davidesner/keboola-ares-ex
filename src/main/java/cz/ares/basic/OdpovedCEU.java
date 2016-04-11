
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odpoved_CEU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_CEU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pomocne_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Error" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}error_ARES"/>
 *         &lt;element name="Vysledek_hledani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vysledek_hledani"/>
 *         &lt;element name="Pocet_zaznamu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vypis_CEU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vypis_ceu" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_CEU", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "pomocneID",
    "error",
    "vysledekHledani",
    "pocetZaznamu",
    "vypisCEU"
})
public class OdpovedCEU {

    @XmlElement(name = "Pomocne_ID")
    protected int pomocneID;
    @XmlElement(name = "Error", required = true)
    protected ErrorARES error;
    @XmlElement(name = "Vysledek_hledani", required = true)
    protected VysledekHledani vysledekHledani;
    @XmlElement(name = "Pocet_zaznamu")
    protected int pocetZaznamu;
    @XmlElement(name = "Vypis_CEU")
    protected VypisCeu vypisCEU;

    /**
     * Gets the value of the pomocneID property.
     * 
     */
    public int getPomocneID() {
        return pomocneID;
    }

    /**
     * Sets the value of the pomocneID property.
     * 
     */
    public void setPomocneID(int value) {
        this.pomocneID = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES }
     *     
     */
    public ErrorARES getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES }
     *     
     */
    public void setError(ErrorARES value) {
        this.error = value;
    }

    /**
     * Gets the value of the vysledekHledani property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekHledani }
     *     
     */
    public VysledekHledani getVysledekHledani() {
        return vysledekHledani;
    }

    /**
     * Sets the value of the vysledekHledani property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekHledani }
     *     
     */
    public void setVysledekHledani(VysledekHledani value) {
        this.vysledekHledani = value;
    }

    /**
     * Gets the value of the pocetZaznamu property.
     * 
     */
    public int getPocetZaznamu() {
        return pocetZaznamu;
    }

    /**
     * Sets the value of the pocetZaznamu property.
     * 
     */
    public void setPocetZaznamu(int value) {
        this.pocetZaznamu = value;
    }

    /**
     * Gets the value of the vypisCEU property.
     * 
     * @return
     *     possible object is
     *     {@link VypisCeu }
     *     
     */
    public VypisCeu getVypisCEU() {
        return vypisCEU;
    }

    /**
     * Sets the value of the vypisCEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link VypisCeu }
     *     
     */
    public void setVypisCEU(VypisCeu value) {
        this.vypisCEU = value;
    }

}
