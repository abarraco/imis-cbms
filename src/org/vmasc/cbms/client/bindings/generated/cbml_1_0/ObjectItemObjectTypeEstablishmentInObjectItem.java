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
 * A ObjectItem/ObjectTypeEstablishment association. ObjectTypeEstablishment is the child in a 'is-assigned-establishment-through' relationship; ObjectItemObjectTypeEstablishment provides additional information on the association.
 * 
 * <p>Java class for ObjectItemObjectTypeEstablishmentInObjectItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectItemObjectTypeEstablishmentInObjectItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ObjectTypeEstablishment" type="{http://www.sisostds.org/schemas/c-bml/1.0}ObjectTypeEstablishment"/>
 *           &lt;element name="ObjectTypeEstablishmentRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}ObjectTypeEstablishmentRef"/>
 *         &lt;/choice>
 *         &lt;element name="ObjectItemObjectTypeEstablishment" type="{http://www.sisostds.org/schemas/c-bml/1.0}ObjectItemObjectTypeEstablishment"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectItemObjectTypeEstablishmentInObjectItem", propOrder = {
    "objectTypeEstablishment",
    "objectTypeEstablishmentRef",
    "objectItemObjectTypeEstablishment"
})
public class ObjectItemObjectTypeEstablishmentInObjectItem {

    @XmlElement(name = "ObjectTypeEstablishment")
    protected ObjectTypeEstablishment objectTypeEstablishment;
    @XmlElement(name = "ObjectTypeEstablishmentRef")
    protected ObjectTypeEstablishmentRef objectTypeEstablishmentRef;
    @XmlElement(name = "ObjectItemObjectTypeEstablishment", required = true)
    protected ObjectItemObjectTypeEstablishment objectItemObjectTypeEstablishment;

    /**
     * Gets the value of the objectTypeEstablishment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectTypeEstablishment }
     *     
     */
    public ObjectTypeEstablishment getObjectTypeEstablishment() {
        return objectTypeEstablishment;
    }

    /**
     * Sets the value of the objectTypeEstablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectTypeEstablishment }
     *     
     */
    public void setObjectTypeEstablishment(ObjectTypeEstablishment value) {
        this.objectTypeEstablishment = value;
    }

    /**
     * Gets the value of the objectTypeEstablishmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectTypeEstablishmentRef }
     *     
     */
    public ObjectTypeEstablishmentRef getObjectTypeEstablishmentRef() {
        return objectTypeEstablishmentRef;
    }

    /**
     * Sets the value of the objectTypeEstablishmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectTypeEstablishmentRef }
     *     
     */
    public void setObjectTypeEstablishmentRef(ObjectTypeEstablishmentRef value) {
        this.objectTypeEstablishmentRef = value;
    }

    /**
     * Gets the value of the objectItemObjectTypeEstablishment property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectItemObjectTypeEstablishment }
     *     
     */
    public ObjectItemObjectTypeEstablishment getObjectItemObjectTypeEstablishment() {
        return objectItemObjectTypeEstablishment;
    }

    /**
     * Sets the value of the objectItemObjectTypeEstablishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectItemObjectTypeEstablishment }
     *     
     */
    public void setObjectItemObjectTypeEstablishment(ObjectItemObjectTypeEstablishment value) {
        this.objectItemObjectTypeEstablishment = value;
    }

}
