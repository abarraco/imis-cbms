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
 * A specific LOCATION that is a three-dimensional bounded space. Concrete types are: {ConeVolume, SphereVolume, SurfaceVolume}
 * 
 * <p>Java class for AbstractGeometricVolume complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeometricVolume">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractLocation">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="LowerVerticalDistance" type="{http://www.sisostds.org/schemas/c-bml/1.0}VerticalDistance"/>
 *           &lt;element name="LowerVerticalDistanceRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}VerticalDistanceRef"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="UpperVerticalDistance" type="{http://www.sisostds.org/schemas/c-bml/1.0}VerticalDistance"/>
 *           &lt;element name="UpperVerticalDistanceRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}VerticalDistanceRef"/>
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
@XmlType(name = "AbstractGeometricVolume", propOrder = {
    "lowerVerticalDistance",
    "lowerVerticalDistanceRef",
    "upperVerticalDistance",
    "upperVerticalDistanceRef"
})
@XmlSeeAlso({
    SurfaceVolume.class,
    ConeVolume.class,
    SphereVolume.class
})
public abstract class AbstractGeometricVolume
    extends AbstractLocation
{

    @XmlElement(name = "LowerVerticalDistance")
    protected VerticalDistance lowerVerticalDistance;
    @XmlElement(name = "LowerVerticalDistanceRef")
    protected VerticalDistanceRef lowerVerticalDistanceRef;
    @XmlElement(name = "UpperVerticalDistance")
    protected VerticalDistance upperVerticalDistance;
    @XmlElement(name = "UpperVerticalDistanceRef")
    protected VerticalDistanceRef upperVerticalDistanceRef;

    /**
     * Gets the value of the lowerVerticalDistance property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDistance }
     *     
     */
    public VerticalDistance getLowerVerticalDistance() {
        return lowerVerticalDistance;
    }

    /**
     * Sets the value of the lowerVerticalDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDistance }
     *     
     */
    public void setLowerVerticalDistance(VerticalDistance value) {
        this.lowerVerticalDistance = value;
    }

    /**
     * Gets the value of the lowerVerticalDistanceRef property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDistanceRef }
     *     
     */
    public VerticalDistanceRef getLowerVerticalDistanceRef() {
        return lowerVerticalDistanceRef;
    }

    /**
     * Sets the value of the lowerVerticalDistanceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDistanceRef }
     *     
     */
    public void setLowerVerticalDistanceRef(VerticalDistanceRef value) {
        this.lowerVerticalDistanceRef = value;
    }

    /**
     * Gets the value of the upperVerticalDistance property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDistance }
     *     
     */
    public VerticalDistance getUpperVerticalDistance() {
        return upperVerticalDistance;
    }

    /**
     * Sets the value of the upperVerticalDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDistance }
     *     
     */
    public void setUpperVerticalDistance(VerticalDistance value) {
        this.upperVerticalDistance = value;
    }

    /**
     * Gets the value of the upperVerticalDistanceRef property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDistanceRef }
     *     
     */
    public VerticalDistanceRef getUpperVerticalDistanceRef() {
        return upperVerticalDistanceRef;
    }

    /**
     * Sets the value of the upperVerticalDistanceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDistanceRef }
     *     
     */
    public void setUpperVerticalDistanceRef(VerticalDistanceRef value) {
        this.upperVerticalDistanceRef = value;
    }

}