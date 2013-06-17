//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A LOCATION that is defined by two or more POINTs connected by one-dimensional line segments in an ordered sequence.
 * 
 * <p>Java class for Line complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Line">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractLocation">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="2">
 *           &lt;element name="Point" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractPoint"/>
 *           &lt;element name="PointRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractPointRef"/>
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
@XmlType(name = "Line", propOrder = {
    "pointOrPointRef"
})
public class Line
    extends AbstractLocation
{

    @XmlElements({
        @XmlElement(name = "PointRef", type = AbstractPointRef.class),
        @XmlElement(name = "Point", type = AbstractPoint.class)
    })
    protected List<Object> pointOrPointRef;

    /**
     * Gets the value of the pointOrPointRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOrPointRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOrPointRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractPointRef }
     * {@link AbstractPoint }
     * 
     * 
     */
    public List<Object> getPointOrPointRef() {
        if (pointOrPointRef == null) {
            pointOrPointRef = new ArrayList<Object>();
        }
        return this.pointOrPointRef;
    }

}