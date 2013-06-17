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
 * <p>Java class for EquipmentTypeCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EquipmentTypeCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AIRCFT"/>
 *     &lt;enumeration value="CBRNEQ"/>
 *     &lt;enumeration value="ELCTRN"/>
 *     &lt;enumeration value="ENGEQ"/>
 *     &lt;enumeration value="MISCEQ"/>
 *     &lt;enumeration value="MRTMEQ"/>
 *     &lt;enumeration value="RAIL"/>
 *     &lt;enumeration value="VEHCLE"/>
 *     &lt;enumeration value="VESSEL"/>
 *     &lt;enumeration value="WEPTYP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EquipmentTypeCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum EquipmentTypeCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed to fly.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    AIRCFT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed for specialised roles in detecting, decontaminating or reconnoitring NBC (CBRN) materiel.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CBRNEQ,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed to use electronic processing to realise its primary function.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ELCTRN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed to accomplish engineering functions.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ENGEQ,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE whose designed function does not fit in any other defined category.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MISCEQ,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed to be used in a maritime environment.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MRTMEQ,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed to operate on rail tracks.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RAIL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed to operate on land routes (other than rail) with a primary role of transporting personnel, equipment or supplies.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    VEHCLE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE that is designed to operate on or under the water surface.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    VESSEL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An EQUIPMENT-TYPE of any kind used in warfare or combat to attack and overcome an enemy.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    WEPTYP;

    public String value() {
        return name();
    }

    public static EquipmentTypeCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}
