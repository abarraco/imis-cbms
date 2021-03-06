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


/**
 * A FACILITY that provides an enclosure for maintenance, building or repairing ships, from which water can be pumped out.
 * 
 * <p>Java class for DryDock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DryDock">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacility">
 *       &lt;sequence>
 *         &lt;element name="BoatLiftCapacityQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType9" minOccurs="0"/>
 *         &lt;element name="DepthDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="MarineRailwaySizeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DryDockMarineRailwaySizeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DryDock", propOrder = {
    "boatLiftCapacityQuantity",
    "depthDimension",
    "marineRailwaySizeCode"
})
public class DryDock
    extends AbstractFacility
{

    @XmlElement(name = "BoatLiftCapacityQuantity")
    protected Integer boatLiftCapacityQuantity;
    @XmlElement(name = "DepthDimension")
    protected BigDecimal depthDimension;
    @XmlElement(name = "MarineRailwaySizeCode")
    protected DryDockMarineRailwaySizeCode marineRailwaySizeCode;

    /**
     * Gets the value of the boatLiftCapacityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBoatLiftCapacityQuantity() {
        return boatLiftCapacityQuantity;
    }

    /**
     * Sets the value of the boatLiftCapacityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBoatLiftCapacityQuantity(Integer value) {
        this.boatLiftCapacityQuantity = value;
    }

    /**
     * Gets the value of the depthDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepthDimension() {
        return depthDimension;
    }

    /**
     * Sets the value of the depthDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepthDimension(BigDecimal value) {
        this.depthDimension = value;
    }

    /**
     * Gets the value of the marineRailwaySizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DryDockMarineRailwaySizeCode }
     *     
     */
    public DryDockMarineRailwaySizeCode getMarineRailwaySizeCode() {
        return marineRailwaySizeCode;
    }

    /**
     * Sets the value of the marineRailwaySizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DryDockMarineRailwaySizeCode }
     *     
     */
    public void setMarineRailwaySizeCode(DryDockMarineRailwaySizeCode value) {
        this.marineRailwaySizeCode = value;
    }

}
