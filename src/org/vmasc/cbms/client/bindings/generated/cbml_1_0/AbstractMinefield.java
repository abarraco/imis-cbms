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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A MILITARY-OBSTACLE that is an area or volume containing mines. Concrete types are: {MinefieldLand, MinefieldMaritime}
 * 
 * <p>Java class for AbstractMinefield complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMinefield">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractMilitaryObstacle">
 *       &lt;sequence>
 *         &lt;element name="IdentificationText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar15" minOccurs="0"/>
 *         &lt;element name="MineSpacingDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3" minOccurs="0"/>
 *         &lt;element name="DestructionDatetime" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DatetimeTypeFix18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMinefield", propOrder = {
    "identificationText",
    "mineSpacingDimension",
    "destructionDatetime"
})
@XmlSeeAlso({
    MinefieldLand.class,
    MinefieldMaritime.class
})
public abstract class AbstractMinefield
    extends AbstractMilitaryObstacle
{

    @XmlElement(name = "IdentificationText")
    protected String identificationText;
    @XmlElement(name = "MineSpacingDimension")
    protected BigDecimal mineSpacingDimension;
    @XmlElement(name = "DestructionDatetime")
    protected String destructionDatetime;

    /**
     * Gets the value of the identificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationText() {
        return identificationText;
    }

    /**
     * Sets the value of the identificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationText(String value) {
        this.identificationText = value;
    }

    /**
     * Gets the value of the mineSpacingDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMineSpacingDimension() {
        return mineSpacingDimension;
    }

    /**
     * Sets the value of the mineSpacingDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMineSpacingDimension(BigDecimal value) {
        this.mineSpacingDimension = value;
    }

    /**
     * Gets the value of the destructionDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestructionDatetime() {
        return destructionDatetime;
    }

    /**
     * Sets the value of the destructionDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestructionDatetime(String value) {
        this.destructionDatetime = value;
    }

}