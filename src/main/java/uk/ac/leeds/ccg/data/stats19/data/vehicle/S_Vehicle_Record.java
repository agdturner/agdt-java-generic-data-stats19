/*
 * Source code generated by uk.ac.leeds.ccg.data.stats19.process.STATS19_JavaCodeGenerator
 */
package uk.ac.leeds.ccg.data.stats19.data.vehicle;

import uk.ac.leeds.ccg.data.Data_Record;
import uk.ac.leeds.ccg.data.stats19.data.id.S_RecordID;

public class S_Vehicle_Record extends Data_Record {

    private static final long serialVersionUID = 1L;

    protected String Acc_Index;
    protected Short Vehicle_Reference;
    protected Byte Vehicle_Type;
    protected Byte Towing_and_Articulation;
    protected Byte Vehicle_Manoeuvre;
    protected Byte Vehicle_Location_Restricted_Lane;
    protected Byte Junction_Location;
    protected Byte Skidding_and_Overturning;
    protected Byte Hit_Object_in_Carriageway;
    protected Byte Vehicle_Leaving_Carriageway;
    protected Byte Hit_Object_off_Carriageway;
    protected Byte First_Point_of_Impact;
    protected Byte Was_Vehicle_Left_Hand_Drive;
    protected Byte Journey_Purpose_of_Driver;
    protected Byte Sex_of_Driver;
    protected Byte Age_Band_of_Driver;
    protected Integer Engine_Capacity_CC;
    protected Byte Propulsion_Code;
    protected Byte Age_of_Vehicle;
    protected Byte Driver_IMD_Decile;
    protected Byte Driver_Home_Area_Type;

    public S_Vehicle_Record(S_RecordID i) {
        super(i);        
    }

    public S_Vehicle_Record(S_RecordID i, String line) throws Exception {
        super(i);
        String[] s = line.split(",");
        initAcc_Index(s[0]);
        initVehicle_Reference(s[1]);
        initVehicle_Type(s[2]);
        initTowing_and_Articulation(s[3]);
        initVehicle_Manoeuvre(s[4]);
        initVehicle_Location_Restricted_Lane(s[5]);
        initJunction_Location(s[6]);
        initSkidding_and_Overturning(s[7]);
        initHit_Object_in_Carriageway(s[8]);
        initVehicle_Leaving_Carriageway(s[9]);
        initHit_Object_off_Carriageway(s[10]);
        initFirst_Point_of_Impact(s[11]);
        initWas_Vehicle_Left_Hand_Drive(s[12]);
        initJourney_Purpose_of_Driver(s[13]);
        initSex_of_Driver(s[14]);
        initAge_Band_of_Driver(s[15]);
        initEngine_Capacity_CC(s[16]);
        initPropulsion_Code(s[17]);
        initAge_of_Vehicle(s[18]);
        initDriver_IMD_Decile(s[19]);
        initDriver_Home_Area_Type(s[20]);
    }

    @Override
    public S_RecordID getID() {
        return (S_RecordID) id;
    }

    protected final void initAcc_Index(String s) {
        if (!s.trim().isEmpty()) {
            Acc_Index = s;
        } else {
            Acc_Index = null;
        }
    }

    protected final void initVehicle_Reference(String s) {
        if (!s.trim().isEmpty()) {
            Vehicle_Reference = Short.parseShort(s);
        } else {
            Vehicle_Reference = null;
        }
    }

    protected final void initVehicle_Type(String s) {
        if (!s.trim().isEmpty()) {
            Vehicle_Type = Byte.parseByte(s);
        } else {
            Vehicle_Type = null;
        }
    }

    protected final void initTowing_and_Articulation(String s) {
        if (!s.trim().isEmpty()) {
            Towing_and_Articulation = Byte.parseByte(s);
        } else {
            Towing_and_Articulation = null;
        }
    }

    protected final void initVehicle_Manoeuvre(String s) {
        if (!s.trim().isEmpty()) {
            Vehicle_Manoeuvre = Byte.parseByte(s);
        } else {
            Vehicle_Manoeuvre = null;
        }
    }

    protected final void initVehicle_Location_Restricted_Lane(String s) {
        if (!s.trim().isEmpty()) {
            Vehicle_Location_Restricted_Lane = Byte.parseByte(s);
        } else {
            Vehicle_Location_Restricted_Lane = null;
        }
    }

    protected final void initJunction_Location(String s) {
        if (!s.trim().isEmpty()) {
            Junction_Location = Byte.parseByte(s);
        } else {
            Junction_Location = null;
        }
    }

    protected final void initSkidding_and_Overturning(String s) {
        if (!s.trim().isEmpty()) {
            Skidding_and_Overturning = Byte.parseByte(s);
        } else {
            Skidding_and_Overturning = null;
        }
    }

    protected final void initHit_Object_in_Carriageway(String s) {
        if (!s.trim().isEmpty()) {
            Hit_Object_in_Carriageway = Byte.parseByte(s);
        } else {
            Hit_Object_in_Carriageway = null;
        }
    }

    protected final void initVehicle_Leaving_Carriageway(String s) {
        if (!s.trim().isEmpty()) {
            Vehicle_Leaving_Carriageway = Byte.parseByte(s);
        } else {
            Vehicle_Leaving_Carriageway = null;
        }
    }

    protected final void initHit_Object_off_Carriageway(String s) {
        if (!s.trim().isEmpty()) {
            Hit_Object_off_Carriageway = Byte.parseByte(s);
        } else {
            Hit_Object_off_Carriageway = null;
        }
    }

    protected final void initFirst_Point_of_Impact(String s) {
        if (!s.trim().isEmpty()) {
            First_Point_of_Impact = Byte.parseByte(s);
        } else {
            First_Point_of_Impact = null;
        }
    }

    protected final void initWas_Vehicle_Left_Hand_Drive(String s) {
        if (!s.trim().isEmpty()) {
            Was_Vehicle_Left_Hand_Drive = Byte.parseByte(s);
        } else {
            Was_Vehicle_Left_Hand_Drive = null;
        }
    }

    protected final void initJourney_Purpose_of_Driver(String s) {
        if (!s.trim().isEmpty()) {
            Journey_Purpose_of_Driver = Byte.parseByte(s);
        } else {
            Journey_Purpose_of_Driver = null;
        }
    }

    protected final void initSex_of_Driver(String s) {
        if (!s.trim().isEmpty()) {
            Sex_of_Driver = Byte.parseByte(s);
        } else {
            Sex_of_Driver = null;
        }
    }

    protected final void initAge_Band_of_Driver(String s) {
        if (!s.trim().isEmpty()) {
            Age_Band_of_Driver = Byte.parseByte(s);
        } else {
            Age_Band_of_Driver = null;
        }
    }

    protected final void initEngine_Capacity_CC(String s) {
        if (!s.trim().isEmpty()) {
            Engine_Capacity_CC = Integer.parseInt(s);
        } else {
            Engine_Capacity_CC = null;
        }
    }

    protected final void initPropulsion_Code(String s) {
        if (!s.trim().isEmpty()) {
            Propulsion_Code = Byte.parseByte(s);
        } else {
            Propulsion_Code = null;
        }
    }

    protected final void initAge_of_Vehicle(String s) {
        if (!s.trim().isEmpty()) {
            Age_of_Vehicle = Byte.parseByte(s);
        } else {
            Age_of_Vehicle = null;
        }
    }

    protected final void initDriver_IMD_Decile(String s) {
        if (!s.trim().isEmpty()) {
            Driver_IMD_Decile = Byte.parseByte(s);
        } else {
            Driver_IMD_Decile = null;
        }
    }

    protected final void initDriver_Home_Area_Type(String s) {
        if (!s.trim().isEmpty()) {
            Driver_Home_Area_Type = Byte.parseByte(s);
        } else {
            Driver_Home_Area_Type = null;
        }
    }

    public String getAcc_Index() {
        return Acc_Index;
    }

    public Short getVehicle_Reference() {
        return Vehicle_Reference;
    }

    public Byte getVehicle_Type() {
        return Vehicle_Type;
    }

    public Byte getTowing_and_Articulation() {
        return Towing_and_Articulation;
    }

    public Byte getVehicle_Manoeuvre() {
        return Vehicle_Manoeuvre;
    }

    public Byte getVehicle_Location_Restricted_Lane() {
        return Vehicle_Location_Restricted_Lane;
    }

    public Byte getJunction_Location() {
        return Junction_Location;
    }

    public Byte getSkidding_and_Overturning() {
        return Skidding_and_Overturning;
    }

    public Byte getHit_Object_in_Carriageway() {
        return Hit_Object_in_Carriageway;
    }

    public Byte getVehicle_Leaving_Carriageway() {
        return Vehicle_Leaving_Carriageway;
    }

    public Byte getHit_Object_off_Carriageway() {
        return Hit_Object_off_Carriageway;
    }

    public Byte getFirst_Point_of_Impact() {
        return First_Point_of_Impact;
    }

    public Byte getWas_Vehicle_Left_Hand_Drive() {
        return Was_Vehicle_Left_Hand_Drive;
    }

    public Byte getJourney_Purpose_of_Driver() {
        return Journey_Purpose_of_Driver;
    }

    public Byte getSex_of_Driver() {
        return Sex_of_Driver;
    }

    public Byte getAge_Band_of_Driver() {
        return Age_Band_of_Driver;
    }

    public Integer getEngine_Capacity_CC() {
        return Engine_Capacity_CC;
    }

    public Byte getPropulsion_Code() {
        return Propulsion_Code;
    }

    public Byte getAge_of_Vehicle() {
        return Age_of_Vehicle;
    }

    public Byte getDriver_IMD_Decile() {
        return Driver_IMD_Decile;
    }

    public Byte getDriver_Home_Area_Type() {
        return Driver_Home_Area_Type;
    }
}
