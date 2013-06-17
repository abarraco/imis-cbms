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
 * A specification of an OBJECT-TYPE-ESTABLISHMENT that is authorised for a specific OBJECT-ITEM.
 * 
 * <p>Java class for ObjectItemObjectTypeEstablishment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectItemObjectTypeEstablishment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffectiveDatetime" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DatetimeTypeFix18"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectItemObjectTypeEstablishment", propOrder = {
    "effectiveDatetime"
})
public class ObjectItemObjectTypeEstablishment {

    @XmlElement(name = "EffectiveDatetime", required = true)
    protected String effectiveDatetime;

    /**
     * Gets the value of the effectiveDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDatetime() {
        return effectiveDatetime;
    }

    /**
     * Sets the value of the effectiveDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDatetime(String value) {
        this.effectiveDatetime = value;
    }

}