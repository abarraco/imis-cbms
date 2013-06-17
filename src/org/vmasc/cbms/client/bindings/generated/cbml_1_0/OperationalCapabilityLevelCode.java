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
 * <p>Java class for OperationalCapabilityLevelCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationalCapabilityLevelCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CORPS"/>
 *     &lt;enumeration value="DIV"/>
 *     &lt;enumeration value="FORCE"/>
 *     &lt;enumeration value="OPR"/>
 *     &lt;enumeration value="STRTGC"/>
 *     &lt;enumeration value="TACTCL"/>
 *     &lt;enumeration value="THTRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationalCapabilityLevelCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum OperationalCapabilityLevelCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific mission can be performed at Corps level of command.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CORPS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific mission can be performed at Division level of command.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DIV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific mission can be performed at Force level of command.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    FORCE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific mission can be performed at Operational level of command.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    OPR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific mission can be performed at Strategic level of command.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STRTGC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific mission can be performed at Tactical level of command.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TACTCL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific mission can be performed at Theatre level of command.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    THTRE;

    public String value() {
        return name();
    }

    public static OperationalCapabilityLevelCode fromValue(String v) {
        return valueOf(v);
    }

}
