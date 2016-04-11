
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis všech angažmá školy nebo školského zaøízení
 * 
 * <p>Java class for angazma_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="angazma_sko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Angazma_SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}angaz_sko" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "angazma_sko", propOrder = {
    "angazmaSKO"
})
public class AngazmaSko {

    @XmlElement(name = "Angazma_SKO", required = true)
    protected List<AngazSko> angazmaSKO;

    /**
     * Gets the value of the angazmaSKO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the angazmaSKO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAngazmaSKO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AngazSko }
     * 
     * 
     */
    public List<AngazSko> getAngazmaSKO() {
        if (angazmaSKO == null) {
            angazmaSKO = new ArrayList<AngazSko>();
        }
        return this.angazmaSKO;
    }

}
