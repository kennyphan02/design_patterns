/**
 * Nose class that contains the contents and methods of Nose. Nose inherits all of CharacterDecorators's variables and methods.
 */
public class Nose extends CharacterDecorator{
    /**
     * Default constructor that calls the super() method of CharacterDecorator and passes in an instance of Character. 
     * @param character instance of Character
     */
    public Nose(Character character)
    {
        super(character); 
    }

    /**
     * Sets the 5th element to a string of a nose. 
     */
    public void customize()
    {
        this.sections.set(4," |   >    | ");
    }
}
