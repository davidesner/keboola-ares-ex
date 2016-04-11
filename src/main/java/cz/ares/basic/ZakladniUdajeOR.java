
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikaèní a alokaèní údaje ekonomického subjektu
 * 
 * <p>Java class for zakladni_udaje_OR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_OR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Klic_ARES" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ico" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cizi_nazev" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cizi_nazev" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pravni_forma_OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pravni_forma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PF_zakladatele" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pravni_forma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Misto_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Adresa_v_CR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Adresa_nadace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Adresa_nadacniho_fondu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Bydliste" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Umisteni_v_CR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fyzicka_osoba_OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}fyzicka_osoba" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Financni_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}financni_urad" minOccurs="0"/>
 *         &lt;element name="Datum_vzniku_OR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_zapisu_OR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_zaniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Fuze" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Udalosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}udalosti" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_OR", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "platnostOd",
    "klicARES",
    "stav",
    "ico",
    "obchodniFirma",
    "ciziNazev",
    "pravniFormaOR",
    "pfZakladatele",
    "sidlo",
    "mistoPodnikani",
    "adresaVCR",
    "adresaNadace",
    "adresaNadacnihoFondu",
    "bydliste",
    "umisteniVCR",
    "adresa",
    "fyzickaOsobaOR",
    "financniUrad",
    "datumVznikuOR",
    "datumZapisuOR",
    "datumZaniku",
    "fuze",
    "udalosti"
})
public class ZakladniUdajeOR {

    @XmlElement(name = "Platnost_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostOd;
    @XmlElement(name = "Klic_ARES")
    protected Integer klicARES;
    @XmlElement(name = "Stav", required = true)
    protected Stav stav;
    @XmlElement(name = "ICO")
    protected List<Ico> ico;
    @XmlElement(name = "Obchodni_firma")
    protected List<ObchodniFirma> obchodniFirma;
    @XmlElement(name = "Cizi_nazev")
    protected List<CiziNazev> ciziNazev;
    @XmlElement(name = "Pravni_forma_OR")
    protected List<PravniForma> pravniFormaOR;
    @XmlElement(name = "PF_zakladatele")
    protected List<PravniForma> pfZakladatele;
    @XmlElement(name = "Sidlo")
    protected List<AdresaARES> sidlo;
    @XmlElement(name = "Misto_podnikani")
    protected List<AdresaARES> mistoPodnikani;
    @XmlElement(name = "Adresa_v_CR")
    protected List<AdresaARES> adresaVCR;
    @XmlElement(name = "Adresa_nadace")
    protected List<AdresaARES> adresaNadace;
    @XmlElement(name = "Adresa_nadacniho_fondu")
    protected List<AdresaARES> adresaNadacnihoFondu;
    @XmlElement(name = "Bydliste")
    protected List<AdresaARES> bydliste;
    @XmlElement(name = "Umisteni_v_CR")
    protected List<AdresaARES> umisteniVCR;
    @XmlElement(name = "Adresa")
    protected List<AdresaARES> adresa;
    @XmlElement(name = "Fyzicka_osoba_OR")
    protected List<FyzickaOsoba> fyzickaOsobaOR;
    @XmlElement(name = "Financni_urad")
    protected FinancniUrad financniUrad;
    @XmlElement(name = "Datum_vzniku_OR")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVznikuOR;
    @XmlElement(name = "Datum_zapisu_OR")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZapisuOR;
    @XmlElement(name = "Datum_zaniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZaniku;
    @XmlElement(name = "Fuze")
    protected Short fuze;
    @XmlElement(name = "Udalosti")
    protected Udalosti udalosti;

    /**
     * Gets the value of the platnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostOd() {
        return platnostOd;
    }

    /**
     * Sets the value of the platnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostOd(XMLGregorianCalendar value) {
        this.platnostOd = value;
    }

    /**
     * Gets the value of the klicARES property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlicARES() {
        return klicARES;
    }

    /**
     * Sets the value of the klicARES property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlicARES(Integer value) {
        this.klicARES = value;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link Stav }
     *     
     */
    public Stav getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav }
     *     
     */
    public void setStav(Stav value) {
        this.stav = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getICO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ico }
     * 
     * 
     */
    public List<Ico> getICO() {
        if (ico == null) {
            ico = new ArrayList<Ico>();
        }
        return this.ico;
    }

    /**
     * Gets the value of the obchodniFirma property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obchodniFirma property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObchodniFirma().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObchodniFirma }
     * 
     * 
     */
    public List<ObchodniFirma> getObchodniFirma() {
        if (obchodniFirma == null) {
            obchodniFirma = new ArrayList<ObchodniFirma>();
        }
        return this.obchodniFirma;
    }

    /**
     * Gets the value of the ciziNazev property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ciziNazev property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCiziNazev().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CiziNazev }
     * 
     * 
     */
    public List<CiziNazev> getCiziNazev() {
        if (ciziNazev == null) {
            ciziNazev = new ArrayList<CiziNazev>();
        }
        return this.ciziNazev;
    }

    /**
     * Gets the value of the pravniFormaOR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pravniFormaOR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPravniFormaOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PravniForma }
     * 
     * 
     */
    public List<PravniForma> getPravniFormaOR() {
        if (pravniFormaOR == null) {
            pravniFormaOR = new ArrayList<PravniForma>();
        }
        return this.pravniFormaOR;
    }

    /**
     * Gets the value of the pfZakladatele property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfZakladatele property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFZakladatele().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PravniForma }
     * 
     * 
     */
    public List<PravniForma> getPFZakladatele() {
        if (pfZakladatele == null) {
            pfZakladatele = new ArrayList<PravniForma>();
        }
        return this.pfZakladatele;
    }

    /**
     * Gets the value of the sidlo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sidlo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSidlo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getSidlo() {
        if (sidlo == null) {
            sidlo = new ArrayList<AdresaARES>();
        }
        return this.sidlo;
    }

    /**
     * Gets the value of the mistoPodnikani property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mistoPodnikani property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMistoPodnikani().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getMistoPodnikani() {
        if (mistoPodnikani == null) {
            mistoPodnikani = new ArrayList<AdresaARES>();
        }
        return this.mistoPodnikani;
    }

    /**
     * Gets the value of the adresaVCR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresaVCR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresaVCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getAdresaVCR() {
        if (adresaVCR == null) {
            adresaVCR = new ArrayList<AdresaARES>();
        }
        return this.adresaVCR;
    }

    /**
     * Gets the value of the adresaNadace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresaNadace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresaNadace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getAdresaNadace() {
        if (adresaNadace == null) {
            adresaNadace = new ArrayList<AdresaARES>();
        }
        return this.adresaNadace;
    }

    /**
     * Gets the value of the adresaNadacnihoFondu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresaNadacnihoFondu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresaNadacnihoFondu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getAdresaNadacnihoFondu() {
        if (adresaNadacnihoFondu == null) {
            adresaNadacnihoFondu = new ArrayList<AdresaARES>();
        }
        return this.adresaNadacnihoFondu;
    }

    /**
     * Gets the value of the bydliste property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bydliste property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBydliste().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getBydliste() {
        if (bydliste == null) {
            bydliste = new ArrayList<AdresaARES>();
        }
        return this.bydliste;
    }

    /**
     * Gets the value of the umisteniVCR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the umisteniVCR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUmisteniVCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getUmisteniVCR() {
        if (umisteniVCR == null) {
            umisteniVCR = new ArrayList<AdresaARES>();
        }
        return this.umisteniVCR;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES }
     * 
     * 
     */
    public List<AdresaARES> getAdresa() {
        if (adresa == null) {
            adresa = new ArrayList<AdresaARES>();
        }
        return this.adresa;
    }

    /**
     * Gets the value of the fyzickaOsobaOR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fyzickaOsobaOR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFyzickaOsobaOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FyzickaOsoba }
     * 
     * 
     */
    public List<FyzickaOsoba> getFyzickaOsobaOR() {
        if (fyzickaOsobaOR == null) {
            fyzickaOsobaOR = new ArrayList<FyzickaOsoba>();
        }
        return this.fyzickaOsobaOR;
    }

    /**
     * Gets the value of the financniUrad property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad }
     *     
     */
    public FinancniUrad getFinancniUrad() {
        return financniUrad;
    }

    /**
     * Sets the value of the financniUrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad }
     *     
     */
    public void setFinancniUrad(FinancniUrad value) {
        this.financniUrad = value;
    }

    /**
     * Gets the value of the datumVznikuOR property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVznikuOR() {
        return datumVznikuOR;
    }

    /**
     * Sets the value of the datumVznikuOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVznikuOR(XMLGregorianCalendar value) {
        this.datumVznikuOR = value;
    }

    /**
     * Gets the value of the datumZapisuOR property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZapisuOR() {
        return datumZapisuOR;
    }

    /**
     * Sets the value of the datumZapisuOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZapisuOR(XMLGregorianCalendar value) {
        this.datumZapisuOR = value;
    }

    /**
     * Gets the value of the datumZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZaniku() {
        return datumZaniku;
    }

    /**
     * Sets the value of the datumZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZaniku(XMLGregorianCalendar value) {
        this.datumZaniku = value;
    }

    /**
     * Gets the value of the fuze property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFuze() {
        return fuze;
    }

    /**
     * Sets the value of the fuze property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFuze(Short value) {
        this.fuze = value;
    }

    /**
     * Gets the value of the udalosti property.
     * 
     * @return
     *     possible object is
     *     {@link Udalosti }
     *     
     */
    public Udalosti getUdalosti() {
        return udalosti;
    }

    /**
     * Sets the value of the udalosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Udalosti }
     *     
     */
    public void setUdalosti(Udalosti value) {
        this.udalosti = value;
    }

}
