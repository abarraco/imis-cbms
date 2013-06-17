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
 * <p>Java class for VisibilityCategoryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VisibilityCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BLWSNW"/>
 *     &lt;enumeration value="DSTDVL"/>
 *     &lt;enumeration value="DSTSND"/>
 *     &lt;enumeration value="DSTSTR"/>
 *     &lt;enumeration value="FOG"/>
 *     &lt;enumeration value="FRZFOG"/>
 *     &lt;enumeration value="HAZE"/>
 *     &lt;enumeration value="NKN"/>
 *     &lt;enumeration value="NOS"/>
 *     &lt;enumeration value="SMOKE"/>
 *     &lt;enumeration value="SNDSTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisibilityCategoryCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum VisibilityCategoryCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Snow particles raised and stirred violently by the wind to moderate or great heights. Prevailing visibility is reduced to less than 11,260 metres and the sky may become obscured when the particles are raised to great heights.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    BLWSNW,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Well-developed dust/sand whirls (PO). An ensemble of particles of dust or sand, sometimes accompanied by small litter, raised from the ground in the form of a whirling column of varying height with a small diameter and an approximately vertical axis. Reported regardless of the visibility.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DSTDVL,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Dust or sand raised by the wind to a height of 1.8 metres or more.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DSTSND,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An unusual, frequently severe weather condition characterised by strong winds and dust-filled air over an extensive area. Report a dust storm if the prevailing visibility is reduced to less than 1,000 meters, but not less than 500 metres. Report a heavy (severe) dust storm (+DS) if the visibility is reduced to less than 500 metres.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    DSTSTR,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A visible aggregate of minute water particles (droplets), which are based on the Earth�s surface, extends vertically, and reduces horizontal visibility to less than 1,000 metres. When fog is further described by the descriptors BC, MI, or PR, the prevailing visibility may be equal to or greater than 1,000 metres. Unlike drizzle, Fog does not fall to the ground.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    FOG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A suspension of numerous minute ice crystals in the air, or water droplets at temperatures below 0 degrees Celsius, based at the Earth�s surface and extending vertically to greater than 1.8 metres. FZFG reduces prevailing visibility to less than 1000 metres and, unlike drizzle, does not fall to the ground. The water droplets may freeze upon contact with exposed objects to form a coating of rime or glaze and it can occur even though the air temperature is above freezing. Also called Ice Fog.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    FRZFOG,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A suspension in the air of extremely small, dry particles invisible to the naked eye and sufficiently numerous to give the air an opalescent appearance. This phenomenon resembles a uniform veil over the landscape and subdues all colours. Dark objects viewed through this veil tend to have a bluish tinge while bright objects, such as the sun or distant lights, tend to have a dirty yellow or reddish hue. When haze is present and the sun is well above the horizon, its light may have a peculiar silvery tinge. Haze particles may be composed of a variety of substances; e.g., dust, salt, residue from distant fires or volcanoes, pollen, etc., which generally are well diffused through the atmosphere.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    HAZE,

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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A suspension in the air of small particles produced by combustion. A transition to haze may occur when smoke particles have travelled great distances (40 to 160 kilometres or more) and when the larger particles have settled out and the remaining particles have become widely scattered through the atmosphere. When viewed through smoke, the disk of the sun at sunrise and sunset appears very red. The disk may have an orange tinge when the sun is above the horizon. Evenly distributed smoke from distant sources generally has a light greyish or bluish appearance.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SMOKE,

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Particles of sand ranging in diameter from 0.2 millimetres to 1 millimetre carried aloft by a strong wind. A sandstorm is reported if the prevailing visibility is reduced to less than 1,000 metres, but not less than 500 metres. Report a heavy (severe) sandstorm (+SS) if the visibility is reduced to less than 500 metres.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    SNDSTR;

    public String value() {
        return name();
    }

    public static VisibilityCategoryCode fromValue(String v) {
        return valueOf(v);
    }

}