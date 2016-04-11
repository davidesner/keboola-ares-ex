
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o souèásti v SKO (škola, školka, jídelna, klub školy, ...)
 * 
 * <p>Java class for soucast_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soucast_sko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IZO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}izo_sko"/>
 *         &lt;element name="Typ_soucasti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}typ_soucasti_sko"/>
 *         &lt;element name="DV" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DZ" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zakladni_udaje_eks_sko" minOccurs="0"/>
 *         &lt;element name="A" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soucast_sko", propOrder = {
    "izo",
    "typSoucasti",
    "dv",
    "dz",
    "zau",
    "a"
})
public class SoucastSko {

    @XmlElement(name = "IZO", required = true)
    protected String izo;
    @XmlElement(name = "Typ_soucasti", required = true)
    protected TypSoucastiSko typSoucasti;
    @XmlElement(name = "DV")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dv;
    @XmlElement(name = "DZ")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dz;
    @XmlElement(name = "ZAU")
    protected ZakladniUdajeEksSko zau;
    @XmlElement(name = "A")
    protected AdresaARES3 a;

    /**
     * Gets the value of the izo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIZO() {
        return izo;
    }

    /**
     * Sets the value of the izo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIZO(String value) {
        this.izo = value;
    }

    /**
     * Gets the value of the typSoucasti property.
     * 
     * @return
     *     possible object is
     *     {@link TypSoucastiSko }
     *     
     */
    public TypSoucastiSko getTypSoucasti() {
        return typSoucasti;
    }

    /**
     * Sets the value of the typSoucasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypSoucastiSko }
     *     
     */
    public void setTypSoucasti(TypSoucastiSko value) {
        this.typSoucasti = value;
    }

    /**
     * Gets the value of the dv property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDV() {
        return dv;
    }

    /**
     * Sets the value of the dv property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDV(XMLGregorianCalendar value) {
        this.dv = value;
    }

    /**
     * Gets the value of the dz property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDZ() {
        return dz;
    }

    /**
     * Sets the value of the dz property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDZ(XMLGregorianCalendar value) {
        this.dz = value;
    }

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeEksSko }
     *     
     */
    public ZakladniUdajeEksSko getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeEksSko }
     *     
     */
    public void setZAU(ZakladniUdajeEksSko value) {
        this.zau = value;
    }

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES3 }
     *     
     */
    public AdresaARES3 getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES3 }
     *     
     */
    public void setA(AdresaARES3 value) {
        this.a = value;
    }

}
