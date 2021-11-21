/**
 * Easy class contains the content and methods of Easy level. Implements State interface.
 */
import java.util.*;
import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;
    private Random numberGenerator;
    private int randNum;
    private int randNumForOperand;

    /**
     * Default constructor that initalizes the private variables
     * @param arithmeticMachine
     */
    
    public Easy(ArithemeticGame arithmeticMachine){
        this.game = arithmeticMachine;
        numberGenerator = new Random();
        this.randNum = randNum;
    }

    /**
     * Gets a random num value depending on the difficulity and returns it
     */
    public int getNum(){
        this.randNum = numberGenerator.nextInt(11);
        return this.randNum;
    }

    /**
     * gets a random operation depending on the difficulity and returns it
     */
    public String getOperation(){
        randNumForOperand = numberGenerator.nextInt(2);
        String operand = "";
        if(randNumForOperand == 0){
            operand = "+";
        }
        if(randNumForOperand == 1){
            operand = "-";
        }
        return operand;
    }

    /**
     * Sets the state to the next difficulity after the score is greater than or equal to 3 
     */
    public void levelUp(){
        System.out.println("You've been advanced to medium mode");
        game.setState(game.getMediumState());
        
    }

    /**
     * Sets the state to the previous difficulity after the score is lesser than or equal to -3
     */
    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study");
    }




    
}
