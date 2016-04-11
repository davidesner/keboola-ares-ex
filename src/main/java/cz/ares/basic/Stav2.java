
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * S subjektu: Aktivní / Zaniklý a atributy KKZ, VY, ZAM, LI
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
 *         &lt;element name="SSU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_subjektu" minOccurs="0"/>
 *         &lt;element name="KKZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_KVZ"/>
 *         &lt;element name="VY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_KVZ"/>
 *         &lt;element name="ZAM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_KVZ"/>
 *         &lt;element name="LI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_KVZ"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stav", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "ssu",
    "kkz",
    "vy",
    "zam",
    "li"
})
public class Stav2 {

    @XmlElement(name = "SSU")
    protected StavSubjektu2 ssu;
    @XmlElement(name = "KKZ", required = true)
    protected StavKVZ2 kkz;
    @XmlElement(name = "VY", required = true)
    protected StavKVZ2 vy;
    @XmlElement(name = "ZAM", required = true)
    protected StavKVZ2 zam;
    @XmlElement(name = "LI", required = true)
    protected StavKVZ2 li;

    /**
     * Gets the value of the ssu property.
     * 
     * @return
     *     possible object is
     *     {@link StavSubjektu2 }
     *     
     */
    public StavSubjektu2 getSSU() {
        return ssu;
    }

    /**
     * Sets the value of the ssu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavSubjektu2 }
     *     
     */
    public void setSSU(StavSubjektu2 value) {
        this.ssu = value;
    }

    /**
     * Gets the value of the kkz property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ2 }
     *     
     */
    public StavKVZ2 getKKZ() {
        return kkz;
    }

    /**
     * Sets the value of the kkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ2 }
     *     
     */
    public void setKKZ(StavKVZ2 value) {
        this.kkz = value;
    }

    /**
     * Gets the value of the vy property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ2 }
     *     
     */
    public StavKVZ2 getVY() {
        return vy;
    }

    /**
     * Sets the value of the vy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ2 }
     *     
     */
    public void setVY(StavKVZ2 value) {
        this.vy = value;
    }

    /**
     * Gets the value of the zam property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ2 }
     *     
     */
    public StavKVZ2 getZAM() {
        return zam;
    }

    /**
     * Sets the value of the zam property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ2 }
     *     
     */
    public void setZAM(StavKVZ2 value) {
        this.zam = value;
    }

    /**
     * Gets the value of the li property.
     * 
     * @return
     *     possible object is
     *     {@link StavKVZ2 }
     *     
     */
    public StavKVZ2 getLI() {
        return li;
    }

    /**
     * Sets the value of the li property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKVZ2 }
     *     
     */
    public void setLI(StavKVZ2 value) {
        this.li = value;
    }

}
