
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �len p�edstavenstva a texty
 * 
 * <p>Java class for predstavenstvo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predstavenstvo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clen_predstavenstva" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}clen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}textType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predstavenstvo", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "clenPredstavenstva",
    "text"
})
public class Predstavenstvo {

    @XmlElement(name = "Clen_predstavenstva")
    protected List<Clen> clenPredstavenstva;
    @XmlElement(name = "Text")
    protected List<TextType> text;

    /**
     * Gets the value of the clenPredstavenstva property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clenPredstavenstva property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClenPredstavenstva().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clen }
     * 
     * 
     */
    public List<Clen> getClenPredstavenstva() {
        if (clenPredstavenstva == null) {
            clenPredstavenstva = new ArrayList<Clen>();
        }
        return this.clenPredstavenstva;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getText() {
        if (text == null) {
            text = new ArrayList<TextType>();
        }
        return this.text;
    }

}
