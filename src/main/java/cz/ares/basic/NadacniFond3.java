
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Nadaèní fond, k 16.6.2003 se ještì nevyskytuje
 * 
 * <p>Java class for nadacni_fond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nadacni_fond">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OOF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}angazma" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CLE" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}trvani" minOccurs="0"/>
 *         &lt;element name="VF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}trvani" minOccurs="0"/>
 *         &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}textType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nadacni_fond", propOrder = {
    "oof",
    "cle",
    "vf",
    "t"
})
public class NadacniFond3 {

    @XmlElement(name = "OOF")
    protected List<Angazma3> oof;
    @XmlElement(name = "CLE")
    protected Trvani3 cle;
    @XmlElement(name = "VF")
    protected Trvani3 vf;
    @XmlElement(name = "T")
    protected List<TextType3> t;

    /**
     * Gets the value of the oof property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oof property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOOF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Angazma3 }
     * 
     * 
     */
    public List<Angazma3> getOOF() {
        if (oof == null) {
            oof = new ArrayList<Angazma3>();
        }
        return this.oof;
    }

    /**
     * Gets the value of the cle property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani3 }
     *     
     */
    public Trvani3 getCLE() {
        return cle;
    }

    /**
     * Sets the value of the cle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani3 }
     *     
     */
    public void setCLE(Trvani3 value) {
        this.cle = value;
    }

    /**
     * Gets the value of the vf property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani3 }
     *     
     */
    public Trvani3 getVF() {
        return vf;
    }

    /**
     * Sets the value of the vf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani3 }
     *     
     */
    public void setVF(Trvani3 value) {
        this.vf = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType3 }
     * 
     * 
     */
    public List<TextType3> getT() {
        if (t == null) {
            t = new ArrayList<TextType3>();
        }
        return this.t;
    }

}
