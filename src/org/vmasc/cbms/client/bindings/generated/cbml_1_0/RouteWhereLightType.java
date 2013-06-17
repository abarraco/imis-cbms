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
 *  Supports Route. Provides a choice between a reference to a route or
 * 				an actual route. 
 * 
 * <p>Java class for RouteWhereLightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteWhereLightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RouteRef" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="SpecificRoute" type="{http://www.sisostds.org/schemas/c-bml/1.0}RouteLightType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteWhereLightType", propOrder = {
    "routeRef",
    "specificRoute"
})
public class RouteWhereLightType {

    @XmlElement(name = "RouteRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String routeRef;
    @XmlElement(name = "SpecificRoute")
    protected RouteLightType specificRoute;

    /**
     * Gets the value of the routeRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteRef() {
        return routeRef;
    }

    /**
     * Sets the value of the routeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteRef(String value) {
        this.routeRef = value;
    }

    /**
     * Gets the value of the specificRoute property.
     * 
     * @return
     *     possible object is
     *     {@link RouteLightType }
     *     
     */
    public RouteLightType getSpecificRoute() {
        return specificRoute;
    }

    /**
     * Sets the value of the specificRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteLightType }
     *     
     */
    public void setSpecificRoute(RouteLightType value) {
        this.specificRoute = value;
    }

}
