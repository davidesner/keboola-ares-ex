
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis všech souèástí školy nebo školského zaøízení
 * 
 * <p>Java class for soucasti_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soucasti_sko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Soucast_SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}soucast_sko" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soucasti_sko", propOrder = {
    "soucastSKO"
})
public class SoucastiSko {

    @XmlElement(name = "Soucast_SKO", required = true)
    protected List<SoucastSko> soucastSKO;

    /**
     * Gets the value of the soucastSKO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soucastSKO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoucastSKO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoucastSko }
     * 
     * 
     */
    public List<SoucastSko> getSoucastSKO() {
        if (soucastSKO == null) {
            soucastSKO = new ArrayList<SoucastSko>();
        }
        return this.soucastSKO;
    }

}
