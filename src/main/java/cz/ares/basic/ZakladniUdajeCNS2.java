
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
 * Základní identifikaèní  údaje
 * 
 * <p>Java class for zakladni_udaje_CNS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_CNS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}ico" minOccurs="0"/>
 *         &lt;element name="Prideleno_ICO" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Nazev_CPO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}obchodni_firma" minOccurs="0"/>
 *         &lt;element name="DIC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}dic" minOccurs="0"/>
 *         &lt;element name="PF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}pravni_forma" minOccurs="0"/>
 *         &lt;element name="Typ_rejstriku" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Zrizovatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}adresa_ARES" minOccurs="0"/>
 *         &lt;element name="Rozhodnuti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}rozhodnuti" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_CNS", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "ico",
    "pridelenoICO",
    "nazevCPO",
    "dic",
    "pf",
    "typRejstriku",
    "zrizovatel",
    "a",
    "rozhodnuti"
})
public class ZakladniUdajeCNS2 {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Prideleno_ICO")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pridelenoICO;
    @XmlElement(name = "Nazev_CPO")
    protected String nazevCPO;
    @XmlElement(name = "DIC")
    protected Dic2 dic;
    @XmlElement(name = "PF")
    protected PravniForma2 pf;
    @XmlElement(name = "Typ_rejstriku")
    protected Short typRejstriku;
    @XmlElement(name = "Zrizovatel")
    protected String zrizovatel;
    @XmlElement(name = "A")
    protected AdresaARES2 a;
    @XmlElement(name = "Rozhodnuti")
    protected List<Rozhodnuti2> rozhodnuti;

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICO() {
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
    public void setICO(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the pridelenoICO property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPridelenoICO() {
        return pridelenoICO;
    }

    /**
     * Sets the value of the pridelenoICO property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPridelenoICO(XMLGregorianCalendar value) {
        this.pridelenoICO = value;
    }

    /**
     * Gets the value of the nazevCPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCPO() {
        return nazevCPO;
    }

    /**
     * Sets the value of the nazevCPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCPO(String value) {
        this.nazevCPO = value;
    }

    /**
     * Gets the value of the dic property.
     * 
     * @return
     *     possible object is
     *     {@link Dic2 }
     *     
     */
    public Dic2 getDIC() {
        return dic;
    }

    /**
     * Sets the value of the dic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dic2 }
     *     
     */
    public void setDIC(Dic2 value) {
        this.dic = value;
    }

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma2 }
     *     
     */
    public PravniForma2 getPF() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma2 }
     *     
     */
    public void setPF(PravniForma2 value) {
        this.pf = value;
    }

    /**
     * Gets the value of the typRejstriku property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTypRejstriku() {
        return typRejstriku;
    }

    /**
     * Sets the value of the typRejstriku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTypRejstriku(Short value) {
        this.typRejstriku = value;
    }

    /**
     * Gets the value of the zrizovatel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZrizovatel() {
        return zrizovatel;
    }

    /**
     * Sets the value of the zrizovatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZrizovatel(String value) {
        this.zrizovatel = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setA(AdresaARES2 value) {
        this.a = value;
    }

    /**
     * Gets the value of the rozhodnuti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rozhodnuti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRozhodnuti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rozhodnuti2 }
     * 
     * 
     */
    public List<Rozhodnuti2> getRozhodnuti() {
        if (rozhodnuti == null) {
            rozhodnuti = new ArrayList<Rozhodnuti2>();
        }
        return this.rozhodnuti;
    }

}
