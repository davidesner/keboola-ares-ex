
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o subjektu v SZR
 * 
 * <p>Java class for subjekt_szr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subjekt_szr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Klic_szr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Obchodni_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="Zkr_obch_jmeno" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Ico" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Dic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}dic" minOccurs="0"/>
 *         &lt;element name="RC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}rodne_cislo" minOccurs="0"/>
 *         &lt;element name="Icd" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1111"/>
 *               &lt;enumeration value="1112"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *         &lt;element name="FUA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *         &lt;element name="K_platce_dane" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Je_platce_dph" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="Osoba_szr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osoba_szr" minOccurs="0"/>
 *         &lt;element name="Datum_aktualizace" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_vyrazeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Vyrazen" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="Kontakty" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kontakty_szr" minOccurs="0"/>
 *         &lt;element name="Adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresy_szr" minOccurs="0"/>
 *         &lt;element name="PRY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}provozovny_szr" minOccurs="0"/>
 *         &lt;element name="Exids" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}exids_szr" minOccurs="0"/>
 *         &lt;element name="Registry" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registry_szr" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="regdod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="regddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="regkod">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjekt_szr", propOrder = {
    "klicSzr",
    "obchodniJmeno",
    "zkrObchJmeno",
    "ico",
    "la",
    "dic",
    "rc",
    "icd",
    "fu",
    "fua",
    "kPlatceDane",
    "jePlatceDph",
    "osobaSzr",
    "datumAktualizace",
    "datumVyrazeni",
    "vyrazen",
    "kontakty",
    "adresy",
    "pry",
    "exids",
    "registry"
})
public class SubjektSzr {

    @XmlElement(name = "Klic_szr")
    protected Integer klicSzr;
    @XmlElement(name = "Obchodni_jmeno")
    protected String obchodniJmeno;
    @XmlElement(name = "Zkr_obch_jmeno")
    protected String zkrObchJmeno;
    @XmlElement(name = "Ico")
    protected String ico;
    @XmlElement(name = "LA")
    protected Integer la;
    @XmlElement(name = "Dic")
    protected String dic;
    @XmlElement(name = "RC")
    protected String rc;
    @XmlElement(name = "Icd")
    protected String icd;
    @XmlElement(name = "FU")
    protected FinancniUrad3 fu;
    @XmlElement(name = "FUA")
    protected FinancniUrad3 fua;
    @XmlElement(name = "K_platce_dane")
    protected String kPlatceDane;
    @XmlElement(name = "Je_platce_dph")
    protected String jePlatceDph;
    @XmlElement(name = "Osoba_szr")
    protected OsobaSzr osobaSzr;
    @XmlElement(name = "Datum_aktualizace")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAktualizace;
    @XmlElement(name = "Datum_vyrazeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVyrazeni;
    @XmlElement(name = "Vyrazen")
    protected String vyrazen;
    @XmlElement(name = "Kontakty")
    protected KontaktySzr kontakty;
    @XmlElement(name = "Adresy")
    protected AdresySzr adresy;
    @XmlElement(name = "PRY")
    protected ProvozovnySzr pry;
    @XmlElement(name = "Exids")
    protected ExidsSzr exids;
    @XmlElement(name = "Registry")
    protected RegistrySzr registry;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regdod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regddo;
    @XmlAttribute
    protected String regkod;

    /**
     * Gets the value of the klicSzr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlicSzr() {
        return klicSzr;
    }

    /**
     * Sets the value of the klicSzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlicSzr(Integer value) {
        this.klicSzr = value;
    }

    /**
     * Gets the value of the obchodniJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodniJmeno() {
        return obchodniJmeno;
    }

    /**
     * Sets the value of the obchodniJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodniJmeno(String value) {
        this.obchodniJmeno = value;
    }

    /**
     * Gets the value of the zkrObchJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkrObchJmeno() {
        return zkrObchJmeno;
    }

    /**
     * Sets the value of the zkrObchJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkrObchJmeno(String value) {
        this.zkrObchJmeno = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
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
    public void setIco(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the la property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLA() {
        return la;
    }

    /**
     * Sets the value of the la property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLA(Integer value) {
        this.la = value;
    }

    /**
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDic() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDic(String value) {
        this.dic = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRC() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRC(String value) {
        this.rc = value;
    }

    /**
     * Gets the value of the icd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcd() {
        return icd;
    }

    /**
     * Sets the value of the icd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcd(String value) {
        this.icd = value;
    }

    /**
     * Gets the value of the fu property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad3 }
     *     
     */
    public FinancniUrad3 getFU() {
        return fu;
    }

    /**
     * Sets the value of the fu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad3 }
     *     
     */
    public void setFU(FinancniUrad3 value) {
        this.fu = value;
    }

    /**
     * Gets the value of the fua property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad3 }
     *     
     */
    public FinancniUrad3 getFUA() {
        return fua;
    }

    /**
     * Sets the value of the fua property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad3 }
     *     
     */
    public void setFUA(FinancniUrad3 value) {
        this.fua = value;
    }

    /**
     * Gets the value of the kPlatceDane property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPlatceDane() {
        return kPlatceDane;
    }

    /**
     * Sets the value of the kPlatceDane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPlatceDane(String value) {
        this.kPlatceDane = value;
    }

    /**
     * Gets the value of the jePlatceDph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJePlatceDph() {
        return jePlatceDph;
    }

    /**
     * Sets the value of the jePlatceDph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJePlatceDph(String value) {
        this.jePlatceDph = value;
    }

    /**
     * Gets the value of the osobaSzr property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaSzr }
     *     
     */
    public OsobaSzr getOsobaSzr() {
        return osobaSzr;
    }

    /**
     * Sets the value of the osobaSzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaSzr }
     *     
     */
    public void setOsobaSzr(OsobaSzr value) {
        this.osobaSzr = value;
    }

    /**
     * Gets the value of the datumAktualizace property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumAktualizace() {
        return datumAktualizace;
    }

    /**
     * Sets the value of the datumAktualizace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumAktualizace(XMLGregorianCalendar value) {
        this.datumAktualizace = value;
    }

    /**
     * Gets the value of the datumVyrazeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVyrazeni() {
        return datumVyrazeni;
    }

    /**
     * Sets the value of the datumVyrazeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVyrazeni(XMLGregorianCalendar value) {
        this.datumVyrazeni = value;
    }

    /**
     * Gets the value of the vyrazen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyrazen() {
        return vyrazen;
    }

    /**
     * Sets the value of the vyrazen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyrazen(String value) {
        this.vyrazen = value;
    }

    /**
     * Gets the value of the kontakty property.
     * 
     * @return
     *     possible object is
     *     {@link KontaktySzr }
     *     
     */
    public KontaktySzr getKontakty() {
        return kontakty;
    }

    /**
     * Sets the value of the kontakty property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontaktySzr }
     *     
     */
    public void setKontakty(KontaktySzr value) {
        this.kontakty = value;
    }

    /**
     * Gets the value of the adresy property.
     * 
     * @return
     *     possible object is
     *     {@link AdresySzr }
     *     
     */
    public AdresySzr getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresySzr }
     *     
     */
    public void setAdresy(AdresySzr value) {
        this.adresy = value;
    }

    /**
     * Gets the value of the pry property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovnySzr }
     *     
     */
    public ProvozovnySzr getPRY() {
        return pry;
    }

    /**
     * Sets the value of the pry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovnySzr }
     *     
     */
    public void setPRY(ProvozovnySzr value) {
        this.pry = value;
    }

    /**
     * Gets the value of the exids property.
     * 
     * @return
     *     possible object is
     *     {@link ExidsSzr }
     *     
     */
    public ExidsSzr getExids() {
        return exids;
    }

    /**
     * Sets the value of the exids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExidsSzr }
     *     
     */
    public void setExids(ExidsSzr value) {
        this.exids = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrySzr }
     *     
     */
    public RegistrySzr getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrySzr }
     *     
     */
    public void setRegistry(RegistrySzr value) {
        this.registry = value;
    }

    /**
     * Gets the value of the regdod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegdod() {
        return regdod;
    }

    /**
     * Sets the value of the regdod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegdod(XMLGregorianCalendar value) {
        this.regdod = value;
    }

    /**
     * Gets the value of the regddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegddo() {
        return regddo;
    }

    /**
     * Sets the value of the regddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegddo(XMLGregorianCalendar value) {
        this.regddo = value;
    }

    /**
     * Gets the value of the regkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegkod() {
        return regkod;
    }

    /**
     * Sets the value of the regkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegkod(String value) {
        this.regkod = value;
    }

}
