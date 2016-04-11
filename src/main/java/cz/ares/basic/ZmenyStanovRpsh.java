
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis všech zmìn stanov strany/hnutí
 * 
 * <p>Java class for zmeny_stanov_rpsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zmeny_stanov_rpsh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Zmena_stanov" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zmena_stanov_rpsh" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zmeny_stanov_rpsh", propOrder = {
    "zmenaStanov"
})
public class ZmenyStanovRpsh {

    @XmlElement(name = "Zmena_stanov", required = true)
    protected List<ZmenaStanovRpsh> zmenaStanov;

    /**
     * Gets the value of the zmenaStanov property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zmenaStanov property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZmenaStanov().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZmenaStanovRpsh }
     * 
     * 
     */
    public List<ZmenaStanovRpsh> getZmenaStanov() {
        if (zmenaStanov == null) {
            zmenaStanov = new ArrayList<ZmenaStanovRpsh>();
        }
        return this.zmenaStanov;
    }

}
