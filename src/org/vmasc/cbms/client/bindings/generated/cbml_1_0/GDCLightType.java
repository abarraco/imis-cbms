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
 *  Provides the coordinates for a point using the GDC system.
 * 			
 * 
 * <p>Java class for GDCLightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDCLightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="SpecificPoint" type="{http://www.sisostds.org/schemas/c-bml/1.0}SpecificPointLightType"/>
 *           &lt;element name="PointReference" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;/choice>
 *         &lt;element name="Displacement" type="{http://www.sisostds.org/schemas/c-bml/1.0}DisplacementLightType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDCLightType", propOrder = {
    "oid",
    "specificPoint",
    "pointReference",
    "displacement"
})
public class GDCLightType {

    @XmlElement(name = "OID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "SpecificPoint")
    protected SpecificPointLightType specificPoint;
    @XmlElement(name = "PointReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pointReference;
    @XmlElement(name = "Displacement")
    protected DisplacementLightType displacement;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the specificPoint property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificPointLightType }
     *     
     */
    public SpecificPointLightType getSpecificPoint() {
        return specificPoint;
    }

    /**
     * Sets the value of the specificPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificPointLightType }
     *     
     */
    public void setSpecificPoint(SpecificPointLightType value) {
        this.specificPoint = value;
    }

    /**
     * Gets the value of the pointReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointReference() {
        return pointReference;
    }

    /**
     * Sets the value of the pointReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointReference(String value) {
        this.pointReference = value;
    }

    /**
     * Gets the value of the displacement property.
     * 
     * @return
     *     possible object is
     *     {@link DisplacementLightType }
     *     
     */
    public DisplacementLightType getDisplacement() {
        return displacement;
    }

    /**
     * Sets the value of the displacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplacementLightType }
     *     
     */
    public void setDisplacement(DisplacementLightType value) {
        this.displacement = value;
    }

}
