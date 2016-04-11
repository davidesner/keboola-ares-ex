
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
 *         &lt;element name="Kod_mestske_casti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Nazev" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_mestske_casti" minOccurs="0"/>
 *         &lt;element name="Cast_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}cast_obce_RFO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mestska_cast_RFO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodMestskeCasti",
    "nazev",
    "castObce"
})
public class MestskaCastRFO {

    @XmlElement(name = "Kod_mestske_casti")
    protected String kodMestskeCasti;
    @XmlElement(name = "Nazev")
    protected String nazev;
    @XmlElement(name = "Cast_obce")
    protected List<CastObceRFO> castObce;

    /**
     * Gets the value of the kodMestskeCasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodMestskeCasti() {
        return kodMestskeCasti;
    }

    /**
     * Sets the value of the kodMestskeCasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodMestskeCasti(String value) {
        this.kodMestskeCasti = value;
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
     * {@link CastObceRFO }
     * 
     * 
     */
    public List<CastObceRFO> getCastObce() {
        if (castObce == null) {
            castObce = new ArrayList<CastObceRFO>();
        }
        return this.castObce;
    }

}
