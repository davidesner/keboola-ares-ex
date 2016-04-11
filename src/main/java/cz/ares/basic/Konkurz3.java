
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
 *         &lt;element name="KVZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}udaje_KVZ"/>
 *         &lt;element name="SKP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spravce" minOccurs="0"/>
 *         &lt;element name="ZAS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spravce" minOccurs="0"/>
 *         &lt;element name="ZVS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spravce" minOccurs="0"/>
 *         &lt;element name="PRS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spravce" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "konkurz", propOrder = {
    "kvz",
    "skp",
    "zas",
    "zvs",
    "prs"
})
public class Konkurz3 {

    @XmlElement(name = "KVZ", required = true)
    protected UdajeKVZ3 kvz;
    @XmlElement(name = "SKP")
    protected Spravce3 skp;
    @XmlElement(name = "ZAS")
    protected Spravce3 zas;
    @XmlElement(name = "ZVS")
    protected Spravce3 zvs;
    @XmlElement(name = "PRS")
    protected Spravce3 prs;

    /**
     * Gets the value of the kvz property.
     * 
     * @return
     *     possible object is
     *     {@link UdajeKVZ3 }
     *     
     */
    public UdajeKVZ3 getKVZ() {
        return kvz;
    }

    /**
     * Sets the value of the kvz property.
     * 
     * @param value
     *     allowed object is
     *     {@link UdajeKVZ3 }
     *     
     */
    public void setKVZ(UdajeKVZ3 value) {
        this.kvz = value;
    }

    /**
     * Gets the value of the skp property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce3 }
     *     
     */
    public Spravce3 getSKP() {
        return skp;
    }

    /**
     * Sets the value of the skp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce3 }
     *     
     */
    public void setSKP(Spravce3 value) {
        this.skp = value;
    }

    /**
     * Gets the value of the zas property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce3 }
     *     
     */
    public Spravce3 getZAS() {
        return zas;
    }

    /**
     * Sets the value of the zas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce3 }
     *     
     */
    public void setZAS(Spravce3 value) {
        this.zas = value;
    }

    /**
     * Gets the value of the zvs property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce3 }
     *     
     */
    public Spravce3 getZVS() {
        return zvs;
    }

    /**
     * Sets the value of the zvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce3 }
     *     
     */
    public void setZVS(Spravce3 value) {
        this.zvs = value;
    }

    /**
     * Gets the value of the prs property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce3 }
     *     
     */
    public Spravce3 getPRS() {
        return prs;
    }

    /**
     * Sets the value of the prs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce3 }
     *     
     */
    public void setPRS(Spravce3 value) {
        this.prs = value;
    }

}
