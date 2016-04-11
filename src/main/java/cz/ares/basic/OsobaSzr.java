
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * údaje o fyzické osobì v SZR
 * 
 * <p>Java class for osoba_szr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osoba_szr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Osobni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osobniUdaje" minOccurs="0"/>
 *         &lt;element name="RC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}rodne_cislo" minOccurs="0"/>
 *         &lt;element name="Datum_umrti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="J2" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}jmeno" minOccurs="0"/>
 *         &lt;element name="P2" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}prijmeni" minOccurs="0"/>
 *         &lt;element name="Cislo_OP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Kval_obcanstvi" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="KSB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_statu" minOccurs="0"/>
 *         &lt;element name="AS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_szr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osoba_szr", propOrder = {
    "osobniUdaje",
    "rc",
    "datumUmrti",
    "j2",
    "p2",
    "cisloOP",
    "kvalObcanstvi",
    "ksb",
    "ns",
    "as"
})
public class OsobaSzr {

    @XmlElement(name = "Osobni_udaje")
    protected OsobniUdaje osobniUdaje;
    @XmlElement(name = "RC")
    protected String rc;
    @XmlElement(name = "Datum_umrti")
    protected String datumUmrti;
    @XmlElement(name = "J2")
    protected String j2;
    @XmlElement(name = "P2")
    protected String p2;
    @XmlElement(name = "Cislo_OP")
    protected String cisloOP;
    @XmlElement(name = "Kval_obcanstvi")
    protected BigInteger kvalObcanstvi;
    @XmlElement(name = "KSB")
    protected Short ksb;
    @XmlElement(name = "NS")
    protected String ns;
    @XmlElement(name = "AS")
    protected AdresaSzr as;

    /**
     * Gets the value of the osobniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link OsobniUdaje }
     *     
     */
    public OsobniUdaje getOsobniUdaje() {
        return osobniUdaje;
    }

    /**
     * Sets the value of the osobniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobniUdaje }
     *     
     */
    public void setOsobniUdaje(OsobniUdaje value) {
        this.osobniUdaje = value;
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
     * Gets the value of the datumUmrti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumUmrti() {
        return datumUmrti;
    }

    /**
     * Sets the value of the datumUmrti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumUmrti(String value) {
        this.datumUmrti = value;
    }

    /**
     * Gets the value of the j2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJ2() {
        return j2;
    }

    /**
     * Sets the value of the j2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJ2(String value) {
        this.j2 = value;
    }

    /**
     * Gets the value of the p2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP2() {
        return p2;
    }

    /**
     * Sets the value of the p2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP2(String value) {
        this.p2 = value;
    }

    /**
     * Gets the value of the cisloOP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloOP() {
        return cisloOP;
    }

    /**
     * Sets the value of the cisloOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloOP(String value) {
        this.cisloOP = value;
    }

    /**
     * Gets the value of the kvalObcanstvi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKvalObcanstvi() {
        return kvalObcanstvi;
    }

    /**
     * Sets the value of the kvalObcanstvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKvalObcanstvi(BigInteger value) {
        this.kvalObcanstvi = value;
    }

    /**
     * Gets the value of the ksb property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKSB() {
        return ksb;
    }

    /**
     * Sets the value of the ksb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKSB(Short value) {
        this.ksb = value;
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
     * Gets the value of the as property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaSzr }
     *     
     */
    public AdresaSzr getAS() {
        return as;
    }

    /**
     * Sets the value of the as property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaSzr }
     *     
     */
    public void setAS(AdresaSzr value) {
        this.as = value;
    }

}
