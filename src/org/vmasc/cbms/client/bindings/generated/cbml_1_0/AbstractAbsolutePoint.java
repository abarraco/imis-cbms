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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A POINT in a geodetic system. Concrete types are: {CartesianPoint, GeographicPoint}
 * 
 * <p>Java class for AbstractAbsolutePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAbsolutePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractPoint">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="VerticalDistance" type="{http://www.sisostds.org/schemas/c-bml/1.0}VerticalDistance"/>
 *           &lt;element name="VerticalDistanceRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}VerticalDistanceRef"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAbsolutePoint", propOrder = {
    "verticalDistance",
    "verticalDistanceRef"
})
@XmlSeeAlso({
    CartesianPoint.class,
    GeographicPoint.class
})
public abstract class AbstractAbsolutePoint
    extends AbstractPoint
{

    @XmlElement(name = "VerticalDistance")
    protected VerticalDistance verticalDistance;
    @XmlElement(name = "VerticalDistanceRef")
    protected VerticalDistanceRef verticalDistanceRef;

    /**
     * Gets the value of the verticalDistance property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDistance }
     *     
     */
    public VerticalDistance getVerticalDistance() {
        return verticalDistance;
    }

    /**
     * Sets the value of the verticalDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDistance }
     *     
     */
    public void setVerticalDistance(VerticalDistance value) {
        this.verticalDistance = value;
    }

    /**
     * Gets the value of the verticalDistanceRef property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDistanceRef }
     *     
     */
    public VerticalDistanceRef getVerticalDistanceRef() {
        return verticalDistanceRef;
    }

    /**
     * Sets the value of the verticalDistanceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDistanceRef }
     *     
     */
    public void setVerticalDistanceRef(VerticalDistanceRef value) {
        this.verticalDistanceRef = value;
    }

}
