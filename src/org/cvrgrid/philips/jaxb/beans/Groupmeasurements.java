//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.15 at 12:56:57 PM EDT 
//


package org.cvrgrid.philips.jaxb.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www3.medical.philips.com}groupmeasurement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "groupmeasurement"
})
@XmlRootElement(name = "groupmeasurements")
public class Groupmeasurements {

    protected List<Groupmeasurement> groupmeasurement;

    /**
     * Gets the value of the groupmeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupmeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupmeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Groupmeasurement }
     * 
     * 
     */
    public List<Groupmeasurement> getGroupmeasurement() {
        if (groupmeasurement == null) {
            groupmeasurement = new ArrayList<Groupmeasurement>();
        }
        return this.groupmeasurement;
    }

}
