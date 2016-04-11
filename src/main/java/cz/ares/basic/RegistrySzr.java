
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o výskytu subjektu v jednotlivých registrech
 * 
 * <p>Java class for registry_szr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registry_szr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ezp" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_ezp" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Lpi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Uez" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Jia" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rsa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rch" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Rsk" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Szp" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Svs" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Srs" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Grl" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}registr_szr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registry_szr", propOrder = {
    "ezp",
    "lpi",
    "uez",
    "jia",
    "rsa",
    "rvi",
    "rch",
    "rsk",
    "szp",
    "svs",
    "srs",
    "grl"
})
public class RegistrySzr {

    @XmlElement(name = "Ezp")
    protected List<RegistrEzp> ezp;
    @XmlElement(name = "Lpi")
    protected List<RegistrSzr> lpi;
    @XmlElement(name = "Uez")
    protected List<RegistrSzr> uez;
    @XmlElement(name = "Jia")
    protected List<RegistrSzr> jia;
    @XmlElement(name = "Rsa")
    protected List<RegistrSzr> rsa;
    @XmlElement(name = "Rvi")
    protected List<RegistrSzr> rvi;
    @XmlElement(name = "Rch")
    protected List<RegistrSzr> rch;
    @XmlElement(name = "Rsk")
    protected List<RegistrSzr> rsk;
    @XmlElement(name = "Szp")
    protected List<RegistrSzr> szp;
    @XmlElement(name = "Svs")
    protected List<RegistrSzr> svs;
    @XmlElement(name = "Srs")
    protected List<RegistrSzr> srs;
    @XmlElement(name = "Grl")
    protected List<RegistrSzr> grl;

    /**
     * Gets the value of the ezp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ezp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEzp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrEzp }
     * 
     * 
     */
    public List<RegistrEzp> getEzp() {
        if (ezp == null) {
            ezp = new ArrayList<RegistrEzp>();
        }
        return this.ezp;
    }

    /**
     * Gets the value of the lpi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lpi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLpi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getLpi() {
        if (lpi == null) {
            lpi = new ArrayList<RegistrSzr>();
        }
        return this.lpi;
    }

    /**
     * Gets the value of the uez property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uez property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUez().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getUez() {
        if (uez == null) {
            uez = new ArrayList<RegistrSzr>();
        }
        return this.uez;
    }

    /**
     * Gets the value of the jia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getJia() {
        if (jia == null) {
            jia = new ArrayList<RegistrSzr>();
        }
        return this.jia;
    }

    /**
     * Gets the value of the rsa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getRsa() {
        if (rsa == null) {
            rsa = new ArrayList<RegistrSzr>();
        }
        return this.rsa;
    }

    /**
     * Gets the value of the rvi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rvi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getRvi() {
        if (rvi == null) {
            rvi = new ArrayList<RegistrSzr>();
        }
        return this.rvi;
    }

    /**
     * Gets the value of the rch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getRch() {
        if (rch == null) {
            rch = new ArrayList<RegistrSzr>();
        }
        return this.rch;
    }

    /**
     * Gets the value of the rsk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getRsk() {
        if (rsk == null) {
            rsk = new ArrayList<RegistrSzr>();
        }
        return this.rsk;
    }

    /**
     * Gets the value of the szp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the szp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSzp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getSzp() {
        if (szp == null) {
            szp = new ArrayList<RegistrSzr>();
        }
        return this.szp;
    }

    /**
     * Gets the value of the svs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getSvs() {
        if (svs == null) {
            svs = new ArrayList<RegistrSzr>();
        }
        return this.svs;
    }

    /**
     * Gets the value of the srs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the srs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getSrs() {
        if (srs == null) {
            srs = new ArrayList<RegistrSzr>();
        }
        return this.srs;
    }

    /**
     * Gets the value of the grl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrSzr }
     * 
     * 
     */
    public List<RegistrSzr> getGrl() {
        if (grl == null) {
            grl = new ArrayList<RegistrSzr>();
        }
        return this.grl;
    }

}
