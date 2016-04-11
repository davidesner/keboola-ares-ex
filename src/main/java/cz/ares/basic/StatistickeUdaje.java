
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statisticke_udaje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statisticke_udaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Esa2010" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Esa2010t" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Inst_sec_kod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Institucionarni_sektor" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}institucionarni_sektor" minOccurs="0"/>
 *         &lt;element name="Kategorie_poctu_pracovniku" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kategorie_poctu_pracovniku" minOccurs="0"/>
 *         &lt;element name="Fvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Ksni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Tjz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statisticke_udaje", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "esa2010",
    "esa2010T",
    "instSecKod",
    "institucionarniSektor",
    "kategoriePoctuPracovniku",
    "fvi",
    "ksni",
    "tjz"
})
public class StatistickeUdaje {

    @XmlElement(name = "Esa2010")
    protected BigInteger esa2010;
    @XmlElement(name = "Esa2010t")
    protected String esa2010T;
    @XmlElement(name = "Inst_sec_kod")
    protected BigInteger instSecKod;
    @XmlElement(name = "Institucionarni_sektor")
    protected InstitucionarniSektor institucionarniSektor;
    @XmlElement(name = "Kategorie_poctu_pracovniku")
    protected KategoriePoctuPracovniku kategoriePoctuPracovniku;
    @XmlElement(name = "Fvi")
    protected String fvi;
    @XmlElement(name = "Ksni")
    protected String ksni;
    @XmlElement(name = "Tjz")
    protected String tjz;

    /**
     * Gets the value of the esa2010 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEsa2010() {
        return esa2010;
    }

    /**
     * Sets the value of the esa2010 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEsa2010(BigInteger value) {
        this.esa2010 = value;
    }

    /**
     * Gets the value of the esa2010T property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsa2010T() {
        return esa2010T;
    }

    /**
     * Sets the value of the esa2010T property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsa2010T(String value) {
        this.esa2010T = value;
    }

    /**
     * Gets the value of the instSecKod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstSecKod() {
        return instSecKod;
    }

    /**
     * Sets the value of the instSecKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstSecKod(BigInteger value) {
        this.instSecKod = value;
    }

    /**
     * Gets the value of the institucionarniSektor property.
     * 
     * @return
     *     possible object is
     *     {@link InstitucionarniSektor }
     *     
     */
    public InstitucionarniSektor getInstitucionarniSektor() {
        return institucionarniSektor;
    }

    /**
     * Sets the value of the institucionarniSektor property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitucionarniSektor }
     *     
     */
    public void setInstitucionarniSektor(InstitucionarniSektor value) {
        this.institucionarniSektor = value;
    }

    /**
     * Gets the value of the kategoriePoctuPracovniku property.
     * 
     * @return
     *     possible object is
     *     {@link KategoriePoctuPracovniku }
     *     
     */
    public KategoriePoctuPracovniku getKategoriePoctuPracovniku() {
        return kategoriePoctuPracovniku;
    }

    /**
     * Sets the value of the kategoriePoctuPracovniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategoriePoctuPracovniku }
     *     
     */
    public void setKategoriePoctuPracovniku(KategoriePoctuPracovniku value) {
        this.kategoriePoctuPracovniku = value;
    }

    /**
     * Gets the value of the fvi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFvi() {
        return fvi;
    }

    /**
     * Sets the value of the fvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFvi(String value) {
        this.fvi = value;
    }

    /**
     * Gets the value of the ksni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKsni() {
        return ksni;
    }

    /**
     * Sets the value of the ksni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKsni(String value) {
        this.ksni = value;
    }

    /**
     * Gets the value of the tjz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTjz() {
        return tjz;
    }

    /**
     * Sets the value of the tjz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTjz(String value) {
        this.tjz = value;
    }

}
