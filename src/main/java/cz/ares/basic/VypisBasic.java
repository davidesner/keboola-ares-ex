
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
 * <p>Java class for vypis_basic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_basic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ico"/>
 *         &lt;element name="DIC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}dic" minOccurs="0"/>
 *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}obchodni_firma"/>
 *         &lt;element name="Datum_vzniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_zaniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Pravni_forma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pravni_forma" minOccurs="0"/>
 *         &lt;element name="Doplnujici_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}doplnujici_pravni_formy" minOccurs="0"/>
 *         &lt;element name="Adresa_dorucovaci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_dorucovaci" minOccurs="0"/>
 *         &lt;element name="Adresa_ARES" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Adr_puv" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Priznaky_subjektu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}priznaky_subjektu" minOccurs="0"/>
 *         &lt;element name="Registrace_OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}registrace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Registrace_RZP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}registrace_RZP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Stav_subjektu_CEU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav_subjektu_ceu" minOccurs="0"/>
 *         &lt;element name="Kategorie_poctu_pracovniku" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kategorie_poctu_pracovniku" minOccurs="0"/>
 *         &lt;element name="OKECE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}okec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Predmety_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}predmety_podnikani" minOccurs="0"/>
 *         &lt;element name="Obory_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}obory_cinnosti" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_basic", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "ico",
    "dic",
    "obchodniFirma",
    "datumVzniku",
    "datumZaniku",
    "pravniForma",
    "doplnujiciPF",
    "adresaDorucovaci",
    "adresaARES",
    "adrPuv",
    "priznakySubjektu",
    "registraceOR",
    "registraceRZP",
    "stavSubjektuCEU",
    "kategoriePoctuPracovniku",
    "okece",
    "nace",
    "predmetyPodnikani",
    "oboryCinnosti"
})
public class VypisBasic {

    @XmlElement(name = "ICO", required = true)
    protected Ico ico;
    @XmlElement(name = "DIC")
    protected Dic dic;
    @XmlElement(name = "Obchodni_firma", required = true)
    protected ObchodniFirma obchodniFirma;
    @XmlElement(name = "Datum_vzniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVzniku;
    @XmlElement(name = "Datum_zaniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZaniku;
    @XmlElement(name = "Pravni_forma")
    protected PravniForma pravniForma;
    @XmlElement(name = "Doplnujici_PF")
    protected DoplnujiciPravniFormy doplnujiciPF;
    @XmlElement(name = "Adresa_dorucovaci")
    protected AdresaDorucovaci adresaDorucovaci;
    @XmlElement(name = "Adresa_ARES")
    protected AdresaARES adresaARES;
    @XmlElement(name = "Adr_puv")
    protected AdresaARES adrPuv;
    @XmlElement(name = "Priznaky_subjektu")
    protected String priznakySubjektu;
    @XmlElement(name = "Registrace_OR")
    protected List<Registrace> registraceOR;
    @XmlElement(name = "Registrace_RZP")
    protected List<RegistraceRZP> registraceRZP;
    @XmlElement(name = "Stav_subjektu_CEU")
    protected StavSubjektuCeu stavSubjektuCEU;
    @XmlElement(name = "Kategorie_poctu_pracovniku")
    protected KategoriePoctuPracovniku kategoriePoctuPracovniku;
    @XmlElement(name = "OKECE")
    protected List<Okec> okece;
    @XmlElement(name = "Nace")
    protected List<Nace> nace;
    @XmlElement(name = "Predmety_podnikani")
    protected PredmetyPodnikani predmetyPodnikani;
    @XmlElement(name = "Obory_cinnosti")
    protected OboryCinnosti oboryCinnosti;

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link Ico }
     *     
     */
    public Ico getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ico }
     *     
     */
    public void setICO(Ico value) {
        this.ico = value;
    }

    /**
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link Dic }
     *     
     */
    public Dic getDIC() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dic }
     *     
     */
    public void setDIC(Dic value) {
        this.dic = value;
    }

    /**
     * Gets the value of the obchodniFirma property.
     * 
     * @return
     *     possible object is
     *     {@link ObchodniFirma }
     *     
     */
    public ObchodniFirma getObchodniFirma() {
        return obchodniFirma;
    }

    /**
     * Sets the value of the obchodniFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObchodniFirma }
     *     
     */
    public void setObchodniFirma(ObchodniFirma value) {
        this.obchodniFirma = value;
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
     * Gets the value of the pravniForma property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma }
     *     
     */
    public PravniForma getPravniForma() {
        return pravniForma;
    }

    /**
     * Sets the value of the pravniForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma }
     *     
     */
    public void setPravniForma(PravniForma value) {
        this.pravniForma = value;
    }

    /**
     * Gets the value of the doplnujiciPF property.
     * 
     * @return
     *     possible object is
     *     {@link DoplnujiciPravniFormy }
     *     
     */
    public DoplnujiciPravniFormy getDoplnujiciPF() {
        return doplnujiciPF;
    }

    /**
     * Sets the value of the doplnujiciPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoplnujiciPravniFormy }
     *     
     */
    public void setDoplnujiciPF(DoplnujiciPravniFormy value) {
        this.doplnujiciPF = value;
    }

    /**
     * Gets the value of the adresaDorucovaci property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaDorucovaci }
     *     
     */
    public AdresaDorucovaci getAdresaDorucovaci() {
        return adresaDorucovaci;
    }

    /**
     * Sets the value of the adresaDorucovaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaDorucovaci }
     *     
     */
    public void setAdresaDorucovaci(AdresaDorucovaci value) {
        this.adresaDorucovaci = value;
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

    /**
     * Gets the value of the adrPuv property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdrPuv() {
        return adrPuv;
    }

    /**
     * Sets the value of the adrPuv property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdrPuv(AdresaARES value) {
        this.adrPuv = value;
    }

    /**
     * Gets the value of the priznakySubjektu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriznakySubjektu() {
        return priznakySubjektu;
    }

    /**
     * Sets the value of the priznakySubjektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriznakySubjektu(String value) {
        this.priznakySubjektu = value;
    }

    /**
     * Gets the value of the registraceOR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registraceOR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistraceOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registrace }
     * 
     * 
     */
    public List<Registrace> getRegistraceOR() {
        if (registraceOR == null) {
            registraceOR = new ArrayList<Registrace>();
        }
        return this.registraceOR;
    }

    /**
     * Gets the value of the registraceRZP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registraceRZP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistraceRZP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistraceRZP }
     * 
     * 
     */
    public List<RegistraceRZP> getRegistraceRZP() {
        if (registraceRZP == null) {
            registraceRZP = new ArrayList<RegistraceRZP>();
        }
        return this.registraceRZP;
    }

    /**
     * Gets the value of the stavSubjektuCEU property.
     * 
     * @return
     *     possible object is
     *     {@link StavSubjektuCeu }
     *     
     */
    public StavSubjektuCeu getStavSubjektuCEU() {
        return stavSubjektuCEU;
    }

    /**
     * Sets the value of the stavSubjektuCEU property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavSubjektuCeu }
     *     
     */
    public void setStavSubjektuCEU(StavSubjektuCeu value) {
        this.stavSubjektuCEU = value;
    }

    /**
     * Gets the value of the kategoriePoctuPracovniku property.
     * 
     * @return
     *     possible object is
     *     {@link KategoriePoctuPracovniku }
     *     
     */
    public KategoriePoctuPracovniku getKategoriePoctuPracovniku() {
        return kategoriePoctuPracovniku;
    }

    /**
     * Sets the value of the kategoriePoctuPracovniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategoriePoctuPracovniku }
     *     
     */
    public void setKategoriePoctuPracovniku(KategoriePoctuPracovniku value) {
        this.kategoriePoctuPracovniku = value;
    }

    /**
     * Gets the value of the okece property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okece property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOKECE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Okec }
     * 
     * 
     */
    public List<Okec> getOKECE() {
        if (okece == null) {
            okece = new ArrayList<Okec>();
        }
        return this.okece;
    }

    /**
     * Gets the value of the nace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nace }
     * 
     * 
     */
    public List<Nace> getNace() {
        if (nace == null) {
            nace = new ArrayList<Nace>();
        }
        return this.nace;
    }

    /**
     * Gets the value of the predmetyPodnikani property.
     * 
     * @return
     *     possible object is
     *     {@link PredmetyPodnikani }
     *     
     */
    public PredmetyPodnikani getPredmetyPodnikani() {
        return predmetyPodnikani;
    }

    /**
     * Sets the value of the predmetyPodnikani property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredmetyPodnikani }
     *     
     */
    public void setPredmetyPodnikani(PredmetyPodnikani value) {
        this.predmetyPodnikani = value;
    }

    /**
     * Gets the value of the oboryCinnosti property.
     * 
     * @return
     *     possible object is
     *     {@link OboryCinnosti }
     *     
     */
    public OboryCinnosti getOboryCinnosti() {
        return oboryCinnosti;
    }

    /**
     * Sets the value of the oboryCinnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link OboryCinnosti }
     *     
     */
    public void setOboryCinnosti(OboryCinnosti value) {
        this.oboryCinnosti = value;
    }

}
