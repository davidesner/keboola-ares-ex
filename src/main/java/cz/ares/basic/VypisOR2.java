
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
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}uvod" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladni_udaje_OR"/>
 *         &lt;element name="REG" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}registrace"/>
 *         &lt;element name="CIN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}cinnosti" minOccurs="0"/>
 *         &lt;element name="EX" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OSK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KAP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kapital" minOccurs="0"/>
 *         &lt;element name="SO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}statutarni_organ" minOccurs="0"/>
 *         &lt;element name="SOS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}sos" minOccurs="0"/>
 *         &lt;element name="SOK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}sok" minOccurs="0"/>
 *         &lt;element name="SOP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}sop" minOccurs="0"/>
 *         &lt;element name="PRE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}predstavenstvo" minOccurs="0"/>
 *         &lt;element name="SOZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}szo" minOccurs="0"/>
 *         &lt;element name="SR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spravni_rada" minOccurs="0"/>
 *         &lt;element name="NAD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nadace" minOccurs="0"/>
 *         &lt;element name="NF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nadacni_fond" minOccurs="0"/>
 *         &lt;element name="LI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}likvidace" minOccurs="0"/>
 *         &lt;element name="PRO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}prokura" minOccurs="0"/>
 *         &lt;element name="Reditele_ops" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}reditele_ops" minOccurs="0"/>
 *         &lt;element name="DR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}dozorci_rada" minOccurs="0"/>
 *         &lt;element name="Kontrolni_komise" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kontrolni_komise" minOccurs="0"/>
 *         &lt;element name="REI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}revizori" minOccurs="0"/>
 *         &lt;element name="SBV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spolecnici_bez_vkladu" minOccurs="0"/>
 *         &lt;element name="SSV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}spolecnici_s_vkladem" minOccurs="0"/>
 *         &lt;element name="AKI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}akcionari" minOccurs="0"/>
 *         &lt;element name="Z_SP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladatele_SP" minOccurs="0"/>
 *         &lt;element name="Z_OPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladatele_OPS" minOccurs="0"/>
 *         &lt;element name="Z_OZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zrizovatele_OZ" minOccurs="0"/>
 *         &lt;element name="Z_PR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zrizovatele_PR" minOccurs="0"/>
 *         &lt;element name="NAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nastupci_zrizovatele" minOccurs="0"/>
 *         &lt;element name="Z_N" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zrizovatele_nadace" minOccurs="0"/>
 *         &lt;element name="VOU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}ved_oz" minOccurs="0"/>
 *         &lt;element name="KME" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}komanditiste" minOccurs="0"/>
 *         &lt;element name="DCI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}druzstevnici" minOccurs="0"/>
 *         &lt;element name="KPI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}komplementari" minOccurs="0"/>
 *         &lt;element name="CLS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}clenove_sdruzeni" minOccurs="0"/>
 *         &lt;element name="KV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurzy_vyrovnani" minOccurs="0"/>
 *         &lt;element name="OZY" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}odstepne_zavody" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_OR", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
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
public class VypisOR2 {

    @XmlElement(name = "UVOD")
    protected Uvod2 uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeOR2 zau;
    @XmlElement(name = "REG", required = true)
    protected Registrace2 reg;
    @XmlElement(name = "CIN")
    protected Cinnosti2 cin;
    @XmlElement(name = "EX")
    protected List<Texty2> ex;
    @XmlElement(name = "OSK")
    protected List<Texty2> osk;
    @XmlElement(name = "KAP")
    protected Kapital2 kap;
    @XmlElement(name = "SO")
    protected StatutarniOrgan2 so;
    @XmlElement(name = "SOS")
    protected Sos2 sos;
    @XmlElement(name = "SOK")
    protected Sok2 sok;
    @XmlElement(name = "SOP")
    protected Sop2 sop;
    @XmlElement(name = "PRE")
    protected Predstavenstvo2 pre;
    @XmlElement(name = "SOZ")
    protected Szo2 soz;
    @XmlElement(name = "SR")
    protected SpravniRada2 sr;
    @XmlElement(name = "NAD")
    protected Nadace2 nad;
    @XmlElement(name = "NF")
    protected NadacniFond2 nf;
    @XmlElement(name = "LI")
    protected Likvidace2 li;
    @XmlElement(name = "PRO")
    protected Prokura2 pro;
    @XmlElement(name = "Reditele_ops")
    protected RediteleOps2 rediteleOps;
    @XmlElement(name = "DR")
    protected DozorciRada2 dr;
    @XmlElement(name = "Kontrolni_komise")
    protected KontrolniKomise2 kontrolniKomise;
    @XmlElement(name = "REI")
    protected Revizori2 rei;
    @XmlElement(name = "SBV")
    protected SpolecniciBezVkladu2 sbv;
    @XmlElement(name = "SSV")
    protected SpolecniciSVkladem2 ssv;
    @XmlElement(name = "AKI")
    protected Akcionari2 aki;
    @XmlElement(name = "Z_SP")
    protected ZakladateleSP2 zsp;
    @XmlElement(name = "Z_OPS")
    protected ZakladateleOPS2 zops;
    @XmlElement(name = "Z_OZ")
    protected ZrizovateleOZ2 zoz;
    @XmlElement(name = "Z_PR")
    protected ZrizovatelePR2 zpr;
    @XmlElement(name = "NAU")
    protected NastupciZrizovatele2 nau;
    @XmlElement(name = "Z_N")
    protected ZrizovateleNadace2 zn;
    @XmlElement(name = "VOU")
    protected VedOz2 vou;
    @XmlElement(name = "KME")
    protected Komanditiste2 kme;
    @XmlElement(name = "DCI")
    protected Druzstevnici2 dci;
    @XmlElement(name = "KPI")
    protected Komplementari2 kpi;
    @XmlElement(name = "CLS")
    protected ClenoveSdruzeni2 cls;
    @XmlElement(name = "KV")
    protected KonkurzyVyrovnani2 kv;
    @XmlElement(name = "OZY")
    protected List<OdstepneZavody2> ozy;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod2 }
     *     
     */
    public Uvod2 getUVOD() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod2 }
     *     
     */
    public void setUVOD(Uvod2 value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeOR2 }
     *     
     */
    public ZakladniUdajeOR2 getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeOR2 }
     *     
     */
    public void setZAU(ZakladniUdajeOR2 value) {
        this.zau = value;
    }

    /**
     * Gets the value of the reg property.
     * 
     * @return
     *     possible object is
     *     {@link Registrace2 }
     *     
     */
    public Registrace2 getREG() {
        return reg;
    }

    /**
     * Sets the value of the reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registrace2 }
     *     
     */
    public void setREG(Registrace2 value) {
        this.reg = value;
    }

    /**
     * Gets the value of the cin property.
     * 
     * @return
     *     possible object is
     *     {@link Cinnosti2 }
     *     
     */
    public Cinnosti2 getCIN() {
        return cin;
    }

    /**
     * Sets the value of the cin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cinnosti2 }
     *     
     */
    public void setCIN(Cinnosti2 value) {
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
     * {@link Texty2 }
     * 
     * 
     */
    public List<Texty2> getEX() {
        if (ex == null) {
            ex = new ArrayList<Texty2>();
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
     * {@link Texty2 }
     * 
     * 
     */
    public List<Texty2> getOSK() {
        if (osk == null) {
            osk = new ArrayList<Texty2>();
        }
        return this.osk;
    }

    /**
     * Gets the value of the kap property.
     * 
     * @return
     *     possible object is
     *     {@link Kapital2 }
     *     
     */
    public Kapital2 getKAP() {
        return kap;
    }

    /**
     * Sets the value of the kap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kapital2 }
     *     
     */
    public void setKAP(Kapital2 value) {
        this.kap = value;
    }

    /**
     * Gets the value of the so property.
     * 
     * @return
     *     possible object is
     *     {@link StatutarniOrgan2 }
     *     
     */
    public StatutarniOrgan2 getSO() {
        return so;
    }

    /**
     * Sets the value of the so property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutarniOrgan2 }
     *     
     */
    public void setSO(StatutarniOrgan2 value) {
        this.so = value;
    }

    /**
     * Gets the value of the sos property.
     * 
     * @return
     *     possible object is
     *     {@link Sos2 }
     *     
     */
    public Sos2 getSOS() {
        return sos;
    }

    /**
     * Sets the value of the sos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sos2 }
     *     
     */
    public void setSOS(Sos2 value) {
        this.sos = value;
    }

    /**
     * Gets the value of the sok property.
     * 
     * @return
     *     possible object is
     *     {@link Sok2 }
     *     
     */
    public Sok2 getSOK() {
        return sok;
    }

    /**
     * Sets the value of the sok property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sok2 }
     *     
     */
    public void setSOK(Sok2 value) {
        this.sok = value;
    }

    /**
     * Gets the value of the sop property.
     * 
     * @return
     *     possible object is
     *     {@link Sop2 }
     *     
     */
    public Sop2 getSOP() {
        return sop;
    }

    /**
     * Sets the value of the sop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sop2 }
     *     
     */
    public void setSOP(Sop2 value) {
        this.sop = value;
    }

    /**
     * Gets the value of the pre property.
     * 
     * @return
     *     possible object is
     *     {@link Predstavenstvo2 }
     *     
     */
    public Predstavenstvo2 getPRE() {
        return pre;
    }

    /**
     * Sets the value of the pre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Predstavenstvo2 }
     *     
     */
    public void setPRE(Predstavenstvo2 value) {
        this.pre = value;
    }

    /**
     * Gets the value of the soz property.
     * 
     * @return
     *     possible object is
     *     {@link Szo2 }
     *     
     */
    public Szo2 getSOZ() {
        return soz;
    }

    /**
     * Sets the value of the soz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Szo2 }
     *     
     */
    public void setSOZ(Szo2 value) {
        this.soz = value;
    }

    /**
     * Gets the value of the sr property.
     * 
     * @return
     *     possible object is
     *     {@link SpravniRada2 }
     *     
     */
    public SpravniRada2 getSR() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpravniRada2 }
     *     
     */
    public void setSR(SpravniRada2 value) {
        this.sr = value;
    }

    /**
     * Gets the value of the nad property.
     * 
     * @return
     *     possible object is
     *     {@link Nadace2 }
     *     
     */
    public Nadace2 getNAD() {
        return nad;
    }

    /**
     * Sets the value of the nad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nadace2 }
     *     
     */
    public void setNAD(Nadace2 value) {
        this.nad = value;
    }

    /**
     * Gets the value of the nf property.
     * 
     * @return
     *     possible object is
     *     {@link NadacniFond2 }
     *     
     */
    public NadacniFond2 getNF() {
        return nf;
    }

    /**
     * Sets the value of the nf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NadacniFond2 }
     *     
     */
    public void setNF(NadacniFond2 value) {
        this.nf = value;
    }

    /**
     * Gets the value of the li property.
     * 
     * @return
     *     possible object is
     *     {@link Likvidace2 }
     *     
     */
    public Likvidace2 getLI() {
        return li;
    }

    /**
     * Sets the value of the li property.
     * 
     * @param value
     *     allowed object is
     *     {@link Likvidace2 }
     *     
     */
    public void setLI(Likvidace2 value) {
        this.li = value;
    }

    /**
     * Gets the value of the pro property.
     * 
     * @return
     *     possible object is
     *     {@link Prokura2 }
     *     
     */
    public Prokura2 getPRO() {
        return pro;
    }

    /**
     * Sets the value of the pro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prokura2 }
     *     
     */
    public void setPRO(Prokura2 value) {
        this.pro = value;
    }

    /**
     * Gets the value of the rediteleOps property.
     * 
     * @return
     *     possible object is
     *     {@link RediteleOps2 }
     *     
     */
    public RediteleOps2 getRediteleOps() {
        return rediteleOps;
    }

    /**
     * Sets the value of the rediteleOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link RediteleOps2 }
     *     
     */
    public void setRediteleOps(RediteleOps2 value) {
        this.rediteleOps = value;
    }

    /**
     * Gets the value of the dr property.
     * 
     * @return
     *     possible object is
     *     {@link DozorciRada2 }
     *     
     */
    public DozorciRada2 getDR() {
        return dr;
    }

    /**
     * Sets the value of the dr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DozorciRada2 }
     *     
     */
    public void setDR(DozorciRada2 value) {
        this.dr = value;
    }

    /**
     * Gets the value of the kontrolniKomise property.
     * 
     * @return
     *     possible object is
     *     {@link KontrolniKomise2 }
     *     
     */
    public KontrolniKomise2 getKontrolniKomise() {
        return kontrolniKomise;
    }

    /**
     * Sets the value of the kontrolniKomise property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontrolniKomise2 }
     *     
     */
    public void setKontrolniKomise(KontrolniKomise2 value) {
        this.kontrolniKomise = value;
    }

    /**
     * Gets the value of the rei property.
     * 
     * @return
     *     possible object is
     *     {@link Revizori2 }
     *     
     */
    public Revizori2 getREI() {
        return rei;
    }

    /**
     * Sets the value of the rei property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revizori2 }
     *     
     */
    public void setREI(Revizori2 value) {
        this.rei = value;
    }

    /**
     * Gets the value of the sbv property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciBezVkladu2 }
     *     
     */
    public SpolecniciBezVkladu2 getSBV() {
        return sbv;
    }

    /**
     * Sets the value of the sbv property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciBezVkladu2 }
     *     
     */
    public void setSBV(SpolecniciBezVkladu2 value) {
        this.sbv = value;
    }

    /**
     * Gets the value of the ssv property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciSVkladem2 }
     *     
     */
    public SpolecniciSVkladem2 getSSV() {
        return ssv;
    }

    /**
     * Sets the value of the ssv property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciSVkladem2 }
     *     
     */
    public void setSSV(SpolecniciSVkladem2 value) {
        this.ssv = value;
    }

    /**
     * Gets the value of the aki property.
     * 
     * @return
     *     possible object is
     *     {@link Akcionari2 }
     *     
     */
    public Akcionari2 getAKI() {
        return aki;
    }

    /**
     * Sets the value of the aki property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akcionari2 }
     *     
     */
    public void setAKI(Akcionari2 value) {
        this.aki = value;
    }

    /**
     * Gets the value of the zsp property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladateleSP2 }
     *     
     */
    public ZakladateleSP2 getZSP() {
        return zsp;
    }

    /**
     * Sets the value of the zsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladateleSP2 }
     *     
     */
    public void setZSP(ZakladateleSP2 value) {
        this.zsp = value;
    }

    /**
     * Gets the value of the zops property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladateleOPS2 }
     *     
     */
    public ZakladateleOPS2 getZOPS() {
        return zops;
    }

    /**
     * Sets the value of the zops property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladateleOPS2 }
     *     
     */
    public void setZOPS(ZakladateleOPS2 value) {
        this.zops = value;
    }

    /**
     * Gets the value of the zoz property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovateleOZ2 }
     *     
     */
    public ZrizovateleOZ2 getZOZ() {
        return zoz;
    }

    /**
     * Sets the value of the zoz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovateleOZ2 }
     *     
     */
    public void setZOZ(ZrizovateleOZ2 value) {
        this.zoz = value;
    }

    /**
     * Gets the value of the zpr property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovatelePR2 }
     *     
     */
    public ZrizovatelePR2 getZPR() {
        return zpr;
    }

    /**
     * Sets the value of the zpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovatelePR2 }
     *     
     */
    public void setZPR(ZrizovatelePR2 value) {
        this.zpr = value;
    }

    /**
     * Gets the value of the nau property.
     * 
     * @return
     *     possible object is
     *     {@link NastupciZrizovatele2 }
     *     
     */
    public NastupciZrizovatele2 getNAU() {
        return nau;
    }

    /**
     * Sets the value of the nau property.
     * 
     * @param value
     *     allowed object is
     *     {@link NastupciZrizovatele2 }
     *     
     */
    public void setNAU(NastupciZrizovatele2 value) {
        this.nau = value;
    }

    /**
     * Gets the value of the zn property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovateleNadace2 }
     *     
     */
    public ZrizovateleNadace2 getZN() {
        return zn;
    }

    /**
     * Sets the value of the zn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovateleNadace2 }
     *     
     */
    public void setZN(ZrizovateleNadace2 value) {
        this.zn = value;
    }

    /**
     * Gets the value of the vou property.
     * 
     * @return
     *     possible object is
     *     {@link VedOz2 }
     *     
     */
    public VedOz2 getVOU() {
        return vou;
    }

    /**
     * Sets the value of the vou property.
     * 
     * @param value
     *     allowed object is
     *     {@link VedOz2 }
     *     
     */
    public void setVOU(VedOz2 value) {
        this.vou = value;
    }

    /**
     * Gets the value of the kme property.
     * 
     * @return
     *     possible object is
     *     {@link Komanditiste2 }
     *     
     */
    public Komanditiste2 getKME() {
        return kme;
    }

    /**
     * Sets the value of the kme property.
     * 
     * @param value
     *     allowed object is
     *     {@link Komanditiste2 }
     *     
     */
    public void setKME(Komanditiste2 value) {
        this.kme = value;
    }

    /**
     * Gets the value of the dci property.
     * 
     * @return
     *     possible object is
     *     {@link Druzstevnici2 }
     *     
     */
    public Druzstevnici2 getDCI() {
        return dci;
    }

    /**
     * Sets the value of the dci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Druzstevnici2 }
     *     
     */
    public void setDCI(Druzstevnici2 value) {
        this.dci = value;
    }

    /**
     * Gets the value of the kpi property.
     * 
     * @return
     *     possible object is
     *     {@link Komplementari2 }
     *     
     */
    public Komplementari2 getKPI() {
        return kpi;
    }

    /**
     * Sets the value of the kpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Komplementari2 }
     *     
     */
    public void setKPI(Komplementari2 value) {
        this.kpi = value;
    }

    /**
     * Gets the value of the cls property.
     * 
     * @return
     *     possible object is
     *     {@link ClenoveSdruzeni2 }
     *     
     */
    public ClenoveSdruzeni2 getCLS() {
        return cls;
    }

    /**
     * Sets the value of the cls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClenoveSdruzeni2 }
     *     
     */
    public void setCLS(ClenoveSdruzeni2 value) {
        this.cls = value;
    }

    /**
     * Gets the value of the kv property.
     * 
     * @return
     *     possible object is
     *     {@link KonkurzyVyrovnani2 }
     *     
     */
    public KonkurzyVyrovnani2 getKV() {
        return kv;
    }

    /**
     * Sets the value of the kv property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonkurzyVyrovnani2 }
     *     
     */
    public void setKV(KonkurzyVyrovnani2 value) {
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
     * {@link OdstepneZavody2 }
     * 
     * 
     */
    public List<OdstepneZavody2> getOZY() {
        if (ozy == null) {
            ozy = new ArrayList<OdstepneZavody2>();
        }
        return this.ozy;
    }

}
