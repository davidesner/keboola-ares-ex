
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Spoleèné údaje o konkurzu, vyrovnání nebo zamítnutí konkurzu (K, V nebo Z)
 * 
 * <p>Java class for udaje_KVZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="udaje_KVZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Txt_KVZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}txt_KVZ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udaje_KVZ", propOrder = {
    "txtKVZ"
})
public class UdajeKVZ3 {

    @XmlElement(name = "Txt_KVZ")
    protected List<TxtKVZ3> txtKVZ;

    /**
     * Gets the value of the txtKVZ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txtKVZ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxtKVZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxtKVZ3 }
     * 
     * 
     */
    public List<TxtKVZ3> getTxtKVZ() {
        if (txtKVZ == null) {
            txtKVZ = new ArrayList<TxtKVZ3>();
        }
        return this.txtKVZ;
    }

}
