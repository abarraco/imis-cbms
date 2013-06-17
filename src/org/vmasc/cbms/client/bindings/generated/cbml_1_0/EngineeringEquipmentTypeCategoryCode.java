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
 * <p>Java class for EngineeringEquipmentTypeCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EngineeringEquipmentTypeCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BRDLVA"/>
 *     &lt;enumeration value="BRDVEH"/>
 *     &lt;enumeration value="BRIDGG"/>
 *     &lt;enumeration value="CNSTVE"/>
 *     &lt;enumeration value="CONST"/>
 *     &lt;enumeration value="CRANE"/>
 *     &lt;enumeration value="DITCHR"/>
 *     &lt;enumeration value="DOZER"/>
 *     &lt;enumeration value="ERTHMV"/>
 *     &lt;enumeration value="GRADER"/>
 *     &lt;enumeration value="MCBRLY"/>
 *     &lt;enumeration value="MINCLR"/>
 *     &lt;enumeration value="MINECL"/>
 *     &lt;enumeration value="MINEDT"/>
 *     &lt;enumeration value="MINEMR"/>
 *     &lt;enumeration value="MINLAY"/>
 *     &lt;enumeration value="MINLYR"/>
 *     &lt;enumeration value="MNLYAR"/>
 *     &lt;enumeration value="MNLYTR"/>
 *     &lt;enumeration value="NKN"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="PILDRV"/>
 *     &lt;enumeration value="POWSHV"/>
 *     &lt;enumeration value="RCKCRH"/>
 *     &lt;enumeration value="TFBRID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EngineeringEquipmentTypeCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum EngineeringEquipmentTypeCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A bridge that is carried on an armoured vehicle and is deployed from the vehicle for immediate use (VBPP, AVLB).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BRDLVA,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle used to deliver a bridge.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BRDVEH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Equipment designed for the crossing of gaps and other obstacles.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BRIDGG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle generally used in the construction trade.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CNSTVE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An equipment used to build a facility.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CONST,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A machine for raising and lowering heavy weights; in its usual form it consists of a vertical post capable of rotation on its axis, a projecting arm or 'jib' over which passes the chain or rope from which the weight is suspended, and a barrel round which the chain or rope is wound.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    CRANE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A machine used to make ditches.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DITCHR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A heavy caterpillar tractor fitted with a broad steel blade in front, used for removing obstacles, levelling uneven surfaces, etc.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DOZER,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle designed for the excavation or shifting of large quantities of earth.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    ERTHMV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A wheeled machine for levelling the ground.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    GRADER,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A tracked vehicle designed to carry and lay a removable bridge.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MCBRLY,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle whose purpose is to remove or destroy mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MINCLR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An equipment whose purpose is to remove or destroy mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MINECL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An equipment whose purpose is to detect the presence of mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MINEDT,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An equipment used to delimit a minefield.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MINEMR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An equipment whose purpose is to lay mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MINLAY,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A vehicle whose purpose is to lay mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MINLYR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An armoured vehicle whose purpose is to lay mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MNLYAR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A trailer whose purpose is to lay mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    MNLYTR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;It is not possible to determine which value is most applicable.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NKN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The appropriate value is not in the set of specified values.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NOS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A machine for driving piles into the ground, usually consisting of a heavy block of iron, suspended in a frame between two vertical guide-posts, and alternately let fall upon the pile-head, and raised by steam, manual, or other power; some, working with steam, act on the principle of the steam-hammer.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    PILDRV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A mechanically powered spade-like implement, consisting of a broad blade of metal or other material, attached to a handle and used for raising and removing quantities of earth, grain, coal or other loose material.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    POWSHV,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A machine used to break down rocks.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    RCKCRH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A bridge that can be laid on floating structure to permit crossing.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    TFBRID;

    public String value() {
        return name();
    }

    public static EngineeringEquipmentTypeCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}