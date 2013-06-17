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
 * Specifies a report describing the affiliation of an entity.
 * 
 * <p>Java class for WhoAffiliationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WhoAffiliationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractReportType">
 *       &lt;sequence>
 *         &lt;element name="WhoRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}WhoRefType"/>
 *         &lt;choice>
 *           &lt;element name="Affiliation" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractAffiliation"/>
 *           &lt;element name="AffiliationRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractAffiliationRef"/>
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
@XmlType(name = "WhoAffiliationType", propOrder = {
    "whoRef",
    "affiliation",
    "affiliationRef"
})
public class WhoAffiliationType
    extends AbstractReportType
{

    @XmlElement(name = "WhoRef", required = true)
    protected WhoRefType whoRef;
    @XmlElement(name = "Affiliation")
    protected AbstractAffiliation affiliation;
    @XmlElement(name = "AffiliationRef")
    protected AbstractAffiliationRef affiliationRef;

    /**
     * Gets the value of the whoRef property.
     * 
     * @return
     *     possible object is
     *     {@link WhoRefType }
     *     
     */
    public WhoRefType getWhoRef() {
        return whoRef;
    }

    /**
     * Sets the value of the whoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhoRefType }
     *     
     */
    public void setWhoRef(WhoRefType value) {
        this.whoRef = value;
    }

    /**
     * Gets the value of the affiliation property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractAffiliation }
     *     
     */
    public AbstractAffiliation getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the value of the affiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractAffiliation }
     *     
     */
    public void setAffiliation(AbstractAffiliation value) {
        this.affiliation = value;
    }

    /**
     * Gets the value of the affiliationRef property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractAffiliationRef }
     *     
     */
    public AbstractAffiliationRef getAffiliationRef() {
        return affiliationRef;
    }

    /**
     * Sets the value of the affiliationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractAffiliationRef }
     *     
     */
    public void setAffiliationRef(AbstractAffiliationRef value) {
        this.affiliationRef = value;
    }

}
