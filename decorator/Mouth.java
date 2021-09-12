/**
 * Mouth class that contains the contents and methods of Mouth. Mouth inherits all of CharacterDecorators's variables and methods.
 */
public class Mouth extends CharacterDecorator{
    /**
     * Default constructor that calls the super() method of CharacterDecorator and passes in an instance of Character. 
     * @param character instance of Character
     */
    public Mouth(Character character)
    {
        super(character); 
    }

    /**
     * Sets the 6th element of sections to a String of a mouth. 
     */
    public void customize()
    {
        this.sections.set(5,"  \\ ---- / ");
    }
}
