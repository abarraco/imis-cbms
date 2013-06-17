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
 * <p>Java class for ObjectTypeReferenceAssociationCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectTypeReferenceAssociationCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="HASCAP"/>
 *     &lt;enumeration value="HASTNG"/>
 *     &lt;enumeration value="ISDSCR"/>
 *     &lt;enumeration value="ISMNTN"/>
 *     &lt;enumeration value="ISPRCR"/>
 *     &lt;enumeration value="ISRFNC"/>
 *     &lt;enumeration value="ISSPCF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectTypeReferenceAssociationCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ObjectTypeReferenceAssociationCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-TYPE is competent to perform according to provisions in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HASCAP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The training for a specific OBJECT-TYPE is aided by the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HASTNG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-TYPE is depicted in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The maintenance of the specific OBJECT-TYPE is performed according to the provisions in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISMNTN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-TYPE is acquired according to provisions in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISPRCR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-TYPE is alluded to in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific OBJECT-TYPE is specified by the provisions in the artefact cited in the specific REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISSPCF;

    public String value() {
        return name();
    }

    public static ObjectTypeReferenceAssociationCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}