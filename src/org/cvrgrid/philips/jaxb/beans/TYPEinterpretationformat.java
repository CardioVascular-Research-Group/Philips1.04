//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.15 at 12:56:57 PM EDT 
//


package org.cvrgrid.philips.jaxb.beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TYPEinterpretationformat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TYPEinterpretationformat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Severity only"/>
 *     &lt;enumeration value="Short measurements"/>
 *     &lt;enumeration value="Extended measurements"/>
 *     &lt;enumeration value="Interpretations"/>
 *     &lt;enumeration value="Interpretations and reasons"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TYPEinterpretationformat")
@XmlEnum
public enum TYPEinterpretationformat {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Severity only")
    SEVERITY_ONLY("Severity only"),
    @XmlEnumValue("Short measurements")
    SHORT_MEASUREMENTS("Short measurements"),
    @XmlEnumValue("Extended measurements")
    EXTENDED_MEASUREMENTS("Extended measurements"),
    @XmlEnumValue("Interpretations")
    INTERPRETATIONS("Interpretations"),
    @XmlEnumValue("Interpretations and reasons")
    INTERPRETATIONS_AND_REASONS("Interpretations and reasons"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TYPEinterpretationformat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TYPEinterpretationformat fromValue(String v) {
        for (TYPEinterpretationformat c: TYPEinterpretationformat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
