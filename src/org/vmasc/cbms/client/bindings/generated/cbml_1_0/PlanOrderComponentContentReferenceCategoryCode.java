//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanOrderComponentContentReferenceCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanOrderComponentContentReferenceCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HASINS"/>
 *     &lt;enumeration value="ISAMPL"/>
 *     &lt;enumeration value="ISDISS"/>
 *     &lt;enumeration value="ISPROV"/>
 *     &lt;enumeration value="ISRCRD"/>
 *     &lt;enumeration value="ISSPCM"/>
 *     &lt;enumeration value="ISSPPM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlanOrderComponentContentReferenceCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum PlanOrderComponentContentReferenceCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific artefact is subject to guidance provided in the artefact cited by the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HASINS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific artefact is subject to additional detail provided in the artefact cited by the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISAMPL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The relationship of the specific PLAN-ORDER-CONTENT with the specific REFERENCE is deleted.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISDISS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific artefact is subject to relevant background information in the artefact cited by the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISPROV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific artefact is physically stored in the artefact cited by the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISRCRD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific artefact references geographic mapping products in the artefact cited by the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISSPCM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific artefact references relevant pictorial material in the artefact cited by the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISSPPM;

    public String value() {
        return name();
    }

    public static PlanOrderComponentContentReferenceCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
