
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o angažmá v SKO
 * 
 * <p>Java class for angaz_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="angaz_sko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="F" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}funkce_sko" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="PO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravnicka_osoba_sko"/>
 *           &lt;element name="FO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}fyzicka_osoba_sko"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "angaz_sko", propOrder = {
    "dv",
    "dz",
    "f",
    "po",
    "fo"
})
public class AngazSko {

    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "F")
    protected FunkceSko f;
    @XmlElement(name = "PO")
    protected PravnickaOsobaSko po;
    @XmlElement(name = "FO")
    protected FyzickaOsobaSko fo;

    /**
     * Gets the value of the dv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDV() {
        return dv;
    }

    /**
     * Sets the value of the dv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDV(XMLGregorianCalendar value) {
        this.dv = value;
    }

    /**
     * Gets the value of the dz property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDZ() {
        return dz;
    }

    /**
     * Sets the value of the dz property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDZ(XMLGregorianCalendar value) {
        this.dz = value;
    }

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link FunkceSko }
     *     
     */
    public FunkceSko getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunkceSko }
     *     
     */
    public void setF(FunkceSko value) {
        this.f = value;
    }

    /**
     * Gets the value of the po property.
     * 
     * @return
     *     possible object is
     *     {@link PravnickaOsobaSko }
     *     
     */
    public PravnickaOsobaSko getPO() {
        return po;
    }

    /**
     * Sets the value of the po property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravnickaOsobaSko }
     *     
     */
    public void setPO(PravnickaOsobaSko value) {
        this.po = value;
    }

    /**
     * Gets the value of the fo property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsobaSko }
     *     
     */
    public FyzickaOsobaSko getFO() {
        return fo;
    }

    /**
     * Sets the value of the fo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsobaSko }
     *     
     */
    public void setFO(FyzickaOsobaSko value) {
        this.fo = value;
    }

}
