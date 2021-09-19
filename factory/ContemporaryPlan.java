import java.util.ArrayList;

/**
 * Contains methods and contents of a contemporaryplan
 */
public class ContemporaryPlan extends HousePlan {

    /**
     * Default constructor that calls the superclass constructor
     */
    public ContemporaryPlan()
    {
        super(5, 40, 3000);
    }

    /**
     * Sets the materials of a contemporaryplan
     */
    protected void setMaterials()
    {
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    /**
     * Sets the features of a contemporaryplan
     */
    protected void setFeatures()
    {
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }

    /**
     * calls the superclass tostring method
     */
    public String toString()
    {
        return "Contemporary Home\n" + super.toString();
    }
}
