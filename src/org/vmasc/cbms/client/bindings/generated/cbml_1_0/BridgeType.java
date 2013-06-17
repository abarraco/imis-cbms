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
 * A FACILITY-TYPE that is a class of structures (including overpasses and viaducts), fixed or moveable, spanning and/or providing passage over an object.
 * 
 * <p>Java class for BridgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BridgeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacilityType">
 *       &lt;sequence>
 *         &lt;element name="DesignTypeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}BridgeTypeDesignTypeCode"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BridgeType", propOrder = {
    "designTypeCode"
})
public class BridgeType
    extends AbstractFacilityType
{

    @XmlElement(name = "DesignTypeCode", required = true)
    protected BridgeTypeDesignTypeCode designTypeCode;

    /**
     * Gets the value of the designTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BridgeTypeDesignTypeCode }
     *     
     */
    public BridgeTypeDesignTypeCode getDesignTypeCode() {
        return designTypeCode;
    }

    /**
     * Sets the value of the designTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BridgeTypeDesignTypeCode }
     *     
     */
    public void setDesignTypeCode(BridgeTypeDesignTypeCode value) {
        this.designTypeCode = value;
    }

}