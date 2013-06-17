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
 * <p>Java class for ObjectTypeEstablishmentOperationalModeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectTypeEstablishmentOperationalModeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PSO"/>
 *     &lt;enumeration value="WA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectTypeEstablishmentOperationalModeCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum ObjectTypeEstablishmentOperationalModeCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An indication that the specified OBJECT-TYPE-ESTABLISHMENT is designated for civil support operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An indication that the specified OBJECT-TYPE-ESTABLISHMENT is designated for humanitarian support operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HU,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An indication that the specified OBJECT-TYPE-ESTABLISHMENT is designated for internal security operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    IS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An indication that the specified OBJECT-TYPE-ESTABLISHMENT is designated for conditions of peace.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An indication that the specified OBJECT-TYPE-ESTABLISHMENT is designated for peace keeping operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PK,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An indication that the specified OBJECT-TYPE-ESTABLISHMENT is designated for peace support operations.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PSO,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An indication that the specified OBJECT-TYPE-ESTABLISHMENT is designated for war.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WA;

    public String value() {
        return name();
    }

    public static ObjectTypeEstablishmentOperationalModeCode fromValue(String v) {
        return valueOf(v);
    }

}