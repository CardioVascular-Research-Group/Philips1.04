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
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="annotation" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="leadname" type="{http://www3.medical.philips.com}TYPEleadname" minOccurs="0"/>
 *                   &lt;element name="time">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
 *                           &lt;attribute name="editedflag" type="{http://www3.medical.philips.com}TYPEflag" />
 *                           &lt;attribute name="uneditedvalue" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = {
    "annotation"
})
@XmlRootElement(name = "annotations")
public class Annotations {

    protected List<Annotations.Annotation> annotation;

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotations.Annotation }
     * 
     * 
     */
    public List<Annotations.Annotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<Annotations.Annotation>();
        }
        return this.annotation;
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
     *         &lt;element name="leadname" type="{http://www3.medical.philips.com}TYPEleadname" minOccurs="0"/>
     *         &lt;element name="time">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
     *                 &lt;attribute name="editedflag" type="{http://www3.medical.philips.com}TYPEflag" />
     *                 &lt;attribute name="uneditedvalue" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "leadname",
        "time",
        "label"
    })
    public static class Annotation {

        protected String leadname;
        @XmlElement(required = true)
        protected Annotations.Annotation.Time time;
        @XmlElement(required = true)
        protected String label;

        /**
         * Gets the value of the leadname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeadname() {
            return leadname;
        }

        /**
         * Sets the value of the leadname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeadname(String value) {
            this.leadname = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link Annotations.Annotation.Time }
         *     
         */
        public Annotations.Annotation.Time getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link Annotations.Annotation.Time }
         *     
         */
        public void setTime(Annotations.Annotation.Time value) {
            this.time = value;
        }

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>float">
         *       &lt;attribute name="editedflag" type="{http://www3.medical.philips.com}TYPEflag" />
         *       &lt;attribute name="uneditedvalue" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
        public static class Time {

            @XmlValue
            protected float value;
            @XmlAttribute(name = "editedflag")
            protected TYPEflag editedflag;
            @XmlAttribute(name = "uneditedvalue")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger uneditedvalue;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
            }

            /**
             * Gets the value of the editedflag property.
             * 
             * @return
             *     possible object is
             *     {@link TYPEflag }
             *     
             */
            public TYPEflag getEditedflag() {
                return editedflag;
            }

            /**
             * Sets the value of the editedflag property.
             * 
             * @param value
             *     allowed object is
             *     {@link TYPEflag }
             *     
             */
            public void setEditedflag(TYPEflag value) {
                this.editedflag = value;
            }

            /**
             * Gets the value of the uneditedvalue property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUneditedvalue() {
                return uneditedvalue;
            }

            /**
             * Sets the value of the uneditedvalue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUneditedvalue(BigInteger value) {
                this.uneditedvalue = value;
            }

        }

    }

}
