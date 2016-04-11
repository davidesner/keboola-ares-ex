
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Živnostenský úøad (vz_ciurady)
 * 
 * <p>Java class for zivnostensky_urad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zivnostensky_urad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KZU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nazev_ZU"/>
 *         &lt;element name="N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="NU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zivnostensky_urad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "kzu",
    "nzu",
    "n",
    "nu",
    "psc"
})
public class ZivnostenskyUrad2 {

    @XmlElement(name = "KZU")
    protected int kzu;
    @XmlElement(name = "NZU", required = true)
    protected String nzu;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "NU")
    protected String nu;
    @XmlElement(name = "PSC")
    protected String psc;

    /**
     * Gets the value of the kzu property.
     * 
     */
    public int getKZU() {
        return kzu;
    }

    /**
     * Sets the value of the kzu property.
     * 
     */
    public void setKZU(int value) {
        this.kzu = value;
    }

    /**
     * Gets the value of the nzu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNZU() {
        return nzu;
    }

    /**
     * Sets the value of the nzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNZU(String value) {
        this.nzu = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the nu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNU() {
        return nu;
    }

    /**
     * Sets the value of the nu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNU(String value) {
        this.nu = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSC() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSC(String value) {
        this.psc = value;
    }

}
