//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.15 at 12:56:57 PM EDT 
//


package org.cvrgrid.philips.jaxb.beans;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="modifier" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="numericcode" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="modifiercode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="added" type="{http://www3.medical.philips.com}TYPEflag" />
 *                 &lt;attribute name="deleted" type="{http://www3.medical.philips.com}TYPEflag" />
 *                 &lt;attribute name="changed" type="{http://www3.medical.philips.com}TYPEflag" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="changed" type="{http://www3.medical.philips.com}TYPEflag" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modifier"
})
@XmlRootElement(name = "modifiers")
public class Modifiers {

    protected List<Modifiers.Modifier> modifier;
    @XmlAttribute(name = "changed")
    protected TYPEflag changed;

    /**
     * Gets the value of the modifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modifiers.Modifier }
     * 
     * 
     */
    public List<Modifiers.Modifier> getModifier() {
        if (modifier == null) {
            modifier = new ArrayList<Modifiers.Modifier>();
        }
        return this.modifier;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link TYPEflag }
     *     
     */
    public TYPEflag getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TYPEflag }
     *     
     */
    public void setChanged(TYPEflag value) {
        this.changed = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="numericcode" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="modifiercode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="added" type="{http://www3.medical.philips.com}TYPEflag" />
     *       &lt;attribute name="deleted" type="{http://www3.medical.philips.com}TYPEflag" />
     *       &lt;attribute name="changed" type="{http://www3.medical.philips.com}TYPEflag" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Modifier {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "numericcode", required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger numericcode;
        @XmlAttribute(name = "modifiercode", required = true)
        protected String modifiercode;
        @XmlAttribute(name = "added")
        protected TYPEflag added;
        @XmlAttribute(name = "deleted")
        protected TYPEflag deleted;
        @XmlAttribute(name = "changed")
        protected TYPEflag changed;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the numericcode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumericcode() {
            return numericcode;
        }

        /**
         * Sets the value of the numericcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumericcode(BigInteger value) {
            this.numericcode = value;
        }

        /**
         * Gets the value of the modifiercode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModifiercode() {
            return modifiercode;
        }

        /**
         * Sets the value of the modifiercode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModifiercode(String value) {
            this.modifiercode = value;
        }

        /**
         * Gets the value of the added property.
         * 
         * @return
         *     possible object is
         *     {@link TYPEflag }
         *     
         */
        public TYPEflag getAdded() {
            return added;
        }

        /**
         * Sets the value of the added property.
         * 
         * @param value
         *     allowed object is
         *     {@link TYPEflag }
         *     
         */
        public void setAdded(TYPEflag value) {
            this.added = value;
        }

        /**
         * Gets the value of the deleted property.
         * 
         * @return
         *     possible object is
         *     {@link TYPEflag }
         *     
         */
        public TYPEflag getDeleted() {
            return deleted;
        }

        /**
         * Sets the value of the deleted property.
         * 
         * @param value
         *     allowed object is
         *     {@link TYPEflag }
         *     
         */
        public void setDeleted(TYPEflag value) {
            this.deleted = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link TYPEflag }
         *     
         */
        public TYPEflag getChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link TYPEflag }
         *     
         */
        public void setChanged(TYPEflag value) {
            this.changed = value;
        }

    }

}