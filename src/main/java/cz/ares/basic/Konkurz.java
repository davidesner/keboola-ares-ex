
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
 *         &lt;element name="Udaje_KVZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}udaje_KVZ"/>
 *         &lt;element name="Spravci_KP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spravce" minOccurs="0"/>
 *         &lt;element name="Zastupci_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spravce" minOccurs="0"/>
 *         &lt;element name="Zvlastni_spravci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spravce" minOccurs="0"/>
 *         &lt;element name="Predbezni_spravci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spravce" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "konkurz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "udajeKVZ",
    "spravciKP",
    "zastupciSpravce",
    "zvlastniSpravci",
    "predbezniSpravci"
})
public class Konkurz {

    @XmlElement(name = "Udaje_KVZ", required = true)
    protected UdajeKVZ udajeKVZ;
    @XmlElement(name = "Spravci_KP")
    protected Spravce spravciKP;
    @XmlElement(name = "Zastupci_spravce")
    protected Spravce zastupciSpravce;
    @XmlElement(name = "Zvlastni_spravci")
    protected Spravce zvlastniSpravci;
    @XmlElement(name = "Predbezni_spravci")
    protected Spravce predbezniSpravci;

    /**
     * Gets the value of the udajeKVZ property.
     * 
     * @return
     *     possible object is
     *     {@link UdajeKVZ }
     *     
     */
    public UdajeKVZ getUdajeKVZ() {
        return udajeKVZ;
    }

    /**
     * Sets the value of the udajeKVZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link UdajeKVZ }
     *     
     */
    public void setUdajeKVZ(UdajeKVZ value) {
        this.udajeKVZ = value;
    }

    /**
     * Gets the value of the spravciKP property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce }
     *     
     */
    public Spravce getSpravciKP() {
        return spravciKP;
    }

    /**
     * Sets the value of the spravciKP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce }
     *     
     */
    public void setSpravciKP(Spravce value) {
        this.spravciKP = value;
    }

    /**
     * Gets the value of the zastupciSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce }
     *     
     */
    public Spravce getZastupciSpravce() {
        return zastupciSpravce;
    }

    /**
     * Sets the value of the zastupciSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce }
     *     
     */
    public void setZastupciSpravce(Spravce value) {
        this.zastupciSpravce = value;
    }

    /**
     * Gets the value of the zvlastniSpravci property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce }
     *     
     */
    public Spravce getZvlastniSpravci() {
        return zvlastniSpravci;
    }

    /**
     * Sets the value of the zvlastniSpravci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce }
     *     
     */
    public void setZvlastniSpravci(Spravce value) {
        this.zvlastniSpravci = value;
    }

    /**
     * Gets the value of the predbezniSpravci property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce }
     *     
     */
    public Spravce getPredbezniSpravci() {
        return predbezniSpravci;
    }

    /**
     * Sets the value of the predbezniSpravci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce }
     *     
     */
    public void setPredbezniSpravci(Spravce value) {
        this.predbezniSpravci = value;
    }

}
