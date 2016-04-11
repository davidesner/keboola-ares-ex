
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Vstupní tabulka s nahranými daty z Ministerstva spravedlnosti
 * 
 * <p>Java class for vk_podnet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vk_podnet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S_podnetu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cislo_vety_ceu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Stornuj" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Datum_vzniku" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Cislo_soudu" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Kod_ukonu" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Cislo_senatu" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Cislo_znacky" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Rok_znacky" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Konkurz_vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurz_vyrovnani_CEU"/>
 *         &lt;element name="PFO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pfc"/>
 *         &lt;element name="Cele_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/>
 *         &lt;element name="Rodne_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}rodne_cislo" minOccurs="0"/>
 *         &lt;element name="URL_detail" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}url_CEU"/>
 *         &lt;element name="URL_usneseni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}url_CEU" minOccurs="0"/>
 *         &lt;element name="Spravce_konkurzni_podstaty" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Stav_vety" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_vety_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vk_podnet", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "sPodnetu",
    "cisloVetyCeu",
    "stornuj",
    "datumVzniku",
    "cisloSoudu",
    "kodUkonu",
    "cisloSenatu",
    "cisloZnacky",
    "rokZnacky",
    "konkurzVyrovnani",
    "pfo",
    "celeJmeno",
    "ico",
    "rodneCislo",
    "urlDetail",
    "urlUsneseni",
    "spravceKonkurzniPodstaty",
    "stavVety"
})
public class VkPodnet {

    @XmlElement(name = "S_podnetu")
    protected int sPodnetu;
    @XmlElement(name = "Cislo_vety_ceu")
    protected int cisloVetyCeu;
    @XmlElement(name = "Stornuj")
    protected Integer stornuj;
    @XmlElement(name = "Datum_vzniku", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVzniku;
    @XmlElement(name = "Cislo_soudu")
    protected short cisloSoudu;
    @XmlElement(name = "Kod_ukonu")
    protected short kodUkonu;
    @XmlElement(name = "Cislo_senatu")
    protected Short cisloSenatu;
    @XmlElement(name = "Cislo_znacky")
    protected short cisloZnacky;
    @XmlElement(name = "Rok_znacky")
    protected short rokZnacky;
    @XmlElement(name = "Konkurz_vyrovnani", required = true)
    protected KonkurzVyrovnaniCEU konkurzVyrovnani;
    @XmlElement(name = "PFO", required = true)
    protected Pfc pfo;
    @XmlElement(name = "Cele_jmeno")
    protected String celeJmeno;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Rodne_cislo")
    protected String rodneCislo;
    @XmlElement(name = "URL_detail", required = true)
    protected String urlDetail;
    @XmlElement(name = "URL_usneseni")
    protected String urlUsneseni;
    @XmlElement(name = "Spravce_konkurzni_podstaty")
    protected String spravceKonkurzniPodstaty;
    @XmlElement(name = "Stav_vety", required = true)
    protected StavVetyCEU stavVety;

    /**
     * Gets the value of the sPodnetu property.
     * 
     */
    public int getSPodnetu() {
        return sPodnetu;
    }

    /**
     * Sets the value of the sPodnetu property.
     * 
     */
    public void setSPodnetu(int value) {
        this.sPodnetu = value;
    }

    /**
     * Gets the value of the cisloVetyCeu property.
     * 
     */
    public int getCisloVetyCeu() {
        return cisloVetyCeu;
    }

    /**
     * Sets the value of the cisloVetyCeu property.
     * 
     */
    public void setCisloVetyCeu(int value) {
        this.cisloVetyCeu = value;
    }

    /**
     * Gets the value of the stornuj property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStornuj() {
        return stornuj;
    }

    /**
     * Sets the value of the stornuj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStornuj(Integer value) {
        this.stornuj = value;
    }

    /**
     * Gets the value of the datumVzniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVzniku() {
        return datumVzniku;
    }

    /**
     * Sets the value of the datumVzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVzniku(XMLGregorianCalendar value) {
        this.datumVzniku = value;
    }

    /**
     * Gets the value of the cisloSoudu property.
     * 
     */
    public short getCisloSoudu() {
        return cisloSoudu;
    }

    /**
     * Sets the value of the cisloSoudu property.
     * 
     */
    public void setCisloSoudu(short value) {
        this.cisloSoudu = value;
    }

    /**
     * Gets the value of the kodUkonu property.
     * 
     */
    public short getKodUkonu() {
        return kodUkonu;
    }

    /**
     * Sets the value of the kodUkonu property.
     * 
     */
    public void setKodUkonu(short value) {
        this.kodUkonu = value;
    }

    /**
     * Gets the value of the cisloSenatu property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCisloSenatu() {
        return cisloSenatu;
    }

    /**
     * Sets the value of the cisloSenatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCisloSenatu(Short value) {
        this.cisloSenatu = value;
    }

    /**
     * Gets the value of the cisloZnacky property.
     * 
     */
    public short getCisloZnacky() {
        return cisloZnacky;
    }

    /**
     * Sets the value of the cisloZnacky property.
     * 
     */
    public void setCisloZnacky(short value) {
        this.cisloZnacky = value;
    }

    /**
     * Gets the value of the rokZnacky property.
     * 
     */
    public short getRokZnacky() {
        return rokZnacky;
    }

    /**
     * Sets the value of the rokZnacky property.
     * 
     */
    public void setRokZnacky(short value) {
        this.rokZnacky = value;
    }

    /**
     * Gets the value of the konkurzVyrovnani property.
     * 
     * @return
     *     possible object is
     *     {@link KonkurzVyrovnaniCEU }
     *     
     */
    public KonkurzVyrovnaniCEU getKonkurzVyrovnani() {
        return konkurzVyrovnani;
    }

    /**
     * Sets the value of the konkurzVyrovnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonkurzVyrovnaniCEU }
     *     
     */
    public void setKonkurzVyrovnani(KonkurzVyrovnaniCEU value) {
        this.konkurzVyrovnani = value;
    }

    /**
     * Gets the value of the pfo property.
     * 
     * @return
     *     possible object is
     *     {@link Pfc }
     *     
     */
    public Pfc getPFO() {
        return pfo;
    }

    /**
     * Sets the value of the pfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pfc }
     *     
     */
    public void setPFO(Pfc value) {
        this.pfo = value;
    }

    /**
     * Gets the value of the celeJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeleJmeno() {
        return celeJmeno;
    }

    /**
     * Sets the value of the celeJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeleJmeno(String value) {
        this.celeJmeno = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICO(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the rodneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodneCislo() {
        return rodneCislo;
    }

    /**
     * Sets the value of the rodneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodneCislo(String value) {
        this.rodneCislo = value;
    }

    /**
     * Gets the value of the urlDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLDetail() {
        return urlDetail;
    }

    /**
     * Sets the value of the urlDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLDetail(String value) {
        this.urlDetail = value;
    }

    /**
     * Gets the value of the urlUsneseni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLUsneseni() {
        return urlUsneseni;
    }

    /**
     * Sets the value of the urlUsneseni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLUsneseni(String value) {
        this.urlUsneseni = value;
    }

    /**
     * Gets the value of the spravceKonkurzniPodstaty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpravceKonkurzniPodstaty() {
        return spravceKonkurzniPodstaty;
    }

    /**
     * Sets the value of the spravceKonkurzniPodstaty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpravceKonkurzniPodstaty(String value) {
        this.spravceKonkurzniPodstaty = value;
    }

    /**
     * Gets the value of the stavVety property.
     * 
     * @return
     *     possible object is
     *     {@link StavVetyCEU }
     *     
     */
    public StavVetyCEU getStavVety() {
        return stavVety;
    }

    /**
     * Sets the value of the stavVety property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavVetyCEU }
     *     
     */
    public void setStavVety(StavVetyCEU value) {
        this.stavVety = value;
    }

}
