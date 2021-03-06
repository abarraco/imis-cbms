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


/**
 * An ACTION-TASK that states a requirement.
 * 
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractActionTask">
 *       &lt;sequence>
 *         &lt;element name="CategoryCode" type="{http://www.sisostds.org/schemas/c-bml/1.0}RequestCategoryCode"/>
 *         &lt;element name="ImmediateInterestIndicatorCode" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}RequestImmediateInterestIndicatorCode" minOccurs="0"/>
 *         &lt;element name="LatestAnswerDatetime" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}DatetimeTypeFix18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "categoryCode",
    "immediateInterestIndicatorCode",
    "latestAnswerDatetime"
})
public class Request
    extends AbstractActionTask
{

    @XmlElement(name = "CategoryCode", required = true)
    protected RequestCategoryCode categoryCode;
    @XmlElement(name = "ImmediateInterestIndicatorCode")
    protected RequestImmediateInterestIndicatorCode immediateInterestIndicatorCode;
    @XmlElement(name = "LatestAnswerDatetime")
    protected String latestAnswerDatetime;

    /**
     * Gets the value of the categoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestCategoryCode }
     *     
     */
    public RequestCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Sets the value of the categoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestCategoryCode }
     *     
     */
    public void setCategoryCode(RequestCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Gets the value of the immediateInterestIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestImmediateInterestIndicatorCode }
     *     
     */
    public RequestImmediateInterestIndicatorCode getImmediateInterestIndicatorCode() {
        return immediateInterestIndicatorCode;
    }

    /**
     * Sets the value of the immediateInterestIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestImmediateInterestIndicatorCode }
     *     
     */
    public void setImmediateInterestIndicatorCode(RequestImmediateInterestIndicatorCode value) {
        this.immediateInterestIndicatorCode = value;
    }

    /**
     * Gets the value of the latestAnswerDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestAnswerDatetime() {
        return latestAnswerDatetime;
    }

    /**
     * Sets the value of the latestAnswerDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestAnswerDatetime(String value) {
        this.latestAnswerDatetime = value;
    }

}
