
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o subjektu v RPSH
 * 
 * <p>Java class for subjekt_rpsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subjekt_rpsh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Klic_RPSH" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Ico" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="Typ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DRE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Datum_aktualizace" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Cislo_registrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FUA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *         &lt;element name="S" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_subjektu"/>
 *         &lt;element name="Nazvy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nazvy_rpsh" minOccurs="0"/>
 *         &lt;element name="Osoby" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osoby_rpsh" minOccurs="0"/>
 *         &lt;element name="Adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresy_rpsh" minOccurs="0"/>
 *         &lt;element name="SOY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}statut_organy_rpsh" minOccurs="0"/>
 *         &lt;element name="Zmeny_stanov" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zmeny_stanov_rpsh" minOccurs="0"/>
 *         &lt;element name="SY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stavy_subj_rpsh" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjekt_rpsh", propOrder = {
    "la",
    "klicRPSH",
    "ico",
    "typ",
    "dre",
    "datumAktualizace",
    "cisloRegistrace",
    "fua",
    "s",
    "nazvy",
    "osoby",
    "adresy",
    "soy",
    "zmenyStanov",
    "sy"
})
public class SubjektRpsh {

    @XmlElement(name = "LA")
    protected Integer la;
    @XmlElement(name = "Klic_RPSH")
    protected Integer klicRPSH;
    @XmlElement(name = "Ico")
    protected String ico;
    @XmlElement(name = "Typ")
    protected Byte typ;
    @XmlElement(name = "DRE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dre;
    @XmlElement(name = "Datum_aktualizace")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAktualizace;
    @XmlElement(name = "Cislo_registrace")
    protected String cisloRegistrace;
    @XmlElement(name = "FUA")
    protected FinancniUrad3 fua;
    @XmlElement(name = "S", required = true)
    protected StavSubjektu3 s;
    @XmlElement(name = "Nazvy")
    protected NazvyRpsh nazvy;
    @XmlElement(name = "Osoby")
    protected OsobyRpsh osoby;
    @XmlElement(name = "Adresy")
    protected AdresyRpsh adresy;
    @XmlElement(name = "SOY")
    protected StatutOrganyRpsh soy;
    @XmlElement(name = "Zmeny_stanov")
    protected ZmenyStanovRpsh zmenyStanov;
    @XmlElement(name = "SY")
    protected StavySubjRpsh sy;

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
     * Gets the value of the klicRPSH property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlicRPSH() {
        return klicRPSH;
    }

    /**
     * Sets the value of the klicRPSH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlicRPSH(Integer value) {
        this.klicRPSH = value;
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
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTyp(Byte value) {
        this.typ = value;
    }

    /**
     * Gets the value of the dre property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDRE() {
        return dre;
    }

    /**
     * Sets the value of the dre property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDRE(XMLGregorianCalendar value) {
        this.dre = value;
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
     * Gets the value of the cisloRegistrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloRegistrace() {
        return cisloRegistrace;
    }

    /**
     * Sets the value of the cisloRegistrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloRegistrace(String value) {
        this.cisloRegistrace = value;
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
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link StavSubjektu3 }
     *     
     */
    public StavSubjektu3 getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavSubjektu3 }
     *     
     */
    public void setS(StavSubjektu3 value) {
        this.s = value;
    }

    /**
     * Gets the value of the nazvy property.
     * 
     * @return
     *     possible object is
     *     {@link NazvyRpsh }
     *     
     */
    public NazvyRpsh getNazvy() {
        return nazvy;
    }

    /**
     * Sets the value of the nazvy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NazvyRpsh }
     *     
     */
    public void setNazvy(NazvyRpsh value) {
        this.nazvy = value;
    }

    /**
     * Gets the value of the osoby property.
     * 
     * @return
     *     possible object is
     *     {@link OsobyRpsh }
     *     
     */
    public OsobyRpsh getOsoby() {
        return osoby;
    }

    /**
     * Sets the value of the osoby property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobyRpsh }
     *     
     */
    public void setOsoby(OsobyRpsh value) {
        this.osoby = value;
    }

    /**
     * Gets the value of the adresy property.
     * 
     * @return
     *     possible object is
     *     {@link AdresyRpsh }
     *     
     */
    public AdresyRpsh getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresyRpsh }
     *     
     */
    public void setAdresy(AdresyRpsh value) {
        this.adresy = value;
    }

    /**
     * Gets the value of the soy property.
     * 
     * @return
     *     possible object is
     *     {@link StatutOrganyRpsh }
     *     
     */
    public StatutOrganyRpsh getSOY() {
        return soy;
    }

    /**
     * Sets the value of the soy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutOrganyRpsh }
     *     
     */
    public void setSOY(StatutOrganyRpsh value) {
        this.soy = value;
    }

    /**
     * Gets the value of the zmenyStanov property.
     * 
     * @return
     *     possible object is
     *     {@link ZmenyStanovRpsh }
     *     
     */
    public ZmenyStanovRpsh getZmenyStanov() {
        return zmenyStanov;
    }

    /**
     * Sets the value of the zmenyStanov property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZmenyStanovRpsh }
     *     
     */
    public void setZmenyStanov(ZmenyStanovRpsh value) {
        this.zmenyStanov = value;
    }

    /**
     * Gets the value of the sy property.
     * 
     * @return
     *     possible object is
     *     {@link StavySubjRpsh }
     *     
     */
    public StavySubjRpsh getSY() {
        return sy;
    }

    /**
     * Sets the value of the sy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavySubjRpsh }
     *     
     */
    public void setSY(StavySubjRpsh value) {
        this.sy = value;
    }

}
