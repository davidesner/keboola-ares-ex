
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Definice elementu návratové adresy ARES
 * 
 * <p>Java class for adresa_ARES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_ARES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_statu" minOccurs="0"/>
 *         &lt;element name="NS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_statu" minOccurs="0"/>
 *         &lt;element name="Nazev_oblasti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_oblasti" minOccurs="0"/>
 *         &lt;element name="Nazev_kraje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_kraje" minOccurs="0"/>
 *         &lt;element name="NOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_pobvodu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="NCO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_casti_obce" minOccurs="0"/>
 *         &lt;element name="NMC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_mestske_casti" minOccurs="0"/>
 *         &lt;element name="NU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="CD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_dom" minOccurs="0"/>
 *         &lt;element name="TCD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}typ_cis_dom" minOccurs="0"/>
 *         &lt;element name="CO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}cis_or_sp" minOccurs="0"/>
 *         &lt;element name="CA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="Zahr_PSC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AT" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_textem" minOccurs="0"/>
 *         &lt;element name="AU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}adresa_UIR" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zdroj_type" />
 *       &lt;attribute name="kvadres" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kvadres_rzp" />
 *       &lt;attribute name="uiradr" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="pcd" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_ARES", propOrder = {
    "ida",
    "ks",
    "ns",
    "nazevOblasti",
    "nazevKraje",
    "nok",
    "n",
    "nazevPobvodu",
    "nco",
    "nmc",
    "nu",
    "cd",
    "tcd",
    "co",
    "ca",
    "psc",
    "zahrPSC",
    "at",
    "au"
})
public class AdresaARES3 {

    @XmlElement(name = "IDA")
    protected String ida;
    @XmlElement(name = "KS")
    protected String ks;
    @XmlElement(name = "NS")
    protected String ns;
    @XmlElement(name = "Nazev_oblasti")
    protected String nazevOblasti;
    @XmlElement(name = "Nazev_kraje")
    protected String nazevKraje;
    @XmlElement(name = "NOK")
    protected String nok;
    @XmlElement(name = "N")
    protected String n;
    @XmlElement(name = "Nazev_pobvodu")
    protected String nazevPobvodu;
    @XmlElement(name = "NCO")
    protected String nco;
    @XmlElement(name = "NMC")
    protected String nmc;
    @XmlElement(name = "NU")
    protected String nu;
    @XmlElement(name = "CD")
    protected Integer cd;
    @XmlElement(name = "TCD")
    protected Byte tcd;
    @XmlElement(name = "CO")
    protected String co;
    @XmlElement(name = "CA")
    protected String ca;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Zahr_PSC")
    protected String zahrPSC;
    @XmlElement(name = "AT")
    protected String at;
    @XmlElement(name = "AU")
    protected AdresaUIR2 au;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;
    @XmlAttribute
    protected ZdrojType3 zdroj;
    @XmlAttribute
    protected Short kvadres;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger uiradr;
    @XmlAttribute
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger pcd;

    /**
     * Gets the value of the ida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDA() {
        return ida;
    }

    /**
     * Sets the value of the ida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDA(String value) {
        this.ida = value;
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
     * Gets the value of the nazevOblasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOblasti() {
        return nazevOblasti;
    }

    /**
     * Sets the value of the nazevOblasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOblasti(String value) {
        this.nazevOblasti = value;
    }

    /**
     * Gets the value of the nazevKraje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevKraje() {
        return nazevKraje;
    }

    /**
     * Sets the value of the nazevKraje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevKraje(String value) {
        this.nazevKraje = value;
    }

    /**
     * Gets the value of the nok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOK() {
        return nok;
    }

    /**
     * Sets the value of the nok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOK(String value) {
        this.nok = value;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setN(String value) {
        this.n = value;
    }

    /**
     * Gets the value of the nazevPobvodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPobvodu() {
        return nazevPobvodu;
    }

    /**
     * Sets the value of the nazevPobvodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPobvodu(String value) {
        this.nazevPobvodu = value;
    }

    /**
     * Gets the value of the nco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCO() {
        return nco;
    }

    /**
     * Sets the value of the nco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCO(String value) {
        this.nco = value;
    }

    /**
     * Gets the value of the nmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMC() {
        return nmc;
    }

    /**
     * Sets the value of the nmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMC(String value) {
        this.nmc = value;
    }

    /**
     * Gets the value of the nu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNU() {
        return nu;
    }

    /**
     * Sets the value of the nu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNU(String value) {
        this.nu = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCD() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCD(Integer value) {
        this.cd = value;
    }

    /**
     * Gets the value of the tcd property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTCD() {
        return tcd;
    }

    /**
     * Sets the value of the tcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTCD(Byte value) {
        this.tcd = value;
    }

    /**
     * Gets the value of the co property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCO() {
        return co;
    }

    /**
     * Sets the value of the co property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCO(String value) {
        this.co = value;
    }

    /**
     * Gets the value of the ca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCA() {
        return ca;
    }

    /**
     * Sets the value of the ca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCA(String value) {
        this.ca = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSC() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSC(String value) {
        this.psc = value;
    }

    /**
     * Gets the value of the zahrPSC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZahrPSC() {
        return zahrPSC;
    }

    /**
     * Sets the value of the zahrPSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZahrPSC(String value) {
        this.zahrPSC = value;
    }

    /**
     * Gets the value of the at property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAT() {
        return at;
    }

    /**
     * Sets the value of the at property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAT(String value) {
        this.at = value;
    }

    /**
     * Gets the value of the au property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaUIR2 }
     *     
     */
    public AdresaUIR2 getAU() {
        return au;
    }

    /**
     * Sets the value of the au property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaUIR2 }
     *     
     */
    public void setAU(AdresaUIR2 value) {
        this.au = value;
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

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType3 }
     *     
     */
    public ZdrojType3 getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType3 }
     *     
     */
    public void setZdroj(ZdrojType3 value) {
        this.zdroj = value;
    }

    /**
     * Gets the value of the kvadres property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKvadres() {
        return kvadres;
    }

    /**
     * Sets the value of the kvadres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKvadres(Short value) {
        this.kvadres = value;
    }

    /**
     * Gets the value of the uiradr property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUiradr() {
        return uiradr;
    }

    /**
     * Sets the value of the uiradr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUiradr(BigInteger value) {
        this.uiradr = value;
    }

    /**
     * Gets the value of the pcd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPcd() {
        return pcd;
    }

    /**
     * Sets the value of the pcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPcd(BigInteger value) {
        this.pcd = value;
    }

}
