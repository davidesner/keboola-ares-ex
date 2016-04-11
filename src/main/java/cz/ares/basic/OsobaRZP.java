
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Identifikace osoby v RŽP (Pozn. v rodném èísle je u cizincù prvních 6 znakù datum narození ve tvaru jako v rè + nuly místo koncovky rè)
 * 
 * <p>Java class for osoba_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osoba_RZP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}role_rzp"/>
 *         &lt;element name="J" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}jmeno"/>
 *         &lt;element name="P" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}prijmeni"/>
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}titul_pred" minOccurs="0"/>
 *         &lt;element name="TZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}titul_za" minOccurs="0"/>
 *         &lt;element name="RC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}rodne_cislo" minOccurs="0"/>
 *         &lt;element name="KS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_statu" minOccurs="0"/>
 *         &lt;element name="NS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_statu" minOccurs="0"/>
 *         &lt;element name="B" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Pobyt" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osoba_RZP", propOrder = {
    "role",
    "j",
    "p",
    "dn",
    "tp",
    "tz",
    "rc",
    "ks",
    "ns",
    "b",
    "pobyt"
})
public class OsobaRZP {

    @XmlElement(name = "Role", required = true)
    protected RoleRzp role;
    @XmlElement(name = "J", required = true)
    protected String j;
    @XmlElement(name = "P", required = true)
    protected String p;
    @XmlElement(name = "DN")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dn;
    @XmlElement(name = "TP")
    protected String tp;
    @XmlElement(name = "TZ")
    protected String tz;
    @XmlElement(name = "RC")
    protected String rc;
    @XmlElement(name = "KS")
    protected String ks;
    @XmlElement(name = "NS")
    protected String ns;
    @XmlElement(name = "B")
    protected AdresaARES3 b;
    @XmlElement(name = "Pobyt")
    protected AdresaARES3 pobyt;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link RoleRzp }
     *     
     */
    public RoleRzp getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleRzp }
     *     
     */
    public void setRole(RoleRzp value) {
        this.role = value;
    }

    /**
     * Gets the value of the j property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ() {
        return j;
    }

    /**
     * Sets the value of the j property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ(String value) {
        this.j = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP(String value) {
        this.p = value;
    }

    /**
     * Gets the value of the dn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDN() {
        return dn;
    }

    /**
     * Sets the value of the dn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDN(XMLGregorianCalendar value) {
        this.dn = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTP() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTP(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the tz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTZ() {
        return tz;
    }

    /**
     * Sets the value of the tz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTZ(String value) {
        this.tz = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRC() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRC(String value) {
        this.rc = value;
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
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setB(AdresaARES3 value) {
        this.b = value;
    }

    /**
     * Gets the value of the pobyt property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getPobyt() {
        return pobyt;
    }

    /**
     * Sets the value of the pobyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setPobyt(AdresaARES3 value) {
        this.pobyt = value;
    }

}
