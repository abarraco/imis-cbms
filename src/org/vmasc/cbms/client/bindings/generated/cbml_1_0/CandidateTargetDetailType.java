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
 * An instance of CANDIDATE-TARGET-DETAIL that is an OBJECT-TYPE.
 * 
 * <p>Java class for CandidateTargetDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CandidateTargetDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractCandidateTargetDetail">
 *       &lt;sequence>
 *         &lt;element name="ObjectTypeRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractObjectTypeRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateTargetDetailType", propOrder = {
    "objectTypeRef"
})
public class CandidateTargetDetailType
    extends AbstractCandidateTargetDetail
{

    @XmlElement(name = "ObjectTypeRef", required = true)
    protected AbstractObjectTypeRef objectTypeRef;

    /**
     * Gets the value of the objectTypeRef property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractObjectTypeRef }
     *     
     */
    public AbstractObjectTypeRef getObjectTypeRef() {
        return objectTypeRef;
    }

    /**
     * Sets the value of the objectTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractObjectTypeRef }
     *     
     */
    public void setObjectTypeRef(AbstractObjectTypeRef value) {
        this.objectTypeRef = value;
    }

}
