
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Doplòující právní formy v pøípadì více právních forem u subjektu v RES
 * 
 * <p>Java class for doplnujici_pravni_formy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doplnujici_pravni_formy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pravni_forma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}pravni_forma" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doplnujici_pravni_formy", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "pravniForma"
})
public class DoplnujiciPravniFormy {

    @XmlElement(name = "Pravni_forma")
    protected List<PravniForma> pravniForma;

    /**
     * Gets the value of the pravniForma property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pravniForma property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPravniForma().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PravniForma }
     * 
     * 
     */
    public List<PravniForma> getPravniForma() {
        if (pravniForma == null) {
            pravniForma = new ArrayList<PravniForma>();
        }
        return this.pravniForma;
    }

}
