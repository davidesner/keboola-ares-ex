
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Dotaz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_request_orrg/v_1.0.0}dotaz" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="dotaz_datum_cas" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dotaz_pocet" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dotaz_typ" use="required" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}ares_dotaz_typ" />
 *       &lt;attribute name="vystup_format" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.2}vystup_format" default="XML" />
 *       &lt;attribute name="validation_XSLT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="user_mail" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}e_mail" />
 *       &lt;attribute name="answerNamespaceRequired" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dotaz"
})
@XmlRootElement(name = "Ares_dotazy", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_request_orrg/v_1.0.0")
public class AresDotazy {

    @XmlElement(name = "Dotaz", namespace = "", required = true)
    protected List<Dotaz> dotaz;
    @XmlAttribute(name = "dotaz_datum_cas", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dotazDatumCas;
    @XmlAttribute(name = "dotaz_pocet", required = true)
    protected int dotazPocet;
    @XmlAttribute(name = "dotaz_typ", required = true)
    protected AresDotazTyp dotazTyp;
    @XmlAttribute(name = "vystup_format")
    protected VystupFormat vystupFormat;
    @XmlAttribute(name = "validation_XSLT", required = true)
    protected String validationXSLT;
    @XmlAttribute(name = "user_mail")
    protected String userMail;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String answerNamespaceRequired;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the dotaz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dotaz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDotaz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dotaz }
     * 
     * 
     */
    public List<Dotaz> getDotaz() {
        if (dotaz == null) {
            dotaz = new ArrayList<Dotaz>();
        }
        return this.dotaz;
    }

    /**
     * Gets the value of the dotazDatumCas property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDotazDatumCas() {
        return dotazDatumCas;
    }

    /**
     * Sets the value of the dotazDatumCas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDotazDatumCas(XMLGregorianCalendar value) {
        this.dotazDatumCas = value;
    }

    /**
     * Gets the value of the dotazPocet property.
     * 
     */
    public int getDotazPocet() {
        return dotazPocet;
    }

    /**
     * Sets the value of the dotazPocet property.
     * 
     */
    public void setDotazPocet(int value) {
        this.dotazPocet = value;
    }

    /**
     * Gets the value of the dotazTyp property.
     * 
     * @return
     *     possible object is
     *     {@link AresDotazTyp }
     *     
     */
    public AresDotazTyp getDotazTyp() {
        return dotazTyp;
    }

    /**
     * Sets the value of the dotazTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AresDotazTyp }
     *     
     */
    public void setDotazTyp(AresDotazTyp value) {
        this.dotazTyp = value;
    }

    /**
     * Gets the value of the vystupFormat property.
     * 
     * @return
     *     possible object is
     *     {@link VystupFormat }
     *     
     */
    public VystupFormat getVystupFormat() {
        if (vystupFormat == null) {
            return VystupFormat.XML;
        } else {
            return vystupFormat;
        }
    }

    /**
     * Sets the value of the vystupFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VystupFormat }
     *     
     */
    public void setVystupFormat(VystupFormat value) {
        this.vystupFormat = value;
    }

    /**
     * Gets the value of the validationXSLT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationXSLT() {
        return validationXSLT;
    }

    /**
     * Sets the value of the validationXSLT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationXSLT(String value) {
        this.validationXSLT = value;
    }

    /**
     * Gets the value of the userMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMail() {
        return userMail;
    }

    /**
     * Sets the value of the userMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMail(String value) {
        this.userMail = value;
    }

    /**
     * Gets the value of the answerNamespaceRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerNamespaceRequired() {
        return answerNamespaceRequired;
    }

    /**
     * Sets the value of the answerNamespaceRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerNamespaceRequired(String value) {
        this.answerNamespaceRequired = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
