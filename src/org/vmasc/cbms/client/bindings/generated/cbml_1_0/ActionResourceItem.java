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
 * An OBJECT-ITEM (FACILITY, FEATURE, MATERIEL, ORGANISATION, or PERSON) to be used, excluded from use, being used, or having been used, in conducting a specific ACTION.
 * 
 * <p>Java class for ActionResourceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionResourceItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractActionResource">
 *       &lt;sequence>
 *         &lt;element name="ObjectItemRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractObjectItemRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionResourceItem", propOrder = {
    "objectItemRef"
})
public class ActionResourceItem
    extends AbstractActionResource
{

    @XmlElement(name = "ObjectItemRef", required = true)
    protected AbstractObjectItemRef objectItemRef;

    /**
     * Gets the value of the objectItemRef property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractObjectItemRef }
     *     
     */
    public AbstractObjectItemRef getObjectItemRef() {
        return objectItemRef;
    }

    /**
     * Sets the value of the objectItemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractObjectItemRef }
     *     
     */
    public void setObjectItemRef(AbstractObjectItemRef value) {
        this.objectItemRef = value;
    }

}
