import java.util.Queue;
import java.util.LinkedList; 
import java.util.*; 

/**
 * Store class that contains attributes and methods of what a Store should do/ 
 */
public class Store implements Observer {
    private Subject subject; 
    private String title; 
    private Queue<Book> bestSellers; 

    /**
     * Default constructor that takes a Subject object and then registers it as an observor. A queue of the bestSellers is
     * initalized. 
     * @param subject
     */
    public Store(Subject subject)
    {
        this.subject = subject;
        this.subject.registerObserver(this);
        bestSellers = new LinkedList<Book>();
    }

    /**
     * Updates the bestsellers list by adding a book. If there is more then 5, remove the oldest book and replace it with the one
     * being added. 
     * @param book takes a parameter of a Book object 
     */
    public void update(Book book)
    {
    	if(bestSellers.size() == 5)
    	{
    		bestSellers.remove();
    	}
    	bestSellers.add(book);
    }

    /**
     * Prints out BestSellers listt. 
     */
    public void display()
    {
    	System.out.println("Top 5 Best Sellers:");
    	for(Book book: bestSellers)
    	{
    		System.out.println(" - " + book); 
    	}
    }
}
