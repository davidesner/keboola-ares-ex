
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vysledek_dotazu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vysledek_dotazu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pocet_nalezenych" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Chyba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}chyba" minOccurs="0"/>
 *         &lt;element name="Pocet_nenalezenych" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seznam_nenalezenych" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}slovo" minOccurs="0"/>
 *         &lt;element name="Pocet_navracenych" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seznam_navracenych" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}seznam_navracenych" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vysledek_dotazu", propOrder = {
    "pocetNalezenych",
    "chyba",
    "pocetNenalezenych",
    "seznamNenalezenych",
    "pocetNavracenych",
    "seznamNavracenych"
})
public class VysledekDotazu3 {

    @XmlElement(name = "Pocet_nalezenych")
    protected int pocetNalezenych;
    @XmlElement(name = "Chyba")
    protected Chyba3 chyba;
    @XmlElement(name = "Pocet_nenalezenych")
    protected Integer pocetNenalezenych;
    @XmlElement(name = "Seznam_nenalezenych")
    protected Slovo3 seznamNenalezenych;
    @XmlElement(name = "Pocet_navracenych")
    protected Integer pocetNavracenych;
    @XmlElement(name = "Seznam_navracenych")
    protected SeznamNavracenych3 seznamNavracenych;

    /**
     * Gets the value of the pocetNalezenych property.
     * 
     */
    public int getPocetNalezenych() {
        return pocetNalezenych;
    }

    /**
     * Sets the value of the pocetNalezenych property.
     * 
     */
    public void setPocetNalezenych(int value) {
        this.pocetNalezenych = value;
    }

    /**
     * Gets the value of the chyba property.
     * 
     * @return
     *     possible object is
     *     {@link Chyba3 }
     *     
     */
    public Chyba3 getChyba() {
        return chyba;
    }

    /**
     * Sets the value of the chyba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chyba3 }
     *     
     */
    public void setChyba(Chyba3 value) {
        this.chyba = value;
    }

    /**
     * Gets the value of the pocetNenalezenych property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetNenalezenych() {
        return pocetNenalezenych;
    }

    /**
     * Sets the value of the pocetNenalezenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetNenalezenych(Integer value) {
        this.pocetNenalezenych = value;
    }

    /**
     * Gets the value of the seznamNenalezenych property.
     * 
     * @return
     *     possible object is
     *     {@link Slovo3 }
     *     
     */
    public Slovo3 getSeznamNenalezenych() {
        return seznamNenalezenych;
    }

    /**
     * Sets the value of the seznamNenalezenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slovo3 }
     *     
     */
    public void setSeznamNenalezenych(Slovo3 value) {
        this.seznamNenalezenych = value;
    }

    /**
     * Gets the value of the pocetNavracenych property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetNavracenych() {
        return pocetNavracenych;
    }

    /**
     * Sets the value of the pocetNavracenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetNavracenych(Integer value) {
        this.pocetNavracenych = value;
    }

    /**
     * Gets the value of the seznamNavracenych property.
     * 
     * @return
     *     possible object is
     *     {@link SeznamNavracenych3 }
     *     
     */
    public SeznamNavracenych3 getSeznamNavracenych() {
        return seznamNavracenych;
    }

    /**
     * Sets the value of the seznamNavracenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeznamNavracenych3 }
     *     
     */
    public void setSeznamNavracenych(SeznamNavracenych3 value) {
        this.seznamNavracenych = value;
    }

}
