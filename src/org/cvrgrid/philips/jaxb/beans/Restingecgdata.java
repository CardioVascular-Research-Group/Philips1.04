//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.15 at 12:56:57 PM EDT 
//


package org.cvrgrid.philips.jaxb.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www3.medical.philips.com}documentinfo"/>
 *         &lt;element ref="{http://www3.medical.philips.com}userdefines" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}orderinfo" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}otherECGs" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}reportinfo"/>
 *         &lt;element ref="{http://www3.medical.philips.com}dataacquisition"/>
 *         &lt;element ref="{http://www3.medical.philips.com}patient"/>
 *         &lt;element ref="{http://www3.medical.philips.com}internalmeasurements" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}interpretations" minOccurs="0"/>
 *         &lt;element ref="{http://www3.medical.philips.com}waveforms" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="crc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" use="required" type="{http://www3.medical.philips.com}TYPErestingecgstatus" />
 *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}language" />
 *       &lt;attribute name="locale" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentinfo",
    "userdefines",
    "orderinfo",
    "otherECGs",
    "reportinfo",
    "dataacquisition",
    "patient",
    "internalmeasurements",
    "interpretations",
    "waveforms"
})
@XmlRootElement(name = "restingecgdata")
public class Restingecgdata {

    @XmlElement(required = true)
    protected Documentinfo documentinfo;
    protected Userdefines userdefines;
    protected Orderinfo orderinfo;
    protected OtherECGs otherECGs;
    @XmlElement(required = true)
    protected Reportinfo reportinfo;
    @XmlElement(required = true)
    protected Dataacquisition dataacquisition;
    @XmlElement(required = true)
    protected Patient patient;
    protected Internalmeasurements internalmeasurements;
    protected Interpretations interpretations;
    protected Waveforms waveforms;
    @XmlAttribute(name = "crc")
    protected String crc;
    @XmlAttribute(name = "status", required = true)
    protected TYPErestingecgstatus status;
    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "locale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String locale;

    /**
     * Gets the value of the documentinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Documentinfo }
     *     
     */
    public Documentinfo getDocumentinfo() {
        return documentinfo;
    }

    /**
     * Sets the value of the documentinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentinfo }
     *     
     */
    public void setDocumentinfo(Documentinfo value) {
        this.documentinfo = value;
    }

    /**
     * Gets the value of the userdefines property.
     * 
     * @return
     *     possible object is
     *     {@link Userdefines }
     *     
     */
    public Userdefines getUserdefines() {
        return userdefines;
    }

    /**
     * Sets the value of the userdefines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Userdefines }
     *     
     */
    public void setUserdefines(Userdefines value) {
        this.userdefines = value;
    }

    /**
     * Gets the value of the orderinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Orderinfo }
     *     
     */
    public Orderinfo getOrderinfo() {
        return orderinfo;
    }

    /**
     * Sets the value of the orderinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orderinfo }
     *     
     */
    public void setOrderinfo(Orderinfo value) {
        this.orderinfo = value;
    }

    /**
     * Gets the value of the otherECGs property.
     * 
     * @return
     *     possible object is
     *     {@link OtherECGs }
     *     
     */
    public OtherECGs getOtherECGs() {
        return otherECGs;
    }

    /**
     * Sets the value of the otherECGs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherECGs }
     *     
     */
    public void setOtherECGs(OtherECGs value) {
        this.otherECGs = value;
    }

    /**
     * Gets the value of the reportinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Reportinfo }
     *     
     */
    public Reportinfo getReportinfo() {
        return reportinfo;
    }

    /**
     * Sets the value of the reportinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reportinfo }
     *     
     */
    public void setReportinfo(Reportinfo value) {
        this.reportinfo = value;
    }

    /**
     * Gets the value of the dataacquisition property.
     * 
     * @return
     *     possible object is
     *     {@link Dataacquisition }
     *     
     */
    public Dataacquisition getDataacquisition() {
        return dataacquisition;
    }

    /**
     * Sets the value of the dataacquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataacquisition }
     *     
     */
    public void setDataacquisition(Dataacquisition value) {
        this.dataacquisition = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link Patient }
     *     
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Patient }
     *     
     */
    public void setPatient(Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the internalmeasurements property.
     * 
     * @return
     *     possible object is
     *     {@link Internalmeasurements }
     *     
     */
    public Internalmeasurements getInternalmeasurements() {
        return internalmeasurements;
    }

    /**
     * Sets the value of the internalmeasurements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Internalmeasurements }
     *     
     */
    public void setInternalmeasurements(Internalmeasurements value) {
        this.internalmeasurements = value;
    }

    /**
     * Gets the value of the interpretations property.
     * 
     * @return
     *     possible object is
     *     {@link Interpretations }
     *     
     */
    public Interpretations getInterpretations() {
        return interpretations;
    }

    /**
     * Sets the value of the interpretations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interpretations }
     *     
     */
    public void setInterpretations(Interpretations value) {
        this.interpretations = value;
    }

    /**
     * Gets the value of the waveforms property.
     * 
     * @return
     *     possible object is
     *     {@link Waveforms }
     *     
     */
    public Waveforms getWaveforms() {
        return waveforms;
    }

    /**
     * Sets the value of the waveforms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Waveforms }
     *     
     */
    public void setWaveforms(Waveforms value) {
        this.waveforms = value;
    }

    /**
     * Gets the value of the crc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrc() {
        return crc;
    }

    /**
     * Sets the value of the crc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrc(String value) {
        this.crc = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TYPErestingecgstatus }
     *     
     */
    public TYPErestingecgstatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPErestingecgstatus }
     *     
     */
    public void setStatus(TYPErestingecgstatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}
