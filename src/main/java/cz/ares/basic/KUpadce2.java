
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hlavní tabulka úpadcù - slouží zejména pro rozlišení, o jakého úpadce se jedná
 * 
 * <p>Java class for k_upadce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_upadce">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_upadce" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PFC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pfc"/>
 *         &lt;element name="K_eksubj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_eksubj" minOccurs="0"/>
 *         &lt;element name="K_cosoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_cosoba" minOccurs="0"/>
 *         &lt;element name="SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_upadce_CEU"/>
 *         &lt;element name="SVY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_upadce_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_upadce", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "sUpadce",
    "pfc",
    "kEksubj",
    "kCosoba",
    "sko",
    "svy"
})
public class KUpadce2 {

    @XmlElement(name = "S_upadce")
    protected int sUpadce;
    @XmlElement(name = "PFC", required = true)
    protected Pfc2 pfc;
    @XmlElement(name = "K_eksubj")
    protected KEksubj2 kEksubj;
    @XmlElement(name = "K_cosoba")
    protected KCosoba2 kCosoba;
    @XmlElement(name = "SKO", required = true)
    protected StavUpadceCEU2 sko;
    @XmlElement(name = "SVY", required = true)
    protected StavUpadceCEU2 svy;

    /**
     * Gets the value of the sUpadce property.
     * 
     */
    public int getSUpadce() {
        return sUpadce;
    }

    /**
     * Sets the value of the sUpadce property.
     * 
     */
    public void setSUpadce(int value) {
        this.sUpadce = value;
    }

    /**
     * Gets the value of the pfc property.
     * 
     * @return
     *     possible object is
     *     {@link Pfc2 }
     *     
     */
    public Pfc2 getPFC() {
        return pfc;
    }

    /**
     * Sets the value of the pfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pfc2 }
     *     
     */
    public void setPFC(Pfc2 value) {
        this.pfc = value;
    }

    /**
     * Gets the value of the kEksubj property.
     * 
     * @return
     *     possible object is
     *     {@link KEksubj2 }
     *     
     */
    public KEksubj2 getKEksubj() {
        return kEksubj;
    }

    /**
     * Sets the value of the kEksubj property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEksubj2 }
     *     
     */
    public void setKEksubj(KEksubj2 value) {
        this.kEksubj = value;
    }

    /**
     * Gets the value of the kCosoba property.
     * 
     * @return
     *     possible object is
     *     {@link KCosoba2 }
     *     
     */
    public KCosoba2 getKCosoba() {
        return kCosoba;
    }

    /**
     * Sets the value of the kCosoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link KCosoba2 }
     *     
     */
    public void setKCosoba(KCosoba2 value) {
        this.kCosoba = value;
    }

    /**
     * Gets the value of the sko property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU2 }
     *     
     */
    public StavUpadceCEU2 getSKO() {
        return sko;
    }

    /**
     * Sets the value of the sko property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU2 }
     *     
     */
    public void setSKO(StavUpadceCEU2 value) {
        this.sko = value;
    }

    /**
     * Gets the value of the svy property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU2 }
     *     
     */
    public StavUpadceCEU2 getSVY() {
        return svy;
    }

    /**
     * Sets the value of the svy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU2 }
     *     
     */
    public void setSVY(StavUpadceCEU2 value) {
        this.svy = value;
    }

}
