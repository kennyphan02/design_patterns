import java.util.ArrayList;
public class Customer implements Observer {
    private Subject subject;
    private String firstName; 
    private String lastName; 
    private ArrayList<Book> wishList; 
    public Customer(Subject subject, String firstName, String lastName)
    {
        this.subject = subject;   
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();
        this.subject.registerObserver(this);
        
    }
    public void update(Book book)
    {
    	wishList.add(book); 
    }
    public void display()
    {
    	System.out.println("");
    	System.out.println("Wish List:");
    	for(int i = 0; i < wishList.size(); i++)
    	{
    		System.out.println(" - " + wishList.get(i).getTitle() + " by: " + wishList.get(i).getAuthorFirstName() + " " + wishList.get(i).getAuthorLastName());
    	}
        
    }

}
