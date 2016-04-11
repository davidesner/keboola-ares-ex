
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Èlen kontrolní komise u právní formy 932 (od 8/2006)
 * 
 * <p>Java class for kontrolni_komise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kontrolni_komise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clen_kontrolni_komise" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}clen" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "kontrolni_komise", propOrder = {
    "clenKontrolniKomise",
    "t"
})
public class KontrolniKomise3 {

    @XmlElement(name = "Clen_kontrolni_komise")
    protected List<Clen3> clenKontrolniKomise;
    @XmlElement(name = "T")
    protected List<TextType3> t;

    /**
     * Gets the value of the clenKontrolniKomise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clenKontrolniKomise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClenKontrolniKomise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clen3 }
     * 
     * 
     */
    public List<Clen3> getClenKontrolniKomise() {
        if (clenKontrolniKomise == null) {
            clenKontrolniKomise = new ArrayList<Clen3>();
        }
        return this.clenKontrolniKomise;
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
