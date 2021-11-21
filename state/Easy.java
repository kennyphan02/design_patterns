import java.util.*;
import java.util.Random;

public class Easy implements State {
    private ArithemeticGame game;
    private Random numberGenerator;
    private int randNum;
    private int randNumForOperand;
    
    public Easy(ArithemeticGame arithmeticMachine){
        this.game = arithmeticMachine;
        numberGenerator = new Random();
        this.randNum = randNum;
    }

    public int getNum(){
        this.randNum = numberGenerator.nextInt(11);
        return this.randNum;
    }

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

    public void levelUp(){
        System.out.println("You've been advanced to medium mode");
        game.setState(game.getMediumState());
        
    }
    
    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study");
    }




    
}
