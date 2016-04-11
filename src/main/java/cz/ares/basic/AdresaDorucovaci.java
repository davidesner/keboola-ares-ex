
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresa_dorucovaci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_dorucovaci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ulice_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ulice_cislo" minOccurs="0"/>
 *         &lt;element name="PSC_obec" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}psc_obec" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zdroj_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_dorucovaci", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "uliceCislo",
    "pscObec"
})
public class AdresaDorucovaci {

    @XmlElement(name = "Ulice_cislo")
    protected String uliceCislo;
    @XmlElement(name = "PSC_obec")
    protected String pscObec;
    @XmlAttribute
    protected ZdrojType zdroj;

    /**
     * Gets the value of the uliceCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUliceCislo() {
        return uliceCislo;
    }

    /**
     * Sets the value of the uliceCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUliceCislo(String value) {
        this.uliceCislo = value;
    }

    /**
     * Gets the value of the pscObec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCObec() {
        return pscObec;
    }

    /**
     * Sets the value of the pscObec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCObec(String value) {
        this.pscObec = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType }
     *     
     */
    public ZdrojType getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType }
     *     
     */
    public void setZdroj(ZdrojType value) {
        this.zdroj = value;
    }

}
