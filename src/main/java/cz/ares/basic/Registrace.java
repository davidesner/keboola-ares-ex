
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o registraci subjektu u soudù
 * 
 * <p>Java class for registrace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Spisova_znacka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}spisova_znacka" maxOccurs="unbounded"/>
 *         &lt;element name="Stav_subjektu_OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}stav" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrace", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "spisovaZnacka",
    "stavSubjektuOR"
})
public class Registrace {

    @XmlElement(name = "Spisova_znacka", required = true)
    protected List<SpisovaZnacka> spisovaZnacka;
    @XmlElement(name = "Stav_subjektu_OR")
    protected Stav stavSubjektuOR;

    /**
     * Gets the value of the spisovaZnacka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spisovaZnacka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpisovaZnacka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpisovaZnacka }
     * 
     * 
     */
    public List<SpisovaZnacka> getSpisovaZnacka() {
        if (spisovaZnacka == null) {
            spisovaZnacka = new ArrayList<SpisovaZnacka>();
        }
        return this.spisovaZnacka;
    }

    /**
     * Gets the value of the stavSubjektuOR property.
     * 
     * @return
     *     possible object is
     *     {@link Stav }
     *     
     */
    public Stav getStavSubjektuOR() {
        return stavSubjektuOR;
    }

    /**
     * Sets the value of the stavSubjektuOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav }
     *     
     */
    public void setStavSubjektuOR(Stav value) {
        this.stavSubjektuOR = value;
    }

}
