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
 * <p>Java class for UnitTypeQualifierCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnitTypeQualifierCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CORPS"/>
 *     &lt;enumeration value="DIV"/>
 *     &lt;enumeration value="FORCE"/>
 *     &lt;enumeration value="HEAVY"/>
 *     &lt;enumeration value="HMAD"/>
 *     &lt;enumeration value="LIGHT"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="STRTGC"/>
 *     &lt;enumeration value="TACTCL"/>
 *     &lt;enumeration value="THTRE"/>
 *     &lt;enumeration value="TMD"/>
 *     &lt;enumeration value="VSR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnitTypeQualifierCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum UnitTypeQualifierCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE supports a force of Corps level.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE operates at Division level.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE operates at Force level.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HEAVY,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE major equipment is able to intercept threats flying at high or medium altitude.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HMAD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LIGHT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    LR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MEDIUM,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE operates at a strategic level of command.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE operates at a tactical level of command.&lt;/Definition&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specified UNIT-TYPE supports a force at Theatre level.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    THTRE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TMD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;No definition provided in APP-6A.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    VSR;

    public String value() {
        return name();
    }

    public static UnitTypeQualifierCode fromValue(String v) {
        return valueOf(v);
    }

}