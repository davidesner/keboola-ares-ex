
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
 *         &lt;element name="AA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Priz_adr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}priz_adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seznam_navracenych", propOrder = {
    "aa",
    "prizAdr"
})
public class SeznamNavracenych3 {

    @XmlElement(name = "AA")
    protected List<AdresaARES3> aa;
    @XmlElement(name = "Priz_adr")
    protected PrizAdresaARES prizAdr;

    /**
     * Gets the value of the aa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES3 }
     * 
     * 
     */
    public List<AdresaARES3> getAA() {
        if (aa == null) {
            aa = new ArrayList<AdresaARES3>();
        }
        return this.aa;
    }

    /**
     * Gets the value of the prizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PrizAdresaARES }
     *     
     */
    public PrizAdresaARES getPrizAdr() {
        return prizAdr;
    }

    /**
     * Sets the value of the prizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrizAdresaARES }
     *     
     */
    public void setPrizAdr(PrizAdresaARES value) {
        this.prizAdr = value;
    }

}
