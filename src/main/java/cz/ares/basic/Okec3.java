
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
 *         &lt;element name="OKEC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_okec" maxOccurs="unbounded"/>
 *         &lt;element name="NO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}nazev_okec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "okec", propOrder = {
    "okec",
    "no"
})
public class Okec3 {

    @XmlElement(name = "OKEC", required = true)
    protected List<KodOkec3> okec;
    @XmlElement(name = "NO")
    protected String no;

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
     * {@link KodOkec3 }
     * 
     * 
     */
    public List<KodOkec3> getOKEC() {
        if (okec == null) {
            okec = new ArrayList<KodOkec3>();
        }
        return this.okec;
    }

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNO() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNO(String value) {
        this.no = value;
    }

}
