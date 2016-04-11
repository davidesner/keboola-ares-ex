
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
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ico"/>
 *         &lt;element name="DIC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}dic" minOccurs="0"/>
 *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}obchodni_firma"/>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravni_forma" minOccurs="0"/>
 *         &lt;element name="Doplnujici_PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}doplnujici_pravni_formy" minOccurs="0"/>
 *         &lt;element name="AD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_dorucovaci" minOccurs="0"/>
 *         &lt;element name="AA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Adr_puv" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="PSU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}priznaky_subjektu" minOccurs="0"/>
 *         &lt;element name="ROR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registrace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RRZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registrace_RZP" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SCEU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_subjektu_ceu" minOccurs="0"/>
 *         &lt;element name="KPP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kategorie_poctu_pracovniku" minOccurs="0"/>
 *         &lt;element name="OKECE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}okec" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PPI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}predmety_podnikani" minOccurs="0"/>
 *         &lt;element name="Obory_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}obory_cinnosti" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_basic", propOrder = {
    "ico",
    "dic",
    "of",
    "dv",
    "dz",
    "pf",
    "doplnujiciPF",
    "ad",
    "aa",
    "adrPuv",
    "psu",
    "ror",
    "rrz",
    "sceu",
    "kpp",
    "okece",
    "nace",
    "ppi",
    "oboryCinnosti"
})
public class VypisBasic3 {

    @XmlElement(name = "ICO", required = true)
    protected Ico3 ico;
    @XmlElement(name = "DIC")
    protected Dic3 dic;
    @XmlElement(name = "OF", required = true)
    protected ObchodniFirma3 of;
    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "PF")
    protected PravniForma3 pf;
    @XmlElement(name = "Doplnujici_PF")
    protected DoplnujiciPravniFormy3 doplnujiciPF;
    @XmlElement(name = "AD")
    protected AdresaDorucovaci3 ad;
    @XmlElement(name = "AA")
    protected AdresaARES3 aa;
    @XmlElement(name = "Adr_puv")
    protected AdresaARES3 adrPuv;
    @XmlElement(name = "PSU")
    protected String psu;
    @XmlElement(name = "ROR")
    protected List<Registrace3> ror;
    @XmlElement(name = "RRZ")
    protected List<RegistraceRZP3> rrz;
    @XmlElement(name = "SCEU")
    protected StavSubjektuCeu3 sceu;
    @XmlElement(name = "KPP")
    protected KategoriePoctuPracovniku3 kpp;
    @XmlElement(name = "OKECE")
    protected List<Okec3> okece;
    @XmlElement(name = "Nace")
    protected List<Nace3> nace;
    @XmlElement(name = "PPI")
    protected PredmetyPodnikani3 ppi;
    @XmlElement(name = "Obory_cinnosti")
    protected OboryCinnosti3 oboryCinnosti;

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link Ico3 }
     *     
     */
    public Ico3 getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ico3 }
     *     
     */
    public void setICO(Ico3 value) {
        this.ico = value;
    }

    /**
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link Dic3 }
     *     
     */
    public Dic3 getDIC() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dic3 }
     *     
     */
    public void setDIC(Dic3 value) {
        this.dic = value;
    }

    /**
     * Gets the value of the of property.
     * 
     * @return
     *     possible object is
     *     {@link ObchodniFirma3 }
     *     
     */
    public ObchodniFirma3 getOF() {
        return of;
    }

    /**
     * Sets the value of the of property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObchodniFirma3 }
     *     
     */
    public void setOF(ObchodniFirma3 value) {
        this.of = value;
    }

    /**
     * Gets the value of the dv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDV() {
        return dv;
    }

    /**
     * Sets the value of the dv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDV(XMLGregorianCalendar value) {
        this.dv = value;
    }

    /**
     * Gets the value of the dz property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDZ() {
        return dz;
    }

    /**
     * Sets the value of the dz property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDZ(XMLGregorianCalendar value) {
        this.dz = value;
    }

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma3 }
     *     
     */
    public PravniForma3 getPF() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma3 }
     *     
     */
    public void setPF(PravniForma3 value) {
        this.pf = value;
    }

    /**
     * Gets the value of the doplnujiciPF property.
     * 
     * @return
     *     possible object is
     *     {@link DoplnujiciPravniFormy3 }
     *     
     */
    public DoplnujiciPravniFormy3 getDoplnujiciPF() {
        return doplnujiciPF;
    }

    /**
     * Sets the value of the doplnujiciPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoplnujiciPravniFormy3 }
     *     
     */
    public void setDoplnujiciPF(DoplnujiciPravniFormy3 value) {
        this.doplnujiciPF = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaDorucovaci3 }
     *     
     */
    public AdresaDorucovaci3 getAD() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaDorucovaci3 }
     *     
     */
    public void setAD(AdresaDorucovaci3 value) {
        this.ad = value;
    }

    /**
     * Gets the value of the aa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getAA() {
        return aa;
    }

    /**
     * Sets the value of the aa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setAA(AdresaARES3 value) {
        this.aa = value;
    }

    /**
     * Gets the value of the adrPuv property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getAdrPuv() {
        return adrPuv;
    }

    /**
     * Sets the value of the adrPuv property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setAdrPuv(AdresaARES3 value) {
        this.adrPuv = value;
    }

    /**
     * Gets the value of the psu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSU() {
        return psu;
    }

    /**
     * Sets the value of the psu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSU(String value) {
        this.psu = value;
    }

    /**
     * Gets the value of the ror property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ror property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registrace3 }
     * 
     * 
     */
    public List<Registrace3> getROR() {
        if (ror == null) {
            ror = new ArrayList<Registrace3>();
        }
        return this.ror;
    }

    /**
     * Gets the value of the rrz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rrz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRRZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistraceRZP3 }
     * 
     * 
     */
    public List<RegistraceRZP3> getRRZ() {
        if (rrz == null) {
            rrz = new ArrayList<RegistraceRZP3>();
        }
        return this.rrz;
    }

    /**
     * Gets the value of the sceu property.
     * 
     * @return
     *     possible object is
     *     {@link StavSubjektuCeu3 }
     *     
     */
    public StavSubjektuCeu3 getSCEU() {
        return sceu;
    }

    /**
     * Sets the value of the sceu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavSubjektuCeu3 }
     *     
     */
    public void setSCEU(StavSubjektuCeu3 value) {
        this.sceu = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link KategoriePoctuPracovniku3 }
     *     
     */
    public KategoriePoctuPracovniku3 getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategoriePoctuPracovniku3 }
     *     
     */
    public void setKPP(KategoriePoctuPracovniku3 value) {
        this.kpp = value;
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
     * {@link Okec3 }
     * 
     * 
     */
    public List<Okec3> getOKECE() {
        if (okece == null) {
            okece = new ArrayList<Okec3>();
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
     * {@link Nace3 }
     * 
     * 
     */
    public List<Nace3> getNace() {
        if (nace == null) {
            nace = new ArrayList<Nace3>();
        }
        return this.nace;
    }

    /**
     * Gets the value of the ppi property.
     * 
     * @return
     *     possible object is
     *     {@link PredmetyPodnikani3 }
     *     
     */
    public PredmetyPodnikani3 getPPI() {
        return ppi;
    }

    /**
     * Sets the value of the ppi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredmetyPodnikani3 }
     *     
     */
    public void setPPI(PredmetyPodnikani3 value) {
        this.ppi = value;
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

}
