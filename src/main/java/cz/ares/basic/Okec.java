
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OKEÈ - odvìtvová klasifikace ekonomických èinností (slouží pro dvì rùzná volání - 1. seznam okeèù bez názvu, 2. jeden okeè s názvem
 * 
 * <p>Java class for okec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="okec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OKEC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}kod_okec" maxOccurs="unbounded"/>
 *         &lt;element name="Nazev_OKEC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}nazev_okec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "okec", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "okec",
    "nazevOKEC"
})
public class Okec {

    @XmlElement(name = "OKEC", required = true)
    protected List<KodOkec> okec;
    @XmlElement(name = "Nazev_OKEC")
    protected String nazevOKEC;

    /**
     * Gets the value of the okec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOKEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KodOkec }
     * 
     * 
     */
    public List<KodOkec> getOKEC() {
        if (okec == null) {
            okec = new ArrayList<KodOkec>();
        }
        return this.okec;
    }

    /**
     * Gets the value of the nazevOKEC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOKEC() {
        return nazevOKEC;
    }

    /**
     * Sets the value of the nazevOKEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOKEC(String value) {
        this.nazevOKEC = value;
    }

}
