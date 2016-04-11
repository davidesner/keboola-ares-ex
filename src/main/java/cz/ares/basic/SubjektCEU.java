
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o subjektu v databázi ARES
 * 
 * <p>Java class for subjekt_CEU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subjekt_CEU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSp" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}msp"/>
 *         &lt;element name="ACEU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}aceu"/>
 *         &lt;element name="K_zruseno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}k_zruseno" minOccurs="0"/>
 *         &lt;element name="K_chyba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}k_chyba" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjekt_CEU", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "mSp",
    "aceu",
    "kZruseno",
    "kChyba"
})
public class SubjektCEU {

    @XmlElement(name = "MSp", required = true)
    protected Msp mSp;
    @XmlElement(name = "ACEU", required = true)
    protected Aceu aceu;
    @XmlElement(name = "K_zruseno")
    protected KZruseno kZruseno;
    @XmlElement(name = "K_chyba")
    protected List<KChyba> kChyba;

    /**
     * Gets the value of the mSp property.
     * 
     * @return
     *     possible object is
     *     {@link Msp }
     *     
     */
    public Msp getMSp() {
        return mSp;
    }

    /**
     * Sets the value of the mSp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Msp }
     *     
     */
    public void setMSp(Msp value) {
        this.mSp = value;
    }

    /**
     * Gets the value of the aceu property.
     * 
     * @return
     *     possible object is
     *     {@link Aceu }
     *     
     */
    public Aceu getACEU() {
        return aceu;
    }

    /**
     * Sets the value of the aceu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aceu }
     *     
     */
    public void setACEU(Aceu value) {
        this.aceu = value;
    }

    /**
     * Gets the value of the kZruseno property.
     * 
     * @return
     *     possible object is
     *     {@link KZruseno }
     *     
     */
    public KZruseno getKZruseno() {
        return kZruseno;
    }

    /**
     * Sets the value of the kZruseno property.
     * 
     * @param value
     *     allowed object is
     *     {@link KZruseno }
     *     
     */
    public void setKZruseno(KZruseno value) {
        this.kZruseno = value;
    }

    /**
     * Gets the value of the kChyba property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kChyba property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKChyba().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KChyba }
     * 
     * 
     */
    public List<KChyba> getKChyba() {
        if (kChyba == null) {
            kChyba = new ArrayList<KChyba>();
        }
        return this.kChyba;
    }

}
