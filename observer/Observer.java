import java.util.ArrayList;

/**
 * Classes that implement this interface must include a update and display method. 
 */
public interface Observer {
    public void update(Book book);
    public void display();
}
