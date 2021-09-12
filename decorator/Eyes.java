/**
 * Eyes class that contains the contents and methods of eyes. Eyes inherits all of CharacterDecorators's variables and methods.
 */ 
public class Eyes extends CharacterDecorator{
    /**
     * Default constructor that calls the super() method of CharacterDecorator and passes in an instance of Character. 
     * @param character instance of Character
     */
    public Eyes(Character character)
    {
        super(character); 
    }

    /**
     * Sets the 4th element of sections to a string of eyes. 
     */
    public void customize()
    {
        this.sections.set(3," |  o  o  | ");
    }
}
