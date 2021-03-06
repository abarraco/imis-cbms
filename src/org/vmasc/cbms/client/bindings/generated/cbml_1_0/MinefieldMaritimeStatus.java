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
 * A FACILITY-STATUS that is a record of condition of a specific MINEFIELD-MARITIME.
 * 
 * <p>Java class for MinefieldMaritimeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinefieldMaritimeStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractFacilityStatus">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MinefieldMaritimeStatusCode" minOccurs="0"/>
 *         &lt;element name="ColourCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MinefieldMaritimeStatusColourCode" minOccurs="0"/>
 *         &lt;element name="ExpectedLevelMcmCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MinefieldMaritimeStatusExpectedLevelMcmCode" minOccurs="0"/>
 *         &lt;element name="MinesDetectedQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType6" minOccurs="0"/>
 *         &lt;element name="MinesDetectedCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType6" minOccurs="0"/>
 *         &lt;element name="MineZoneRiskCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MinefieldMaritimeStatusMineZoneRiskCode" minOccurs="0"/>
 *         &lt;element name="SeedingCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MinefieldMaritimeStatusSeedingCode" minOccurs="0"/>
 *         &lt;element name="SweptDepthQuantity" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}QuantityType12_3" minOccurs="0"/>
 *         &lt;element name="ThreatRatio" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RatioType6_5" minOccurs="0"/>
 *         &lt;element name="MineDetectionCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MinefieldMaritimeStatusMineDetectionCode" minOccurs="0"/>
 *         &lt;element name="MinesCount" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CountType6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinefieldMaritimeStatus", propOrder = {
    "code",
    "colourCode",
    "expectedLevelMcmCode",
    "minesDetectedQuantity",
    "minesDetectedCount",
    "mineZoneRiskCode",
    "seedingCode",
    "sweptDepthQuantity",
    "threatRatio",
    "mineDetectionCode",
    "minesCount"
})
public class MinefieldMaritimeStatus
    extends AbstractFacilityStatus
{

    @XmlElement(name = "Code")
    protected MinefieldMaritimeStatusCode code;
    @XmlElement(name = "ColourCode")
    protected MinefieldMaritimeStatusColourCode colourCode;
    @XmlElement(name = "ExpectedLevelMcmCode")
    protected MinefieldMaritimeStatusExpectedLevelMcmCode expectedLevelMcmCode;
    @XmlElement(name = "MinesDetectedQuantity")
    protected Integer minesDetectedQuantity;
    @XmlElement(name = "MinesDetectedCount")
    protected Integer minesDetectedCount;
    @XmlElement(name = "MineZoneRiskCode")
    protected MinefieldMaritimeStatusMineZoneRiskCode mineZoneRiskCode;
    @XmlElement(name = "SeedingCode")
    protected MinefieldMaritimeStatusSeedingCode seedingCode;
    @XmlElement(name = "SweptDepthQuantity")
    protected BigDecimal sweptDepthQuantity;
    @XmlElement(name = "ThreatRatio")
    protected BigDecimal threatRatio;
    @XmlElement(name = "MineDetectionCode")
    protected MinefieldMaritimeStatusMineDetectionCode mineDetectionCode;
    @XmlElement(name = "MinesCount")
    protected Integer minesCount;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link MinefieldMaritimeStatusCode }
     *     
     */
    public MinefieldMaritimeStatusCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinefieldMaritimeStatusCode }
     *     
     */
    public void setCode(MinefieldMaritimeStatusCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the colourCode property.
     * 
     * @return
     *     possible object is
     *     {@link MinefieldMaritimeStatusColourCode }
     *     
     */
    public MinefieldMaritimeStatusColourCode getColourCode() {
        return colourCode;
    }

    /**
     * Sets the value of the colourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinefieldMaritimeStatusColourCode }
     *     
     */
    public void setColourCode(MinefieldMaritimeStatusColourCode value) {
        this.colourCode = value;
    }

    /**
     * Gets the value of the expectedLevelMcmCode property.
     * 
     * @return
     *     possible object is
     *     {@link MinefieldMaritimeStatusExpectedLevelMcmCode }
     *     
     */
    public MinefieldMaritimeStatusExpectedLevelMcmCode getExpectedLevelMcmCode() {
        return expectedLevelMcmCode;
    }

    /**
     * Sets the value of the expectedLevelMcmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinefieldMaritimeStatusExpectedLevelMcmCode }
     *     
     */
    public void setExpectedLevelMcmCode(MinefieldMaritimeStatusExpectedLevelMcmCode value) {
        this.expectedLevelMcmCode = value;
    }

    /**
     * Gets the value of the minesDetectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinesDetectedQuantity() {
        return minesDetectedQuantity;
    }

    /**
     * Sets the value of the minesDetectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinesDetectedQuantity(Integer value) {
        this.minesDetectedQuantity = value;
    }

    /**
     * Gets the value of the minesDetectedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinesDetectedCount() {
        return minesDetectedCount;
    }

    /**
     * Sets the value of the minesDetectedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinesDetectedCount(Integer value) {
        this.minesDetectedCount = value;
    }

    /**
     * Gets the value of the mineZoneRiskCode property.
     * 
     * @return
     *     possible object is
     *     {@link MinefieldMaritimeStatusMineZoneRiskCode }
     *     
     */
    public MinefieldMaritimeStatusMineZoneRiskCode getMineZoneRiskCode() {
        return mineZoneRiskCode;
    }

    /**
     * Sets the value of the mineZoneRiskCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinefieldMaritimeStatusMineZoneRiskCode }
     *     
     */
    public void setMineZoneRiskCode(MinefieldMaritimeStatusMineZoneRiskCode value) {
        this.mineZoneRiskCode = value;
    }

    /**
     * Gets the value of the seedingCode property.
     * 
     * @return
     *     possible object is
     *     {@link MinefieldMaritimeStatusSeedingCode }
     *     
     */
    public MinefieldMaritimeStatusSeedingCode getSeedingCode() {
        return seedingCode;
    }

    /**
     * Sets the value of the seedingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinefieldMaritimeStatusSeedingCode }
     *     
     */
    public void setSeedingCode(MinefieldMaritimeStatusSeedingCode value) {
        this.seedingCode = value;
    }

    /**
     * Gets the value of the sweptDepthQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSweptDepthQuantity() {
        return sweptDepthQuantity;
    }

    /**
     * Sets the value of the sweptDepthQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSweptDepthQuantity(BigDecimal value) {
        this.sweptDepthQuantity = value;
    }

    /**
     * Gets the value of the threatRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThreatRatio() {
        return threatRatio;
    }

    /**
     * Sets the value of the threatRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThreatRatio(BigDecimal value) {
        this.threatRatio = value;
    }

    /**
     * Gets the value of the mineDetectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link MinefieldMaritimeStatusMineDetectionCode }
     *     
     */
    public MinefieldMaritimeStatusMineDetectionCode getMineDetectionCode() {
        return mineDetectionCode;
    }

    /**
     * Sets the value of the mineDetectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinefieldMaritimeStatusMineDetectionCode }
     *     
     */
    public void setMineDetectionCode(MinefieldMaritimeStatusMineDetectionCode value) {
        this.mineDetectionCode = value;
    }

    /**
     * Gets the value of the minesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinesCount() {
        return minesCount;
    }

    /**
     * Sets the value of the minesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinesCount(Integer value) {
        this.minesCount = value;
    }

}
