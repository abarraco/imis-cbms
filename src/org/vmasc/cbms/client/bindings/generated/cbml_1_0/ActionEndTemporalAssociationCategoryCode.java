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
 * <p>Java class for ActionEndTemporalAssociationCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionEndTemporalAssociationCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ENDEND"/>
 *     &lt;enumeration value="ENDENE"/>
 *     &lt;enumeration value="ENDENL"/>
 *     &lt;enumeration value="ENDSNE"/>
 *     &lt;enumeration value="ENDSNL"/>
 *     &lt;enumeration value="ENDSTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionEndTemporalAssociationCategoryCode")
@XmlEnum
public enum ActionEndTemporalAssociationCategoryCode {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The subject ACTION ends after the object ACTION ends.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENDEND,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The subject ACTION ends no earlier than the end of the object ACTION augmented by a fixed duration.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENDENE,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The subject ACTION ends no later than the end of object ACTION augmented by a fixed duration.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENDENL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The subject ACTION ends no earlier than the start of the object ACTION augmented by a fixed duration.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENDSNE,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The subject ACTION ends no later than the start of object ACTION augmented by a fixed duration.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENDSNL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:Definition xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:cbml="http://www.sisostds.org/schemas/c-bml/1.0" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The subject ACTION ends after the object ACTION starts.&lt;/xs:Definition&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENDSTR;

    public String value() {
        return name();
    }

    public static ActionEndTemporalAssociationCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
