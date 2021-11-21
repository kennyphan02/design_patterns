import java.util.*;
import java.util.Random;

public class Hard implements State {
    private ArithemeticGame game;
    private State state;
    private Random numberGenerator;
    private int randNum;
    private int randNumForOperand;
    
    public Hard(ArithemeticGame arithmeticMachine){
        this.game = arithmeticMachine;
        numberGenerator = new Random();
        this.randNum = randNum;
    }

    public int getNum(){
        this.randNum = numberGenerator.nextInt(101);
        return this.randNum;
    }

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

    public void levelUp(){
        System.out.println("You are doing so well!!!!");
    }
    
    public void levelDown(){
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }




    
}
