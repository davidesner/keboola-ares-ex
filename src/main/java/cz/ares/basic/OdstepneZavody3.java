
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for odstepne_zavody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odstepne_zavody">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OZ" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ico" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CIN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cinnosti" minOccurs="0"/>
 *                   &lt;element name="V" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}angazma" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odstepne_zavody", propOrder = {
    "oz"
})
public class OdstepneZavody3 {

    @XmlElement(name = "OZ", required = true)
    protected List<OdstepneZavody3 .OZ> oz;

    /**
     * Gets the value of the oz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdstepneZavody3 .OZ }
     * 
     * 
     */
    public List<OdstepneZavody3 .OZ> getOZ() {
        if (oz == null) {
            oz = new ArrayList<OdstepneZavody3 .OZ>();
        }
        return this.oz;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}ico" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OF" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CIN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}cinnosti" minOccurs="0"/>
     *         &lt;element name="V" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}angazma" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ico",
        "of",
        "si",
        "cin",
        "v"
    })
    public static class OZ {

        @XmlElement(name = "ICO")
        protected List<Ico3> ico;
        @XmlElement(name = "OF")
        protected List<ObchodniFirma3> of;
        @XmlElement(name = "SI")
        protected List<AdresaARES3> si;
        @XmlElement(name = "CIN")
        protected Cinnosti3 cin;
        @XmlElement(name = "V")
        protected List<Angazma3> v;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dod;
        @XmlAttribute
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ddo;

        /**
         * Gets the value of the ico property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ico property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getICO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ico3 }
         * 
         * 
         */
        public List<Ico3> getICO() {
            if (ico == null) {
                ico = new ArrayList<Ico3>();
            }
            return this.ico;
        }

        /**
         * Gets the value of the of property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the of property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOF().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObchodniFirma3 }
         * 
         * 
         */
        public List<ObchodniFirma3> getOF() {
            if (of == null) {
                of = new ArrayList<ObchodniFirma3>();
            }
            return this.of;
        }

        /**
         * Gets the value of the si property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the si property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdresaARES3 }
         * 
         * 
         */
        public List<AdresaARES3> getSI() {
            if (si == null) {
                si = new ArrayList<AdresaARES3>();
            }
            return this.si;
        }

        /**
         * Gets the value of the cin property.
         * 
         * @return
         *     possible object is
         *     {@link Cinnosti3 }
         *     
         */
        public Cinnosti3 getCIN() {
            return cin;
        }

        /**
         * Sets the value of the cin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cinnosti3 }
         *     
         */
        public void setCIN(Cinnosti3 value) {
            this.cin = value;
        }

        /**
         * Gets the value of the v property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the v property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getV().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Angazma3 }
         * 
         * 
         */
        public List<Angazma3> getV() {
            if (v == null) {
                v = new ArrayList<Angazma3>();
            }
            return this.v;
        }

        /**
         * Gets the value of the dod property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDod() {
            return dod;
        }

        /**
         * Sets the value of the dod property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDod(XMLGregorianCalendar value) {
            this.dod = value;
        }

        /**
         * Gets the value of the ddo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDdo() {
            return ddo;
        }

        /**
         * Sets the value of the ddo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDdo(XMLGregorianCalendar value) {
            this.ddo = value;
        }

    }

}
