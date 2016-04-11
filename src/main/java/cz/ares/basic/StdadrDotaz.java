
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stdadr_dotaz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stdadr_dotaz">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Typ_odkazu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Stat" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_statu" minOccurs="0"/>
 *         &lt;element name="Kraj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_kraje" minOccurs="0"/>
 *         &lt;element name="Okres" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="Obec" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="PObvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="Mestska_cast" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Cast_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_casti_obce" minOccurs="0"/>
 *         &lt;element name="Ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="CA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="Psc" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="AT" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_textem" minOccurs="0"/>
 *         &lt;element name="Cestina" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="Jazyk" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jazyk_odkazu" minOccurs="0"/>
 *         &lt;element name="Typ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="Diakritika" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *         &lt;element name="Max_pocet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Redukce_slov" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ano_ne" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stdadr_dotaz", propOrder = {
    "pid",
    "typOdkazu",
    "aa",
    "stat",
    "kraj",
    "okres",
    "obec",
    "pObvod",
    "mestskaCast",
    "castObce",
    "ulice",
    "ca",
    "psc",
    "at",
    "cestina",
    "jazyk",
    "typ",
    "diakritika",
    "maxPocet",
    "redukceSlov"
})
public class StdadrDotaz {

    @XmlElement(name = "PID")
    protected Integer pid;
    @XmlElement(name = "Typ_odkazu")
    protected Integer typOdkazu;
    @XmlElement(name = "AA")
    protected AdresaARES3 aa;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "Kraj")
    protected String kraj;
    @XmlElement(name = "Okres")
    protected String okres;
    @XmlElement(name = "Obec")
    protected String obec;
    @XmlElement(name = "PObvod")
    protected String pObvod;
    @XmlElement(name = "Mestska_cast")
    protected String mestskaCast;
    @XmlElement(name = "Cast_obce")
    protected String castObce;
    @XmlElement(name = "Ulice")
    protected String ulice;
    @XmlElement(name = "CA")
    protected String ca;
    @XmlElement(name = "Psc")
    protected String psc;
    @XmlElement(name = "AT")
    protected String at;
    @XmlElement(name = "Cestina", defaultValue = "A")
    protected String cestina;
    @XmlElement(name = "Jazyk")
    protected JazykOdkazu jazyk;
    @XmlElement(name = "Typ")
    protected String typ;
    @XmlElement(name = "Diakritika")
    protected String diakritika;
    @XmlElement(name = "Max_pocet", defaultValue = "20")
    protected Integer maxPocet;
    @XmlElement(name = "Redukce_slov", defaultValue = "N")
    protected String redukceSlov;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPID(Integer value) {
        this.pid = value;
    }

    /**
     * Gets the value of the typOdkazu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypOdkazu() {
        return typOdkazu;
    }

    /**
     * Sets the value of the typOdkazu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypOdkazu(Integer value) {
        this.typOdkazu = value;
    }

    /**
     * Gets the value of the aa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getAA() {
        return aa;
    }

    /**
     * Sets the value of the aa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setAA(AdresaARES3 value) {
        this.aa = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the kraj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKraj() {
        return kraj;
    }

    /**
     * Sets the value of the kraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKraj(String value) {
        this.kraj = value;
    }

    /**
     * Gets the value of the okres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkres() {
        return okres;
    }

    /**
     * Sets the value of the okres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkres(String value) {
        this.okres = value;
    }

    /**
     * Gets the value of the obec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObec() {
        return obec;
    }

    /**
     * Sets the value of the obec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObec(String value) {
        this.obec = value;
    }

    /**
     * Gets the value of the pObvod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPObvod() {
        return pObvod;
    }

    /**
     * Sets the value of the pObvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPObvod(String value) {
        this.pObvod = value;
    }

    /**
     * Gets the value of the mestskaCast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMestskaCast() {
        return mestskaCast;
    }

    /**
     * Sets the value of the mestskaCast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMestskaCast(String value) {
        this.mestskaCast = value;
    }

    /**
     * Gets the value of the castObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastObce() {
        return castObce;
    }

    /**
     * Sets the value of the castObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastObce(String value) {
        this.castObce = value;
    }

    /**
     * Gets the value of the ulice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlice() {
        return ulice;
    }

    /**
     * Sets the value of the ulice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlice(String value) {
        this.ulice = value;
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
    public String getPsc() {
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
    public void setPsc(String value) {
        this.psc = value;
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
     * Gets the value of the cestina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCestina() {
        return cestina;
    }

    /**
     * Sets the value of the cestina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCestina(String value) {
        this.cestina = value;
    }

    /**
     * Gets the value of the jazyk property.
     * 
     * @return
     *     possible object is
     *     {@link JazykOdkazu }
     *     
     */
    public JazykOdkazu getJazyk() {
        return jazyk;
    }

    /**
     * Sets the value of the jazyk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JazykOdkazu }
     *     
     */
    public void setJazyk(JazykOdkazu value) {
        this.jazyk = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the diakritika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiakritika() {
        return diakritika;
    }

    /**
     * Sets the value of the diakritika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiakritika(String value) {
        this.diakritika = value;
    }

    /**
     * Gets the value of the maxPocet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPocet() {
        return maxPocet;
    }

    /**
     * Sets the value of the maxPocet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPocet(Integer value) {
        this.maxPocet = value;
    }

    /**
     * Gets the value of the redukceSlov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedukceSlov() {
        return redukceSlov;
    }

    /**
     * Sets the value of the redukceSlov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedukceSlov(String value) {
        this.redukceSlov = value;
    }

}
