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
 * <p>Java class for RequestCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RequestCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ACTION"/>
 *     &lt;enumeration value="ASSOC"/>
 *     &lt;enumeration value="HOLDNG"/>
 *     &lt;enumeration value="HOSTIL"/>
 *     &lt;enumeration value="LOCATN"/>
 *     &lt;enumeration value="PRESNC"/>
 *     &lt;enumeration value="STATUS"/>
 *     &lt;enumeration value="TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RequestCategoryCode")
@XmlEnum
public enum RequestCategoryCode {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To discover the actions of an ACTION-OBJECTIVE (OBJECT-ITEM) by any means.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ACTION,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To discover the relation between two ACTION-OBJECTIVEs (OBJECT-ITEMs) by any means.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ASSOC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To discover the holding of an ACTION-OBJECTIVE (OBJECT-ITEM) by any means.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    HOLDNG,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To recognise the friendly or enemy character of an ACTION-OBJECTIVE (OBJECT-ITEM) by any means.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    HOSTIL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To discover the location of an ACTION-OBJECTIVE (OBJECT-ITEM) by any means.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    LOCATN,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To discover the manifestation of an ACTION-OBJECTIVE in the area of operational interest specified through another ACTION-OBJECTIVE (OBJECT-ITEM: FACILITY, FEATURE).&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    PRESNC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To recognise the status of an ACTION-OBJECTIVE (OBJECT-ITEM) by any means.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    STATUS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;To recognise the type of an ACTION-OBJECTIVE (OBJECT-ITEM) by any means.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    TYPE;

    public String value() {
        return name();
    }

    public static RequestCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
