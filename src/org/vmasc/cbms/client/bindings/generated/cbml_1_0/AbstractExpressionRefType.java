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
 *  A reference to some AbstractExpressionType - Specifies a C-BML Expression. Concrete types are: {OrderRefType, RequestRefType, ReportRefType}
 * 
 * <p>Java class for AbstractExpressionRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractExpressionRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContextRef" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractContextRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractExpressionRefType", propOrder = {
    "contextRef"
})
@XmlSeeAlso({
    RequestRefType.class,
    ReportRefType.class,
    OrderRefType.class
})
public class AbstractExpressionRefType {

    @XmlElement(name = "ContextRef", required = true)
    protected AbstractContextRef contextRef;

    /**
     * Gets the value of the contextRef property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractContextRef }
     *     
     */
    public AbstractContextRef getContextRef() {
        return contextRef;
    }

    /**
     * Sets the value of the contextRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractContextRef }
     *     
     */
    public void setContextRef(AbstractContextRef value) {
        this.contextRef = value;
    }

}
