
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Definice elementu návratové adresy ARES
 * 
 * <p>Java class for adresa_ARES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_ARES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID_adresy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kod_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_statu" minOccurs="0"/>
 *         &lt;element name="Nazev_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_statu" minOccurs="0"/>
 *         &lt;element name="Nazev_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_casti_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_casti_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_mestske_casti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Nazev_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="Cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_dom" minOccurs="0"/>
 *         &lt;element name="Typ_cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}typ_cis_dom" minOccurs="0"/>
 *         &lt;element name="Cislo_orientacni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_or_sp" minOccurs="0"/>
 *         &lt;element name="Cislo_do_adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/>
 *         &lt;element name="Zahr_PSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Adresa_textem" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_textem" minOccurs="0"/>
 *         &lt;element name="Adresa_UIR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}adresa_UIR" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zdroj_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_ARES", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "idAdresy",
    "kodStatu",
    "nazevStatu",
    "nazevOkresu",
    "nazevObce",
    "nazevCastiObce",
    "nazevMestskeCasti",
    "nazevUlice",
    "cisloDomovni",
    "typCisloDomovni",
    "cisloOrientacni",
    "cisloDoAdresy",
    "psc",
    "zahrPSC",
    "adresaTextem",
    "adresaUIR"
})
public class AdresaARES {

    @XmlElement(name = "ID_adresy")
    protected String idAdresy;
    @XmlElement(name = "Kod_statu")
    protected String kodStatu;
    @XmlElement(name = "Nazev_statu")
    protected String nazevStatu;
    @XmlElement(name = "Nazev_okresu")
    protected String nazevOkresu;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Nazev_casti_obce")
    protected String nazevCastiObce;
    @XmlElement(name = "Nazev_mestske_casti")
    protected String nazevMestskeCasti;
    @XmlElement(name = "Nazev_ulice")
    protected String nazevUlice;
    @XmlElement(name = "Cislo_domovni")
    protected Integer cisloDomovni;
    @XmlElement(name = "Typ_cislo_domovni")
    protected Byte typCisloDomovni;
    @XmlElement(name = "Cislo_orientacni")
    protected String cisloOrientacni;
    @XmlElement(name = "Cislo_do_adresy")
    protected String cisloDoAdresy;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Zahr_PSC")
    protected String zahrPSC;
    @XmlElement(name = "Adresa_textem")
    protected String adresaTextem;
    @XmlElement(name = "Adresa_UIR")
    protected AdresaUIR adresaUIR;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;
    @XmlAttribute
    protected ZdrojType zdroj;

    /**
     * Gets the value of the idAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAdresy() {
        return idAdresy;
    }

    /**
     * Sets the value of the idAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAdresy(String value) {
        this.idAdresy = value;
    }

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
     * Gets the value of the nazevStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevStatu() {
        return nazevStatu;
    }

    /**
     * Sets the value of the nazevStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevStatu(String value) {
        this.nazevStatu = value;
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
     * Gets the value of the nazevMestskeCasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevMestskeCasti() {
        return nazevMestskeCasti;
    }

    /**
     * Sets the value of the nazevMestskeCasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevMestskeCasti(String value) {
        this.nazevMestskeCasti = value;
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
     * Gets the value of the cisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCisloDomovni() {
        return cisloDomovni;
    }

    /**
     * Sets the value of the cisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCisloDomovni(Integer value) {
        this.cisloDomovni = value;
    }

    /**
     * Gets the value of the typCisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTypCisloDomovni() {
        return typCisloDomovni;
    }

    /**
     * Sets the value of the typCisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTypCisloDomovni(Byte value) {
        this.typCisloDomovni = value;
    }

    /**
     * Gets the value of the cisloOrientacni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloOrientacni() {
        return cisloOrientacni;
    }

    /**
     * Sets the value of the cisloOrientacni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloOrientacni(String value) {
        this.cisloOrientacni = value;
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
     * Gets the value of the zahrPSC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZahrPSC() {
        return zahrPSC;
    }

    /**
     * Sets the value of the zahrPSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZahrPSC(String value) {
        this.zahrPSC = value;
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
     * Gets the value of the adresaUIR property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaUIR }
     *     
     */
    public AdresaUIR getAdresaUIR() {
        return adresaUIR;
    }

    /**
     * Sets the value of the adresaUIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaUIR }
     *     
     */
    public void setAdresaUIR(AdresaUIR value) {
        this.adresaUIR = value;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

    /**
     * Gets the value of the ddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdo() {
        return ddo;
    }

    /**
     * Sets the value of the ddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdo(XMLGregorianCalendar value) {
        this.ddo = value;
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
