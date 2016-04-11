
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o jedné živnosti
 * 
 * <p>Java class for zivnost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zivnost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_zivnosti" minOccurs="0"/>
 *         &lt;element name="Datum_zmeny" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Evp" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="Evc" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="ZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zivnostensky_urad" minOccurs="0"/>
 *         &lt;element name="Druh" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}druh_zivnosti" minOccurs="0"/>
 *         &lt;element name="KZI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_zivnosti" minOccurs="0"/>
 *         &lt;element name="OKEC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_okec" minOccurs="0"/>
 *         &lt;element name="PP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}predmet_podnikani_rzp" minOccurs="0"/>
 *         &lt;element name="Obory_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}obory_cinnosti" minOccurs="0"/>
 *         &lt;element name="Vznik" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Zahajeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Ukonceni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Zanik" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pozastaveni_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pozastaveni_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Rozsah_pozastaveni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Preruseni_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Preruseni_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PRY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}provozovny_RZP" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zivnost", propOrder = {
    "s",
    "datumZmeny",
    "evp",
    "evc",
    "zu",
    "druh",
    "kzi",
    "okec",
    "pp",
    "oboryCinnosti",
    "vznik",
    "zahajeni",
    "ukonceni",
    "zanik",
    "pozastaveniOd",
    "pozastaveniDo",
    "rozsahPozastaveni",
    "preruseniOd",
    "preruseniDo",
    "pry"
})
public class Zivnost3 {

    @XmlElement(name = "S")
    protected StavZivnosti s;
    @XmlElement(name = "Datum_zmeny")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZmeny;
    @XmlElement(name = "Evp")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger evp;
    @XmlElement(name = "Evc")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger evc;
    @XmlElement(name = "ZU")
    protected ZivnostenskyUrad3 zu;
    @XmlElement(name = "Druh")
    protected DruhZivnosti druh;
    @XmlElement(name = "KZI")
    protected String kzi;
    @XmlElement(name = "OKEC")
    protected KodOkec3 okec;
    @XmlElement(name = "PP")
    protected String pp;
    @XmlElement(name = "Obory_cinnosti")
    protected OboryCinnosti3 oboryCinnosti;
    @XmlElement(name = "Vznik")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vznik;
    @XmlElement(name = "Zahajeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zahajeni;
    @XmlElement(name = "Ukonceni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ukonceni;
    @XmlElement(name = "Zanik")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zanik;
    @XmlElement(name = "Pozastaveni_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pozastaveniOd;
    @XmlElement(name = "Pozastaveni_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pozastaveniDo;
    @XmlElement(name = "Rozsah_pozastaveni")
    protected String rozsahPozastaveni;
    @XmlElement(name = "Preruseni_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preruseniOd;
    @XmlElement(name = "Preruseni_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar preruseniDo;
    @XmlElement(name = "PRY")
    protected ProvozovnyRZP pry;

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link StavZivnosti }
     *     
     */
    public StavZivnosti getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavZivnosti }
     *     
     */
    public void setS(StavZivnosti value) {
        this.s = value;
    }

    /**
     * Gets the value of the datumZmeny property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZmeny() {
        return datumZmeny;
    }

    /**
     * Sets the value of the datumZmeny property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZmeny(XMLGregorianCalendar value) {
        this.datumZmeny = value;
    }

    /**
     * Gets the value of the evp property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEvp() {
        return evp;
    }

    /**
     * Sets the value of the evp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEvp(BigInteger value) {
        this.evp = value;
    }

    /**
     * Gets the value of the evc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEvc() {
        return evc;
    }

    /**
     * Sets the value of the evc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEvc(BigInteger value) {
        this.evc = value;
    }

    /**
     * Gets the value of the zu property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostenskyUrad3 }
     *     
     */
    public ZivnostenskyUrad3 getZU() {
        return zu;
    }

    /**
     * Sets the value of the zu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostenskyUrad3 }
     *     
     */
    public void setZU(ZivnostenskyUrad3 value) {
        this.zu = value;
    }

    /**
     * Gets the value of the druh property.
     * 
     * @return
     *     possible object is
     *     {@link DruhZivnosti }
     *     
     */
    public DruhZivnosti getDruh() {
        return druh;
    }

    /**
     * Sets the value of the druh property.
     * 
     * @param value
     *     allowed object is
     *     {@link DruhZivnosti }
     *     
     */
    public void setDruh(DruhZivnosti value) {
        this.druh = value;
    }

    /**
     * Gets the value of the kzi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKZI() {
        return kzi;
    }

    /**
     * Sets the value of the kzi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKZI(String value) {
        this.kzi = value;
    }

    /**
     * Gets the value of the okec property.
     * 
     * @return
     *     possible object is
     *     {@link KodOkec3 }
     *     
     */
    public KodOkec3 getOKEC() {
        return okec;
    }

    /**
     * Sets the value of the okec property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodOkec3 }
     *     
     */
    public void setOKEC(KodOkec3 value) {
        this.okec = value;
    }

    /**
     * Gets the value of the pp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPP() {
        return pp;
    }

    /**
     * Sets the value of the pp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPP(String value) {
        this.pp = value;
    }

    /**
     * Gets the value of the oboryCinnosti property.
     * 
     * @return
     *     possible object is
     *     {@link OboryCinnosti3 }
     *     
     */
    public OboryCinnosti3 getOboryCinnosti() {
        return oboryCinnosti;
    }

    /**
     * Sets the value of the oboryCinnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link OboryCinnosti3 }
     *     
     */
    public void setOboryCinnosti(OboryCinnosti3 value) {
        this.oboryCinnosti = value;
    }

    /**
     * Gets the value of the vznik property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVznik() {
        return vznik;
    }

    /**
     * Sets the value of the vznik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVznik(XMLGregorianCalendar value) {
        this.vznik = value;
    }

    /**
     * Gets the value of the zahajeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZahajeni() {
        return zahajeni;
    }

    /**
     * Sets the value of the zahajeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZahajeni(XMLGregorianCalendar value) {
        this.zahajeni = value;
    }

    /**
     * Gets the value of the ukonceni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUkonceni() {
        return ukonceni;
    }

    /**
     * Sets the value of the ukonceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUkonceni(XMLGregorianCalendar value) {
        this.ukonceni = value;
    }

    /**
     * Gets the value of the zanik property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZanik() {
        return zanik;
    }

    /**
     * Sets the value of the zanik property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZanik(XMLGregorianCalendar value) {
        this.zanik = value;
    }

    /**
     * Gets the value of the pozastaveniOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPozastaveniOd() {
        return pozastaveniOd;
    }

    /**
     * Sets the value of the pozastaveniOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPozastaveniOd(XMLGregorianCalendar value) {
        this.pozastaveniOd = value;
    }

    /**
     * Gets the value of the pozastaveniDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPozastaveniDo() {
        return pozastaveniDo;
    }

    /**
     * Sets the value of the pozastaveniDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPozastaveniDo(XMLGregorianCalendar value) {
        this.pozastaveniDo = value;
    }

    /**
     * Gets the value of the rozsahPozastaveni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRozsahPozastaveni() {
        return rozsahPozastaveni;
    }

    /**
     * Sets the value of the rozsahPozastaveni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRozsahPozastaveni(String value) {
        this.rozsahPozastaveni = value;
    }

    /**
     * Gets the value of the preruseniOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreruseniOd() {
        return preruseniOd;
    }

    /**
     * Sets the value of the preruseniOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreruseniOd(XMLGregorianCalendar value) {
        this.preruseniOd = value;
    }

    /**
     * Gets the value of the preruseniDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreruseniDo() {
        return preruseniDo;
    }

    /**
     * Sets the value of the preruseniDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreruseniDo(XMLGregorianCalendar value) {
        this.preruseniDo = value;
    }

    /**
     * Gets the value of the pry property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovnyRZP }
     *     
     */
    public ProvozovnyRZP getPRY() {
        return pry;
    }

    /**
     * Sets the value of the pry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovnyRZP }
     *     
     */
    public void setPRY(ProvozovnyRZP value) {
        this.pry = value;
    }

}
