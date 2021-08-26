import java.util.ArrayList;
public class GuestList
{
    private String title; 
    private ArrayList<String> people; 
    private SearchBehavior searchBehavior; 
    public GuestList(String title)
    {
        this.title = title; 
    }

    public ArrayList<String> getList()
    {
        return this.people; 

    }

    public String getTitle() 
    {
        return this.title; 
    }

    public boolean add(String person)
    {
        

    }

    public boolean remove(String person) 
    {

    }

    public void setSearchBehavior(SearchBehavior searchBehavior)
    {

    }


    

}