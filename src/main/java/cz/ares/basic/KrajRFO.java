
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kraj_RFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kraj_RFO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_kraje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kod_kraje"/>
 *         &lt;element name="Nazev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Okres" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}okres_RFO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kraj_RFO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodKraje",
    "nazev",
    "okres"
})
public class KrajRFO {

    @XmlElement(name = "Kod_kraje")
    protected short kodKraje;
    @XmlElement(name = "Nazev", required = true)
    protected String nazev;
    @XmlElement(name = "Okres")
    protected List<OkresRFO> okres;

    /**
     * Gets the value of the kodKraje property.
     * 
     */
    public short getKodKraje() {
        return kodKraje;
    }

    /**
     * Sets the value of the kodKraje property.
     * 
     */
    public void setKodKraje(short value) {
        this.kodKraje = value;
    }

    /**
     * Gets the value of the nazev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * Sets the value of the nazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazev(String value) {
        this.nazev = value;
    }

    /**
     * Gets the value of the okres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOkres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OkresRFO }
     * 
     * 
     */
    public List<OkresRFO> getOkres() {
        if (okres == null) {
            okres = new ArrayList<OkresRFO>();
        }
        return this.okres;
    }

}
