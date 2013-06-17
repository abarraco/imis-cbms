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
 * Specifies the start time of a task in absolute time.
 * 
 * <p>Java class for StartWhenAbsoluteSpecifiedTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StartWhenAbsoluteSpecifiedTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Datetime" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DatetimeTypeFix18"/>
 *         &lt;element name="StartQualifierCode" type="{http://www.sisostds.org/schemas/c-bml/1.0}ActionTaskStartTimeQualifierCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StartWhenAbsoluteSpecifiedTimeType", propOrder = {
    "datetime",
    "startQualifierCode"
})
public class StartWhenAbsoluteSpecifiedTimeType {

    @XmlElement(name = "Datetime", required = true)
    protected String datetime;
    @XmlElement(name = "StartQualifierCode", required = true)
    protected ActionTaskStartTimeQualifierCode startQualifierCode;

    /**
     * Gets the value of the datetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatetime() {
        return datetime;
    }

    /**
     * Sets the value of the datetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatetime(String value) {
        this.datetime = value;
    }

    /**
     * Gets the value of the startQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionTaskStartTimeQualifierCode }
     *     
     */
    public ActionTaskStartTimeQualifierCode getStartQualifierCode() {
        return startQualifierCode;
    }

    /**
     * Sets the value of the startQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionTaskStartTimeQualifierCode }
     *     
     */
    public void setStartQualifierCode(ActionTaskStartTimeQualifierCode value) {
        this.startQualifierCode = value;
    }

}
