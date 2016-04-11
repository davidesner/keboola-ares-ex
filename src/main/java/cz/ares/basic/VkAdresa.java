
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
 *         &lt;element name="Upadce_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}upadce_spravce_CEU"/>
 *         &lt;element name="Kod_typu_adresy" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Nazev_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="Cislo_do_adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/>
 *         &lt;element name="Adresa_ARES" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vk_adresa", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "upadceSpravce",
    "kodTypuAdresy",
    "nazevOkresu",
    "nazevObce",
    "nazevUlice",
    "cisloDoAdresy",
    "psc",
    "adresaARES"
})
public class VkAdresa {

    @XmlElement(name = "Upadce_spravce", required = true)
    protected UpadceSpravceCEU upadceSpravce;
    @XmlElement(name = "Kod_typu_adresy")
    protected short kodTypuAdresy;
    @XmlElement(name = "Nazev_okresu")
    protected String nazevOkresu;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Nazev_ulice")
    protected String nazevUlice;
    @XmlElement(name = "Cislo_do_adresy")
    protected String cisloDoAdresy;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Adresa_ARES")
    protected AdresaARES adresaARES;

    /**
     * Gets the value of the upadceSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link UpadceSpravceCEU }
     *     
     */
    public UpadceSpravceCEU getUpadceSpravce() {
        return upadceSpravce;
    }

    /**
     * Sets the value of the upadceSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpadceSpravceCEU }
     *     
     */
    public void setUpadceSpravce(UpadceSpravceCEU value) {
        this.upadceSpravce = value;
    }

    /**
     * Gets the value of the kodTypuAdresy property.
     * 
     */
    public short getKodTypuAdresy() {
        return kodTypuAdresy;
    }

    /**
     * Sets the value of the kodTypuAdresy property.
     * 
     */
    public void setKodTypuAdresy(short value) {
        this.kodTypuAdresy = value;
    }

    /**
     * Gets the value of the nazevOkresu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOkresu() {
        return nazevOkresu;
    }

    /**
     * Sets the value of the nazevOkresu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOkresu(String value) {
        this.nazevOkresu = value;
    }

    /**
     * Gets the value of the nazevObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevObce() {
        return nazevObce;
    }

    /**
     * Sets the value of the nazevObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevObce(String value) {
        this.nazevObce = value;
    }

    /**
     * Gets the value of the nazevUlice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevUlice() {
        return nazevUlice;
    }

    /**
     * Sets the value of the nazevUlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevUlice(String value) {
        this.nazevUlice = value;
    }

    /**
     * Gets the value of the cisloDoAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloDoAdresy() {
        return cisloDoAdresy;
    }

    /**
     * Sets the value of the cisloDoAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloDoAdresy(String value) {
        this.cisloDoAdresy = value;
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
     * Gets the value of the adresaARES property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdresaARES() {
        return adresaARES;
    }

    /**
     * Sets the value of the adresaARES property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdresaARES(AdresaARES value) {
        this.adresaARES = value;
    }

}
