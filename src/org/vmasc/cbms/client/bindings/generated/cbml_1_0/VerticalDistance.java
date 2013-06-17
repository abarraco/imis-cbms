//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A specification of the altitude or height of a point or a level as measured with respect to a specified reference datum in the direction normal to the plane that is tangent to the WGS84 ellipsoid of revolution.
 * 
 * <p>Java class for VerticalDistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalDistance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="ReferenceCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}VerticalDistanceReferenceCode"/>
 *         &lt;element name="Dimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3"/>
 *         &lt;element name="PrecisionCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DistancePrecisionCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalDistance", propOrder = {
    "oid",
    "referenceCode",
    "dimension",
    "precisionCode"
})
public class VerticalDistance {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "ReferenceCode", required = true)
    protected VerticalDistanceReferenceCode referenceCode;
    @XmlElement(name = "Dimension", required = true)
    protected BigDecimal dimension;
    @XmlElement(name = "PrecisionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String precisionCode;

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
     * Gets the value of the referenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalDistanceReferenceCode }
     *     
     */
    public VerticalDistanceReferenceCode getReferenceCode() {
        return referenceCode;
    }

    /**
     * Sets the value of the referenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalDistanceReferenceCode }
     *     
     */
    public void setReferenceCode(VerticalDistanceReferenceCode value) {
        this.referenceCode = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimension(BigDecimal value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the precisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecisionCode() {
        return precisionCode;
    }

    /**
     * Sets the value of the precisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecisionCode(String value) {
        this.precisionCode = value;
    }

}