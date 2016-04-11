
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
 *         &lt;element name="Uvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}uvod" minOccurs="0"/>
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zakladni_udaje_OR"/>
 *         &lt;element name="Registrace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}registrace"/>
 *         &lt;element name="Cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cinnosti" minOccurs="0"/>
 *         &lt;element name="Exekuce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ostatni_skutecnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Kapital" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kapital" minOccurs="0"/>
 *         &lt;element name="Statutarni_organ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}statutarni_organ" minOccurs="0"/>
 *         &lt;element name="Statutarni_organ_spolecnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}sos" minOccurs="0"/>
 *         &lt;element name="Statutarni_organ_komplementaru" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}sok" minOccurs="0"/>
 *         &lt;element name="Statutarni_organ_predstavenstvo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}sop" minOccurs="0"/>
 *         &lt;element name="Predstavenstvo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}predstavenstvo" minOccurs="0"/>
 *         &lt;element name="Statutarni_organ_zrizovatele_ZO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}szo" minOccurs="0"/>
 *         &lt;element name="Spravni_rada" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spravni_rada" minOccurs="0"/>
 *         &lt;element name="Nadace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nadace" minOccurs="0"/>
 *         &lt;element name="Nadacni_fond" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nadacni_fond" minOccurs="0"/>
 *         &lt;element name="Likvidace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}likvidace" minOccurs="0"/>
 *         &lt;element name="Prokura" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}prokura" minOccurs="0"/>
 *         &lt;element name="Reditele_ops" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}reditele_ops" minOccurs="0"/>
 *         &lt;element name="Dozorci_rada" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}dozorci_rada" minOccurs="0"/>
 *         &lt;element name="Kontrolni_komise" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kontrolni_komise" minOccurs="0"/>
 *         &lt;element name="Revizori" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}revizori" minOccurs="0"/>
 *         &lt;element name="Spolecnici_bez_vkladu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spolecnici_bez_vkladu" minOccurs="0"/>
 *         &lt;element name="Spolecnici_s_vkladem" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spolecnici_s_vkladem" minOccurs="0"/>
 *         &lt;element name="Akcionari" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}akcionari" minOccurs="0"/>
 *         &lt;element name="Zakladatele_SP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zakladatele_SP" minOccurs="0"/>
 *         &lt;element name="Zakladatele_OPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zakladatele_OPS" minOccurs="0"/>
 *         &lt;element name="Zrizovatele_OZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zrizovatele_OZ" minOccurs="0"/>
 *         &lt;element name="Zrizovatele_PR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zrizovatele_PR" minOccurs="0"/>
 *         &lt;element name="Nastupci_zrizovatelu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nastupci_zrizovatele" minOccurs="0"/>
 *         &lt;element name="Zrizovatele_nadace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}zrizovatele_nadace" minOccurs="0"/>
 *         &lt;element name="Vedouci_odstepnych_zavodu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ved_oz" minOccurs="0"/>
 *         &lt;element name="Komanditiste" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}komanditiste" minOccurs="0"/>
 *         &lt;element name="Druzstevnici" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}druzstevnici" minOccurs="0"/>
 *         &lt;element name="Komplementari" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}komplementari" minOccurs="0"/>
 *         &lt;element name="Clenove_sdruzeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}clenove_sdruzeni" minOccurs="0"/>
 *         &lt;element name="Konkurzy_vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}konkurzy_vyrovnani" minOccurs="0"/>
 *         &lt;element name="Odstepne_zavody" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}odstepne_zavody" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_OR", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "uvod",
    "zakladniUdaje",
    "registrace",
    "cinnosti",
    "exekuce",
    "ostatniSkutecnosti",
    "kapital",
    "statutarniOrgan",
    "statutarniOrganSpolecnosti",
    "statutarniOrganKomplementaru",
    "statutarniOrganPredstavenstvo",
    "predstavenstvo",
    "statutarniOrganZrizovateleZO",
    "spravniRada",
    "nadace",
    "nadacniFond",
    "likvidace",
    "prokura",
    "rediteleOps",
    "dozorciRada",
    "kontrolniKomise",
    "revizori",
    "spolecniciBezVkladu",
    "spolecniciSVkladem",
    "akcionari",
    "zakladateleSP",
    "zakladateleOPS",
    "zrizovateleOZ",
    "zrizovatelePR",
    "nastupciZrizovatelu",
    "zrizovateleNadace",
    "vedouciOdstepnychZavodu",
    "komanditiste",
    "druzstevnici",
    "komplementari",
    "clenoveSdruzeni",
    "konkurzyVyrovnani",
    "odstepneZavody"
})
public class VypisOR {

    @XmlElement(name = "Uvod")
    protected Uvod uvod;
    @XmlElement(name = "Zakladni_udaje", required = true)
    protected ZakladniUdajeOR zakladniUdaje;
    @XmlElement(name = "Registrace", required = true)
    protected Registrace registrace;
    @XmlElement(name = "Cinnosti")
    protected Cinnosti cinnosti;
    @XmlElement(name = "Exekuce")
    protected List<Texty> exekuce;
    @XmlElement(name = "Ostatni_skutecnosti")
    protected List<Texty> ostatniSkutecnosti;
    @XmlElement(name = "Kapital")
    protected Kapital kapital;
    @XmlElement(name = "Statutarni_organ")
    protected StatutarniOrgan statutarniOrgan;
    @XmlElement(name = "Statutarni_organ_spolecnosti")
    protected Sos statutarniOrganSpolecnosti;
    @XmlElement(name = "Statutarni_organ_komplementaru")
    protected Sok statutarniOrganKomplementaru;
    @XmlElement(name = "Statutarni_organ_predstavenstvo")
    protected Sop statutarniOrganPredstavenstvo;
    @XmlElement(name = "Predstavenstvo")
    protected Predstavenstvo predstavenstvo;
    @XmlElement(name = "Statutarni_organ_zrizovatele_ZO")
    protected Szo statutarniOrganZrizovateleZO;
    @XmlElement(name = "Spravni_rada")
    protected SpravniRada spravniRada;
    @XmlElement(name = "Nadace")
    protected Nadace nadace;
    @XmlElement(name = "Nadacni_fond")
    protected NadacniFond nadacniFond;
    @XmlElement(name = "Likvidace")
    protected Likvidace likvidace;
    @XmlElement(name = "Prokura")
    protected Prokura prokura;
    @XmlElement(name = "Reditele_ops")
    protected RediteleOps rediteleOps;
    @XmlElement(name = "Dozorci_rada")
    protected DozorciRada dozorciRada;
    @XmlElement(name = "Kontrolni_komise")
    protected KontrolniKomise kontrolniKomise;
    @XmlElement(name = "Revizori")
    protected Revizori revizori;
    @XmlElement(name = "Spolecnici_bez_vkladu")
    protected SpolecniciBezVkladu spolecniciBezVkladu;
    @XmlElement(name = "Spolecnici_s_vkladem")
    protected SpolecniciSVkladem spolecniciSVkladem;
    @XmlElement(name = "Akcionari")
    protected Akcionari akcionari;
    @XmlElement(name = "Zakladatele_SP")
    protected ZakladateleSP zakladateleSP;
    @XmlElement(name = "Zakladatele_OPS")
    protected ZakladateleOPS zakladateleOPS;
    @XmlElement(name = "Zrizovatele_OZ")
    protected ZrizovateleOZ zrizovateleOZ;
    @XmlElement(name = "Zrizovatele_PR")
    protected ZrizovatelePR zrizovatelePR;
    @XmlElement(name = "Nastupci_zrizovatelu")
    protected NastupciZrizovatele nastupciZrizovatelu;
    @XmlElement(name = "Zrizovatele_nadace")
    protected ZrizovateleNadace zrizovateleNadace;
    @XmlElement(name = "Vedouci_odstepnych_zavodu")
    protected VedOz vedouciOdstepnychZavodu;
    @XmlElement(name = "Komanditiste")
    protected Komanditiste komanditiste;
    @XmlElement(name = "Druzstevnici")
    protected Druzstevnici druzstevnici;
    @XmlElement(name = "Komplementari")
    protected Komplementari komplementari;
    @XmlElement(name = "Clenove_sdruzeni")
    protected ClenoveSdruzeni clenoveSdruzeni;
    @XmlElement(name = "Konkurzy_vyrovnani")
    protected KonkurzyVyrovnani konkurzyVyrovnani;
    @XmlElement(name = "Odstepne_zavody")
    protected List<OdstepneZavody> odstepneZavody;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod }
     *     
     */
    public Uvod getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod }
     *     
     */
    public void setUvod(Uvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zakladniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeOR }
     *     
     */
    public ZakladniUdajeOR getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeOR }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeOR value) {
        this.zakladniUdaje = value;
    }

    /**
     * Gets the value of the registrace property.
     * 
     * @return
     *     possible object is
     *     {@link Registrace }
     *     
     */
    public Registrace getRegistrace() {
        return registrace;
    }

    /**
     * Sets the value of the registrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Registrace }
     *     
     */
    public void setRegistrace(Registrace value) {
        this.registrace = value;
    }

    /**
     * Gets the value of the cinnosti property.
     * 
     * @return
     *     possible object is
     *     {@link Cinnosti }
     *     
     */
    public Cinnosti getCinnosti() {
        return cinnosti;
    }

    /**
     * Sets the value of the cinnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cinnosti }
     *     
     */
    public void setCinnosti(Cinnosti value) {
        this.cinnosti = value;
    }

    /**
     * Gets the value of the exekuce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exekuce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExekuce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getExekuce() {
        if (exekuce == null) {
            exekuce = new ArrayList<Texty>();
        }
        return this.exekuce;
    }

    /**
     * Gets the value of the ostatniSkutecnosti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ostatniSkutecnosti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOstatniSkutecnosti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getOstatniSkutecnosti() {
        if (ostatniSkutecnosti == null) {
            ostatniSkutecnosti = new ArrayList<Texty>();
        }
        return this.ostatniSkutecnosti;
    }

    /**
     * Gets the value of the kapital property.
     * 
     * @return
     *     possible object is
     *     {@link Kapital }
     *     
     */
    public Kapital getKapital() {
        return kapital;
    }

    /**
     * Sets the value of the kapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Kapital }
     *     
     */
    public void setKapital(Kapital value) {
        this.kapital = value;
    }

    /**
     * Gets the value of the statutarniOrgan property.
     * 
     * @return
     *     possible object is
     *     {@link StatutarniOrgan }
     *     
     */
    public StatutarniOrgan getStatutarniOrgan() {
        return statutarniOrgan;
    }

    /**
     * Sets the value of the statutarniOrgan property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutarniOrgan }
     *     
     */
    public void setStatutarniOrgan(StatutarniOrgan value) {
        this.statutarniOrgan = value;
    }

    /**
     * Gets the value of the statutarniOrganSpolecnosti property.
     * 
     * @return
     *     possible object is
     *     {@link Sos }
     *     
     */
    public Sos getStatutarniOrganSpolecnosti() {
        return statutarniOrganSpolecnosti;
    }

    /**
     * Sets the value of the statutarniOrganSpolecnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sos }
     *     
     */
    public void setStatutarniOrganSpolecnosti(Sos value) {
        this.statutarniOrganSpolecnosti = value;
    }

    /**
     * Gets the value of the statutarniOrganKomplementaru property.
     * 
     * @return
     *     possible object is
     *     {@link Sok }
     *     
     */
    public Sok getStatutarniOrganKomplementaru() {
        return statutarniOrganKomplementaru;
    }

    /**
     * Sets the value of the statutarniOrganKomplementaru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sok }
     *     
     */
    public void setStatutarniOrganKomplementaru(Sok value) {
        this.statutarniOrganKomplementaru = value;
    }

    /**
     * Gets the value of the statutarniOrganPredstavenstvo property.
     * 
     * @return
     *     possible object is
     *     {@link Sop }
     *     
     */
    public Sop getStatutarniOrganPredstavenstvo() {
        return statutarniOrganPredstavenstvo;
    }

    /**
     * Sets the value of the statutarniOrganPredstavenstvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sop }
     *     
     */
    public void setStatutarniOrganPredstavenstvo(Sop value) {
        this.statutarniOrganPredstavenstvo = value;
    }

    /**
     * Gets the value of the predstavenstvo property.
     * 
     * @return
     *     possible object is
     *     {@link Predstavenstvo }
     *     
     */
    public Predstavenstvo getPredstavenstvo() {
        return predstavenstvo;
    }

    /**
     * Sets the value of the predstavenstvo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Predstavenstvo }
     *     
     */
    public void setPredstavenstvo(Predstavenstvo value) {
        this.predstavenstvo = value;
    }

    /**
     * Gets the value of the statutarniOrganZrizovateleZO property.
     * 
     * @return
     *     possible object is
     *     {@link Szo }
     *     
     */
    public Szo getStatutarniOrganZrizovateleZO() {
        return statutarniOrganZrizovateleZO;
    }

    /**
     * Sets the value of the statutarniOrganZrizovateleZO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Szo }
     *     
     */
    public void setStatutarniOrganZrizovateleZO(Szo value) {
        this.statutarniOrganZrizovateleZO = value;
    }

    /**
     * Gets the value of the spravniRada property.
     * 
     * @return
     *     possible object is
     *     {@link SpravniRada }
     *     
     */
    public SpravniRada getSpravniRada() {
        return spravniRada;
    }

    /**
     * Sets the value of the spravniRada property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpravniRada }
     *     
     */
    public void setSpravniRada(SpravniRada value) {
        this.spravniRada = value;
    }

    /**
     * Gets the value of the nadace property.
     * 
     * @return
     *     possible object is
     *     {@link Nadace }
     *     
     */
    public Nadace getNadace() {
        return nadace;
    }

    /**
     * Sets the value of the nadace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nadace }
     *     
     */
    public void setNadace(Nadace value) {
        this.nadace = value;
    }

    /**
     * Gets the value of the nadacniFond property.
     * 
     * @return
     *     possible object is
     *     {@link NadacniFond }
     *     
     */
    public NadacniFond getNadacniFond() {
        return nadacniFond;
    }

    /**
     * Sets the value of the nadacniFond property.
     * 
     * @param value
     *     allowed object is
     *     {@link NadacniFond }
     *     
     */
    public void setNadacniFond(NadacniFond value) {
        this.nadacniFond = value;
    }

    /**
     * Gets the value of the likvidace property.
     * 
     * @return
     *     possible object is
     *     {@link Likvidace }
     *     
     */
    public Likvidace getLikvidace() {
        return likvidace;
    }

    /**
     * Sets the value of the likvidace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Likvidace }
     *     
     */
    public void setLikvidace(Likvidace value) {
        this.likvidace = value;
    }

    /**
     * Gets the value of the prokura property.
     * 
     * @return
     *     possible object is
     *     {@link Prokura }
     *     
     */
    public Prokura getProkura() {
        return prokura;
    }

    /**
     * Sets the value of the prokura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prokura }
     *     
     */
    public void setProkura(Prokura value) {
        this.prokura = value;
    }

    /**
     * Gets the value of the rediteleOps property.
     * 
     * @return
     *     possible object is
     *     {@link RediteleOps }
     *     
     */
    public RediteleOps getRediteleOps() {
        return rediteleOps;
    }

    /**
     * Sets the value of the rediteleOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link RediteleOps }
     *     
     */
    public void setRediteleOps(RediteleOps value) {
        this.rediteleOps = value;
    }

    /**
     * Gets the value of the dozorciRada property.
     * 
     * @return
     *     possible object is
     *     {@link DozorciRada }
     *     
     */
    public DozorciRada getDozorciRada() {
        return dozorciRada;
    }

    /**
     * Sets the value of the dozorciRada property.
     * 
     * @param value
     *     allowed object is
     *     {@link DozorciRada }
     *     
     */
    public void setDozorciRada(DozorciRada value) {
        this.dozorciRada = value;
    }

    /**
     * Gets the value of the kontrolniKomise property.
     * 
     * @return
     *     possible object is
     *     {@link KontrolniKomise }
     *     
     */
    public KontrolniKomise getKontrolniKomise() {
        return kontrolniKomise;
    }

    /**
     * Sets the value of the kontrolniKomise property.
     * 
     * @param value
     *     allowed object is
     *     {@link KontrolniKomise }
     *     
     */
    public void setKontrolniKomise(KontrolniKomise value) {
        this.kontrolniKomise = value;
    }

    /**
     * Gets the value of the revizori property.
     * 
     * @return
     *     possible object is
     *     {@link Revizori }
     *     
     */
    public Revizori getRevizori() {
        return revizori;
    }

    /**
     * Sets the value of the revizori property.
     * 
     * @param value
     *     allowed object is
     *     {@link Revizori }
     *     
     */
    public void setRevizori(Revizori value) {
        this.revizori = value;
    }

    /**
     * Gets the value of the spolecniciBezVkladu property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciBezVkladu }
     *     
     */
    public SpolecniciBezVkladu getSpolecniciBezVkladu() {
        return spolecniciBezVkladu;
    }

    /**
     * Sets the value of the spolecniciBezVkladu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciBezVkladu }
     *     
     */
    public void setSpolecniciBezVkladu(SpolecniciBezVkladu value) {
        this.spolecniciBezVkladu = value;
    }

    /**
     * Gets the value of the spolecniciSVkladem property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciSVkladem }
     *     
     */
    public SpolecniciSVkladem getSpolecniciSVkladem() {
        return spolecniciSVkladem;
    }

    /**
     * Sets the value of the spolecniciSVkladem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciSVkladem }
     *     
     */
    public void setSpolecniciSVkladem(SpolecniciSVkladem value) {
        this.spolecniciSVkladem = value;
    }

    /**
     * Gets the value of the akcionari property.
     * 
     * @return
     *     possible object is
     *     {@link Akcionari }
     *     
     */
    public Akcionari getAkcionari() {
        return akcionari;
    }

    /**
     * Sets the value of the akcionari property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akcionari }
     *     
     */
    public void setAkcionari(Akcionari value) {
        this.akcionari = value;
    }

    /**
     * Gets the value of the zakladateleSP property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladateleSP }
     *     
     */
    public ZakladateleSP getZakladateleSP() {
        return zakladateleSP;
    }

    /**
     * Sets the value of the zakladateleSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladateleSP }
     *     
     */
    public void setZakladateleSP(ZakladateleSP value) {
        this.zakladateleSP = value;
    }

    /**
     * Gets the value of the zakladateleOPS property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladateleOPS }
     *     
     */
    public ZakladateleOPS getZakladateleOPS() {
        return zakladateleOPS;
    }

    /**
     * Sets the value of the zakladateleOPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladateleOPS }
     *     
     */
    public void setZakladateleOPS(ZakladateleOPS value) {
        this.zakladateleOPS = value;
    }

    /**
     * Gets the value of the zrizovateleOZ property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovateleOZ }
     *     
     */
    public ZrizovateleOZ getZrizovateleOZ() {
        return zrizovateleOZ;
    }

    /**
     * Sets the value of the zrizovateleOZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovateleOZ }
     *     
     */
    public void setZrizovateleOZ(ZrizovateleOZ value) {
        this.zrizovateleOZ = value;
    }

    /**
     * Gets the value of the zrizovatelePR property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovatelePR }
     *     
     */
    public ZrizovatelePR getZrizovatelePR() {
        return zrizovatelePR;
    }

    /**
     * Sets the value of the zrizovatelePR property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovatelePR }
     *     
     */
    public void setZrizovatelePR(ZrizovatelePR value) {
        this.zrizovatelePR = value;
    }

    /**
     * Gets the value of the nastupciZrizovatelu property.
     * 
     * @return
     *     possible object is
     *     {@link NastupciZrizovatele }
     *     
     */
    public NastupciZrizovatele getNastupciZrizovatelu() {
        return nastupciZrizovatelu;
    }

    /**
     * Sets the value of the nastupciZrizovatelu property.
     * 
     * @param value
     *     allowed object is
     *     {@link NastupciZrizovatele }
     *     
     */
    public void setNastupciZrizovatelu(NastupciZrizovatele value) {
        this.nastupciZrizovatelu = value;
    }

    /**
     * Gets the value of the zrizovateleNadace property.
     * 
     * @return
     *     possible object is
     *     {@link ZrizovateleNadace }
     *     
     */
    public ZrizovateleNadace getZrizovateleNadace() {
        return zrizovateleNadace;
    }

    /**
     * Sets the value of the zrizovateleNadace property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZrizovateleNadace }
     *     
     */
    public void setZrizovateleNadace(ZrizovateleNadace value) {
        this.zrizovateleNadace = value;
    }

    /**
     * Gets the value of the vedouciOdstepnychZavodu property.
     * 
     * @return
     *     possible object is
     *     {@link VedOz }
     *     
     */
    public VedOz getVedouciOdstepnychZavodu() {
        return vedouciOdstepnychZavodu;
    }

    /**
     * Sets the value of the vedouciOdstepnychZavodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link VedOz }
     *     
     */
    public void setVedouciOdstepnychZavodu(VedOz value) {
        this.vedouciOdstepnychZavodu = value;
    }

    /**
     * Gets the value of the komanditiste property.
     * 
     * @return
     *     possible object is
     *     {@link Komanditiste }
     *     
     */
    public Komanditiste getKomanditiste() {
        return komanditiste;
    }

    /**
     * Sets the value of the komanditiste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Komanditiste }
     *     
     */
    public void setKomanditiste(Komanditiste value) {
        this.komanditiste = value;
    }

    /**
     * Gets the value of the druzstevnici property.
     * 
     * @return
     *     possible object is
     *     {@link Druzstevnici }
     *     
     */
    public Druzstevnici getDruzstevnici() {
        return druzstevnici;
    }

    /**
     * Sets the value of the druzstevnici property.
     * 
     * @param value
     *     allowed object is
     *     {@link Druzstevnici }
     *     
     */
    public void setDruzstevnici(Druzstevnici value) {
        this.druzstevnici = value;
    }

    /**
     * Gets the value of the komplementari property.
     * 
     * @return
     *     possible object is
     *     {@link Komplementari }
     *     
     */
    public Komplementari getKomplementari() {
        return komplementari;
    }

    /**
     * Sets the value of the komplementari property.
     * 
     * @param value
     *     allowed object is
     *     {@link Komplementari }
     *     
     */
    public void setKomplementari(Komplementari value) {
        this.komplementari = value;
    }

    /**
     * Gets the value of the clenoveSdruzeni property.
     * 
     * @return
     *     possible object is
     *     {@link ClenoveSdruzeni }
     *     
     */
    public ClenoveSdruzeni getClenoveSdruzeni() {
        return clenoveSdruzeni;
    }

    /**
     * Sets the value of the clenoveSdruzeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClenoveSdruzeni }
     *     
     */
    public void setClenoveSdruzeni(ClenoveSdruzeni value) {
        this.clenoveSdruzeni = value;
    }

    /**
     * Gets the value of the konkurzyVyrovnani property.
     * 
     * @return
     *     possible object is
     *     {@link KonkurzyVyrovnani }
     *     
     */
    public KonkurzyVyrovnani getKonkurzyVyrovnani() {
        return konkurzyVyrovnani;
    }

    /**
     * Sets the value of the konkurzyVyrovnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonkurzyVyrovnani }
     *     
     */
    public void setKonkurzyVyrovnani(KonkurzyVyrovnani value) {
        this.konkurzyVyrovnani = value;
    }

    /**
     * Gets the value of the odstepneZavody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odstepneZavody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdstepneZavody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdstepneZavody }
     * 
     * 
     */
    public List<OdstepneZavody> getOdstepneZavody() {
        if (odstepneZavody == null) {
            odstepneZavody = new ArrayList<OdstepneZavody>();
        }
        return this.odstepneZavody;
    }

}
