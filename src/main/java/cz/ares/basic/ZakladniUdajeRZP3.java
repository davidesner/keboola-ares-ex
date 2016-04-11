
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikaèní a alokaèní údaje ekonomického subjektu
 * 
 * <p>Java class for zakladni_udaje_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="S" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_rzp" minOccurs="0"/>
 *         &lt;element name="Datum_zmeny" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravni_forma" minOccurs="0"/>
 *         &lt;element name="KS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_statu" minOccurs="0"/>
 *         &lt;element name="NS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_statu" minOccurs="0"/>
 *         &lt;element name="Datum_konkurs" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ZU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zivnostensky_urad" minOccurs="0"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *         &lt;element name="Org_slozka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="Datum_doruceni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ZI1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Posledni_zivnost" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Vsech_zivnosti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Aktivnich_zivnosti" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Vsech_provozoven" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Aktivnich_provozoven" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_RZP", propOrder = {
    "la",
    "s",
    "datumZmeny",
    "ico",
    "of",
    "pf",
    "ks",
    "ns",
    "datumKonkurs",
    "zu",
    "fu",
    "orgSlozka",
    "datumDoruceni",
    "zi1",
    "posledniZivnost",
    "vsechZivnosti",
    "aktivnichZivnosti",
    "vsechProvozoven",
    "aktivnichProvozoven"
})
public class ZakladniUdajeRZP3 {

    @XmlElement(name = "LA")
    protected Integer la;
    @XmlElement(name = "S")
    protected String s;
    @XmlElement(name = "Datum_zmeny")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZmeny;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "OF")
    protected String of;
    @XmlElement(name = "PF")
    protected PravniForma3 pf;
    @XmlElement(name = "KS")
    protected String ks;
    @XmlElement(name = "NS")
    protected String ns;
    @XmlElement(name = "Datum_konkurs")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumKonkurs;
    @XmlElement(name = "ZU")
    protected ZivnostenskyUrad3 zu;
    @XmlElement(name = "FU")
    protected FinancniUrad3 fu;
    @XmlElement(name = "Org_slozka")
    protected String orgSlozka;
    @XmlElement(name = "Datum_doruceni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumDoruceni;
    @XmlElement(name = "ZI1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zi1;
    @XmlElement(name = "Posledni_zivnost")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar posledniZivnost;
    @XmlElement(name = "Vsech_zivnosti")
    protected Integer vsechZivnosti;
    @XmlElement(name = "Aktivnich_zivnosti")
    protected Integer aktivnichZivnosti;
    @XmlElement(name = "Vsech_provozoven")
    protected Integer vsechProvozoven;
    @XmlElement(name = "Aktivnich_provozoven")
    protected String aktivnichProvozoven;

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
     *     {@link String }
     *     
     */
    public String getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
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
     * Gets the value of the of property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOF() {
        return of;
    }

    /**
     * Sets the value of the of property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOF(String value) {
        this.of = value;
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
     * Gets the value of the ks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKS() {
        return ks;
    }

    /**
     * Sets the value of the ks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKS(String value) {
        this.ks = value;
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
     * Gets the value of the datumKonkurs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumKonkurs() {
        return datumKonkurs;
    }

    /**
     * Sets the value of the datumKonkurs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumKonkurs(XMLGregorianCalendar value) {
        this.datumKonkurs = value;
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
     * Gets the value of the orgSlozka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgSlozka() {
        return orgSlozka;
    }

    /**
     * Sets the value of the orgSlozka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgSlozka(String value) {
        this.orgSlozka = value;
    }

    /**
     * Gets the value of the datumDoruceni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumDoruceni() {
        return datumDoruceni;
    }

    /**
     * Sets the value of the datumDoruceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumDoruceni(XMLGregorianCalendar value) {
        this.datumDoruceni = value;
    }

    /**
     * Gets the value of the zi1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZI1() {
        return zi1;
    }

    /**
     * Sets the value of the zi1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZI1(XMLGregorianCalendar value) {
        this.zi1 = value;
    }

    /**
     * Gets the value of the posledniZivnost property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPosledniZivnost() {
        return posledniZivnost;
    }

    /**
     * Sets the value of the posledniZivnost property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPosledniZivnost(XMLGregorianCalendar value) {
        this.posledniZivnost = value;
    }

    /**
     * Gets the value of the vsechZivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVsechZivnosti() {
        return vsechZivnosti;
    }

    /**
     * Sets the value of the vsechZivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVsechZivnosti(Integer value) {
        this.vsechZivnosti = value;
    }

    /**
     * Gets the value of the aktivnichZivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAktivnichZivnosti() {
        return aktivnichZivnosti;
    }

    /**
     * Sets the value of the aktivnichZivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAktivnichZivnosti(Integer value) {
        this.aktivnichZivnosti = value;
    }

    /**
     * Gets the value of the vsechProvozoven property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVsechProvozoven() {
        return vsechProvozoven;
    }

    /**
     * Sets the value of the vsechProvozoven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVsechProvozoven(Integer value) {
        this.vsechProvozoven = value;
    }

    /**
     * Gets the value of the aktivnichProvozoven property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktivnichProvozoven() {
        return aktivnichProvozoven;
    }

    /**
     * Sets the value of the aktivnichProvozoven property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivnichProvozoven(String value) {
        this.aktivnichProvozoven = value;
    }

}
