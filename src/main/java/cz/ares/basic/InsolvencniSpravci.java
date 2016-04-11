
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Insolvenèní správce u subjektu v IR
 * 
 * <p>Java class for insolvencni_spravci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insolvencni_spravci">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}i_spravce" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insolvencni_spravci", propOrder = {
    "iSpravce"
})
public class InsolvencniSpravci {

    @XmlElement(name = "I_spravce", required = true)
    protected List<ISpravce> iSpravce;

    /**
     * Gets the value of the iSpravce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iSpravce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISpravce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISpravce }
     * 
     * 
     */
    public List<ISpravce> getISpravce() {
        if (iSpravce == null) {
            iSpravce = new ArrayList<ISpravce>();
        }
        return this.iSpravce;
    }

}
