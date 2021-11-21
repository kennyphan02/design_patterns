/**
 * Medium class contains the content and methods of medium level. Implements State interface.
 */

import java.util.*;
import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;
    private State state;
    private Random numberGenerator;
    private int randNum;
    private int randNumForOperand;
    

    /**
     * Default constructor that initalizes the private variables
     * @param arithmeticMachine
     */
    
    public Medium(ArithemeticGame arithmeticMachine){
        this.game = arithmeticMachine;
        numberGenerator = new Random();
        this.randNum = randNum;
    }

    /**
     * Gets a random num value depending on the difficulity and returns it
     */
    public int getNum(){
        this.randNum = numberGenerator.nextInt(51);
        return this.randNum;
    }

    /**
     * gets a random operation depending on the difficulity and returns it
     */
    public String getOperation(){
        randNumForOperand = numberGenerator.nextInt(3);
        String operand = "";
        if(randNumForOperand == 0){
            operand = "+";
        }
        if(randNumForOperand == 1){
            operand = "-";
        }
        if(randNumForOperand == 2){
            operand = "*";
        }
        return operand;
    }

    /**
     * Sets the state to the next difficulity after the score is greater than or equal to 3 
     */
    public void levelUp(){
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }
    

    /**
     * Sets the state to the previous difficulity after the score is lesser than or equal to -3
     */
    public void levelDown(){
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());

    }




    
}
