/**
 * Hard class contains the content and methods of Hard level. Implements State interface.
 */

import java.util.*;
import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;
    private State state;
    private Random numberGenerator;
    private int randNum;
    private int randNumForOperand;
    
    /**
     * Default constructor that initalizes the private variables
     * @param arithmeticMachine
     */
    
    public Hard(ArithemeticGame arithmeticMachine){
        this.game = arithmeticMachine;
        numberGenerator = new Random();
        this.randNum = randNum;
    }

    /**
     * Gets a random num value depending on the difficulity and returns it
     */
    public int getNum(){
        this.randNum = numberGenerator.nextInt(101);
        return this.randNum;
    }

    /**
     * gets a random operation depending on the difficulity and returns it
     */
    public String getOperation(){
        randNumForOperand = numberGenerator.nextInt(4);
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
        if(randNumForOperand == 3){
            operand = "/";
        }
        return operand;
    }

    /**
     * Sets the state to the next difficulity after the score is greater than or equal to 3 
     */
    public void levelUp(){
        System.out.println("You are doing so well!!!!");
    }
   
    /**
     * Sets the state to the previous difficulity after the score is lesser than or equal to -3
     */
    public void levelDown(){
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }




    
}
