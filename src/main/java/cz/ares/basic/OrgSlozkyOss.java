
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Organizaèní složky subjektu OSS (od listopadu 2010)
 * 
 * <p>Java class for org_slozky_oss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="org_slozky_oss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}org_slozka_oss" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "org_slozky_oss", propOrder = {
    "os"
})
public class OrgSlozkyOss {

    @XmlElement(name = "OS", required = true)
    protected List<OrgSlozkaOss> os;

    /**
     * Gets the value of the os property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the os property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrgSlozkaOss }
     * 
     * 
     */
    public List<OrgSlozkaOss> getOS() {
        if (os == null) {
            os = new ArrayList<OrgSlozkaOss>();
        }
        return this.os;
    }

}
