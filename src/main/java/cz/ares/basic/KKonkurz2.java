
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Základní údaje o konkurzu z Centrální evidence úpadcù  (tab. k_konkurz a dále)
 * 
 * <p>Java class for k_konkurz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_konkurz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="K_klic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_klic"/>
 *         &lt;element name="K_upadce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}k_upadce"/>
 *         &lt;element name="Poradi" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav_konkurzu_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_konkurz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "kKlic",
    "kUpadce",
    "poradi",
    "sko"
})
public class KKonkurz2 {

    @XmlElement(name = "K_klic", required = true)
    protected KKlic2 kKlic;
    @XmlElement(name = "K_upadce", required = true)
    protected KUpadce2 kUpadce;
    @XmlElement(name = "Poradi")
    protected short poradi;
    @XmlElement(name = "SKO", required = true)
    protected StavKonkurzuCEU2 sko;

    /**
     * Gets the value of the kKlic property.
     * 
     * @return
     *     possible object is
     *     {@link KKlic2 }
     *     
     */
    public KKlic2 getKKlic() {
        return kKlic;
    }

    /**
     * Sets the value of the kKlic property.
     * 
     * @param value
     *     allowed object is
     *     {@link KKlic2 }
     *     
     */
    public void setKKlic(KKlic2 value) {
        this.kKlic = value;
    }

    /**
     * Gets the value of the kUpadce property.
     * 
     * @return
     *     possible object is
     *     {@link KUpadce2 }
     *     
     */
    public KUpadce2 getKUpadce() {
        return kUpadce;
    }

    /**
     * Sets the value of the kUpadce property.
     * 
     * @param value
     *     allowed object is
     *     {@link KUpadce2 }
     *     
     */
    public void setKUpadce(KUpadce2 value) {
        this.kUpadce = value;
    }

    /**
     * Gets the value of the poradi property.
     * 
     */
    public short getPoradi() {
        return poradi;
    }

    /**
     * Sets the value of the poradi property.
     * 
     */
    public void setPoradi(short value) {
        this.poradi = value;
    }

    /**
     * Gets the value of the sko property.
     * 
     * @return
     *     possible object is
     *     {@link StavKonkurzuCEU2 }
     *     
     */
    public StavKonkurzuCEU2 getSKO() {
        return sko;
    }

    /**
     * Sets the value of the sko property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKonkurzuCEU2 }
     *     
     */
    public void setSKO(StavKonkurzuCEU2 value) {
        this.sko = value;
    }

}
