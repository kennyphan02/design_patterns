import java.util.ArrayList; 
import java.util.Collections; 


public class BinarySearch implements SearchBehavior
{

    public BinarySearch()
    {

    }

    /**
     * Sorts the data first because a binary search requires a sorted list. 
     * Finds the middle item of the list. If the middle item is the targetted item, return true. If the targetted item is less than
     * the middle item, examine the list starting from the first item to the middle item. If the targetted item is greater than the 
     * middle item, examine the list starting from the middle item to the last minute. Repeat the process of finding the middle item 
     * within the new set of elements until the array has a size of 1. 
     */
    public boolean contains(ArrayList<String> data, String item)
    {
        Collections.sort(data); 
        int start = 0; 
        int max = data.size() - 1; 
        int mid; 
        while (start <= max) {
            String itemLowercase = item.toLowerCase(); 
            mid = (start + max) / 2;
            String dataLowercase = data.get(mid).toLowerCase();
            if (dataLowercase.compareTo(itemLowercase) < 0) 
            { 
                start = mid + 1; 
            } 
            else if (dataLowercase.compareTo(itemLowercase) > 0) 
            {
                max = mid - 1;
            } 
            else
            {
                return true;
            }
        }
        return false;   
        
    }






    
}
