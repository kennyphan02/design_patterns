import java.util.ArrayList;
public class GuestList implements SearchBehavior
{
    private String title; 
    private ArrayList<String> people; 
    private SearchBehavior searchBehavior; 


    // Default constructor that takes the parameter of a string that is used as the guest list title. 
    public GuestList(String title)
    {
        this.title = title; 
        this.people = new ArrayList<String>(); 
        this.searchBehavior = new LinearSearch(); 
    }

    /**
     * 
     * Returns the value of the arraylist of people
     * @return
     */
    public ArrayList<String> getList()
    {
        return this.people; 

    }

    /**
     * Returns the value of the title of the guestlist 
     * @return
     */
    public String getTitle() 
    {
        return this.title; 
    }

    /**
     * Adds a person to the guestlist. The method uses a condition to check to see if the person is already on the list. If the person
     * is already on the list, the person will not be added to the list again. 
     * @param person the person that is being added to the guest list. 
     * @return
     */
    public boolean add(String person)
    {
        if(contains(this.people,person))
        {
            return false; 
        }
        this.people.add(person); 
        return true; 
    }

    /**
     * Removes a person from the guestlid. The method uses a condition to check to see if the persion is already on the list. If the
     * person is already on the list, he/she will be removed from the list. 
     * @param person the person that is being removed from the guest list.
     * @return 
     */

    public boolean remove(String person) 
    {
        if(contains(this.people,person))
        {
            this.people.remove(person);
            return true; 
        }

        return false; 
    }

    /**
     * Sets the searchBehavior type to SearchBehavior. This method is important as it dictates whether to use linear search or binary
     * search
     * @param searchBehavior SearchBehavior type that instantianted by an object of BinarySearch or LinearSearch 
     */

    public void setSearchBehavior(SearchBehavior searchBehavior)
    {
        this.searchBehavior = searchBehavior; 

    }
    
    /**
     * Utilizes the searchBehavior's method. searchBehavior can be instantianted to either an object of BinarySearch or LinearSearch.
     * The contains method is used from the respective objects to check to see if the name exists on the guest list. 
     * @param data the list of people in guest list. 
     * @param item the targetted name we are looking for in the guest list 
     */
    public boolean contains(ArrayList<String> data, String item)
    {
        if(this.searchBehavior.contains(data,item))
        {
            return true; 
        }
        return false; 
    }



    

}