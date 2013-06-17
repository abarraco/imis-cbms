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
 * <p>Java class for PersonTypeRankCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonTypeRankCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EPTE"/>
 *     &lt;enumeration value="NCO"/>
 *     &lt;enumeration value="NKN"/>
 *     &lt;enumeration value="OF1"/>
 *     &lt;enumeration value="OF10"/>
 *     &lt;enumeration value="OF2"/>
 *     &lt;enumeration value="OF3"/>
 *     &lt;enumeration value="OF4"/>
 *     &lt;enumeration value="OF5"/>
 *     &lt;enumeration value="OF6"/>
 *     &lt;enumeration value="OF7"/>
 *     &lt;enumeration value="OF8"/>
 *     &lt;enumeration value="OF9"/>
 *     &lt;enumeration value="OFFR"/>
 *     &lt;enumeration value="OR1"/>
 *     &lt;enumeration value="OR2"/>
 *     &lt;enumeration value="OR3"/>
 *     &lt;enumeration value="OR4"/>
 *     &lt;enumeration value="OR5"/>
 *     &lt;enumeration value="OR6"/>
 *     &lt;enumeration value="OR7"/>
 *     &lt;enumeration value="OR8"/>
 *     &lt;enumeration value="OR9"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonTypeRankCode", namespace = "urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2")
@XmlEnum
public enum PersonTypeRankCode {


    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A military person in the armed forces without an officer's commission, warrant or other rank conferring leadership over other servicemen.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    EPTE("EPTE"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;An enlisted member of the armed forces appointed to a rank conferring leadership over other servicemen.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    NCO("NCO"),

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
    NKN("NKN"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Lieutenant/Second Lieutenant/Midshipman/Sub-Lieutenant/Pilot Officer/Flying Officer.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF1")
    OF_1("OF1"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Field Marshal/Fleet Admiral/General of the Air Force.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF10")
    OF_10("OF10"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Captain/Lieutenant/Flight Lieutenant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF2")
    OF_2("OF2"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Major/Lieutenant-Commander/Squadron Leader.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF3")
    OF_3("OF3"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Lieutenant Colonel/Commander/Wing Commander.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF4")
    OF_4("OF4"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Colonel/Captain (under 6 years seniority) /Group Captain.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF5")
    OF_5("OF5"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Brigadier/Captain (over 6 years seniority)/Air Commodore.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF6")
    OF_6("OF6"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Major General/Rear Admiral/Air Vice Marshal.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF7")
    OF_7("OF7"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of Lieutenant General/Vice Admiral/Air Marshal.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF8")
    OF_8("OF8"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Officer rank of General/Admiral/Air Chief Marshal.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OF9")
    OF_9("OF9"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;A military person who is invested with authority by means of a commission in the armed forces.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    OFFR("OFFR"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Private (Class 4)/Seaman Recruit/Basic Airman.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR1")
    OR_1("OR1"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Private (Class1-3)/Seaman Apprentice/Airman.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR2")
    OR_2("OR2"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Lance Corporal/Seaman/Airman First Class.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR3")
    OR_3("OR3"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Corporal/Petty Officer Third Class/Senior Airman/Sergeant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR4")
    OR_4("OR4"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Sergeant (Junior)/Petty Officer Second Class/Staff Sergeant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR5")
    OR_5("OR5"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Sergeant (3 Years Seniority)/Petty Officer First Class/Technical Sergeant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR6")
    OR_6("OR6"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Staff Sergeant/Chief Petty Officer First Class/Master Sergeant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR7")
    OR_7("OR7"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Warrant Officer Class 2/Senior Chief Petty Officer/Senior Master Sergeant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR8")
    OR_8("OR8"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;Other rank of Warrant Officer Class 1/Master Chief Petty Officer/Chief Master Sergeant.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    @XmlEnumValue("OR9")
    OR_9("OR9"),

    /**
     * 
     *             
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Definition xmlns="http://www.w3.org/2001/XMLSchema" xmlns:jc3iedm="urn:int:nato:standard:mip:jc3iedm:3.0.2:oo:2.2" xml:lang="en"&gt;All military PERSON-TYPEs who do not hold an officer's commission in the armed forces.&lt;/Definition&gt;
     * </pre>
     * 
     *           
     * 
     */
    OTHR("OTHR");
    private final String value;

    PersonTypeRankCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonTypeRankCode fromValue(String v) {
        for (PersonTypeRankCode c: PersonTypeRankCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}