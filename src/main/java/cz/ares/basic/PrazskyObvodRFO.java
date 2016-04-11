
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prazsky_obvod_RFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prazsky_obvod_RFO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Kod_prazskeho_obvodu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Nazev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mestska_cast" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}mestska_cast_RFO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prazsky_obvod_RFO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "kodPrazskehoObvodu",
    "nazev",
    "mestskaCast"
})
public class PrazskyObvodRFO {

    @XmlElement(name = "Kod_prazskeho_obvodu")
    protected Integer kodPrazskehoObvodu;
    @XmlElement(name = "Nazev")
    protected String nazev;
    @XmlElement(name = "Mestska_cast")
    protected List<MestskaCastRFO> mestskaCast;

    /**
     * Gets the value of the kodPrazskehoObvodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKodPrazskehoObvodu() {
        return kodPrazskehoObvodu;
    }

    /**
     * Sets the value of the kodPrazskehoObvodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKodPrazskehoObvodu(Integer value) {
        this.kodPrazskehoObvodu = value;
    }

    /**
     * Gets the value of the nazev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * Sets the value of the nazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazev(String value) {
        this.nazev = value;
    }

    /**
     * Gets the value of the mestskaCast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mestskaCast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMestskaCast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MestskaCastRFO }
     * 
     * 
     */
    public List<MestskaCastRFO> getMestskaCast() {
        if (mestskaCast == null) {
            mestskaCast = new ArrayList<MestskaCastRFO>();
        }
        return this.mestskaCast;
    }

}
