import java.util.ArrayList; 
/**
 * Character class that contains contents of what a Character is. 
 */
public abstract class Character {
    protected ArrayList<String> sections;  

    /**
     * Default constructor of Character. Initalizes this.sections to an arraylist of strings. 
     */
    public Character() 
    {
        this.sections = new ArrayList<String>(); 
    }

    /**
     * The draw methods iterates through the sections arraylist and print out every element using the built-in get method. 
     */
    public void draw()
    {
        for(int i = 0; i < this.sections.size(); i++)
        {
            System.out.println(this.sections.get(i));
        }
    }
}
