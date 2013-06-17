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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An element of CANDIDATE-TARGET-LIST. Concrete types are: {CandidateTargetDetailItem, CandidateTargetDetailType}
 * 
 * <p>Java class for AbstractCandidateTargetDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractCandidateTargetDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="FocusTypeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CandidateTargetDetailFocusTypeCode"/>
 *         &lt;element name="LabelText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar255" minOccurs="0"/>
 *         &lt;element name="PriorityOrdinal" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OrdinalType6" minOccurs="0"/>
 *         &lt;element name="SchemeCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}CandidateTargetDetailSchemeCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCandidateTargetDetail", propOrder = {
    "oid",
    "focusTypeCode",
    "labelText",
    "priorityOrdinal",
    "schemeCode"
})
@XmlSeeAlso({
    CandidateTargetDetailItem.class,
    CandidateTargetDetailType.class
})
public abstract class AbstractCandidateTargetDetail {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "FocusTypeCode", required = true)
    protected CandidateTargetDetailFocusTypeCode focusTypeCode;
    @XmlElement(name = "LabelText")
    protected String labelText;
    @XmlElement(name = "PriorityOrdinal")
    protected Integer priorityOrdinal;
    @XmlElement(name = "SchemeCode")
    protected CandidateTargetDetailSchemeCode schemeCode;

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
     * Gets the value of the focusTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateTargetDetailFocusTypeCode }
     *     
     */
    public CandidateTargetDetailFocusTypeCode getFocusTypeCode() {
        return focusTypeCode;
    }

    /**
     * Sets the value of the focusTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateTargetDetailFocusTypeCode }
     *     
     */
    public void setFocusTypeCode(CandidateTargetDetailFocusTypeCode value) {
        this.focusTypeCode = value;
    }

    /**
     * Gets the value of the labelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     * Sets the value of the labelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelText(String value) {
        this.labelText = value;
    }

    /**
     * Gets the value of the priorityOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriorityOrdinal() {
        return priorityOrdinal;
    }

    /**
     * Sets the value of the priorityOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriorityOrdinal(Integer value) {
        this.priorityOrdinal = value;
    }

    /**
     * Gets the value of the schemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateTargetDetailSchemeCode }
     *     
     */
    public CandidateTargetDetailSchemeCode getSchemeCode() {
        return schemeCode;
    }

    /**
     * Sets the value of the schemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateTargetDetailSchemeCode }
     *     
     */
    public void setSchemeCode(CandidateTargetDetailSchemeCode value) {
        this.schemeCode = value;
    }

}