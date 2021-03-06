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
 * <p>Java class for ActionObjectiveQualifierCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionObjectiveQualifierCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AUTH"/>
 *     &lt;enumeration value="DONTAT"/>
 *     &lt;enumeration value="NEEL"/>
 *     &lt;enumeration value="NENL"/>
 *     &lt;enumeration value="NESL"/>
 *     &lt;enumeration value="NEWL"/>
 *     &lt;enumeration value="NOTA"/>
 *     &lt;enumeration value="STAYAB"/>
 *     &lt;enumeration value="STAYBL"/>
 *     &lt;enumeration value="STAYIN"/>
 *     &lt;enumeration value="STAYOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionObjectiveQualifierCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ActionObjectiveQualifierCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The ACTION-OBJECTIVE is authorised without restriction.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AUTH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE (e.g. hospitals or friendly forces) must not be attacked.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DONTAT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no exploitation east of it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NEEL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no exploitation north of it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NENL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no exploitation south of it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NESL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no exploitation west of it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NEWL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is not authorised.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NOTA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no movement below or within it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STAYAB,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no movement above or within it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STAYBL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no movement outside it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STAYIN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION-OBJECTIVE is authorised with the restriction that there is to be no movement inside it.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    STAYOT;

    public String value() {
        return name();
    }

    public static ActionObjectiveQualifierCode fromValue(String v) {
        return valueOf(v);
    }

}
