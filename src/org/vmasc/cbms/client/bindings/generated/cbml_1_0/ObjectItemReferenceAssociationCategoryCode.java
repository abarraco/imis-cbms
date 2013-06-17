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
 * <p>Java class for ObjectItemReferenceAssociationCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectItemReferenceAssociationCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HASINS"/>
 *     &lt;enumeration value="ISACTV"/>
 *     &lt;enumeration value="ISAUTH"/>
 *     &lt;enumeration value="ISDEAC"/>
 *     &lt;enumeration value="ISDSCR"/>
 *     &lt;enumeration value="ISGRPH"/>
 *     &lt;enumeration value="ISRFNC"/>
 *     &lt;enumeration value="ISRPTD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectItemReferenceAssociationCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ObjectItemReferenceAssociationCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-ITEM is provided guidance in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The operational status of the specific OBJECT-ITEM is made active by provisions in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISACTV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-ITEM is sanctioned by the provisions in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISAUTH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The operational status of the specific OBJECT-ITEM is made inactive by provisions in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISDEAC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-ITEM is depicted in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISDSCR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-ITEM is pictorially described in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISGRPH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-ITEM is alluded to in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISRFNC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-ITEM is given a formal account in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISRPTD;

    public String value() {
        return name();
    }

    public static ObjectItemReferenceAssociationCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
