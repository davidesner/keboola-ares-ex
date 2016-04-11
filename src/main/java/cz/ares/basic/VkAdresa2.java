
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Adresy z Ministerstva spravedlnosti ve vazbì na tabulku vk_podnet
 * 
 * <p>Java class for vk_adresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vk_adresa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Upadce_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}upadce_spravce_CEU"/>
 *         &lt;element name="K_typu_adresy" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="NU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="CA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="AA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vk_adresa", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "upadceSpravce",
    "kTypuAdresy",
    "nok",
    "n",
    "nu",
    "ca",
    "psc",
    "aa"
})
public class VkAdresa2 {

    @XmlElement(name = "Upadce_spravce", required = true)
    protected UpadceSpravceCEU2 upadceSpravce;
    @XmlElement(name = "K_typu_adresy")
    protected short kTypuAdresy;
    @XmlElement(name = "NOK")
    protected String nok;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "NU")
    protected String nu;
    @XmlElement(name = "CA")
    protected String ca;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "AA")
    protected AdresaARES2 aa;

    /**
     * Gets the value of the upadceSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link UpadceSpravceCEU2 }
     *     
     */
    public UpadceSpravceCEU2 getUpadceSpravce() {
        return upadceSpravce;
    }

    /**
     * Sets the value of the upadceSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpadceSpravceCEU2 }
     *     
     */
    public void setUpadceSpravce(UpadceSpravceCEU2 value) {
        this.upadceSpravce = value;
    }

    /**
     * Gets the value of the kTypuAdresy property.
     * 
     */
    public short getKTypuAdresy() {
        return kTypuAdresy;
    }

    /**
     * Sets the value of the kTypuAdresy property.
     * 
     */
    public void setKTypuAdresy(short value) {
        this.kTypuAdresy = value;
    }

    /**
     * Gets the value of the nok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOK() {
        return nok;
    }

    /**
     * Sets the value of the nok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOK(String value) {
        this.nok = value;
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
     * Gets the value of the ca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCA() {
        return ca;
    }

    /**
     * Sets the value of the ca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCA(String value) {
        this.ca = value;
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

    /**
     * Gets the value of the aa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getAA() {
        return aa;
    }

    /**
     * Sets the value of the aa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setAA(AdresaARES2 value) {
        this.aa = value;
    }

}
