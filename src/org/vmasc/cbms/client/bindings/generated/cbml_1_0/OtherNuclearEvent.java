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
 * A RADIOACTIVE-EVENT involving nuclear materiel and/or nuclear detonation.
 * 
 * <p>Java class for OtherNuclearEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherNuclearEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractNuclearEvent">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}NuclearEventCategoryCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherNuclearEvent", propOrder = {
    "categoryCode"
})
public class OtherNuclearEvent
    extends AbstractNuclearEvent
{

    @XmlElement(name = "CategoryCode", required = true)
    protected NuclearEventCategoryCode categoryCode;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link NuclearEventCategoryCode }
     *     
     */
    public NuclearEventCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuclearEventCategoryCode }
     *     
     */
    public void setCategoryCode(NuclearEventCategoryCode value) {
        this.categoryCode = value;
    }

}
