
/**
 * Book class that contains contents of what a Book is
 */
public class Book {
    private String title;
    private String authorFirstName; 
    private String authorLastName; 

    /**
     * Default constructor that takes 3 parameters, title, authorfirstName, and authorLastName that makes up a Book object
     * @param title the title of a book
     * @param authorFirstName the author's first name of the book
     * @param authorLastName the author's last name of the book
     */
    public Book(String title, String authorFirstName, String authorLastName)
    {
        this.title = title;
        this.authorFirstName = authorFirstName; 
        this.authorLastName = authorLastName; 
    }

    /**
     * Returns the value of the book's title
     * @return
     */
    public String getTitle()
    {
        return this.title; 
    }

    /**
     * Returns the value of the author's first name. 
     * @return
     */
    public String getAuthorFirstName()
    {
        return this.authorFirstName; 
    }

    /**
     * Returns the value of the author's last name. 
     * @return
     */
    public String getAuthorLastName()
    {
        return this.authorLastName;
    }

    /**
     * Prints the String default method 
     */
    public String toString()
    {
        return this.title + " by: " + this.authorFirstName + " " + this.authorLastName; 
    }
}
