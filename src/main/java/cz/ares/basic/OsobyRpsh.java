
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Výpis všech osob statutárního orgánu strany/hnutí
 * 
 * <p>Java class for osoby_rpsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osoby_rpsh">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}osoba_rpsh" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osoby_rpsh", propOrder = {
    "osoba"
})
public class OsobyRpsh {

    @XmlElement(name = "Osoba", required = true)
    protected List<OsobaRpsh> osoba;

    /**
     * Gets the value of the osoba property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osoba property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOsoba().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OsobaRpsh }
     * 
     * 
     */
    public List<OsobaRpsh> getOsoba() {
        if (osoba == null) {
            osoba = new ArrayList<OsobaRpsh>();
        }
        return this.osoba;
    }

}
