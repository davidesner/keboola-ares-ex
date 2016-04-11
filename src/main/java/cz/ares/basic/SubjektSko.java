
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o subjektu v SKO
 * 
 * <p>Java class for subjekt_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subjekt_sko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Red_IZO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}izo_sko"/>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_eks_sko" minOccurs="0"/>
 *         &lt;element name="Datum_aktualizace" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PF_sko" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravni_forma" minOccurs="0"/>
 *         &lt;element name="PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravni_forma"/>
 *         &lt;element name="FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}financni_urad" minOccurs="0"/>
 *         &lt;element name="Email1" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}e_mail_sko" minOccurs="0"/>
 *         &lt;element name="Email2" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}e_mail_sko" minOccurs="0"/>
 *         &lt;element name="Www" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Angazma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}angazma_sko" minOccurs="0"/>
 *         &lt;element name="Soucasti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}soucasti_sko" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjekt_sko", propOrder = {
    "la",
    "redIZO",
    "ico",
    "zau",
    "datumAktualizace",
    "dv",
    "dz",
    "pfSko",
    "pf",
    "fu",
    "email1",
    "email2",
    "www",
    "a",
    "angazma",
    "soucasti"
})
public class SubjektSko {

    @XmlElement(name = "LA")
    protected int la;
    @XmlElement(name = "Red_IZO", required = true)
    protected String redIZO;
    @XmlElement(name = "ICO", required = true)
    protected String ico;
    @XmlElement(name = "ZAU")
    protected ZakladniUdajeEksSko zau;
    @XmlElement(name = "Datum_aktualizace")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAktualizace;
    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "PF_sko")
    protected PravniForma3 pfSko;
    @XmlElement(name = "PF", required = true)
    protected PravniForma3 pf;
    @XmlElement(name = "FU")
    protected FinancniUrad3 fu;
    @XmlElement(name = "Email1")
    protected String email1;
    @XmlElement(name = "Email2")
    protected String email2;
    @XmlElement(name = "Www")
    protected String www;
    @XmlElement(name = "A")
    protected AdresaARES3 a;
    @XmlElement(name = "Angazma")
    protected AngazmaSko angazma;
    @XmlElement(name = "Soucasti")
    protected SoucastiSko soucasti;

    /**
     * Gets the value of the la property.
     * 
     */
    public int getLA() {
        return la;
    }

    /**
     * Sets the value of the la property.
     * 
     */
    public void setLA(int value) {
        this.la = value;
    }

    /**
     * Gets the value of the redIZO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedIZO() {
        return redIZO;
    }

    /**
     * Sets the value of the redIZO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedIZO(String value) {
        this.redIZO = value;
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
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeEksSko }
     *     
     */
    public ZakladniUdajeEksSko getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeEksSko }
     *     
     */
    public void setZAU(ZakladniUdajeEksSko value) {
        this.zau = value;
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
     * Gets the value of the pfSko property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma3 }
     *     
     */
    public PravniForma3 getPFSko() {
        return pfSko;
    }

    /**
     * Sets the value of the pfSko property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma3 }
     *     
     */
    public void setPFSko(PravniForma3 value) {
        this.pfSko = value;
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
     * Gets the value of the email1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * Sets the value of the email1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail1(String value) {
        this.email1 = value;
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail2(String value) {
        this.email2 = value;
    }

    /**
     * Gets the value of the www property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWww() {
        return www;
    }

    /**
     * Sets the value of the www property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWww(String value) {
        this.www = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setA(AdresaARES3 value) {
        this.a = value;
    }

    /**
     * Gets the value of the angazma property.
     * 
     * @return
     *     possible object is
     *     {@link AngazmaSko }
     *     
     */
    public AngazmaSko getAngazma() {
        return angazma;
    }

    /**
     * Sets the value of the angazma property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngazmaSko }
     *     
     */
    public void setAngazma(AngazmaSko value) {
        this.angazma = value;
    }

    /**
     * Gets the value of the soucasti property.
     * 
     * @return
     *     possible object is
     *     {@link SoucastiSko }
     *     
     */
    public SoucastiSko getSoucasti() {
        return soucasti;
    }

    /**
     * Sets the value of the soucasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoucastiSko }
     *     
     */
    public void setSoucasti(SoucastiSko value) {
        this.soucasti = value;
    }

}
