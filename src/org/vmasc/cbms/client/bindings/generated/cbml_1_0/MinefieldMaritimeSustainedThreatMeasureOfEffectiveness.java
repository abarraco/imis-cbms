//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A measure of effectiveness for a specific MINEFIELD-MARITIME in terms of probability of mine function against a transit vessel over a given period of time.
 * 
 * <p>Java class for MinefieldMaritimeSustainedThreatMeasureOfEffectiveness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinefieldMaritimeSustainedThreatMeasureOfEffectiveness">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="PlannedDuration" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DurationType19" minOccurs="0"/>
 *         &lt;element name="ProbabilityRatio" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RatioType6_5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinefieldMaritimeSustainedThreatMeasureOfEffectiveness", propOrder = {
    "oid",
    "plannedDuration",
    "probabilityRatio"
})
public class MinefieldMaritimeSustainedThreatMeasureOfEffectiveness {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "PlannedDuration")
    protected BigInteger plannedDuration;
    @XmlElement(name = "ProbabilityRatio")
    protected BigDecimal probabilityRatio;

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
     * Gets the value of the plannedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlannedDuration() {
        return plannedDuration;
    }

    /**
     * Sets the value of the plannedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlannedDuration(BigInteger value) {
        this.plannedDuration = value;
    }

    /**
     * Gets the value of the probabilityRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProbabilityRatio() {
        return probabilityRatio;
    }

    /**
     * Sets the value of the probabilityRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProbabilityRatio(BigDecimal value) {
        this.probabilityRatio = value;
    }

}
