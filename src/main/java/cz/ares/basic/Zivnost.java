
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o jedné živnosti
 * 
 * <p>Java class for zivnost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zivnost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Predmet_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zivnost", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "predmetPodnikani"
})
public class Zivnost {

    @XmlElement(name = "Predmet_podnikani")
    protected Texty predmetPodnikani;

    /**
     * Gets the value of the predmetPodnikani property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getPredmetPodnikani() {
        return predmetPodnikani;
    }

    /**
     * Sets the value of the predmetPodnikani property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setPredmetPodnikani(Texty value) {
        this.predmetPodnikani = value;
    }

}
