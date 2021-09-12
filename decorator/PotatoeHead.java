/**
 * PotatoeHead class that contains contents of a PotatoeHead. inherits all methods and variables from Character class
 */
public class PotatoeHead extends Character{
    /**
     * Default constructor that creates the base of a potatoehead
     */
    public PotatoeHead() 
    {
        this.sections.add("");
        this.sections.add("   ______");
        this.sections.add("  /      \\ ");
        this.sections.add(" |        | "); 
        this.sections.add(" |        | ");
        this.sections.add(" |        | "); 
        this.sections.add("  \\     / ");
        this.sections.add("   \\___/ ");
    }
    
}
