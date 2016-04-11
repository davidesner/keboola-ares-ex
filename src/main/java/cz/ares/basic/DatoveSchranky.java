
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datove_schranky complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datove_schranky">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datova_schranka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}datova_schranka" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datove_schranky", propOrder = {
    "datovaSchranka"
})
public class DatoveSchranky {

    @XmlElement(name = "Datova_schranka")
    protected List<DatovaSchranka> datovaSchranka;

    /**
     * Gets the value of the datovaSchranka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datovaSchranka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatovaSchranka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatovaSchranka }
     * 
     * 
     */
    public List<DatovaSchranka> getDatovaSchranka() {
        if (datovaSchranka == null) {
            datovaSchranka = new ArrayList<DatovaSchranka>();
        }
        return this.datovaSchranka;
    }

}
