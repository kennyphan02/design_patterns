import java.util.ArrayList;

/**
 * Contains the contents and methods of HousePlan
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * Default constructor that initalizes the needed variables
     * @param numRooms the number of rooms in a house plan
     * @param numWindows the number of windows in a house plan
     * @param squareFeet the area of a house in a house plan
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet)
    {
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    /**
     * Abstract method, setMaterials, that children of the HousePlan must implement.
     */
    protected abstract void setMaterials();

    /**
     * Abstract method, setFeatures, that children of the HousePlan must implement.
     */
    protected abstract void setFeatures();

    /**
     * returns the list of materials of a HousePlan.
     * @return materials is an ArrayList<String> type
     */
    public ArrayList<String> getMaterials()
    {
        return materials;
    }

    /**
     * returns the list of features of a HousePlan
     * @return features is an ArrayList<String> type
     */
    public ArrayList<String> getFeatures()
    {
        return features;
    }

    /**
     * returns the number of rooms of a HousePlan
     * @return this.numRooms is an int type.
     */
    public int getNumRooms()
    {
        return this.numRooms;

    }

    /**
     * returns the number of windows of a HousePlan
     * @return this.numWindows is an int type
     */
    public int getNumWindows()
    {
        return this.numWindows;

    }

    /**
     * returns the square feet of a house in a houseplan
     * @return this.squarefeet is an int type
     */
    public int getSquareFeet()
    {
        return this.squareFeet;
    }

    /**
     * Default string that is printed when an instance of HousePlan is initalized. MaterialList and featureList are strings created to
     * make the code easier to read when debugging.
     */
    public String toString()
    {
        String materialList = "";
        String featureList = "";
        for(int i = 0; i < materials.size(); i++)
        {
            materialList += " - " + materials.get(i) + "\n";
        }
        for(int j = 0; j < features.size(); j++)
        {
            featureList += " - " + features.get(j) + "\n";
        }
        return "Square Feet: " + this.squareFeet + "\nRoom: " + this.numRooms + "\nWindows: " + this.numWindows +
            "\n\nMaterials:\n" + materialList + "\nFeatures:\n " + featureList;
    }
}
