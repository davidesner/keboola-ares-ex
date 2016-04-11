
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Právní forma vèetnì popisných položek
 * 
 * <p>Java class for pravni_forma_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pravni_forma_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_pravni_formy"/>
 *         &lt;element name="Nazev_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_pravni_formy" minOccurs="0"/>
 *         &lt;element name="Zkraceny_nazev_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zkraceny_nazev_PF" minOccurs="0"/>
 *         &lt;element name="PF_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pf_osoba" minOccurs="0"/>
 *         &lt;element name="TZU_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}tzu_osoba" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pravni_forma_RZP", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodPF",
    "nazevPF",
    "zkracenyNazevPF",
    "pfOsoba",
    "tzuOsoba"
})
public class PravniFormaRZP {

    @XmlElement(name = "Kod_PF")
    protected short kodPF;
    @XmlElement(name = "Nazev_PF")
    protected String nazevPF;
    @XmlElement(name = "Zkraceny_nazev_PF")
    protected String zkracenyNazevPF;
    @XmlElement(name = "PF_osoba")
    protected PfOsoba pfOsoba;
    @XmlElement(name = "TZU_osoba")
    protected TzuOsoba tzuOsoba;

    /**
     * Gets the value of the kodPF property.
     * 
     */
    public short getKodPF() {
        return kodPF;
    }

    /**
     * Sets the value of the kodPF property.
     * 
     */
    public void setKodPF(short value) {
        this.kodPF = value;
    }

    /**
     * Gets the value of the nazevPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPF() {
        return nazevPF;
    }

    /**
     * Sets the value of the nazevPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPF(String value) {
        this.nazevPF = value;
    }

    /**
     * Gets the value of the zkracenyNazevPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkracenyNazevPF() {
        return zkracenyNazevPF;
    }

    /**
     * Sets the value of the zkracenyNazevPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkracenyNazevPF(String value) {
        this.zkracenyNazevPF = value;
    }

    /**
     * Gets the value of the pfOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link PfOsoba }
     *     
     */
    public PfOsoba getPFOsoba() {
        return pfOsoba;
    }

    /**
     * Sets the value of the pfOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link PfOsoba }
     *     
     */
    public void setPFOsoba(PfOsoba value) {
        this.pfOsoba = value;
    }

    /**
     * Gets the value of the tzuOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link TzuOsoba }
     *     
     */
    public TzuOsoba getTZUOsoba() {
        return tzuOsoba;
    }

    /**
     * Sets the value of the tzuOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link TzuOsoba }
     *     
     */
    public void setTZUOsoba(TzuOsoba value) {
        this.tzuOsoba = value;
    }

}
