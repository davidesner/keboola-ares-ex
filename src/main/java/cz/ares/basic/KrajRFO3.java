
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
 *         &lt;element name="KK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_kraje"/>
 *         &lt;element name="Nazev" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Okres" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}okres_RFO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kraj_RFO", propOrder = {
    "kk",
    "nazev",
    "okres"
})
public class KrajRFO3 {

    @XmlElement(name = "KK")
    protected short kk;
    @XmlElement(name = "Nazev", required = true)
    protected String nazev;
    @XmlElement(name = "Okres")
    protected List<OkresRFO3> okres;

    /**
     * Gets the value of the kk property.
     * 
     */
    public short getKK() {
        return kk;
    }

    /**
     * Sets the value of the kk property.
     * 
     */
    public void setKK(short value) {
        this.kk = value;
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
     * {@link OkresRFO3 }
     * 
     * 
     */
    public List<OkresRFO3> getOkres() {
        if (okres == null) {
            okres = new ArrayList<OkresRFO3>();
        }
        return this.okres;
    }

}
