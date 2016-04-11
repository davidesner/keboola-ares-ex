
package cz.ares.basic;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Detailní spisová znaèka, mj. i pro tvorbu odkazu na MSp
 * 
 * <p>Java class for detailni_spisova_znacka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailni_spisova_znacka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="senat" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="znacka" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="rok" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="typ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}konkurz_vyrovnani_CEU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailni_spisova_znacka", propOrder = {
    "senat",
    "znacka",
    "rok",
    "typ"
})
public class DetailniSpisovaZnacka {

    protected BigInteger senat;
    protected BigInteger znacka;
    protected BigInteger rok;
    protected KonkurzVyrovnaniCEU3 typ;

    /**
     * Gets the value of the senat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSenat() {
        return senat;
    }

    /**
     * Sets the value of the senat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSenat(BigInteger value) {
        this.senat = value;
    }

    /**
     * Gets the value of the znacka property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZnacka() {
        return znacka;
    }

    /**
     * Sets the value of the znacka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZnacka(BigInteger value) {
        this.znacka = value;
    }

    /**
     * Gets the value of the rok property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRok() {
        return rok;
    }

    /**
     * Sets the value of the rok property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRok(BigInteger value) {
        this.rok = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link KonkurzVyrovnaniCEU3 }
     *     
     */
    public KonkurzVyrovnaniCEU3 getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link KonkurzVyrovnaniCEU3 }
     *     
     */
    public void setTyp(KonkurzVyrovnaniCEU3 value) {
        this.typ = value;
    }

}
