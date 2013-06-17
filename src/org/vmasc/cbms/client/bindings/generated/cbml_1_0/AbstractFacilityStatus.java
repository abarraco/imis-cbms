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
 * An OBJECT-ITEM-STATUS that is a record of condition of a specific FACILITY. Concrete types are:
 * {AirfieldStatus, MedicalFacilityStatus, MinefieldMaritimeStatus, OtherFacilityStatus}
 * 
 * <p>Java class for AbstractFacilityStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractFacilityStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractObjectItemStatus">
 *       &lt;sequence>
 *         &lt;element name="DemolitionStatusCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DemolitionStatusCode" minOccurs="0"/>
 *         &lt;element name="EnemyActivityConditionCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}FacilityStatusEnemyActivityConditionCode" minOccurs="0"/>
 *         &lt;element name="MinePresenceCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}MinePresenceCode" minOccurs="0"/>
 *         &lt;element name="OccupationProgramIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}FacilityStatusOccupationProgramIndicatorCode" minOccurs="0"/>
 *         &lt;element name="OperationalStatusCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}FacilityStatusOperationalStatusCode"/>
 *         &lt;element name="OperationalStatusQualifierCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}FacilityStatusOperationalStatusQualifierCode" minOccurs="0"/>
 *         &lt;element name="ReserveIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}FacilityStatusReserveIndicatorCode" minOccurs="0"/>
 *         &lt;element name="SecurityStatusCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}FacilityStatusSecurityStatusCode" minOccurs="0"/>
 *         &lt;element name="UsageStatusCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}UsageStatusCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFacilityStatus", propOrder = {
    "demolitionStatusCode",
    "enemyActivityConditionCode",
    "minePresenceCode",
    "occupationProgramIndicatorCode",
    "operationalStatusCode",
    "operationalStatusQualifierCode",
    "reserveIndicatorCode",
    "securityStatusCode",
    "usageStatusCode"
})
@XmlSeeAlso({
    AirfieldStatus.class,
    OtherFacilityStatus.class,
    MinefieldMaritimeStatus.class,
    MedicalFacilityStatus.class
})
public abstract class AbstractFacilityStatus
    extends AbstractObjectItemStatus
{

    @XmlElement(name = "DemolitionStatusCode")
    protected DemolitionStatusCode demolitionStatusCode;
    @XmlElement(name = "EnemyActivityConditionCode")
    protected FacilityStatusEnemyActivityConditionCode enemyActivityConditionCode;
    @XmlElement(name = "MinePresenceCode")
    protected MinePresenceCode minePresenceCode;
    @XmlElement(name = "OccupationProgramIndicatorCode")
    protected FacilityStatusOccupationProgramIndicatorCode occupationProgramIndicatorCode;
    @XmlElement(name = "OperationalStatusCode", required = true)
    protected FacilityStatusOperationalStatusCode operationalStatusCode;
    @XmlElement(name = "OperationalStatusQualifierCode")
    protected FacilityStatusOperationalStatusQualifierCode operationalStatusQualifierCode;
    @XmlElement(name = "ReserveIndicatorCode")
    protected FacilityStatusReserveIndicatorCode reserveIndicatorCode;
    @XmlElement(name = "SecurityStatusCode")
    protected FacilityStatusSecurityStatusCode securityStatusCode;
    @XmlElement(name = "UsageStatusCode")
    protected UsageStatusCode usageStatusCode;

    /**
     * Gets the value of the demolitionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DemolitionStatusCode }
     *     
     */
    public DemolitionStatusCode getDemolitionStatusCode() {
        return demolitionStatusCode;
    }

    /**
     * Sets the value of the demolitionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemolitionStatusCode }
     *     
     */
    public void setDemolitionStatusCode(DemolitionStatusCode value) {
        this.demolitionStatusCode = value;
    }

    /**
     * Gets the value of the enemyActivityConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusEnemyActivityConditionCode }
     *     
     */
    public FacilityStatusEnemyActivityConditionCode getEnemyActivityConditionCode() {
        return enemyActivityConditionCode;
    }

    /**
     * Sets the value of the enemyActivityConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusEnemyActivityConditionCode }
     *     
     */
    public void setEnemyActivityConditionCode(FacilityStatusEnemyActivityConditionCode value) {
        this.enemyActivityConditionCode = value;
    }

    /**
     * Gets the value of the minePresenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link MinePresenceCode }
     *     
     */
    public MinePresenceCode getMinePresenceCode() {
        return minePresenceCode;
    }

    /**
     * Sets the value of the minePresenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinePresenceCode }
     *     
     */
    public void setMinePresenceCode(MinePresenceCode value) {
        this.minePresenceCode = value;
    }

    /**
     * Gets the value of the occupationProgramIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusOccupationProgramIndicatorCode }
     *     
     */
    public FacilityStatusOccupationProgramIndicatorCode getOccupationProgramIndicatorCode() {
        return occupationProgramIndicatorCode;
    }

    /**
     * Sets the value of the occupationProgramIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusOccupationProgramIndicatorCode }
     *     
     */
    public void setOccupationProgramIndicatorCode(FacilityStatusOccupationProgramIndicatorCode value) {
        this.occupationProgramIndicatorCode = value;
    }

    /**
     * Gets the value of the operationalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusOperationalStatusCode }
     *     
     */
    public FacilityStatusOperationalStatusCode getOperationalStatusCode() {
        return operationalStatusCode;
    }

    /**
     * Sets the value of the operationalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusOperationalStatusCode }
     *     
     */
    public void setOperationalStatusCode(FacilityStatusOperationalStatusCode value) {
        this.operationalStatusCode = value;
    }

    /**
     * Gets the value of the operationalStatusQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusOperationalStatusQualifierCode }
     *     
     */
    public FacilityStatusOperationalStatusQualifierCode getOperationalStatusQualifierCode() {
        return operationalStatusQualifierCode;
    }

    /**
     * Sets the value of the operationalStatusQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusOperationalStatusQualifierCode }
     *     
     */
    public void setOperationalStatusQualifierCode(FacilityStatusOperationalStatusQualifierCode value) {
        this.operationalStatusQualifierCode = value;
    }

    /**
     * Gets the value of the reserveIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusReserveIndicatorCode }
     *     
     */
    public FacilityStatusReserveIndicatorCode getReserveIndicatorCode() {
        return reserveIndicatorCode;
    }

    /**
     * Sets the value of the reserveIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusReserveIndicatorCode }
     *     
     */
    public void setReserveIndicatorCode(FacilityStatusReserveIndicatorCode value) {
        this.reserveIndicatorCode = value;
    }

    /**
     * Gets the value of the securityStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStatusSecurityStatusCode }
     *     
     */
    public FacilityStatusSecurityStatusCode getSecurityStatusCode() {
        return securityStatusCode;
    }

    /**
     * Sets the value of the securityStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStatusSecurityStatusCode }
     *     
     */
    public void setSecurityStatusCode(FacilityStatusSecurityStatusCode value) {
        this.securityStatusCode = value;
    }

    /**
     * Gets the value of the usageStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link UsageStatusCode }
     *     
     */
    public UsageStatusCode getUsageStatusCode() {
        return usageStatusCode;
    }

    /**
     * Sets the value of the usageStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageStatusCode }
     *     
     */
    public void setUsageStatusCode(UsageStatusCode value) {
        this.usageStatusCode = value;
    }

}