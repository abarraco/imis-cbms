//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A list of selected battlespace objects or types that have potential value for destruction or exploitation, nominated by competent authority for consideration in planning battlespace activities.
 * 
 * <p>Java class for CandidateTargetList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CandidateTargetList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OID" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}OIDType"/>
 *         &lt;element name="NameText" type="{urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2}TextTypeVar80" minOccurs="0"/>
 *         &lt;element name="CandidateTargetDetail" type="{http://www.sisostds.org/schemas/c-bml/1.0}AbstractCandidateTargetDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CandidateTargetList", propOrder = {
    "oid",
    "nameText",
    "candidateTargetDetail"
})
public class CandidateTargetList {

    @XmlElement(name = "OID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String oid;
    @XmlElement(name = "NameText")
    protected String nameText;
    @XmlElement(name = "CandidateTargetDetail")
    protected List<AbstractCandidateTargetDetail> candidateTargetDetail;

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

    /**
     * Gets the value of the candidateTargetDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidateTargetDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidateTargetDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCandidateTargetDetail }
     * 
     * 
     */
    public List<AbstractCandidateTargetDetail> getCandidateTargetDetail() {
        if (candidateTargetDetail == null) {
            candidateTargetDetail = new ArrayList<AbstractCandidateTargetDetail>();
        }
        return this.candidateTargetDetail;
    }

}
