import java.util.ArrayList;

/**
 * Contains the methods and contents of a LogCabinPlan
 */
public class LogCabinPlan extends HousePlan {

    /**
     * Default constructor that calls the superclass constructor
     */
    public LogCabinPlan()
    {
        super(2,10,1800);
    }

    /**
     * Sets the materials for a LogCabinPlan
     */
    protected void setMaterials()
    {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    /**
     * Sets the features for a LogCabinPlan
     */
    protected void setFeatures()
    {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    /**
     * Calls the superclass tostrings method.
     */
    public String toString()
    {
        return "Log Cabin\n" + super.toString();
    }
}
