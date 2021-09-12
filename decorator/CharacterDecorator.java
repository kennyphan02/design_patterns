/**
 * The absstract class CharacterDecorates that inherits Character's variables and methods. 
 */
public abstract class CharacterDecorator extends Character {
    protected Character character; 

    /**
     * Default constructor that initalizes an instance of character to a character that is being passed in the constructor's
     * parameter. Loops through the instance of character's sections and adds every element from the arraylist to this.sections. 
     * The constructor calls the customize method after. 
     * @param character an instance of Character 
     */
    public CharacterDecorator(Character character){
        this.character = character;
        for(int i = 0; i < this.character.sections.size(); i++)
        {
            this.sections.add(this.character.sections.get(i)); 
        }
        customize(); 
    }

    /**
     * Abstract method that childs of the CharacterDecorator class must inherit. 
     */
    public abstract void customize();
}
