public class BestSellers implements Subject {
    private ArrayList<Observer> observers; 
    private ArrayList<Book> bestSellers; 
    public BestSellers()
    {
        observers = new ArrayList<Observer>; 
        bestSellers = new ArrayList<Book>; 
    }
    public void registerObserver(Observer observer)
    {

    }
    public void removeObserver(Observer observer)
    {
        
    }
    public void notifyObservers(Book book)
    {

    }
    public void addBook(Book book)
    {
        
    }
}
