
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Výpis detailu z registru obèanských sdružení a spolkù v ARES
 * 
 * <p>Java class for vypis_oss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_oss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="S" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_oss" minOccurs="0"/>
 *         &lt;element name="Datum_zmeny" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravni_forma" minOccurs="0"/>
 *         &lt;element name="Nazev_OSS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nazev_oss" minOccurs="0"/>
 *         &lt;element name="Datum_nazev" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_reg" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}parent_oss" minOccurs="0"/>
 *         &lt;element name="OSY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}org_slozky_oss" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_oss", propOrder = {
    "s",
    "datumZmeny",
    "la",
    "ico",
    "pf",
    "nazevOSS",
    "datumNazev",
    "datumReg",
    "si",
    "dz",
    "parent",
    "osy"
})
public class VypisOss {

    @XmlElement(name = "S")
    protected StavOss s;
    @XmlElement(name = "Datum_zmeny")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZmeny;
    @XmlElement(name = "LA")
    protected Integer la;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "PF")
    protected PravniForma3 pf;
    @XmlElement(name = "Nazev_OSS")
    protected NazevOss nazevOSS;
    @XmlElement(name = "Datum_nazev")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNazev;
    @XmlElement(name = "Datum_reg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumReg;
    @XmlElement(name = "SI")
    protected AdresaARES3 si;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "Parent")
    protected ParentOss parent;
    @XmlElement(name = "OSY")
    protected OrgSlozkyOss osy;

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link StavOss }
     *     
     */
    public StavOss getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavOss }
     *     
     */
    public void setS(StavOss value) {
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
     * Gets the value of the nazevOSS property.
     * 
     * @return
     *     possible object is
     *     {@link NazevOss }
     *     
     */
    public NazevOss getNazevOSS() {
        return nazevOSS;
    }

    /**
     * Sets the value of the nazevOSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link NazevOss }
     *     
     */
    public void setNazevOSS(NazevOss value) {
        this.nazevOSS = value;
    }

    /**
     * Gets the value of the datumNazev property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNazev() {
        return datumNazev;
    }

    /**
     * Sets the value of the datumNazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNazev(XMLGregorianCalendar value) {
        this.datumNazev = value;
    }

    /**
     * Gets the value of the datumReg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumReg() {
        return datumReg;
    }

    /**
     * Sets the value of the datumReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumReg(XMLGregorianCalendar value) {
        this.datumReg = value;
    }

    /**
     * Gets the value of the si property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getSI() {
        return si;
    }

    /**
     * Sets the value of the si property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setSI(AdresaARES3 value) {
        this.si = value;
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
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link ParentOss }
     *     
     */
    public ParentOss getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentOss }
     *     
     */
    public void setParent(ParentOss value) {
        this.parent = value;
    }

    /**
     * Gets the value of the osy property.
     * 
     * @return
     *     possible object is
     *     {@link OrgSlozkyOss }
     *     
     */
    public OrgSlozkyOss getOSY() {
        return osy;
    }

    /**
     * Sets the value of the osy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgSlozkyOss }
     *     
     */
    public void setOSY(OrgSlozkyOss value) {
        this.osy = value;
    }

}
