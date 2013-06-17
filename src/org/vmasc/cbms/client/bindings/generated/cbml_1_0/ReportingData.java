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
 * The specification of source and quality that applies to reported data.
 * 
 * <p>Java class for ReportingData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="AccuracyCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReportingDataAccuracyCode" minOccurs="0"/>
 *         &lt;element name="ReportingDataCategoryCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReportingDataCategoryCode"/>
 *         &lt;element name="CountingIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReportingDataCountingIndicatorCode" minOccurs="0"/>
 *         &lt;element name="CredibilityCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReportingDataCredibilityCode" minOccurs="0"/>
 *         &lt;element name="ReliabilityCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReportingDataReliabilityCode" minOccurs="0"/>
 *         &lt;element name="SourceTypeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReportingDataSourceTypeCode" minOccurs="0"/>
 *         &lt;element name="RealDataExerciseUseOnlyCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}ReportingDataRealDataExerciseUseOnlyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingData", propOrder = {
    "oid",
    "accuracyCode",
    "reportingDataCategoryCode",
    "countingIndicatorCode",
    "credibilityCode",
    "reliabilityCode",
    "sourceTypeCode",
    "realDataExerciseUseOnlyCode"
})
public class ReportingData {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "AccuracyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String accuracyCode;
    @XmlElement(name = "ReportingDataCategoryCode", required = true)
    protected ReportingDataCategoryCode reportingDataCategoryCode;
    @XmlElement(name = "CountingIndicatorCode")
    protected ReportingDataCountingIndicatorCode countingIndicatorCode;
    @XmlElement(name = "CredibilityCode")
    protected ReportingDataCredibilityCode credibilityCode;
    @XmlElement(name = "ReliabilityCode")
    protected ReportingDataReliabilityCode reliabilityCode;
    @XmlElement(name = "SourceTypeCode")
    protected ReportingDataSourceTypeCode sourceTypeCode;
    @XmlElement(name = "RealDataExerciseUseOnlyCode")
    protected ReportingDataRealDataExerciseUseOnlyCode realDataExerciseUseOnlyCode;

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
     * Gets the value of the accuracyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuracyCode() {
        return accuracyCode;
    }

    /**
     * Sets the value of the accuracyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuracyCode(String value) {
        this.accuracyCode = value;
    }

    /**
     * Gets the value of the reportingDataCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingDataCategoryCode }
     *     
     */
    public ReportingDataCategoryCode getReportingDataCategoryCode() {
        return reportingDataCategoryCode;
    }

    /**
     * Sets the value of the reportingDataCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingDataCategoryCode }
     *     
     */
    public void setReportingDataCategoryCode(ReportingDataCategoryCode value) {
        this.reportingDataCategoryCode = value;
    }

    /**
     * Gets the value of the countingIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingDataCountingIndicatorCode }
     *     
     */
    public ReportingDataCountingIndicatorCode getCountingIndicatorCode() {
        return countingIndicatorCode;
    }

    /**
     * Sets the value of the countingIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingDataCountingIndicatorCode }
     *     
     */
    public void setCountingIndicatorCode(ReportingDataCountingIndicatorCode value) {
        this.countingIndicatorCode = value;
    }

    /**
     * Gets the value of the credibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingDataCredibilityCode }
     *     
     */
    public ReportingDataCredibilityCode getCredibilityCode() {
        return credibilityCode;
    }

    /**
     * Sets the value of the credibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingDataCredibilityCode }
     *     
     */
    public void setCredibilityCode(ReportingDataCredibilityCode value) {
        this.credibilityCode = value;
    }

    /**
     * Gets the value of the reliabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingDataReliabilityCode }
     *     
     */
    public ReportingDataReliabilityCode getReliabilityCode() {
        return reliabilityCode;
    }

    /**
     * Sets the value of the reliabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingDataReliabilityCode }
     *     
     */
    public void setReliabilityCode(ReportingDataReliabilityCode value) {
        this.reliabilityCode = value;
    }

    /**
     * Gets the value of the sourceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingDataSourceTypeCode }
     *     
     */
    public ReportingDataSourceTypeCode getSourceTypeCode() {
        return sourceTypeCode;
    }

    /**
     * Sets the value of the sourceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingDataSourceTypeCode }
     *     
     */
    public void setSourceTypeCode(ReportingDataSourceTypeCode value) {
        this.sourceTypeCode = value;
    }

    /**
     * Gets the value of the realDataExerciseUseOnlyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingDataRealDataExerciseUseOnlyCode }
     *     
     */
    public ReportingDataRealDataExerciseUseOnlyCode getRealDataExerciseUseOnlyCode() {
        return realDataExerciseUseOnlyCode;
    }

    /**
     * Sets the value of the realDataExerciseUseOnlyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingDataRealDataExerciseUseOnlyCode }
     *     
     */
    public void setRealDataExerciseUseOnlyCode(ReportingDataRealDataExerciseUseOnlyCode value) {
        this.realDataExerciseUseOnlyCode = value;
    }

}