
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vypis_ceu_detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_ceu_detail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravni_forma" minOccurs="0"/>
 *         &lt;element name="obec" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="psc" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="uvp" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="okres" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="c_doadr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="obec_b" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce" minOccurs="0"/>
 *         &lt;element name="psc_b" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}psc" minOccurs="0"/>
 *         &lt;element name="uvp_b" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_ulice" minOccurs="0"/>
 *         &lt;element name="okres_b" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_okresu" minOccurs="0"/>
 *         &lt;element name="c_doadr_b" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cislo_do_adresy" minOccurs="0"/>
 *         &lt;element name="S_k" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_upadce_CEU" minOccurs="0"/>
 *         &lt;element name="S_v" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_upadce_CEU" minOccurs="0"/>
 *         &lt;element name="ukony" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jednotlive_ukony" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_ceu_detail", propOrder = {
    "ic",
    "of",
    "pf",
    "obec",
    "psc",
    "uvp",
    "okres",
    "cDoadr",
    "obecB",
    "pscB",
    "uvpB",
    "okresB",
    "cDoadrB",
    "sk",
    "sv",
    "ukony"
})
public class VypisCeuDetail {

    @XmlElement(name = "IC")
    protected String ic;
    @XmlElement(name = "OF")
    protected String of;
    @XmlElement(name = "PF")
    protected PravniForma3 pf;
    protected String obec;
    protected String psc;
    protected String uvp;
    protected String okres;
    @XmlElement(name = "c_doadr")
    protected String cDoadr;
    @XmlElement(name = "obec_b")
    protected String obecB;
    @XmlElement(name = "psc_b")
    protected String pscB;
    @XmlElement(name = "uvp_b")
    protected String uvpB;
    @XmlElement(name = "okres_b")
    protected String okresB;
    @XmlElement(name = "c_doadr_b")
    protected String cDoadrB;
    @XmlElement(name = "S_k")
    protected StavUpadceCEU3 sk;
    @XmlElement(name = "S_v")
    protected StavUpadceCEU3 sv;
    protected List<JednotliveUkony> ukony;

    /**
     * Gets the value of the ic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIC() {
        return ic;
    }

    /**
     * Sets the value of the ic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIC(String value) {
        this.ic = value;
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
     * Gets the value of the uvp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvp() {
        return uvp;
    }

    /**
     * Sets the value of the uvp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvp(String value) {
        this.uvp = value;
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
     * Gets the value of the cDoadr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDoadr() {
        return cDoadr;
    }

    /**
     * Sets the value of the cDoadr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDoadr(String value) {
        this.cDoadr = value;
    }

    /**
     * Gets the value of the obecB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObecB() {
        return obecB;
    }

    /**
     * Sets the value of the obecB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObecB(String value) {
        this.obecB = value;
    }

    /**
     * Gets the value of the pscB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPscB() {
        return pscB;
    }

    /**
     * Sets the value of the pscB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPscB(String value) {
        this.pscB = value;
    }

    /**
     * Gets the value of the uvpB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvpB() {
        return uvpB;
    }

    /**
     * Sets the value of the uvpB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvpB(String value) {
        this.uvpB = value;
    }

    /**
     * Gets the value of the okresB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkresB() {
        return okresB;
    }

    /**
     * Sets the value of the okresB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkresB(String value) {
        this.okresB = value;
    }

    /**
     * Gets the value of the cDoadrB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCDoadrB() {
        return cDoadrB;
    }

    /**
     * Sets the value of the cDoadrB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDoadrB(String value) {
        this.cDoadrB = value;
    }

    /**
     * Gets the value of the sk property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public StavUpadceCEU3 getSK() {
        return sk;
    }

    /**
     * Sets the value of the sk property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public void setSK(StavUpadceCEU3 value) {
        this.sk = value;
    }

    /**
     * Gets the value of the sv property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public StavUpadceCEU3 getSV() {
        return sv;
    }

    /**
     * Sets the value of the sv property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU3 }
     *     
     */
    public void setSV(StavUpadceCEU3 value) {
        this.sv = value;
    }

    /**
     * Gets the value of the ukony property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ukony property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUkony().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JednotliveUkony }
     * 
     * 
     */
    public List<JednotliveUkony> getUkony() {
        if (ukony == null) {
            ukony = new ArrayList<JednotliveUkony>();
        }
        return this.ukony;
    }

}
