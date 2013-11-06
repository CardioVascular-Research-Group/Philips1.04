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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www3.medical.philips.com}interpretationformat"/>
 *         &lt;element ref="{http://www3.medical.philips.com}waveformformat"/>
 *       &lt;/sequence>
 *       &lt;attribute name="extendedmeasflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *       &lt;attribute name="printtruncationflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "interpretationformat",
    "waveformformat"
})
@XmlRootElement(name = "reportformat")
public class Reportformat {

    @XmlElement(required = true)
    protected TYPEinterpretationformat interpretationformat;
    @XmlElement(required = true)
    protected Waveformformat waveformformat;
    @XmlAttribute(name = "extendedmeasflag")
    protected TYPEflag extendedmeasflag;
    @XmlAttribute(name = "printtruncationflag")
    protected TYPEflag printtruncationflag;

    /**
     * Gets the value of the interpretationformat property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEinterpretationformat }
     *     
     */
    public TYPEinterpretationformat getInterpretationformat() {
        return interpretationformat;
    }

    /**
     * Sets the value of the interpretationformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEinterpretationformat }
     *     
     */
    public void setInterpretationformat(TYPEinterpretationformat value) {
        this.interpretationformat = value;
    }

    /**
     * Gets the value of the waveformformat property.
     * 
     * @return
     *     possible object is
     *     {@link Waveformformat }
     *     
     */
    public Waveformformat getWaveformformat() {
        return waveformformat;
    }

    /**
     * Sets the value of the waveformformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Waveformformat }
     *     
     */
    public void setWaveformformat(Waveformformat value) {
        this.waveformformat = value;
    }

    /**
     * Gets the value of the extendedmeasflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getExtendedmeasflag() {
        return extendedmeasflag;
    }

    /**
     * Sets the value of the extendedmeasflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setExtendedmeasflag(TYPEflag value) {
        this.extendedmeasflag = value;
    }

    /**
     * Gets the value of the printtruncationflag property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getPrinttruncationflag() {
        return printtruncationflag;
    }

    /**
     * Sets the value of the printtruncationflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setPrinttruncationflag(TYPEflag value) {
        this.printtruncationflag = value;
    }

}
