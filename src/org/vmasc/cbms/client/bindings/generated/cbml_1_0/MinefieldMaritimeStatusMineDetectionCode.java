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
 * <p>Java class for MinefieldMaritimeStatusMineDetectionCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MinefieldMaritimeStatusMineDetectionCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SGHTD"/>
 *     &lt;enumeration value="SWACAF"/>
 *     &lt;enumeration value="SWACCO"/>
 *     &lt;enumeration value="SWACEX"/>
 *     &lt;enumeration value="SWACIN"/>
 *     &lt;enumeration value="SWACLF"/>
 *     &lt;enumeration value="SWBTTS"/>
 *     &lt;enumeration value="SWCRSS"/>
 *     &lt;enumeration value="SWDVNG"/>
 *     &lt;enumeration value="SWENWS"/>
 *     &lt;enumeration value="SWJASS"/>
 *     &lt;enumeration value="SWMACL"/>
 *     &lt;enumeration value="SWMAIN"/>
 *     &lt;enumeration value="SWMEAN"/>
 *     &lt;enumeration value="SWMECH"/>
 *     &lt;enumeration value="SWMECN"/>
 *     &lt;enumeration value="SWMEEL"/>
 *     &lt;enumeration value="SWMENE"/>
 *     &lt;enumeration value="SWMEOL"/>
 *     &lt;enumeration value="SWMEOR"/>
 *     &lt;enumeration value="SWMESN"/>
 *     &lt;enumeration value="SWMESO"/>
 *     &lt;enumeration value="SWMETE"/>
 *     &lt;enumeration value="SWPRGS"/>
 *     &lt;enumeration value="SWRNJS"/>
 *     &lt;enumeration value="SWSNSE"/>
 *     &lt;enumeration value="SWTWFD"/>
 *     &lt;enumeration value="SWUNDS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MinefieldMaritimeStatusMineDetectionCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum MinefieldMaritimeStatusMineDetectionCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines in the lane swept by visual means.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SGHTD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a sweep designed to operate the acoustic firing system of a mine, audio frequency.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWACAF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a sweep designed to operate the acoustic firing system of a mine, MF and LF frequency 30 to 15000HZ.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWACCO,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a sweep using the detonation of explosive charges to actuate the acoustic sensors in the mine.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWACEX,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by acoustic detonation of sea mines by the generation of underwater acoustic noise.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWACIN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a sweep designed to operate the acoustic firing system of a mine, low frequency, up to 30Hz.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWACLF,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of on the liquid bottom surface by use of divers working as a co-ordinated search group.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWBTTS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a circular snagline search by divers.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWCRSS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by divers entering the water to neutralize/destroy mines.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWDVNG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of an enclosed water grid search.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWENWS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a jackstay snagline search by divers.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWJASS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a conducting cable, loop shaped through which is passed a high current, towed behind a minesweeper.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMACL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A sweep designed to locate the mine by operating the magnetic firing system of a mine.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMAIN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines in the lane swept with either a single or multiple ship rig and is designed to ensure that the sweep wire is not brought into contact with the mines antenna until the mine is a safe distance astern.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMEAN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines in the lane swept by mechanical means.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMECH,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines in the lane swept by mechanical means, chains, normally fixed between two or more minesweeping vessels, dragged across the sea bed.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMECN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of two buoyant conducting cables, an electrode fitted between each leg, the electrical circuit being completed through the seawater.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMEEL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines in the lane swept by mechanical means, nets normally fixed between two or more minesweeping vessels.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMENE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a conducting cable, open loop shaped through which is passed a high current, towed behind a minesweeper.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMEOL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines that consists of sweep wires streamed one or both quarters, with a kite to keep them down to a set depth astern of the ship and otters controlled by floats to spread the wires horizontally apart.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMEOR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a wire to catch the snagline of a moored mine.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMESN,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of large number of horizontal coils through which a small current is passed.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMESO,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by towing either a mechanical or influence gear through the liquid with the intention of cutting or destruction of mines. Sweep wire towed between two or more ships using only kites to keep the sweep down.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWMETE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a progressive grid search.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWPRGS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a running jackstay search, diver(s).&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWRNJS,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by usage of sonar equipment.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWSNSE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of a towed free diver.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWTWFD,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;The location of mines by use of an underwater sled, diver.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SWUNDS;

    public String value() {
        return name();
    }

    public static MinefieldMaritimeStatusMineDetectionCode fromValue(String v) {
        return valueOf(v);
    }

}
