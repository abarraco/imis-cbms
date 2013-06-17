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
 * <p>Java class for ActionContextCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionContextCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DES"/>
 *     &lt;enumeration value="FINACT"/>
 *     &lt;enumeration value="FINPLA"/>
 *     &lt;enumeration value="INIACT"/>
 *     &lt;enumeration value="INIPLA"/>
 *     &lt;enumeration value="INTACT"/>
 *     &lt;enumeration value="INTPLA"/>
 *     &lt;enumeration value="ISINCL"/>
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="MIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionContextCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ActionContextCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An expected positive consequence of a specific CONTEXT in relation to a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DES,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An actual specific CONTEXT as it exists at the end of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    FINACT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A planned specific CONTEXT that may exist at the end of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    FINPLA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An actual specific CONTEXT as it exists at the start of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    INIACT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A planned specific CONTEXT that may exist at the start of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    INIPLA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An actual specific CONTEXT as it exists at an intermediate point during the execution of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    INTACT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A planned specific CONTEXT that may exist at an intermediate point during the execution of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    INTPLA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The specific ACTION is encompassed within the information content of a specific CONTEXT.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ISINCL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The maximum value referred to by a specific CONTEXT that is necessary for the evolution of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MAX,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The minimum value referred to by a specific CONTEXT that is necessary for the evolution of a specific ACTION.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MIN;

    public String value() {
        return name();
    }

    public static ActionContextCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
