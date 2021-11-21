/**
 * ArithemeticGame class that contains the contents and methods of the game
 */
import java.util.*;
import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * Default constructor that initalizes the private variables
     */
    public ArithemeticGame(){
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.score = score;
        reader = new Scanner(System.in);
        this.state = easyState;
    }

    /**
     * Gets two numbers and an operation from the state, present the user with a question, and gets the user answer. If the answer is correct, score
     * is incremented by 1, else decremented by 1. If score is greater or equal than 3, the user moves on to the next state. If score is less than or equal to 3
     * the user moves on the previous state.
     */
    public void pressQuestionButton(){
        int answer;
        int num1 = this.state.getNum();
        int num2 = this.state.getNum();
        String operand = this.state.getOperation();

        System.out.println(num1 + " " + operand + " " + num2 + ":");
        if(operand.equals("+")){
            answer = num1 + num2;
        }
        else if(operand.equals("-")){
            answer = num1 - num2;
        } 
        else if(operand.equals("/")){
            answer = num1 / num2;
        }
        else
        {
            answer = num1 * num2;
        }
        int input = reader.nextInt();
        if(input == answer){
            System.out.println("Correct");
            this.score++;
        }
        else
        {
            System.out.println("Incorrect");
            this.score--;
        }
        if(this.score >= 3){
            this.state.levelUp();
            this.score = 0;
        }
        if(this.score <= -3){
            this.state.levelDown();;
            this.score = 0;
        }
    }

    /**
     * Sets the state in this class
     * @param state type State
     */
    public void setState(State state){
        this.state = state;
    }

    /**
     * Returns easyState
     * @return
     */
    public State getEasyState(){
        return easyState;
    }

    /**
     * Returns mediumState 
     * @return
     */
    public State getMediumState(){
        return mediumState;
    }

    /**
     * Returns hardState
     * @return
     */
    public State getHardState(){
        return hardState;
    }
    



    
}
