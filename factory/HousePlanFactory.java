import java.util.ArrayList;

/**
 * Contains and contents and methods of what a HousePlanFactory is. Responsible for output and setting different house plans.
 */
public class HousePlanFactory {
    /**
     * createHousePlan method creates a house plan depending on the type of house plan (i.e log cabin, tiny home,
     * or contemporaryplan). Sets the house features and materials afterwards.
     * @param typel The type of house being created
     * @return returns an instance of houseplan.
     */
    public static HousePlan createHousePlan(String typel)
    {
        HousePlan house = new TinyHomePlan();
        if(typel == "log cabin")
        {
            house = new LogCabinPlan();
        } 
        else if (typel == "Tiny Home")
        {
            house = new TinyHomePlan();
        } 
        else if (typel == "contemporary home")
        {
            house = new ContemporaryPlan();
        }
        house.setFeatures();
        house.setMaterials();
        return house;
    }
}
