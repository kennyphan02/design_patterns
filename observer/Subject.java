import java.util.ArrayList;

/**
 * Classes that implement the Subject interface must include the registerObserver, removeObservor, and notifyObservor methods. 
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer); 
    public void notifyObservers(Book book); 
}
