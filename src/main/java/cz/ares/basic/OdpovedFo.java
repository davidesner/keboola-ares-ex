
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odpoved_fo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_fo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="E" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}error_ARES" minOccurs="0"/>
 *         &lt;element name="Help" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}help_ARES" minOccurs="0"/>
 *         &lt;element name="V" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vypis_stranky_fo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PZA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_fo", propOrder = {
    "pid",
    "e",
    "help",
    "v",
    "pza"
})
public class OdpovedFo {

    @XmlElement(name = "PID")
    protected Integer pid;
    @XmlElement(name = "E")
    protected ErrorARES3 e;
    @XmlElement(name = "Help")
    protected HelpARES help;
    @XmlElement(name = "V")
    protected List<VypisStrankyFo> v;
    @XmlElement(name = "PZA")
    protected Integer pza;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPID(Integer value) {
        this.pid = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES3 }
     *     
     */
    public ErrorARES3 getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES3 }
     *     
     */
    public void setE(ErrorARES3 value) {
        this.e = value;
    }

    /**
     * Gets the value of the help property.
     * 
     * @return
     *     possible object is
     *     {@link HelpARES }
     *     
     */
    public HelpARES getHelp() {
        return help;
    }

    /**
     * Sets the value of the help property.
     * 
     * @param value
     *     allowed object is
     *     {@link HelpARES }
     *     
     */
    public void setHelp(HelpARES value) {
        this.help = value;
    }

    /**
     * Gets the value of the v property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the v property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VypisStrankyFo }
     * 
     * 
     */
    public List<VypisStrankyFo> getV() {
        if (v == null) {
            v = new ArrayList<VypisStrankyFo>();
        }
        return this.v;
    }

    /**
     * Gets the value of the pza property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPZA() {
        return pza;
    }

    /**
     * Sets the value of the pza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPZA(Integer value) {
        this.pza = value;
    }

}
