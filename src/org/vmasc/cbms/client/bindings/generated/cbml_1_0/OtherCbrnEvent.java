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
 * An ACTION-EVENT that involves chemical, biological, radiological or nuclear materiel individually or in combination.
 * 
 * <p>Java class for OtherCbrnEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherCbrnEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractCbrnEvent">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CbrnEventCategoryCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCbrnEvent", propOrder = {
    "categoryCode"
})
public class OtherCbrnEvent
    extends AbstractCbrnEvent
{

    @XmlElement(name = "CategoryCode", required = true)
    protected CbrnEventCategoryCode categoryCode;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CbrnEventCategoryCode }
     *     
     */
    public CbrnEventCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CbrnEventCategoryCode }
     *     
     */
    public void setCategoryCode(CbrnEventCategoryCode value) {
        this.categoryCode = value;
    }

}
