
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
 *         &lt;element name="POD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}stav"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ico" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cizi_nazev" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cizi_nazev" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PFO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pravni_forma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PFZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pravni_forma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ACR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ANF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="B" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UCR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FOR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}fyzicka_osoba" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}financni_urad" minOccurs="0"/>
 *         &lt;element name="DVOR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZOR" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Fuze" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="UI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}udalosti" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_OR", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "pod",
    "la",
    "s",
    "ico",
    "of",
    "ciziNazev",
    "pfo",
    "pfz",
    "si",
    "mp",
    "acr",
    "an",
    "anf",
    "b",
    "ucr",
    "a",
    "_for",
    "fu",
    "dvor",
    "dzor",
    "dz",
    "fuze",
    "ui"
})
public class ZakladniUdajeOR2 {

    @XmlElement(name = "POD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pod;
    @XmlElement(name = "LA")
    protected Integer la;
    @XmlElement(name = "S", required = true)
    protected Stav2 s;
    @XmlElement(name = "ICO")
    protected List<Ico2> ico;
    @XmlElement(name = "OF")
    protected List<ObchodniFirma2> of;
    @XmlElement(name = "Cizi_nazev")
    protected List<CiziNazev2> ciziNazev;
    @XmlElement(name = "PFO")
    protected List<PravniForma2> pfo;
    @XmlElement(name = "PFZ")
    protected List<PravniForma2> pfz;
    @XmlElement(name = "SI")
    protected List<AdresaARES2> si;
    @XmlElement(name = "MP")
    protected List<AdresaARES2> mp;
    @XmlElement(name = "ACR")
    protected List<AdresaARES2> acr;
    @XmlElement(name = "AN")
    protected List<AdresaARES2> an;
    @XmlElement(name = "ANF")
    protected List<AdresaARES2> anf;
    @XmlElement(name = "B")
    protected List<AdresaARES2> b;
    @XmlElement(name = "UCR")
    protected List<AdresaARES2> ucr;
    @XmlElement(name = "A")
    protected List<AdresaARES2> a;
    @XmlElement(name = "FOR")
    protected List<FyzickaOsoba2> _for;
    @XmlElement(name = "FU")
    protected FinancniUrad2 fu;
    @XmlElement(name = "DVOR")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dvor;
    @XmlElement(name = "DZOR")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dzor;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "Fuze")
    protected Short fuze;
    @XmlElement(name = "UI")
    protected Udalosti2 ui;

    /**
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPOD() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPOD(XMLGregorianCalendar value) {
        this.pod = value;
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
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link Stav2 }
     *     
     */
    public Stav2 getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav2 }
     *     
     */
    public void setS(Stav2 value) {
        this.s = value;
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
     * {@link Ico2 }
     * 
     * 
     */
    public List<Ico2> getICO() {
        if (ico == null) {
            ico = new ArrayList<Ico2>();
        }
        return this.ico;
    }

    /**
     * Gets the value of the of property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the of property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObchodniFirma2 }
     * 
     * 
     */
    public List<ObchodniFirma2> getOF() {
        if (of == null) {
            of = new ArrayList<ObchodniFirma2>();
        }
        return this.of;
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
     * {@link CiziNazev2 }
     * 
     * 
     */
    public List<CiziNazev2> getCiziNazev() {
        if (ciziNazev == null) {
            ciziNazev = new ArrayList<CiziNazev2>();
        }
        return this.ciziNazev;
    }

    /**
     * Gets the value of the pfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PravniForma2 }
     * 
     * 
     */
    public List<PravniForma2> getPFO() {
        if (pfo == null) {
            pfo = new ArrayList<PravniForma2>();
        }
        return this.pfo;
    }

    /**
     * Gets the value of the pfz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pfz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPFZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PravniForma2 }
     * 
     * 
     */
    public List<PravniForma2> getPFZ() {
        if (pfz == null) {
            pfz = new ArrayList<PravniForma2>();
        }
        return this.pfz;
    }

    /**
     * Gets the value of the si property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the si property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getSI() {
        if (si == null) {
            si = new ArrayList<AdresaARES2>();
        }
        return this.si;
    }

    /**
     * Gets the value of the mp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getMP() {
        if (mp == null) {
            mp = new ArrayList<AdresaARES2>();
        }
        return this.mp;
    }

    /**
     * Gets the value of the acr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getACR() {
        if (acr == null) {
            acr = new ArrayList<AdresaARES2>();
        }
        return this.acr;
    }

    /**
     * Gets the value of the an property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the an property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getAN() {
        if (an == null) {
            an = new ArrayList<AdresaARES2>();
        }
        return this.an;
    }

    /**
     * Gets the value of the anf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getANF() {
        if (anf == null) {
            anf = new ArrayList<AdresaARES2>();
        }
        return this.anf;
    }

    /**
     * Gets the value of the b property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the b property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getB() {
        if (b == null) {
            b = new ArrayList<AdresaARES2>();
        }
        return this.b;
    }

    /**
     * Gets the value of the ucr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getUCR() {
        if (ucr == null) {
            ucr = new ArrayList<AdresaARES2>();
        }
        return this.ucr;
    }

    /**
     * Gets the value of the a property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the a property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getA() {
        if (a == null) {
            a = new ArrayList<AdresaARES2>();
        }
        return this.a;
    }

    /**
     * Gets the value of the for property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the for property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FyzickaOsoba2 }
     * 
     * 
     */
    public List<FyzickaOsoba2> getFOR() {
        if (_for == null) {
            _for = new ArrayList<FyzickaOsoba2>();
        }
        return this._for;
    }

    /**
     * Gets the value of the fu property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad2 }
     *     
     */
    public FinancniUrad2 getFU() {
        return fu;
    }

    /**
     * Sets the value of the fu property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad2 }
     *     
     */
    public void setFU(FinancniUrad2 value) {
        this.fu = value;
    }

    /**
     * Gets the value of the dvor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDVOR() {
        return dvor;
    }

    /**
     * Sets the value of the dvor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDVOR(XMLGregorianCalendar value) {
        this.dvor = value;
    }

    /**
     * Gets the value of the dzor property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDZOR() {
        return dzor;
    }

    /**
     * Sets the value of the dzor property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDZOR(XMLGregorianCalendar value) {
        this.dzor = value;
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
     * Gets the value of the ui property.
     * 
     * @return
     *     possible object is
     *     {@link Udalosti2 }
     *     
     */
    public Udalosti2 getUI() {
        return ui;
    }

    /**
     * Sets the value of the ui property.
     * 
     * @param value
     *     allowed object is
     *     {@link Udalosti2 }
     *     
     */
    public void setUI(Udalosti2 value) {
        this.ui = value;
    }

}
