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
 * A SURFACE that consists of a circular arc and a polygonal segment defined by a specific LINE whose beginning coincides with the initial point of the arc and whose end coincides with the last point of the arc.
 * 
 * <p>Java class for PolyarcArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolyarcArea">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractSurface">
 *       &lt;sequence>
 *         &lt;element name="BeginBearingAngle" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}AngleTypeRangeAngle7_4"/>
 *         &lt;element name="EndBearingAngle" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}AngleTypeRangeAngle7_4"/>
 *         &lt;element name="ArcRadiusDimension" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DimensionType12_3"/>
 *         &lt;choice>
 *           &lt;element name="DefiningLine" type="{http://www.sisostds.org/schemas/c-bml/1.0}Line"/>
 *           &lt;element name="DefiningLineRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}LineRef"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="BearingOriginPoint" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractPoint"/>
 *           &lt;element name="BearingOriginPointRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractPointRef"/>
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
@XmlType(name = "PolyarcArea", propOrder = {
    "beginBearingAngle",
    "endBearingAngle",
    "arcRadiusDimension",
    "definingLine",
    "definingLineRef",
    "bearingOriginPoint",
    "bearingOriginPointRef"
})
public class PolyarcArea
    extends AbstractSurface
{

    @XmlElement(name = "BeginBearingAngle", required = true)
    protected BigDecimal beginBearingAngle;
    @XmlElement(name = "EndBearingAngle", required = true)
    protected BigDecimal endBearingAngle;
    @XmlElement(name = "ArcRadiusDimension", required = true)
    protected BigDecimal arcRadiusDimension;
    @XmlElement(name = "DefiningLine")
    protected Line definingLine;
    @XmlElement(name = "DefiningLineRef")
    protected LineRef definingLineRef;
    @XmlElement(name = "BearingOriginPoint")
    protected AbstractPoint bearingOriginPoint;
    @XmlElement(name = "BearingOriginPointRef")
    protected AbstractPointRef bearingOriginPointRef;

    /**
     * Gets the value of the beginBearingAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeginBearingAngle() {
        return beginBearingAngle;
    }

    /**
     * Sets the value of the beginBearingAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeginBearingAngle(BigDecimal value) {
        this.beginBearingAngle = value;
    }

    /**
     * Gets the value of the endBearingAngle property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndBearingAngle() {
        return endBearingAngle;
    }

    /**
     * Sets the value of the endBearingAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndBearingAngle(BigDecimal value) {
        this.endBearingAngle = value;
    }

    /**
     * Gets the value of the arcRadiusDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArcRadiusDimension() {
        return arcRadiusDimension;
    }

    /**
     * Sets the value of the arcRadiusDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArcRadiusDimension(BigDecimal value) {
        this.arcRadiusDimension = value;
    }

    /**
     * Gets the value of the definingLine property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getDefiningLine() {
        return definingLine;
    }

    /**
     * Sets the value of the definingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setDefiningLine(Line value) {
        this.definingLine = value;
    }

    /**
     * Gets the value of the definingLineRef property.
     * 
     * @return
     *     possible object is
     *     {@link LineRef }
     *     
     */
    public LineRef getDefiningLineRef() {
        return definingLineRef;
    }

    /**
     * Sets the value of the definingLineRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRef }
     *     
     */
    public void setDefiningLineRef(LineRef value) {
        this.definingLineRef = value;
    }

    /**
     * Gets the value of the bearingOriginPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPoint }
     *     
     */
    public AbstractPoint getBearingOriginPoint() {
        return bearingOriginPoint;
    }

    /**
     * Sets the value of the bearingOriginPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPoint }
     *     
     */
    public void setBearingOriginPoint(AbstractPoint value) {
        this.bearingOriginPoint = value;
    }

    /**
     * Gets the value of the bearingOriginPointRef property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPointRef }
     *     
     */
    public AbstractPointRef getBearingOriginPointRef() {
        return bearingOriginPointRef;
    }

    /**
     * Sets the value of the bearingOriginPointRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPointRef }
     *     
     */
    public void setBearingOriginPointRef(AbstractPointRef value) {
        this.bearingOriginPointRef = value;
    }

}
