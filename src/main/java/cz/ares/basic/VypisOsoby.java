
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis jednoho subjektu na str. Pøehledu
 * 
 * <p>Java class for vypis_osoby complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_osoby">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="ico" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="LA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rc" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}rodne_cislo" minOccurs="0"/>
 *         &lt;element name="ojm" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="jmn" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="zdr" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ang" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="klic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_osoby", propOrder = {
    "stav",
    "ico",
    "la",
    "rc",
    "ojm",
    "jmn",
    "zdr",
    "ang",
    "klic"
})
public class VypisOsoby {

    protected String stav;
    protected String ico;
    @XmlElement(name = "LA")
    protected Integer la;
    protected String rc;
    protected String ojm;
    protected String jmn;
    protected Short zdr;
    protected String ang;
    protected String klic;

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStav(String value) {
        this.stav = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
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
    public void setIco(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the la property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLA() {
        return la;
    }

    /**
     * Sets the value of the la property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLA(Integer value) {
        this.la = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRc() {
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
    public void setRc(String value) {
        this.rc = value;
    }

    /**
     * Gets the value of the ojm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjm() {
        return ojm;
    }

    /**
     * Sets the value of the ojm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjm(String value) {
        this.ojm = value;
    }

    /**
     * Gets the value of the jmn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmn() {
        return jmn;
    }

    /**
     * Sets the value of the jmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmn(String value) {
        this.jmn = value;
    }

    /**
     * Gets the value of the zdr property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getZdr() {
        return zdr;
    }

    /**
     * Sets the value of the zdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setZdr(Short value) {
        this.zdr = value;
    }

    /**
     * Gets the value of the ang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAng() {
        return ang;
    }

    /**
     * Sets the value of the ang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAng(String value) {
        this.ang = value;
    }

    /**
     * Gets the value of the klic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlic() {
        return klic;
    }

    /**
     * Sets the value of the klic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlic(String value) {
        this.klic = value;
    }

}
