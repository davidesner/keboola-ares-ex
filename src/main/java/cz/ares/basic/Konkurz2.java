
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifické údaje o konkurzu
 * 
 * <p>Java class for konkurz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="konkurz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KVZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}udaje_KVZ"/>
 *         &lt;element name="SKP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spravce" minOccurs="0"/>
 *         &lt;element name="ZAS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spravce" minOccurs="0"/>
 *         &lt;element name="ZVS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spravce" minOccurs="0"/>
 *         &lt;element name="PRS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spravce" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "konkurz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "kvz",
    "skp",
    "zas",
    "zvs",
    "prs"
})
public class Konkurz2 {

    @XmlElement(name = "KVZ", required = true)
    protected UdajeKVZ2 kvz;
    @XmlElement(name = "SKP")
    protected Spravce2 skp;
    @XmlElement(name = "ZAS")
    protected Spravce2 zas;
    @XmlElement(name = "ZVS")
    protected Spravce2 zvs;
    @XmlElement(name = "PRS")
    protected Spravce2 prs;

    /**
     * Gets the value of the kvz property.
     * 
     * @return
     *     possible object is
     *     {@link UdajeKVZ2 }
     *     
     */
    public UdajeKVZ2 getKVZ() {
        return kvz;
    }

    /**
     * Sets the value of the kvz property.
     * 
     * @param value
     *     allowed object is
     *     {@link UdajeKVZ2 }
     *     
     */
    public void setKVZ(UdajeKVZ2 value) {
        this.kvz = value;
    }

    /**
     * Gets the value of the skp property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce2 }
     *     
     */
    public Spravce2 getSKP() {
        return skp;
    }

    /**
     * Sets the value of the skp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce2 }
     *     
     */
    public void setSKP(Spravce2 value) {
        this.skp = value;
    }

    /**
     * Gets the value of the zas property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce2 }
     *     
     */
    public Spravce2 getZAS() {
        return zas;
    }

    /**
     * Sets the value of the zas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce2 }
     *     
     */
    public void setZAS(Spravce2 value) {
        this.zas = value;
    }

    /**
     * Gets the value of the zvs property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce2 }
     *     
     */
    public Spravce2 getZVS() {
        return zvs;
    }

    /**
     * Sets the value of the zvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce2 }
     *     
     */
    public void setZVS(Spravce2 value) {
        this.zvs = value;
    }

    /**
     * Gets the value of the prs property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce2 }
     *     
     */
    public Spravce2 getPRS() {
        return prs;
    }

    /**
     * Sets the value of the prs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce2 }
     *     
     */
    public void setPRS(Spravce2 value) {
        this.prs = value;
    }

}
