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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *  Specifies who or what is affected by the execution of
 * 				an action (task or event). 
 * 
 * <p>Java class for AffectedWhoLightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedWhoLightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectRef" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="QualifierCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ActionObjectiveQualifierCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedWhoLightType", propOrder = {
    "objectRef",
    "qualifierCode"
})
public class AffectedWhoLightType {

    @XmlElement(name = "ObjectRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String objectRef;
    @XmlElement(name = "QualifierCode")
    protected ActionObjectiveQualifierCode qualifierCode;

    /**
     * Gets the value of the objectRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectRef() {
        return objectRef;
    }

    /**
     * Sets the value of the objectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectRef(String value) {
        this.objectRef = value;
    }

    /**
     * Gets the value of the qualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionObjectiveQualifierCode }
     *     
     */
    public ActionObjectiveQualifierCode getQualifierCode() {
        return qualifierCode;
    }

    /**
     * Sets the value of the qualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionObjectiveQualifierCode }
     *     
     */
    public void setQualifierCode(ActionObjectiveQualifierCode value) {
        this.qualifierCode = value;
    }

}
