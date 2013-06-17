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
 * <p>Java class for ActionTaskEndTimeQualifierCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionTaskEndTimeQualifierCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AFT"/>
 *     &lt;enumeration value="ASAPAF"/>
 *     &lt;enumeration value="ASAPNL"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="BEF"/>
 *     &lt;enumeration value="NLT"/>
 *     &lt;enumeration value="NOB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionTaskEndTimeQualifierCode")
@XmlEnum
public enum ActionTaskEndTimeQualifierCode {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;Time intended is later than the time specified.&lt;/Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AFT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;End the activity at the earliest possible time after the specified end time.&lt;/Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ASAPAF,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;End the activity at the earliest possible time but not later than the specified end time.&lt;/Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ASAPNL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;Time intended is the time specified.&lt;/Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;Time intended is in advance of the time specified.&lt;/Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    BEF,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;Time specified is the latest.&lt;/Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    NLT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xmlns:xs="http://www.w3.org/2001/XMLSchema" xml:lang="en"&gt;Time specified is the earliest.&lt;/Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    NOB;

    public String value() {
        return name();
    }

    public static ActionTaskEndTimeQualifierCode fromValue(String v) {
        return valueOf(v);
    }

}
