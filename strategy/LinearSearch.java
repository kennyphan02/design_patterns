
import java.util.ArrayList;
public class LinearSearch implements SearchBehavior
{

    public LinearSearch()
    {

    }

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