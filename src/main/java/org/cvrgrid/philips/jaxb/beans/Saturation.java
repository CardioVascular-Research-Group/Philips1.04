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
 *       &lt;attribute name="starttime" use="required" type="{http://www3.medical.philips.com}TYPEstarttime" />
 *       &lt;attribute name="duration" use="required" type="{http://www3.medical.philips.com}TYPEduration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "saturation")
public class Saturation {

    @XmlAttribute(name = "starttime", required = true)
    protected String starttime;
    @XmlAttribute(name = "duration", required = true)
    protected String duration;

    /**
     * Gets the value of the starttime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * Sets the value of the starttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarttime(String value) {
        this.starttime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

}