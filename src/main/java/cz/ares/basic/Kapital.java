
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * informace o základním jmìní subjektu
 * 
 * <p>Java class for kapital complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kapital">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zakladni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Upsany" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Kmenove_jmeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nadacni_jmeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Zapisovany" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Minimalni_kmenove_jmeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Majetkovy_vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Zakladni_vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Clensky_vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Spolecny_podil" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Uvolneny_obchodni_podil" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Akcie" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}akcie" minOccurs="0"/>
 *         &lt;element name="Urceny_majetek" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Nadacni_majetek" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kapital", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "zakladni",
    "upsany",
    "kmenoveJmeni",
    "nadacniJmeni",
    "zapisovany",
    "minimalniKmenoveJmeni",
    "majetkovyVklad",
    "zakladniVklad",
    "clenskyVklad",
    "spolecnyPodil",
    "uvolnenyObchodniPodil",
    "akcie",
    "urcenyMajetek",
    "nadacniMajetek"
})
public class Kapital {

    @XmlElement(name = "Zakladni")
    protected List<VkladSpolecnika> zakladni;
    @XmlElement(name = "Upsany")
    protected List<VkladSpolecnika> upsany;
    @XmlElement(name = "Kmenove_jmeni")
    protected List<Jmeni> kmenoveJmeni;
    @XmlElement(name = "Nadacni_jmeni")
    protected List<Jmeni> nadacniJmeni;
    @XmlElement(name = "Zapisovany")
    protected List<VkladSpolecnika> zapisovany;
    @XmlElement(name = "Minimalni_kmenove_jmeni")
    protected List<Jmeni> minimalniKmenoveJmeni;
    @XmlElement(name = "Majetkovy_vklad")
    protected List<Jmeni> majetkovyVklad;
    @XmlElement(name = "Zakladni_vklad")
    protected List<Jmeni> zakladniVklad;
    @XmlElement(name = "Clensky_vklad")
    protected List<Jmeni> clenskyVklad;
    @XmlElement(name = "Spolecny_podil")
    protected List<Jmeni> spolecnyPodil;
    @XmlElement(name = "Uvolneny_obchodni_podil")
    protected List<Jmeni> uvolnenyObchodniPodil;
    @XmlElement(name = "Akcie")
    protected Akcie akcie;
    @XmlElement(name = "Urceny_majetek")
    protected List<Texty> urcenyMajetek;
    @XmlElement(name = "Nadacni_majetek")
    protected List<Texty> nadacniMajetek;

    /**
     * Gets the value of the zakladni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zakladni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZakladni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika }
     * 
     * 
     */
    public List<VkladSpolecnika> getZakladni() {
        if (zakladni == null) {
            zakladni = new ArrayList<VkladSpolecnika>();
        }
        return this.zakladni;
    }

    /**
     * Gets the value of the upsany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upsany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpsany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika }
     * 
     * 
     */
    public List<VkladSpolecnika> getUpsany() {
        if (upsany == null) {
            upsany = new ArrayList<VkladSpolecnika>();
        }
        return this.upsany;
    }

    /**
     * Gets the value of the kmenoveJmeni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kmenoveJmeni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKmenoveJmeni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getKmenoveJmeni() {
        if (kmenoveJmeni == null) {
            kmenoveJmeni = new ArrayList<Jmeni>();
        }
        return this.kmenoveJmeni;
    }

    /**
     * Gets the value of the nadacniJmeni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nadacniJmeni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNadacniJmeni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getNadacniJmeni() {
        if (nadacniJmeni == null) {
            nadacniJmeni = new ArrayList<Jmeni>();
        }
        return this.nadacniJmeni;
    }

    /**
     * Gets the value of the zapisovany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zapisovany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZapisovany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika }
     * 
     * 
     */
    public List<VkladSpolecnika> getZapisovany() {
        if (zapisovany == null) {
            zapisovany = new ArrayList<VkladSpolecnika>();
        }
        return this.zapisovany;
    }

    /**
     * Gets the value of the minimalniKmenoveJmeni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimalniKmenoveJmeni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimalniKmenoveJmeni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getMinimalniKmenoveJmeni() {
        if (minimalniKmenoveJmeni == null) {
            minimalniKmenoveJmeni = new ArrayList<Jmeni>();
        }
        return this.minimalniKmenoveJmeni;
    }

    /**
     * Gets the value of the majetkovyVklad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the majetkovyVklad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMajetkovyVklad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getMajetkovyVklad() {
        if (majetkovyVklad == null) {
            majetkovyVklad = new ArrayList<Jmeni>();
        }
        return this.majetkovyVklad;
    }

    /**
     * Gets the value of the zakladniVklad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zakladniVklad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZakladniVklad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getZakladniVklad() {
        if (zakladniVklad == null) {
            zakladniVklad = new ArrayList<Jmeni>();
        }
        return this.zakladniVklad;
    }

    /**
     * Gets the value of the clenskyVklad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clenskyVklad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClenskyVklad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getClenskyVklad() {
        if (clenskyVklad == null) {
            clenskyVklad = new ArrayList<Jmeni>();
        }
        return this.clenskyVklad;
    }

    /**
     * Gets the value of the spolecnyPodil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spolecnyPodil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpolecnyPodil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getSpolecnyPodil() {
        if (spolecnyPodil == null) {
            spolecnyPodil = new ArrayList<Jmeni>();
        }
        return this.spolecnyPodil;
    }

    /**
     * Gets the value of the uvolnenyObchodniPodil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uvolnenyObchodniPodil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUvolnenyObchodniPodil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni }
     * 
     * 
     */
    public List<Jmeni> getUvolnenyObchodniPodil() {
        if (uvolnenyObchodniPodil == null) {
            uvolnenyObchodniPodil = new ArrayList<Jmeni>();
        }
        return this.uvolnenyObchodniPodil;
    }

    /**
     * Gets the value of the akcie property.
     * 
     * @return
     *     possible object is
     *     {@link Akcie }
     *     
     */
    public Akcie getAkcie() {
        return akcie;
    }

    /**
     * Sets the value of the akcie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akcie }
     *     
     */
    public void setAkcie(Akcie value) {
        this.akcie = value;
    }

    /**
     * Gets the value of the urcenyMajetek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urcenyMajetek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrcenyMajetek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getUrcenyMajetek() {
        if (urcenyMajetek == null) {
            urcenyMajetek = new ArrayList<Texty>();
        }
        return this.urcenyMajetek;
    }

    /**
     * Gets the value of the nadacniMajetek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nadacniMajetek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNadacniMajetek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getNadacniMajetek() {
        if (nadacniMajetek == null) {
            nadacniMajetek = new ArrayList<Texty>();
        }
        return this.nadacniMajetek;
    }

}
