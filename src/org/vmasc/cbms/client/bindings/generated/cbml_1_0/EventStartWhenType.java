//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the start time of an event.
 * 
 * <p>Java class for EventStartWhenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventStartWhenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RelativeTime" type="{http://www.sisostds.org/schemas/c-bml/1.0}StartWhenRelativeTimeType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventStartWhenType", propOrder = {
    "relativeTime"
})
public class EventStartWhenType {

    @XmlElement(name = "RelativeTime")
    protected StartWhenRelativeTimeType relativeTime;

    /**
     * Gets the value of the relativeTime property.
     * 
     * @return
     *     possible object is
     *     {@link StartWhenRelativeTimeType }
     *     
     */
    public StartWhenRelativeTimeType getRelativeTime() {
        return relativeTime;
    }

    /**
     * Sets the value of the relativeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartWhenRelativeTimeType }
     *     
     */
    public void setRelativeTime(StartWhenRelativeTimeType value) {
        this.relativeTime = value;
    }

}
