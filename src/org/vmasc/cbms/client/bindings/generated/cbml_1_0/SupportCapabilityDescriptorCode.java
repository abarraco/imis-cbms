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
 * <p>Java class for SupportCapabilityDescriptorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SupportCapabilityDescriptorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BEDCNT"/>
 *     &lt;enumeration value="BLKLIQ"/>
 *     &lt;enumeration value="BLKVOL"/>
 *     &lt;enumeration value="MAXCNT"/>
 *     &lt;enumeration value="OPRCNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SupportCapabilityDescriptorCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum SupportCapabilityDescriptorCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The numeric value denoting the number of hospital beds, fully outfitted with the necessary equipment and nursing personnel, available.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BEDCNT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The numeric value representing the maximum amount of any unpackaged liquid.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BLKLIQ,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The numeric value representing the maximum volume of any unpackaged mass.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BLKVOL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The numeric value representing the maximum item count.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MAXCNT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The numeric value denoting the number of operational operating rooms, fully outfitted with the necessary equipment and surgical personnel, available to treat injuries and illness.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    OPRCNT;

    public String value() {
        return name();
    }

    public static SupportCapabilityDescriptorCode fromValue(String v) {
        return valueOf(v);
    }

}
