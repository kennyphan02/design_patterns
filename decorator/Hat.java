/**
 * Hat class that contains the contents and methods of hat. Hat inherits all of CharacterDecorators's variables and methods.
 */ 
public class Hat extends CharacterDecorator{
    /**
     * Default constructor that calls the super() method of CharacterDecorator and passes in an instance of Character. 
     * @param character instance of Character
     */
    public Hat(Character character)
    {
        super(character); 
    }

    /**
     * Sets the 1st and 2nd element of sections to a String of a Hat 
     */
    public void customize()
    {
        this.sections.set(0,"    ____");
        this.sections.set(1," __|____|____");
    }
}
