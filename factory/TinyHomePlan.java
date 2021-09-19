import java.util.ArrayList;

/**
 * Contains the contents and methods of a tinyhomeplan
 */
public class TinyHomePlan extends HousePlan {

    /**
     * Default constructor that calls the superclass constructor.
     */
    public TinyHomePlan()
    {
        super(1,5,200);
    }

    /**
     * Sets the materials for a tinyhomeplan
     */
    protected void setMaterials()
    {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");

    }

    /**
     * Sets the features for a tinyhomeplan
     */
    protected void setFeatures()
    {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    /**
     * calls the superclass tostring method
     */
    public String toString()
    {
        return "Tiny House\n" + super.toString();
    }
    
}
