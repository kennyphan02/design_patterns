import java.util.ArrayList;

/**
 * Customer class that contains attributies and methods that makes up what a Customer is. 
 */
public class Customer implements Observer {
    private Subject subject;
    private String firstName; 
    private String lastName; 
    private ArrayList<Book> wishList; 

    /**
     * Default constructor that takes a subject, firstName, and LastName parameters to create a Customer object
     * @param subject utilizes the registerObservor method to register a Customer object as an observor.
     * @param firstName first Name of a person
     * @param lastName last name of a person
     */
    public Customer(Subject subject, String firstName, String lastName)
    {
        this.subject = subject;   
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();
        this.subject.registerObserver(this);
        
    }

    /**
     * Updates the customer's wishlist by adding a book
     * @param book Takes in the parameter of a book object 
     */
    public void update(Book book)
    {
    	wishList.add(book); 
    }

    /**
     * Prints out the Customer's wishlist
     */
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
