
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tabulka pro uložení logických klíèù
 * 
 * <p>Java class for k_klic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_klic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cislo_soudu" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Cislo_senatu" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="Cislo_znacky" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Rok_znacky" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="KKZ_vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}konkurz_vyrovnani_CEU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_klic", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "cisloSoudu",
    "cisloSenatu",
    "cisloZnacky",
    "rokZnacky",
    "kkzVyrovnani"
})
public class KKlic2 {

    @XmlElement(name = "Cislo_soudu")
    protected short cisloSoudu;
    @XmlElement(name = "Cislo_senatu")
    protected Short cisloSenatu;
    @XmlElement(name = "Cislo_znacky")
    protected short cisloZnacky;
    @XmlElement(name = "Rok_znacky")
    protected short rokZnacky;
    @XmlElement(name = "KKZ_vyrovnani", required = true)
    protected KonkurzVyrovnaniCEU2 kkzVyrovnani;

    /**
     * Gets the value of the cisloSoudu property.
     * 
     */
    public short getCisloSoudu() {
        return cisloSoudu;
    }

    /**
     * Sets the value of the cisloSoudu property.
     * 
     */
    public void setCisloSoudu(short value) {
        this.cisloSoudu = value;
    }

    /**
     * Gets the value of the cisloSenatu property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCisloSenatu() {
        return cisloSenatu;
    }

    /**
     * Sets the value of the cisloSenatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCisloSenatu(Short value) {
        this.cisloSenatu = value;
    }

    /**
     * Gets the value of the cisloZnacky property.
     * 
     */
    public short getCisloZnacky() {
        return cisloZnacky;
    }

    /**
     * Sets the value of the cisloZnacky property.
     * 
     */
    public void setCisloZnacky(short value) {
        this.cisloZnacky = value;
    }

    /**
     * Gets the value of the rokZnacky property.
     * 
     */
    public short getRokZnacky() {
        return rokZnacky;
    }

    /**
     * Sets the value of the rokZnacky property.
     * 
     */
    public void setRokZnacky(short value) {
        this.rokZnacky = value;
    }

    /**
     * Gets the value of the kkzVyrovnani property.
     * 
     * @return
     *     possible object is
     *     {@link KonkurzVyrovnaniCEU2 }
     *     
     */
    public KonkurzVyrovnaniCEU2 getKKZVyrovnani() {
        return kkzVyrovnani;
    }

    /**
     * Sets the value of the kkzVyrovnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonkurzVyrovnaniCEU2 }
     *     
     */
    public void setKKZVyrovnani(KonkurzVyrovnaniCEU2 value) {
        this.kkzVyrovnani = value;
    }

}
