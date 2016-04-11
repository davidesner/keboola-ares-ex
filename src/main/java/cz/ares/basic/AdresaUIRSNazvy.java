
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresa_UIR_s_nazvy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_UIR_s_nazvy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_kraje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kod_kraje" minOccurs="0"/>
 *         &lt;element name="Nazev_kraje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CZNUTS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cznuts" minOccurs="0"/>
 *         &lt;element name="Kod_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_okresu" minOccurs="0"/>
 *         &lt;element name="Nazev_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="Kod_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Kod_prazskeho_obvodu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nazev_prazskeho_obvodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kod_mestske_casti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Nazev_mestske_casti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Kod_casti_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_casti_obce" minOccurs="0"/>
 *         &lt;element name="Nazev_casti_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_casti_obce" minOccurs="0"/>
 *         &lt;element name="Kod_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_ulice" minOccurs="0"/>
 *         &lt;element name="Nazev_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="Cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_dom" minOccurs="0"/>
 *         &lt;element name="Typ_cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}typ_cis_dom" minOccurs="0"/>
 *         &lt;element name="Cislo_orientacni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_or" minOccurs="0"/>
 *         &lt;element name="Pism_cislo_orientacni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}pism_cislo_orientacni" minOccurs="0"/>
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/>
 *         &lt;element name="Kod_objektu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_objektu" minOccurs="0"/>
 *         &lt;element name="Kod_adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_adresy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_UIR_s_nazvy", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodKraje",
    "nazevKraje",
    "cznuts",
    "kodOkresu",
    "nazevOkresu",
    "kodObce",
    "nazevObce",
    "kodPrazskehoObvodu",
    "nazevPrazskehoObvodu",
    "kodMestskeCasti",
    "nazevMestskeCasti",
    "kodCastiObce",
    "nazevCastiObce",
    "kodUlice",
    "nazevUlice",
    "cisloDomovni",
    "typCisloDomovni",
    "cisloOrientacni",
    "pismCisloOrientacni",
    "psc",
    "kodObjektu",
    "kodAdresy"
})
public class AdresaUIRSNazvy {

    @XmlElement(name = "Kod_kraje")
    protected Short kodKraje;
    @XmlElement(name = "Nazev_kraje")
    protected String nazevKraje;
    @XmlElement(name = "CZNUTS")
    protected String cznuts;
    @XmlElement(name = "Kod_okresu")
    protected Integer kodOkresu;
    @XmlElement(name = "Nazev_okresu")
    protected String nazevOkresu;
    @XmlElement(name = "Kod_obce")
    protected String kodObce;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Kod_prazskeho_obvodu")
    protected Integer kodPrazskehoObvodu;
    @XmlElement(name = "Nazev_prazskeho_obvodu")
    protected String nazevPrazskehoObvodu;
    @XmlElement(name = "Kod_mestske_casti")
    protected String kodMestskeCasti;
    @XmlElement(name = "Nazev_mestske_casti")
    protected String nazevMestskeCasti;
    @XmlElement(name = "Kod_casti_obce")
    protected String kodCastiObce;
    @XmlElement(name = "Nazev_casti_obce")
    protected String nazevCastiObce;
    @XmlElement(name = "Kod_ulice")
    protected String kodUlice;
    @XmlElement(name = "Nazev_ulice")
    protected String nazevUlice;
    @XmlElement(name = "Cislo_domovni")
    protected Integer cisloDomovni;
    @XmlElement(name = "Typ_cislo_domovni")
    protected Byte typCisloDomovni;
    @XmlElement(name = "Cislo_orientacni")
    protected String cisloOrientacni;
    @XmlElement(name = "Pism_cislo_orientacni")
    protected String pismCisloOrientacni;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Kod_objektu")
    protected String kodObjektu;
    @XmlElement(name = "Kod_adresy")
    protected String kodAdresy;

    /**
     * Gets the value of the kodKraje property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getKodKraje() {
        return kodKraje;
    }

    /**
     * Sets the value of the kodKraje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setKodKraje(Short value) {
        this.kodKraje = value;
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
     * Gets the value of the cznuts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCZNUTS() {
        return cznuts;
    }

    /**
     * Sets the value of the cznuts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCZNUTS(String value) {
        this.cznuts = value;
    }

    /**
     * Gets the value of the kodOkresu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKodOkresu() {
        return kodOkresu;
    }

    /**
     * Sets the value of the kodOkresu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKodOkresu(Integer value) {
        this.kodOkresu = value;
    }

    /**
     * Gets the value of the nazevOkresu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOkresu() {
        return nazevOkresu;
    }

    /**
     * Sets the value of the nazevOkresu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOkresu(String value) {
        this.nazevOkresu = value;
    }

    /**
     * Gets the value of the kodObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodObce() {
        return kodObce;
    }

    /**
     * Sets the value of the kodObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodObce(String value) {
        this.kodObce = value;
    }

    /**
     * Gets the value of the nazevObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevObce() {
        return nazevObce;
    }

    /**
     * Sets the value of the nazevObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevObce(String value) {
        this.nazevObce = value;
    }

    /**
     * Gets the value of the kodPrazskehoObvodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKodPrazskehoObvodu() {
        return kodPrazskehoObvodu;
    }

    /**
     * Sets the value of the kodPrazskehoObvodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKodPrazskehoObvodu(Integer value) {
        this.kodPrazskehoObvodu = value;
    }

    /**
     * Gets the value of the nazevPrazskehoObvodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPrazskehoObvodu() {
        return nazevPrazskehoObvodu;
    }

    /**
     * Sets the value of the nazevPrazskehoObvodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPrazskehoObvodu(String value) {
        this.nazevPrazskehoObvodu = value;
    }

    /**
     * Gets the value of the kodMestskeCasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodMestskeCasti() {
        return kodMestskeCasti;
    }

    /**
     * Sets the value of the kodMestskeCasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodMestskeCasti(String value) {
        this.kodMestskeCasti = value;
    }

    /**
     * Gets the value of the nazevMestskeCasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevMestskeCasti() {
        return nazevMestskeCasti;
    }

    /**
     * Sets the value of the nazevMestskeCasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevMestskeCasti(String value) {
        this.nazevMestskeCasti = value;
    }

    /**
     * Gets the value of the kodCastiObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodCastiObce() {
        return kodCastiObce;
    }

    /**
     * Sets the value of the kodCastiObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodCastiObce(String value) {
        this.kodCastiObce = value;
    }

    /**
     * Gets the value of the nazevCastiObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCastiObce() {
        return nazevCastiObce;
    }

    /**
     * Sets the value of the nazevCastiObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCastiObce(String value) {
        this.nazevCastiObce = value;
    }

    /**
     * Gets the value of the kodUlice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodUlice() {
        return kodUlice;
    }

    /**
     * Sets the value of the kodUlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodUlice(String value) {
        this.kodUlice = value;
    }

    /**
     * Gets the value of the nazevUlice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevUlice() {
        return nazevUlice;
    }

    /**
     * Sets the value of the nazevUlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevUlice(String value) {
        this.nazevUlice = value;
    }

    /**
     * Gets the value of the cisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCisloDomovni() {
        return cisloDomovni;
    }

    /**
     * Sets the value of the cisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCisloDomovni(Integer value) {
        this.cisloDomovni = value;
    }

    /**
     * Gets the value of the typCisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTypCisloDomovni() {
        return typCisloDomovni;
    }

    /**
     * Sets the value of the typCisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTypCisloDomovni(Byte value) {
        this.typCisloDomovni = value;
    }

    /**
     * Gets the value of the cisloOrientacni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloOrientacni() {
        return cisloOrientacni;
    }

    /**
     * Sets the value of the cisloOrientacni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloOrientacni(String value) {
        this.cisloOrientacni = value;
    }

    /**
     * Gets the value of the pismCisloOrientacni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPismCisloOrientacni() {
        return pismCisloOrientacni;
    }

    /**
     * Sets the value of the pismCisloOrientacni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPismCisloOrientacni(String value) {
        this.pismCisloOrientacni = value;
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
     * Gets the value of the kodObjektu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodObjektu() {
        return kodObjektu;
    }

    /**
     * Sets the value of the kodObjektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodObjektu(String value) {
        this.kodObjektu = value;
    }

    /**
     * Gets the value of the kodAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodAdresy() {
        return kodAdresy;
    }

    /**
     * Sets the value of the kodAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodAdresy(String value) {
        this.kodAdresy = value;
    }

}
