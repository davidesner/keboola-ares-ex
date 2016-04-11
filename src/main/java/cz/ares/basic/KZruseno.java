
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data o fyzicky zrušených vìtách
 * 
 * <p>Java class for k_zruseno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_zruseno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="O_podnetu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="O_podn_zrus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="O_upadce" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_zruseno", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "oPodnetu",
    "oPodnZrus",
    "oUpadce"
})
public class KZruseno {

    @XmlElement(name = "O_podnetu")
    protected int oPodnetu;
    @XmlElement(name = "O_podn_zrus")
    protected int oPodnZrus;
    @XmlElement(name = "O_upadce")
    protected int oUpadce;

    /**
     * Gets the value of the oPodnetu property.
     * 
     */
    public int getOPodnetu() {
        return oPodnetu;
    }

    /**
     * Sets the value of the oPodnetu property.
     * 
     */
    public void setOPodnetu(int value) {
        this.oPodnetu = value;
    }

    /**
     * Gets the value of the oPodnZrus property.
     * 
     */
    public int getOPodnZrus() {
        return oPodnZrus;
    }

    /**
     * Sets the value of the oPodnZrus property.
     * 
     */
    public void setOPodnZrus(int value) {
        this.oPodnZrus = value;
    }

    /**
     * Gets the value of the oUpadce property.
     * 
     */
    public int getOUpadce() {
        return oUpadce;
    }

    /**
     * Sets the value of the oUpadce property.
     * 
     */
    public void setOUpadce(int value) {
        this.oUpadce = value;
    }

}
