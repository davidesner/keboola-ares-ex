
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikaèníúdaje
 * 
 * <p>Java class for zakladni_udaje_RCNS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_RCNS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datum_zmeny" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SCI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="Nazev_CPO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="DIC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}dic" minOccurs="0"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *         &lt;element name="Typ_CNS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}typ_CNS" minOccurs="0"/>
 *         &lt;element name="Zkr_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zkr_statu" minOccurs="0"/>
 *         &lt;element name="NS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_statu" minOccurs="0"/>
 *         &lt;element name="KPF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_pravni_formy" minOccurs="0"/>
 *         &lt;element name="NPF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_pravni_formy" minOccurs="0"/>
 *         &lt;element name="RCI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registrace_RCNS" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Zvlastni_prava" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
 *         &lt;element name="Zpusob_jednani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" minOccurs="0"/>
 *         &lt;element name="Organy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}organy" minOccurs="0"/>
 *         &lt;element name="LII" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}organy" minOccurs="0"/>
 *         &lt;element name="Spravci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}organy" minOccurs="0"/>
 *         &lt;element name="CSV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ico" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RCNS", propOrder = {
    "datumZmeny",
    "la",
    "sci",
    "ico",
    "nazevCPO",
    "dic",
    "fu",
    "typCNS",
    "zkrStatu",
    "ns",
    "kpf",
    "npf",
    "rci",
    "a",
    "zvlastniPrava",
    "zpusobJednani",
    "organy",
    "lii",
    "spravci",
    "csv"
})
public class ZakladniUdajeRCNS3 {

    @XmlElement(name = "Datum_zmeny")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZmeny;
    @XmlElement(name = "LA")
    protected Integer la;
    @XmlElement(name = "SCI")
    protected String sci;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Nazev_CPO")
    protected String nazevCPO;
    @XmlElement(name = "DIC")
    protected Dic3 dic;
    @XmlElement(name = "FU")
    protected FinancniUrad3 fu;
    @XmlElement(name = "Typ_CNS")
    protected TypCNS3 typCNS;
    @XmlElement(name = "Zkr_statu")
    protected String zkrStatu;
    @XmlElement(name = "NS")
    protected String ns;
    @XmlElement(name = "KPF")
    protected Short kpf;
    @XmlElement(name = "NPF")
    protected String npf;
    @XmlElement(name = "RCI")
    protected RegistraceRCNS3 rci;
    @XmlElement(name = "A")
    protected List<AdresaARES3> a;
    @XmlElement(name = "Zvlastni_prava")
    protected Texty3 zvlastniPrava;
    @XmlElement(name = "Zpusob_jednani")
    protected Texty3 zpusobJednani;
    @XmlElement(name = "Organy")
    protected Organy3 organy;
    @XmlElement(name = "LII")
    protected Organy3 lii;
    @XmlElement(name = "Spravci")
    protected Organy3 spravci;
    @XmlElement(name = "CSV")
    protected List<Ico3> csv;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

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
     * Gets the value of the sci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCI() {
        return sci;
    }

    /**
     * Sets the value of the sci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCI(String value) {
        this.sci = value;
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
     * Gets the value of the nazevCPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCPO() {
        return nazevCPO;
    }

    /**
     * Sets the value of the nazevCPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCPO(String value) {
        this.nazevCPO = value;
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
     * Gets the value of the typCNS property.
     * 
     * @return
     *     possible object is
     *     {@link TypCNS3 }
     *     
     */
    public TypCNS3 getTypCNS() {
        return typCNS;
    }

    /**
     * Sets the value of the typCNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypCNS3 }
     *     
     */
    public void setTypCNS(TypCNS3 value) {
        this.typCNS = value;
    }

    /**
     * Gets the value of the zkrStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZkrStatu() {
        return zkrStatu;
    }

    /**
     * Sets the value of the zkrStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZkrStatu(String value) {
        this.zkrStatu = value;
    }

    /**
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNS() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNS(String value) {
        this.ns = value;
    }

    /**
     * Gets the value of the kpf property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKPF() {
        return kpf;
    }

    /**
     * Sets the value of the kpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKPF(Short value) {
        this.kpf = value;
    }

    /**
     * Gets the value of the npf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPF() {
        return npf;
    }

    /**
     * Sets the value of the npf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPF(String value) {
        this.npf = value;
    }

    /**
     * Gets the value of the rci property.
     * 
     * @return
     *     possible object is
     *     {@link RegistraceRCNS3 }
     *     
     */
    public RegistraceRCNS3 getRCI() {
        return rci;
    }

    /**
     * Sets the value of the rci property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistraceRCNS3 }
     *     
     */
    public void setRCI(RegistraceRCNS3 value) {
        this.rci = value;
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
     * {@link AdresaARES3 }
     * 
     * 
     */
    public List<AdresaARES3> getA() {
        if (a == null) {
            a = new ArrayList<AdresaARES3>();
        }
        return this.a;
    }

    /**
     * Gets the value of the zvlastniPrava property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getZvlastniPrava() {
        return zvlastniPrava;
    }

    /**
     * Sets the value of the zvlastniPrava property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setZvlastniPrava(Texty3 value) {
        this.zvlastniPrava = value;
    }

    /**
     * Gets the value of the zpusobJednani property.
     * 
     * @return
     *     possible object is
     *     {@link Texty3 }
     *     
     */
    public Texty3 getZpusobJednani() {
        return zpusobJednani;
    }

    /**
     * Sets the value of the zpusobJednani property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty3 }
     *     
     */
    public void setZpusobJednani(Texty3 value) {
        this.zpusobJednani = value;
    }

    /**
     * Gets the value of the organy property.
     * 
     * @return
     *     possible object is
     *     {@link Organy3 }
     *     
     */
    public Organy3 getOrgany() {
        return organy;
    }

    /**
     * Sets the value of the organy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organy3 }
     *     
     */
    public void setOrgany(Organy3 value) {
        this.organy = value;
    }

    /**
     * Gets the value of the lii property.
     * 
     * @return
     *     possible object is
     *     {@link Organy3 }
     *     
     */
    public Organy3 getLII() {
        return lii;
    }

    /**
     * Sets the value of the lii property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organy3 }
     *     
     */
    public void setLII(Organy3 value) {
        this.lii = value;
    }

    /**
     * Gets the value of the spravci property.
     * 
     * @return
     *     possible object is
     *     {@link Organy3 }
     *     
     */
    public Organy3 getSpravci() {
        return spravci;
    }

    /**
     * Sets the value of the spravci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organy3 }
     *     
     */
    public void setSpravci(Organy3 value) {
        this.spravci = value;
    }

    /**
     * Gets the value of the csv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCSV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ico3 }
     * 
     * 
     */
    public List<Ico3> getCSV() {
        if (csv == null) {
            csv = new ArrayList<Ico3>();
        }
        return this.csv;
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

}
