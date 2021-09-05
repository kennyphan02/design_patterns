import java.util.ArrayList;

/**
 * BestSellers class that is used to display the top 5 books
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers; 
    private ArrayList<Book> bestSellers; 

    /**
     * Default constructor that initalizes an arraylist of observers and bestsellers that takes an Observer and Book respectively
     */
    public BestSellers()
    {
        observers = new ArrayList<Observer>(); 
        bestSellers = new ArrayList<Book>(); 
    }

    /**
     * Registers an observor into the observers arraylist
     * @param observor takes an instance of an Observor 
     */
    public void registerObserver(Observer observer)
    {
    	observers.add(observer);

    }

    /**
     * Removes an observor from the observers arraylist
     * @param observor takes an instance of an Observor
     */
    public void removeObserver(Observer observer)
    {
    	observers.remove(observer);
        
    }

    /**
     * Notifys the osbervors when an instance of a book is added to the bestsellers list.
     * @param book parameter that takes an instance of Book
     */
    public void notifyObservers(Book book)
    {
    	for(int i = 0; i < observers.size(); i++)
    	{
    		observers.get(i).update(book);
    	}
    }
    
    /**
     * Adds a book object to the bestsellers list then notifies the list of observors.
     * @param book parameter that takes an instance of Book
     */
    public void addBook(Book book)
    {
    	bestSellers.add(book); 
    	notifyObservers(book);
    }
}
