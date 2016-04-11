
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obec_RFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obec_RFO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}kod_obce"/>
 *         &lt;element name="Nazev" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}nazev_obce"/>
 *         &lt;choice>
 *           &lt;element name="Prazsky_obvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}prazsky_obvod_RFO" maxOccurs="unbounded"/>
 *           &lt;element name="Mestska_cast" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}mestska_cast_RFO" maxOccurs="unbounded"/>
 *           &lt;element name="Cast_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cast_obce_RFO" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obec_RFO", propOrder = {
    "ko",
    "nazev",
    "prazskyObvod",
    "mestskaCast",
    "castObce"
})
public class ObecRFO3 {

    @XmlElement(name = "KO", required = true)
    protected String ko;
    @XmlElement(name = "Nazev", required = true)
    protected String nazev;
    @XmlElement(name = "Prazsky_obvod")
    protected List<PrazskyObvodRFO3> prazskyObvod;
    @XmlElement(name = "Mestska_cast")
    protected List<MestskaCastRFO3> mestskaCast;
    @XmlElement(name = "Cast_obce")
    protected List<CastObceRFO3> castObce;

    /**
     * Gets the value of the ko property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKO() {
        return ko;
    }

    /**
     * Sets the value of the ko property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKO(String value) {
        this.ko = value;
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
     * Gets the value of the prazskyObvod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prazskyObvod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrazskyObvod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrazskyObvodRFO3 }
     * 
     * 
     */
    public List<PrazskyObvodRFO3> getPrazskyObvod() {
        if (prazskyObvod == null) {
            prazskyObvod = new ArrayList<PrazskyObvodRFO3>();
        }
        return this.prazskyObvod;
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
     * {@link MestskaCastRFO3 }
     * 
     * 
     */
    public List<MestskaCastRFO3> getMestskaCast() {
        if (mestskaCast == null) {
            mestskaCast = new ArrayList<MestskaCastRFO3>();
        }
        return this.mestskaCast;
    }

    /**
     * Gets the value of the castObce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the castObce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCastObce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CastObceRFO3 }
     * 
     * 
     */
    public List<CastObceRFO3> getCastObce() {
        if (castObce == null) {
            castObce = new ArrayList<CastObceRFO3>();
        }
        return this.castObce;
    }

}
