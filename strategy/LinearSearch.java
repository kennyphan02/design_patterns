
import java.util.ArrayList;
public class LinearSearch implements SearchBehavior
{

    public LinearSearch()
    {

    }
    /**
     * Iterates from the start of the array to the end of the array one by one and checks to see if the targetted name already exists
     * in the guest list. Before comparing strings, the toLowerCase method is used due to the Contains method being case-sensitive. 
     */
    public boolean contains(ArrayList<String> data, String item)
    {
        for(int i = 0; i < data.size(); i++)
        {
            String dataLowercase = data.get(i).toLowerCase();
            String itemLowercase = item.toLowerCase(); 
            if(dataLowercase.contains(itemLowercase))
            {
                return true; 
            }
        }
        return false; 

    }

}