
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
 *         &lt;element name="Predmet_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Doplnkova_cinnost" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Predmet_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Predmet_cinn_pod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ucel_nadace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ucel_nad_fondu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}texty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cinnosti", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2", propOrder = {
    "predmetPodnikani",
    "doplnkovaCinnost",
    "predmetCinnosti",
    "predmetCinnPod",
    "ucelNadace",
    "ucelNadFondu"
})
public class Cinnosti {

    @XmlElement(name = "Predmet_podnikani")
    protected List<Texty> predmetPodnikani;
    @XmlElement(name = "Doplnkova_cinnost")
    protected List<Texty> doplnkovaCinnost;
    @XmlElement(name = "Predmet_cinnosti")
    protected List<Texty> predmetCinnosti;
    @XmlElement(name = "Predmet_cinn_pod")
    protected List<Texty> predmetCinnPod;
    @XmlElement(name = "Ucel_nadace")
    protected List<Texty> ucelNadace;
    @XmlElement(name = "Ucel_nad_fondu")
    protected List<Texty> ucelNadFondu;

    /**
     * Gets the value of the predmetPodnikani property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predmetPodnikani property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredmetPodnikani().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getPredmetPodnikani() {
        if (predmetPodnikani == null) {
            predmetPodnikani = new ArrayList<Texty>();
        }
        return this.predmetPodnikani;
    }

    /**
     * Gets the value of the doplnkovaCinnost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doplnkovaCinnost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoplnkovaCinnost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getDoplnkovaCinnost() {
        if (doplnkovaCinnost == null) {
            doplnkovaCinnost = new ArrayList<Texty>();
        }
        return this.doplnkovaCinnost;
    }

    /**
     * Gets the value of the predmetCinnosti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predmetCinnosti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredmetCinnosti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getPredmetCinnosti() {
        if (predmetCinnosti == null) {
            predmetCinnosti = new ArrayList<Texty>();
        }
        return this.predmetCinnosti;
    }

    /**
     * Gets the value of the predmetCinnPod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predmetCinnPod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredmetCinnPod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getPredmetCinnPod() {
        if (predmetCinnPod == null) {
            predmetCinnPod = new ArrayList<Texty>();
        }
        return this.predmetCinnPod;
    }

    /**
     * Gets the value of the ucelNadace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucelNadace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcelNadace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getUcelNadace() {
        if (ucelNadace == null) {
            ucelNadace = new ArrayList<Texty>();
        }
        return this.ucelNadace;
    }

    /**
     * Gets the value of the ucelNadFondu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucelNadFondu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcelNadFondu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getUcelNadFondu() {
        if (ucelNadFondu == null) {
            ucelNadFondu = new ArrayList<Texty>();
        }
        return this.ucelNadFondu;
    }

}
