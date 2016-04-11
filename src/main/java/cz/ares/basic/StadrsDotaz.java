
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Opíše došlý dotaz, pøíp. doplní implicitní hodnoty místo nezadaných a pøidá k nìmu nalezenou odpovìï
 * 
 * <p>Java class for stadrs_dotaz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stadrs_dotaz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_statu" minOccurs="0"/>
 *         &lt;element name="Kod_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_okresu" minOccurs="0"/>
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_casti_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_casti_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="Cislo_do_adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/>
 *         &lt;element name="Adresa_textem" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_textem" minOccurs="0"/>
 *         &lt;element name="Diakritika" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Kod_diakritiky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kod_diakritiky"/>
 *         &lt;element name="Max_pocet" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Preteceni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}preteceni"/>
 *         &lt;element name="Redukce_slov" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ano_ne"/>
 *         &lt;element name="Format_odpovedi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vystup_format"/>
 *         &lt;element name="Chyba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}chyba" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stadrs_dotaz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodStatu",
    "kodOkresu",
    "nazevObce",
    "nazevCastiObce",
    "nazevUlice",
    "cisloDoAdresy",
    "psc",
    "adresaTextem",
    "diakritika",
    "kodDiakritiky",
    "maxPocet",
    "preteceni",
    "redukceSlov",
    "formatOdpovedi",
    "chyba"
})
public class StadrsDotaz {

    @XmlElement(name = "Kod_statu")
    protected String kodStatu;
    @XmlElement(name = "Kod_okresu")
    protected Integer kodOkresu;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Nazev_casti_obce")
    protected String nazevCastiObce;
    @XmlElement(name = "Nazev_ulice")
    protected String nazevUlice;
    @XmlElement(name = "Cislo_do_adresy")
    protected String cisloDoAdresy;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Adresa_textem")
    protected String adresaTextem;
    @XmlElement(name = "Diakritika", defaultValue = "true")
    protected boolean diakritika;
    @XmlElement(name = "Kod_diakritiky", required = true, defaultValue = "ISO")
    protected KodDiakritiky kodDiakritiky;
    @XmlElement(name = "Max_pocet", defaultValue = "20")
    protected short maxPocet;
    @XmlElement(name = "Preteceni", required = true, defaultValue = "N")
    protected Preteceni preteceni;
    @XmlElement(name = "Redukce_slov", required = true, defaultValue = "A")
    protected String redukceSlov;
    @XmlElement(name = "Format_odpovedi", required = true, defaultValue = "XML")
    protected VystupFormat formatOdpovedi;
    @XmlElement(name = "Chyba")
    protected List<Chyba> chyba;

    /**
     * Gets the value of the kodStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodStatu() {
        return kodStatu;
    }

    /**
     * Sets the value of the kodStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodStatu(String value) {
        this.kodStatu = value;
    }

    /**
     * Gets the value of the kodOkresu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKodOkresu() {
        return kodOkresu;
    }

    /**
     * Sets the value of the kodOkresu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKodOkresu(Integer value) {
        this.kodOkresu = value;
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
     * Gets the value of the nazevCastiObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCastiObce() {
        return nazevCastiObce;
    }

    /**
     * Sets the value of the nazevCastiObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCastiObce(String value) {
        this.nazevCastiObce = value;
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
     * Gets the value of the adresaTextem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresaTextem() {
        return adresaTextem;
    }

    /**
     * Sets the value of the adresaTextem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresaTextem(String value) {
        this.adresaTextem = value;
    }

    /**
     * Gets the value of the diakritika property.
     * 
     */
    public boolean isDiakritika() {
        return diakritika;
    }

    /**
     * Sets the value of the diakritika property.
     * 
     */
    public void setDiakritika(boolean value) {
        this.diakritika = value;
    }

    /**
     * Gets the value of the kodDiakritiky property.
     * 
     * @return
     *     possible object is
     *     {@link KodDiakritiky }
     *     
     */
    public KodDiakritiky getKodDiakritiky() {
        return kodDiakritiky;
    }

    /**
     * Sets the value of the kodDiakritiky property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodDiakritiky }
     *     
     */
    public void setKodDiakritiky(KodDiakritiky value) {
        this.kodDiakritiky = value;
    }

    /**
     * Gets the value of the maxPocet property.
     * 
     */
    public short getMaxPocet() {
        return maxPocet;
    }

    /**
     * Sets the value of the maxPocet property.
     * 
     */
    public void setMaxPocet(short value) {
        this.maxPocet = value;
    }

    /**
     * Gets the value of the preteceni property.
     * 
     * @return
     *     possible object is
     *     {@link Preteceni }
     *     
     */
    public Preteceni getPreteceni() {
        return preteceni;
    }

    /**
     * Sets the value of the preteceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preteceni }
     *     
     */
    public void setPreteceni(Preteceni value) {
        this.preteceni = value;
    }

    /**
     * Gets the value of the redukceSlov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedukceSlov() {
        return redukceSlov;
    }

    /**
     * Sets the value of the redukceSlov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedukceSlov(String value) {
        this.redukceSlov = value;
    }

    /**
     * Gets the value of the formatOdpovedi property.
     * 
     * @return
     *     possible object is
     *     {@link VystupFormat }
     *     
     */
    public VystupFormat getFormatOdpovedi() {
        return formatOdpovedi;
    }

    /**
     * Sets the value of the formatOdpovedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link VystupFormat }
     *     
     */
    public void setFormatOdpovedi(VystupFormat value) {
        this.formatOdpovedi = value;
    }

    /**
     * Gets the value of the chyba property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chyba property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChyba().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chyba }
     * 
     * 
     */
    public List<Chyba> getChyba() {
        if (chyba == null) {
            chyba = new ArrayList<Chyba>();
        }
        return this.chyba;
    }

}
