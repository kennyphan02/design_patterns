import java.util.*;
import java.util.Scanner;

public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;
    public ArithemeticGame(){
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.score = score;
        reader = new Scanner(System.in);
        this.state = easyState;
    }
    
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
        System.out.println(answer);
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
    
    public void setState(State state){
        this.state = state;
    }
    public State getEasyState(){
        return easyState;
    }
    public State getMediumState(){
        return mediumState;
    }
    public State getHardState(){
        return hardState;
    }
    



    
}
