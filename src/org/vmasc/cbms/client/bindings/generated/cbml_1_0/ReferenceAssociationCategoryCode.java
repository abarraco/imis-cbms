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
 * <p>Java class for ReferenceAssociationCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceAssociationCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="GRPHDP"/>
 *     &lt;enumeration value="INCLDE"/>
 *     &lt;enumeration value="ISAMND"/>
 *     &lt;enumeration value="ISATTC"/>
 *     &lt;enumeration value="ISDRVD"/>
 *     &lt;enumeration value="ISMODF"/>
 *     &lt;enumeration value="PRVATH"/>
 *     &lt;enumeration value="REFRNC"/>
 *     &lt;enumeration value="SUPLMN"/>
 *     &lt;enumeration value="SUPRCD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReferenceAssociationCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ReferenceAssociationCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE cancels the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CANCEL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE graphically depicts the information in the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    GRPHDP,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE includes the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    INCLDE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE is an amendment to the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISAMND,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE is an attachment to the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISATTC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE is derived from the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISDRVD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE is a modification of the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISMODF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The stipulations of the artefact in the subject REFERENCE provide authority for the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PRVATH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE references the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    REFRNC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE supplements the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SUPLMN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The artefact in the subject REFERENCE supersedes the artefact in the object REFERENCE.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SUPRCD;

    public String value() {
        return name();
    }

    public static ReferenceAssociationCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
