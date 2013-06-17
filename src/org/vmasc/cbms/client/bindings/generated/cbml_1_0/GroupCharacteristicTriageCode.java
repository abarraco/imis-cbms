//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.11.04 at 01:32:24 PM EDT 
//


package org.vmasc.cbms.client.bindings.generated.cbml_1_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupCharacteristicTriageCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupCharacteristicTriageCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="T1"/>
 *     &lt;enumeration value="T2"/>
 *     &lt;enumeration value="T3"/>
 *     &lt;enumeration value="T4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupCharacteristicTriageCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum GroupCharacteristicTriageCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A group that consists of those requiring emergency care and life-saving surgery. These procedures should not be time-consuming and be applied only to those with high chances of survival.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("T1")
    T_1("T1"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A group that consists of those in need of surgery, but whose general condition permits delay in surgical treatment without unduly endangering life. To mitigate the effect of delay in surgery, sustaining treatment will be required.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("T2")
    T_2("T2"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A group that consists of those with relatively minor injuries who can effectively care for themselves or who can be helped by untrained personnel.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("T3")
    T_3("T3"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A group that comprises those who have received serious and often multiple injuries, and whose treatment would be time-consuming and complicated, with a low chance of survival.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("T4")
    T_4("T4");
    private final String value;

    GroupCharacteristicTriageCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupCharacteristicTriageCode fromValue(String v) {
        for (GroupCharacteristicTriageCode c: GroupCharacteristicTriageCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}