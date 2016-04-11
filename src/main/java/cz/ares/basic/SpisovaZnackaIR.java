
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Spisová znaèka pro insolveèní rejstøík, aby bylo možno dìlat pøes ní odkazy na isir.justice.cz. 24.3.2010
 * 
 * <p>Java class for spisova_znacka_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spisova_znacka_IR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}soud"/>
 *         &lt;element name="OV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis"/>
 *         &lt;element name="Vec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rocnik" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spisova_znacka_IR", propOrder = {
    "sd",
    "ov",
    "vec",
    "rocnik"
})
public class SpisovaZnackaIR {

    @XmlElement(name = "SD", required = true)
    protected Soud3 sd;
    @XmlElement(name = "OV", required = true)
    protected String ov;
    @XmlElement(name = "Vec")
    protected int vec;
    @XmlElement(name = "Rocnik")
    protected int rocnik;

    /**
     * Gets the value of the sd property.
     * 
     * @return
     *     possible object is
     *     {@link Soud3 }
     *     
     */
    public Soud3 getSD() {
        return sd;
    }

    /**
     * Sets the value of the sd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soud3 }
     *     
     */
    public void setSD(Soud3 value) {
        this.sd = value;
    }

    /**
     * Gets the value of the ov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOV() {
        return ov;
    }

    /**
     * Sets the value of the ov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOV(String value) {
        this.ov = value;
    }

    /**
     * Gets the value of the vec property.
     * 
     */
    public int getVec() {
        return vec;
    }

    /**
     * Sets the value of the vec property.
     * 
     */
    public void setVec(int value) {
        this.vec = value;
    }

    /**
     * Gets the value of the rocnik property.
     * 
     */
    public int getRocnik() {
        return rocnik;
    }

    /**
     * Sets the value of the rocnik property.
     * 
     */
    public void setRocnik(int value) {
        this.rocnik = value;
    }

}
