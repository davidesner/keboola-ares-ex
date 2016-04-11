
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data upravená dle ARES (tabulka k_podnet)
 * 
 * <p>Java class for aceu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aceu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="K_konkurz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}k_konkurz"/>
 *         &lt;element name="Poradi" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Datum_vzniku_podnetu" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Kod_ukonu_podnetu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kod_ukonu_podnetu"/>
 *         &lt;element name="Priznak_usneseni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ano_ne"/>
 *         &lt;element name="Radky_textu_usneseni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}radky_textu_usneseni" minOccurs="0"/>
 *         &lt;element name="Jmeno_souboru_s_usnesenim" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/>
 *         &lt;element name="Spravce_konkurzu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spravce_konkurzu_CEU" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Priznaky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}priznaky_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aceu", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kKonkurz",
    "poradi",
    "datumVznikuPodnetu",
    "kodUkonuPodnetu",
    "priznakUsneseni",
    "radkyTextuUsneseni",
    "jmenoSouboruSUsnesenim",
    "spravceKonkurzu",
    "priznaky"
})
public class Aceu {

    @XmlElement(name = "K_konkurz", required = true)
    protected KKonkurz kKonkurz;
    @XmlElement(name = "Poradi")
    protected short poradi;
    @XmlElement(name = "Datum_vzniku_podnetu", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVznikuPodnetu;
    @XmlElement(name = "Kod_ukonu_podnetu")
    protected byte kodUkonuPodnetu;
    @XmlElement(name = "Priznak_usneseni", required = true)
    protected String priznakUsneseni;
    @XmlElement(name = "Radky_textu_usneseni")
    protected RadkyTextuUsneseni radkyTextuUsneseni;
    @XmlElement(name = "Jmeno_souboru_s_usnesenim")
    protected String jmenoSouboruSUsnesenim;
    @XmlElement(name = "Spravce_konkurzu")
    protected List<SpravceKonkurzuCEU> spravceKonkurzu;
    @XmlElement(name = "Priznaky", required = true)
    protected String priznaky;

    /**
     * Gets the value of the kKonkurz property.
     * 
     * @return
     *     possible object is
     *     {@link KKonkurz }
     *     
     */
    public KKonkurz getKKonkurz() {
        return kKonkurz;
    }

    /**
     * Sets the value of the kKonkurz property.
     * 
     * @param value
     *     allowed object is
     *     {@link KKonkurz }
     *     
     */
    public void setKKonkurz(KKonkurz value) {
        this.kKonkurz = value;
    }

    /**
     * Gets the value of the poradi property.
     * 
     */
    public short getPoradi() {
        return poradi;
    }

    /**
     * Sets the value of the poradi property.
     * 
     */
    public void setPoradi(short value) {
        this.poradi = value;
    }

    /**
     * Gets the value of the datumVznikuPodnetu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVznikuPodnetu() {
        return datumVznikuPodnetu;
    }

    /**
     * Sets the value of the datumVznikuPodnetu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVznikuPodnetu(XMLGregorianCalendar value) {
        this.datumVznikuPodnetu = value;
    }

    /**
     * Gets the value of the kodUkonuPodnetu property.
     * 
     */
    public byte getKodUkonuPodnetu() {
        return kodUkonuPodnetu;
    }

    /**
     * Sets the value of the kodUkonuPodnetu property.
     * 
     */
    public void setKodUkonuPodnetu(byte value) {
        this.kodUkonuPodnetu = value;
    }

    /**
     * Gets the value of the priznakUsneseni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriznakUsneseni() {
        return priznakUsneseni;
    }

    /**
     * Sets the value of the priznakUsneseni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriznakUsneseni(String value) {
        this.priznakUsneseni = value;
    }

    /**
     * Gets the value of the radkyTextuUsneseni property.
     * 
     * @return
     *     possible object is
     *     {@link RadkyTextuUsneseni }
     *     
     */
    public RadkyTextuUsneseni getRadkyTextuUsneseni() {
        return radkyTextuUsneseni;
    }

    /**
     * Sets the value of the radkyTextuUsneseni property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadkyTextuUsneseni }
     *     
     */
    public void setRadkyTextuUsneseni(RadkyTextuUsneseni value) {
        this.radkyTextuUsneseni = value;
    }

    /**
     * Gets the value of the jmenoSouboruSUsnesenim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmenoSouboruSUsnesenim() {
        return jmenoSouboruSUsnesenim;
    }

    /**
     * Sets the value of the jmenoSouboruSUsnesenim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmenoSouboruSUsnesenim(String value) {
        this.jmenoSouboruSUsnesenim = value;
    }

    /**
     * Gets the value of the spravceKonkurzu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spravceKonkurzu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpravceKonkurzu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpravceKonkurzuCEU }
     * 
     * 
     */
    public List<SpravceKonkurzuCEU> getSpravceKonkurzu() {
        if (spravceKonkurzu == null) {
            spravceKonkurzu = new ArrayList<SpravceKonkurzuCEU>();
        }
        return this.spravceKonkurzu;
    }

    /**
     * Gets the value of the priznaky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriznaky() {
        return priznaky;
    }

    /**
     * Sets the value of the priznaky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriznaky(String value) {
        this.priznaky = value;
    }

}
