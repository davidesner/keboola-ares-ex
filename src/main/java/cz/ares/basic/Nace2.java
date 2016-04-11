
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Klasifikace ekonomických èinností (CZ-NACE) ÈSÚ
 * 
 * <p>Java class for nace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NACE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}kod_nace" maxOccurs="unbounded"/>
 *         &lt;element name="Nazev_NACE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}nazev_nace" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nace", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "nace",
    "nazevNACE"
})
public class Nace2 {

    @XmlElement(name = "NACE", required = true)
    protected List<KodNace2> nace;
    @XmlElement(name = "Nazev_NACE")
    protected String nazevNACE;

    /**
     * Gets the value of the nace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNACE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KodNace2 }
     * 
     * 
     */
    public List<KodNace2> getNACE() {
        if (nace == null) {
            nace = new ArrayList<KodNace2>();
        }
        return this.nace;
    }

    /**
     * Gets the value of the nazevNACE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevNACE() {
        return nazevNACE;
    }

    /**
     * Sets the value of the nazevNACE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevNACE(String value) {
        this.nazevNACE = value;
    }

}
