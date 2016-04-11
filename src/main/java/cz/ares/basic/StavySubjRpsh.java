
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis všech stavù subjektu strany/hnutí
 * 
 * <p>Java class for stavy_subj_rpsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stavy_subj_rpsh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}stav_subj_rpsh" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stavy_subj_rpsh", propOrder = {
    "ssu"
})
public class StavySubjRpsh {

    @XmlElement(name = "SSU", required = true)
    protected List<StavSubjRpsh> ssu;

    /**
     * Gets the value of the ssu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StavSubjRpsh }
     * 
     * 
     */
    public List<StavSubjRpsh> getSSU() {
        if (ssu == null) {
            ssu = new ArrayList<StavSubjRpsh>();
        }
        return this.ssu;
    }

}
