
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agenda_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agenda_ros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agenda" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}agenda_kod_nazev" minOccurs="0"/>
 *         &lt;element name="OVM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}kod_nazev_ovm" minOccurs="0"/>
 *         &lt;element name="OF_ROS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}of_ros" minOccurs="0"/>
 *         &lt;element name="SR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}sidlo_ros" minOccurs="0"/>
 *         &lt;element name="POD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}datum_ros" minOccurs="0"/>
 *         &lt;element name="Platnost_do" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}datum_ros" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenda_ros", propOrder = {
    "agenda",
    "ovm",
    "ofros",
    "sr",
    "pod",
    "platnostDo"
})
public class AgendaRos {

    @XmlElement(name = "Agenda")
    protected AgendaKodNazev agenda;
    @XmlElement(name = "OVM")
    protected KodNazevOvm ovm;
    @XmlElement(name = "OF_ROS")
    protected OfRos ofros;
    @XmlElement(name = "SR")
    protected SidloRos sr;
    @XmlElement(name = "POD")
    protected DatumRos pod;
    @XmlElement(name = "Platnost_do")
    protected DatumRos platnostDo;

    /**
     * Gets the value of the agenda property.
     * 
     * @return
     *     possible object is
     *     {@link AgendaKodNazev }
     *     
     */
    public AgendaKodNazev getAgenda() {
        return agenda;
    }

    /**
     * Sets the value of the agenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgendaKodNazev }
     *     
     */
    public void setAgenda(AgendaKodNazev value) {
        this.agenda = value;
    }

    /**
     * Gets the value of the ovm property.
     * 
     * @return
     *     possible object is
     *     {@link KodNazevOvm }
     *     
     */
    public KodNazevOvm getOVM() {
        return ovm;
    }

    /**
     * Sets the value of the ovm property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodNazevOvm }
     *     
     */
    public void setOVM(KodNazevOvm value) {
        this.ovm = value;
    }

    /**
     * Gets the value of the ofros property.
     * 
     * @return
     *     possible object is
     *     {@link OfRos }
     *     
     */
    public OfRos getOFROS() {
        return ofros;
    }

    /**
     * Sets the value of the ofros property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfRos }
     *     
     */
    public void setOFROS(OfRos value) {
        this.ofros = value;
    }

    /**
     * Gets the value of the sr property.
     * 
     * @return
     *     possible object is
     *     {@link SidloRos }
     *     
     */
    public SidloRos getSR() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidloRos }
     *     
     */
    public void setSR(SidloRos value) {
        this.sr = value;
    }

    /**
     * Gets the value of the pod property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getPOD() {
        return pod;
    }

    /**
     * Sets the value of the pod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setPOD(DatumRos value) {
        this.pod = value;
    }

    /**
     * Gets the value of the platnostDo property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getPlatnostDo() {
        return platnostDo;
    }

    /**
     * Sets the value of the platnostDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setPlatnostDo(DatumRos value) {
        this.platnostDo = value;
    }

}
