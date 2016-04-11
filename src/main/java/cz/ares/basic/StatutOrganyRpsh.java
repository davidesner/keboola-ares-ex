
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis všech statutárních orgánù strany/hnutí
 * 
 * <p>Java class for statut_organy_rpsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statut_organy_rpsh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}statut_organ_rpsh" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statut_organy_rpsh", propOrder = {
    "so"
})
public class StatutOrganyRpsh {

    @XmlElement(name = "SO", required = true)
    protected List<StatutOrganRpsh> so;

    /**
     * Gets the value of the so property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the so property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatutOrganRpsh }
     * 
     * 
     */
    public List<StatutOrganRpsh> getSO() {
        if (so == null) {
            so = new ArrayList<StatutOrganRpsh>();
        }
        return this.so;
    }

}
