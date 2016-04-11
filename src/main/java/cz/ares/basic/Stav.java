
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Stav subjektu: Aktivní / Zaniklý a atributy Konkurz, Vyrovnani, Zamitnuti, Likvidace
 * 
 * <p>Java class for stav complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stav">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Stav_subjektu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_subjektu" minOccurs="0"/>
 *         &lt;element name="Konkurz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_KVZ"/>
 *         &lt;element name="Vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_KVZ"/>
 *         &lt;element name="Zamitnuti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_KVZ"/>
 *         &lt;element name="Likvidace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_KVZ"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stav", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "stavSubjektu",
    "konkurz",
    "vyrovnani",
    "zamitnuti",
    "likvidace"
})
public class Stav {

    @XmlElement(name = "Stav_subjektu")
    protected StavSubjektu stavSubjektu;
    @XmlElement(name = "Konkurz", required = true)
    protected StavKVZ konkurz;
    @XmlElement(name = "Vyrovnani", required = true)
    protected StavKVZ vyrovnani;
    @XmlElement(name = "Zamitnuti", required = true)
    protected StavKVZ zamitnuti;
    @XmlElement(name = "Likvidace", required = true)
    protected StavKVZ likvidace;

    /**
     * Gets the value of the stavSubjektu property.
     * 
     * @return
     *     possible object is
     *     {@link StavSubjektu }
     *     
     */
    public StavSubjektu getStavSubjektu() {
        return stavSubjektu;
    }

    /**
     * Sets the value of the stavSubjektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavSubjektu }
     *     
     */
    public void setStavSubjektu(StavSubjektu value) {
        this.stavSubjektu = value;
    }

    /**
     * Gets the value of the konkurz property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ }
     *     
     */
    public StavKVZ getKonkurz() {
        return konkurz;
    }

    /**
     * Sets the value of the konkurz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ }
     *     
     */
    public void setKonkurz(StavKVZ value) {
        this.konkurz = value;
    }

    /**
     * Gets the value of the vyrovnani property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ }
     *     
     */
    public StavKVZ getVyrovnani() {
        return vyrovnani;
    }

    /**
     * Sets the value of the vyrovnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ }
     *     
     */
    public void setVyrovnani(StavKVZ value) {
        this.vyrovnani = value;
    }

    /**
     * Gets the value of the zamitnuti property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ }
     *     
     */
    public StavKVZ getZamitnuti() {
        return zamitnuti;
    }

    /**
     * Sets the value of the zamitnuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ }
     *     
     */
    public void setZamitnuti(StavKVZ value) {
        this.zamitnuti = value;
    }

    /**
     * Gets the value of the likvidace property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ }
     *     
     */
    public StavKVZ getLikvidace() {
        return likvidace;
    }

    /**
     * Sets the value of the likvidace property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ }
     *     
     */
    public void setLikvidace(StavKVZ value) {
        this.likvidace = value;
    }

}
