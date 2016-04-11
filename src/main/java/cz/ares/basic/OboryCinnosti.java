
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o oborech èinnosti u živnosti èi provozovny
 * 
 * <p>Java class for obory_cinnosti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obory_cinnosti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Obor_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}obor_cinnosti" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obory_cinnosti", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "oborCinnosti"
})
public class OboryCinnosti {

    @XmlElement(name = "Obor_cinnosti")
    protected List<OborCinnosti> oborCinnosti;

    /**
     * Gets the value of the oborCinnosti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oborCinnosti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOborCinnosti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OborCinnosti }
     * 
     * 
     */
    public List<OborCinnosti> getOborCinnosti() {
        if (oborCinnosti == null) {
            oborCinnosti = new ArrayList<OborCinnosti>();
        }
        return this.oborCinnosti;
    }

}
