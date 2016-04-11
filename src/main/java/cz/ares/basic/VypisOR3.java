
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis z obchodního rejstøíku podle ARES
 * 
 * <p>Java class for vypis_OR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_OR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_OR"/>
 *         &lt;element name="REG" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registrace"/>
 *         &lt;element name="CIN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cinnosti" minOccurs="0"/>
 *         &lt;element name="EX" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OSK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KAP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kapital" minOccurs="0"/>
 *         &lt;element name="SO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}statutarni_organ" minOccurs="0"/>
 *         &lt;element name="SOS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}sos" minOccurs="0"/>
 *         &lt;element name="SOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}sok" minOccurs="0"/>
 *         &lt;element name="SOP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}sop" minOccurs="0"/>
 *         &lt;element name="PRE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}predstavenstvo" minOccurs="0"/>
 *         &lt;element name="SOZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}szo" minOccurs="0"/>
 *         &lt;element name="SR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spravni_rada" minOccurs="0"/>
 *         &lt;element name="NAD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nadace" minOccurs="0"/>
 *         &lt;element name="NF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nadacni_fond" minOccurs="0"/>
 *         &lt;element name="LI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}likvidace" minOccurs="0"/>
 *         &lt;element name="PRO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}prokura" minOccurs="0"/>
 *         &lt;element name="Reditele_ops" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}reditele_ops" minOccurs="0"/>
 *         &lt;element name="DR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}dozorci_rada" minOccurs="0"/>
 *         &lt;element name="Kontrolni_komise" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kontrolni_komise" minOccurs="0"/>
 *         &lt;element name="REI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}revizori" minOccurs="0"/>
 *         &lt;element name="SBV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spolecnici_bez_vkladu" minOccurs="0"/>
 *         &lt;element name="SSV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}spolecnici_s_vkladem" minOccurs="0"/>
 *         &lt;element name="AKI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}akcionari" minOccurs="0"/>
 *         &lt;element name="Z_SP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladatele_SP" minOccurs="0"/>
 *         &lt;element name="Z_OPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladatele_OPS" minOccurs="0"/>
 *         &lt;element name="Z_OZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zrizovatele_OZ" minOccurs="0"/>
 *         &lt;element name="Z_PR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zrizovatele_PR" minOccurs="0"/>
 *         &lt;element name="NAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nastupci_zrizovatele" minOccurs="0"/>
 *         &lt;element name="Z_N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zrizovatele_nadace" minOccurs="0"/>
 *         &lt;element name="VOU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ved_oz" minOccurs="0"/>
 *         &lt;element name="KME" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}komanditiste" minOccurs="0"/>
 *         &lt;element name="DCI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}druzstevnici" minOccurs="0"/>
 *         &lt;element name="KPI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}komplementari" minOccurs="0"/>
 *         &lt;element name="CLS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}clenove_sdruzeni" minOccurs="0"/>
 *         &lt;element name="KV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurzy_vyrovnani" minOccurs="0"/>
 *         &lt;element name="OZY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}odstepne_zavody" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_OR", propOrder = {
    "uvod",
    "zau",
    "reg",
    "cin",
    "ex",
    "osk",
    "kap",
    "so",
    "sos",
    "sok",
    "sop",
    "pre",
    "soz",
    "sr",
    "nad",
    "nf",
    "li",
    "pro",
    "rediteleOps",
    "dr",
    "kontrolniKomise",
    "rei",
    "sbv",
    "ssv",
    "aki",
    "zsp",
    "zops",
    "zoz",
    "zpr",
    "nau",
    "zn",
    "vou",
    "kme",
    "dci",
    "kpi",
    "cls",
    "kv",
    "ozy"
})
public class VypisOR3 {

    @XmlElement(name = "UVOD")
    protected Uvod3 uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeOR3 zau;
    @XmlElement(name = "REG", required = true)
    protected Registrace3 reg;
    @XmlElement(name = "CIN")
    protected Cinnosti3 cin;
    @XmlElement(name = "EX")
    protected List<Texty3> ex;
    @XmlElement(name = "OSK")
    protected List<Texty3> osk;
    @XmlElement(name = "KAP")
    protected Kapital3 kap;
    @XmlElement(name = "SO")
    protected StatutarniOrgan3 so;
    @XmlElement(name = "SOS")
    protected Sos3 sos;
    @XmlElement(name = "SOK")
    protected Sok3 sok;
    @XmlElement(name = "SOP")
    protected Sop3 sop;
    @XmlElement(name = "PRE")
    protected Predstavenstvo3 pre;
    @XmlElement(name = "SOZ")
    protected Szo3 soz;
    @XmlElement(name = "SR")
    protected SpravniRada3 sr;
    @XmlElement(name = "NAD")
    protected Nadace3 nad;
    @XmlElement(name = "NF")
    protected NadacniFond3 nf;
    @XmlElement(name = "LI")
    protected Likvidace3 li;
    @XmlElement(name = "PRO")
    protected Prokura3 pro;
    @XmlElement(name = "Reditele_ops")
    protected RediteleOps3 rediteleOps;
    @XmlElement(name = "DR")
    protected DozorciRada3 dr;
    @XmlElement(name = "Kontrolni_komise")
    protected KontrolniKomise3 kontrolniKomise;
    @XmlElement(name = "REI")
    protected Revizori3 rei;
    @XmlElement(name = "SBV")
    protected SpolecniciBezVkladu3 sbv;
    @XmlElement(name = "SSV")
    protected SpolecniciSVkladem3 ssv;
    @XmlElement(name = "AKI")
    protected Akcionari3 aki;
    @XmlElement(name = "Z_SP")
    protected ZakladateleSP3 zsp;
    @XmlElement(name = "Z_OPS")
    protected ZakladateleOPS3 zops;
    @XmlElement(name = "Z_OZ")
    protected ZrizovateleOZ3 zoz;
    @XmlElement(name = "Z_PR")
    protected ZrizovatelePR3 zpr;
    @XmlElement(name = "NAU")
    protected NastupciZrizovatele3 nau;
    @XmlElement(name = "Z_N")
    protected ZrizovateleNadace3 zn;
    @XmlElement(name = "VOU")
    protected VedOz3 vou;
    @XmlElement(name = "KME")
    protected Komanditiste3 kme;
    @XmlElement(name = "DCI")
    protected Druzstevnici3 dci;
    @XmlElement(name = "KPI")
    protected Komplementari3 kpi;
    @XmlElement(name = "CLS")
    protected ClenoveSdruzeni3 cls;
    @XmlElement(name = "KV")
    protected KonkurzyVyrovnani3 kv;
    @XmlElement(name = "OZY")
    protected List<OdstepneZavody3> ozy;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod3 }
     *     
     */
    public Uvod3 getUVOD() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod3 }
     *     
     */
    public void setUVOD(Uvod3 value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeOR3 }
     *     
     */
    public ZakladniUdajeOR3 getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeOR3 }
     *     
     */
    public void setZAU(ZakladniUdajeOR3 value) {
        this.zau = value;
    }

    /**
     * Gets the value of the reg property.
     * 
     * @return
     *     possible object is
     *     {@link Registrace3 }
     *     
     */
    public Registrace3 getREG() {
        return reg;
    }

    /**
     * Sets the value of the reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registrace3 }
     *     
     */
    public void setREG(Registrace3 value) {
        this.reg = value;
    }

    /**
     * Gets the value of the cin property.
     * 
     * @return
     *     possible object is
     *     {@link Cinnosti3 }
     *     
     */
    public Cinnosti3 getCIN() {
        return cin;
    }

    /**
     * Sets the value of the cin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cinnosti3 }
     *     
     */
    public void setCIN(Cinnosti3 value) {
        this.cin = value;
    }

    /**
     * Gets the value of the ex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getEX() {
        if (ex == null) {
            ex = new ArrayList<Texty3>();
        }
        return this.ex;
    }

    /**
     * Gets the value of the osk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getOSK() {
        if (osk == null) {
            osk = new ArrayList<Texty3>();
        }
        return this.osk;
    }

    /**
     * Gets the value of the kap property.
     * 
     * @return
     *     possible object is
     *     {@link Kapital3 }
     *     
     */
    public Kapital3 getKAP() {
        return kap;
    }

    /**
     * Sets the value of the kap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kapital3 }
     *     
     */
    public void setKAP(Kapital3 value) {
        this.kap = value;
    }

    /**
     * Gets the value of the so property.
     * 
     * @return
     *     possible object is
     *     {@link StatutarniOrgan3 }
     *     
     */
    public StatutarniOrgan3 getSO() {
        return so;
    }

    /**
     * Sets the value of the so property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutarniOrgan3 }
     *     
     */
    public void setSO(StatutarniOrgan3 value) {
        this.so = value;
    }

    /**
     * Gets the value of the sos property.
     * 
     * @return
     *     possible object is
     *     {@link Sos3 }
     *     
     */
    public Sos3 getSOS() {
        return sos;
    }

    /**
     * Sets the value of the sos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sos3 }
     *     
     */
    public void setSOS(Sos3 value) {
        this.sos = value;
    }

    /**
     * Gets the value of the sok property.
     * 
     * @return
     *     possible object is
     *     {@link Sok3 }
     *     
     */
    public Sok3 getSOK() {
        return sok;
    }

    /**
     * Sets the value of the sok property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sok3 }
     *     
     */
    public void setSOK(Sok3 value) {
        this.sok = value;
    }

    /**
     * Gets the value of the sop property.
     * 
     * @return
     *     possible object is
     *     {@link Sop3 }
     *     
     */
    public Sop3 getSOP() {
        return sop;
    }

    /**
     * Sets the value of the sop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sop3 }
     *     
     */
    public void setSOP(Sop3 value) {
        this.sop = value;
    }

    /**
     * Gets the value of the pre property.
     * 
     * @return
     *     possible object is
     *     {@link Predstavenstvo3 }
     *     
     */
    public Predstavenstvo3 getPRE() {
        return pre;
    }

    /**
     * Sets the value of the pre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Predstavenstvo3 }
     *     
     */
    public void setPRE(Predstavenstvo3 value) {
        this.pre = value;
    }

    /**
     * Gets the value of the soz property.
     * 
     * @return
     *     possible object is
     *     {@link Szo3 }
     *     
     */
    public Szo3 getSOZ() {
        return soz;
    }

    /**
     * Sets the value of the soz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Szo3 }
     *     
     */
    public void setSOZ(Szo3 value) {
        this.soz = value;
    }

    /**
     * Gets the value of the sr property.
     * 
     * @return
     *     possible object is
     *     {@link SpravniRada3 }
     *     
     */
    public SpravniRada3 getSR() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpravniRada3 }
     *     
     */
    public void setSR(SpravniRada3 value) {
        this.sr = value;
    }

    /**
     * Gets the value of the nad property.
     * 
     * @return
     *     possible object is
     *     {@link Nadace3 }
     *     
     */
    public Nadace3 getNAD() {
        return nad;
    }

    /**
     * Sets the value of the nad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nadace3 }
     *     
     */
    public void setNAD(Nadace3 value) {
        this.nad = value;
    }

    /**
     * Gets the value of the nf property.
     * 
     * @return
     *     possible object is
     *     {@link NadacniFond3 }
     *     
     */
    public NadacniFond3 getNF() {
        return nf;
    }

    /**
     * Sets the value of the nf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NadacniFond3 }
     *     
     */
    public void setNF(NadacniFond3 value) {
        this.nf = value;
    }

    /**
     * Gets the value of the li property.
     * 
     * @return
     *     possible object is
     *     {@link Likvidace3 }
     *     
     */
    public Likvidace3 getLI() {
        return li;
    }

    /**
     * Sets the value of the li property.
     * 
     * @param value
     *     allowed object is
     *     {@link Likvidace3 }
     *     
     */
    public void setLI(Likvidace3 value) {
        this.li = value;
    }

    /**
     * Gets the value of the pro property.
     * 
     * @return
     *     possible object is
     *     {@link Prokura3 }
     *     
     */
    public Prokura3 getPRO() {
        return pro;
    }

    /**
     * Sets the value of the pro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prokura3 }
     *     
     */
    public void setPRO(Prokura3 value) {
        this.pro = value;
    }

    /**
     * Gets the value of the rediteleOps property.
     * 
     * @return
     *     possible object is
     *     {@link RediteleOps3 }
     *     
     */
    public RediteleOps3 getRediteleOps() {
        return rediteleOps;
    }

    /**
     * Sets the value of the rediteleOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link RediteleOps3 }
     *     
     */
    public void setRediteleOps(RediteleOps3 value) {
        this.rediteleOps = value;
    }

    /**
     * Gets the value of the dr property.
     * 
     * @return
     *     possible object is
     *     {@link DozorciRada3 }
     *     
     */
    public DozorciRada3 getDR() {
        return dr;
    }

    /**
     * Sets the value of the dr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DozorciRada3 }
     *     
     */
    public void setDR(DozorciRada3 value) {
        this.dr = value;
    }

    /**
     * Gets the value of the kontrolniKomise property.
     * 
     * @return
     *     possible object is
     *     {@link KontrolniKomise3 }
     *     
     */
    public KontrolniKomise3 getKontrolniKomise() {
        return kontrolniKomise;
    }

    /**
     * Sets the value of the kontrolniKomise property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontrolniKomise3 }
     *     
     */
    public void setKontrolniKomise(KontrolniKomise3 value) {
        this.kontrolniKomise = value;
    }

    /**
     * Gets the value of the rei property.
     * 
     * @return
     *     possible object is
     *     {@link Revizori3 }
     *     
     */
    public Revizori3 getREI() {
        return rei;
    }

    /**
     * Sets the value of the rei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revizori3 }
     *     
     */
    public void setREI(Revizori3 value) {
        this.rei = value;
    }

    /**
     * Gets the value of the sbv property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciBezVkladu3 }
     *     
     */
    public SpolecniciBezVkladu3 getSBV() {
        return sbv;
    }

    /**
     * Sets the value of the sbv property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciBezVkladu3 }
     *     
     */
    public void setSBV(SpolecniciBezVkladu3 value) {
        this.sbv = value;
    }

    /**
     * Gets the value of the ssv property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciSVkladem3 }
     *     
     */
    public SpolecniciSVkladem3 getSSV() {
        return ssv;
    }

    /**
     * Sets the value of the ssv property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciSVkladem3 }
     *     
     */
    public void setSSV(SpolecniciSVkladem3 value) {
        this.ssv = value;
    }

    /**
     * Gets the value of the aki property.
     * 
     * @return
     *     possible object is
     *     {@link Akcionari3 }
     *     
     */
    public Akcionari3 getAKI() {
        return aki;
    }

    /**
     * Sets the value of the aki property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akcionari3 }
     *     
     */
    public void setAKI(Akcionari3 value) {
        this.aki = value;
    }

    /**
     * Gets the value of the zsp property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladateleSP3 }
     *     
     */
    public ZakladateleSP3 getZSP() {
        return zsp;
    }

    /**
     * Sets the value of the zsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladateleSP3 }
     *     
     */
    public void setZSP(ZakladateleSP3 value) {
        this.zsp = value;
    }

    /**
     * Gets the value of the zops property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladateleOPS3 }
     *     
     */
    public ZakladateleOPS3 getZOPS() {
        return zops;
    }

    /**
     * Sets the value of the zops property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladateleOPS3 }
     *     
     */
    public void setZOPS(ZakladateleOPS3 value) {
        this.zops = value;
    }

    /**
     * Gets the value of the zoz property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovateleOZ3 }
     *     
     */
    public ZrizovateleOZ3 getZOZ() {
        return zoz;
    }

    /**
     * Sets the value of the zoz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovateleOZ3 }
     *     
     */
    public void setZOZ(ZrizovateleOZ3 value) {
        this.zoz = value;
    }

    /**
     * Gets the value of the zpr property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovatelePR3 }
     *     
     */
    public ZrizovatelePR3 getZPR() {
        return zpr;
    }

    /**
     * Sets the value of the zpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovatelePR3 }
     *     
     */
    public void setZPR(ZrizovatelePR3 value) {
        this.zpr = value;
    }

    /**
     * Gets the value of the nau property.
     * 
     * @return
     *     possible object is
     *     {@link NastupciZrizovatele3 }
     *     
     */
    public NastupciZrizovatele3 getNAU() {
        return nau;
    }

    /**
     * Sets the value of the nau property.
     * 
     * @param value
     *     allowed object is
     *     {@link NastupciZrizovatele3 }
     *     
     */
    public void setNAU(NastupciZrizovatele3 value) {
        this.nau = value;
    }

    /**
     * Gets the value of the zn property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovateleNadace3 }
     *     
     */
    public ZrizovateleNadace3 getZN() {
        return zn;
    }

    /**
     * Sets the value of the zn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovateleNadace3 }
     *     
     */
    public void setZN(ZrizovateleNadace3 value) {
        this.zn = value;
    }

    /**
     * Gets the value of the vou property.
     * 
     * @return
     *     possible object is
     *     {@link VedOz3 }
     *     
     */
    public VedOz3 getVOU() {
        return vou;
    }

    /**
     * Sets the value of the vou property.
     * 
     * @param value
     *     allowed object is
     *     {@link VedOz3 }
     *     
     */
    public void setVOU(VedOz3 value) {
        this.vou = value;
    }

    /**
     * Gets the value of the kme property.
     * 
     * @return
     *     possible object is
     *     {@link Komanditiste3 }
     *     
     */
    public Komanditiste3 getKME() {
        return kme;
    }

    /**
     * Sets the value of the kme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Komanditiste3 }
     *     
     */
    public void setKME(Komanditiste3 value) {
        this.kme = value;
    }

    /**
     * Gets the value of the dci property.
     * 
     * @return
     *     possible object is
     *     {@link Druzstevnici3 }
     *     
     */
    public Druzstevnici3 getDCI() {
        return dci;
    }

    /**
     * Sets the value of the dci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Druzstevnici3 }
     *     
     */
    public void setDCI(Druzstevnici3 value) {
        this.dci = value;
    }

    /**
     * Gets the value of the kpi property.
     * 
     * @return
     *     possible object is
     *     {@link Komplementari3 }
     *     
     */
    public Komplementari3 getKPI() {
        return kpi;
    }

    /**
     * Sets the value of the kpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Komplementari3 }
     *     
     */
    public void setKPI(Komplementari3 value) {
        this.kpi = value;
    }

    /**
     * Gets the value of the cls property.
     * 
     * @return
     *     possible object is
     *     {@link ClenoveSdruzeni3 }
     *     
     */
    public ClenoveSdruzeni3 getCLS() {
        return cls;
    }

    /**
     * Sets the value of the cls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClenoveSdruzeni3 }
     *     
     */
    public void setCLS(ClenoveSdruzeni3 value) {
        this.cls = value;
    }

    /**
     * Gets the value of the kv property.
     * 
     * @return
     *     possible object is
     *     {@link KonkurzyVyrovnani3 }
     *     
     */
    public KonkurzyVyrovnani3 getKV() {
        return kv;
    }

    /**
     * Sets the value of the kv property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonkurzyVyrovnani3 }
     *     
     */
    public void setKV(KonkurzyVyrovnani3 value) {
        this.kv = value;
    }

    /**
     * Gets the value of the ozy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ozy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOZY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdstepneZavody3 }
     * 
     * 
     */
    public List<OdstepneZavody3> getOZY() {
        if (ozy == null) {
            ozy = new ArrayList<OdstepneZavody3>();
        }
        return this.ozy;
    }

}
