
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seznam_navracenych complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seznam_navracenych">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adresa_UIR_s_nazvy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}adresa_UIR_s_nazvy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seznam_navracenych", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "adresaUIRSNazvy"
})
public class SeznamNavracenych {

    @XmlElement(name = "Adresa_UIR_s_nazvy")
    protected List<AdresaUIRSNazvy> adresaUIRSNazvy;

    /**
     * Gets the value of the adresaUIRSNazvy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresaUIRSNazvy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresaUIRSNazvy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaUIRSNazvy }
     * 
     * 
     */
    public List<AdresaUIRSNazvy> getAdresaUIRSNazvy() {
        if (adresaUIRSNazvy == null) {
            adresaUIRSNazvy = new ArrayList<AdresaUIRSNazvy>();
        }
        return this.adresaUIRSNazvy;
    }

}
