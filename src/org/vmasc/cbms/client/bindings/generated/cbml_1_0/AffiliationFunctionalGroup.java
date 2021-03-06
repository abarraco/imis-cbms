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
 * A specification of a functional group characterised by its primary purpose to which membership or allegiance may be ascribed.
 * 
 * <p>Java class for AffiliationFunctionalGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliationFunctionalGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractAffiliation">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}AffiliationFunctionalGroupCode"/>
 *         &lt;element name="NameText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar50"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliationFunctionalGroup", propOrder = {
    "code",
    "nameText"
})
public class AffiliationFunctionalGroup
    extends AbstractAffiliation
{

    @XmlElement(name = "Code", required = true)
    protected AffiliationFunctionalGroupCode code;
    @XmlElement(name = "NameText", required = true)
    protected String nameText;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link AffiliationFunctionalGroupCode }
     *     
     */
    public AffiliationFunctionalGroupCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationFunctionalGroupCode }
     *     
     */
    public void setCode(AffiliationFunctionalGroupCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the nameText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameText() {
        return nameText;
    }

    /**
     * Sets the value of the nameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameText(String value) {
        this.nameText = value;
    }

}
