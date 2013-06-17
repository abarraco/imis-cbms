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
 * A SURFACE that has its boundaries defined by a specific LINE.
 * 
 * <p>Java class for PolygonArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolygonArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractSurface">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="BoundingLine" type="{http://www.sisostds.org/schemas/c-bml/1.0}Line"/>
 *           &lt;element name="BoundingLineRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}LineRef"/>
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
@XmlType(name = "PolygonArea", propOrder = {
    "boundingLine",
    "boundingLineRef"
})
public class PolygonArea
    extends AbstractSurface
{

    @XmlElement(name = "BoundingLine")
    protected Line boundingLine;
    @XmlElement(name = "BoundingLineRef")
    protected LineRef boundingLineRef;

    /**
     * Gets the value of the boundingLine property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getBoundingLine() {
        return boundingLine;
    }

    /**
     * Sets the value of the boundingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setBoundingLine(Line value) {
        this.boundingLine = value;
    }

    /**
     * Gets the value of the boundingLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRef }
     *     
     */
    public LineRef getBoundingLineRef() {
        return boundingLineRef;
    }

    /**
     * Sets the value of the boundingLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRef }
     *     
     */
    public void setBoundingLineRef(LineRef value) {
        this.boundingLineRef = value;
    }

}
