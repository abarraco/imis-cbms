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
 * <p>Java class for ActionEventDetailClassificationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionEventDetailClassificationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DISAST"/>
 *     &lt;enumeration value="ECONMC"/>
 *     &lt;enumeration value="ENVIRN"/>
 *     &lt;enumeration value="ETHNIC"/>
 *     &lt;enumeration value="HSTRCL"/>
 *     &lt;enumeration value="LABOUR"/>
 *     &lt;enumeration value="MILTRY"/>
 *     &lt;enumeration value="POLTCL"/>
 *     &lt;enumeration value="RELIGS"/>
 *     &lt;enumeration value="SOCIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionEventDetailClassificationCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ActionEventDetailClassificationCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as resulting in a great or sudden misfortune.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DISAST,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within an economic area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ECONMC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT that is related to ecological or environmental conditions.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ENVIRN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within an ethnic area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ETHNIC,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within an historical area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HSTRCL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within a labour area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LABOUR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within a military area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MILTRY,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within a political area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    POLTCL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within a religious area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RELIGS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-EVENT can be characterised as occurring within a social area of activity.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SOCIAL;

    public String value() {
        return name();
    }

    public static ActionEventDetailClassificationCode fromValue(String v) {
        return valueOf(v);
    }

}
