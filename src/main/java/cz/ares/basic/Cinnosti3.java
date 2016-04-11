
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifikace èinností všech typù
 * 
 * <p>Java class for cinnosti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cinnosti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DKC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PCI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UNF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cinnosti", propOrder = {
    "pp",
    "dkc",
    "pc",
    "pci",
    "un",
    "unf"
})
public class Cinnosti3 {

    @XmlElement(name = "PP")
    protected List<Texty3> pp;
    @XmlElement(name = "DKC")
    protected List<Texty3> dkc;
    @XmlElement(name = "PC")
    protected List<Texty3> pc;
    @XmlElement(name = "PCI")
    protected List<Texty3> pci;
    @XmlElement(name = "UN")
    protected List<Texty3> un;
    @XmlElement(name = "UNF")
    protected List<Texty3> unf;

    /**
     * Gets the value of the pp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getPP() {
        if (pp == null) {
            pp = new ArrayList<Texty3>();
        }
        return this.pp;
    }

    /**
     * Gets the value of the dkc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dkc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDKC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getDKC() {
        if (dkc == null) {
            dkc = new ArrayList<Texty3>();
        }
        return this.dkc;
    }

    /**
     * Gets the value of the pc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getPC() {
        if (pc == null) {
            pc = new ArrayList<Texty3>();
        }
        return this.pc;
    }

    /**
     * Gets the value of the pci property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pci property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPCI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getPCI() {
        if (pci == null) {
            pci = new ArrayList<Texty3>();
        }
        return this.pci;
    }

    /**
     * Gets the value of the un property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the un property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getUN() {
        if (un == null) {
            un = new ArrayList<Texty3>();
        }
        return this.un;
    }

    /**
     * Gets the value of the unf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getUNF() {
        if (unf == null) {
            unf = new ArrayList<Texty3>();
        }
        return this.unf;
    }

}
