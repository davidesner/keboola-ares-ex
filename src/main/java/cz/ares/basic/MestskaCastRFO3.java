
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mestska_cast_RFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mestska_cast_RFO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KMC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Nazev" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Cast_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cast_obce_RFO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mestska_cast_RFO", propOrder = {
    "kmc",
    "nazev",
    "castObce"
})
public class MestskaCastRFO3 {

    @XmlElement(name = "KMC")
    protected String kmc;
    @XmlElement(name = "Nazev")
    protected String nazev;
    @XmlElement(name = "Cast_obce")
    protected List<CastObceRFO3> castObce;

    /**
     * Gets the value of the kmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKMC() {
        return kmc;
    }

    /**
     * Sets the value of the kmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKMC(String value) {
        this.kmc = value;
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
     * Gets the value of the castObce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the castObce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCastObce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CastObceRFO3 }
     * 
     * 
     */
    public List<CastObceRFO3> getCastObce() {
        if (castObce == null) {
            castObce = new ArrayList<CastObceRFO3>();
        }
        return this.castObce;
    }

}
