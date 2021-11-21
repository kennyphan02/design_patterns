import java.util.*;
import java.util.Random;

public class Medium implements State {
    private ArithemeticGame game;
    private State state;
    private Random numberGenerator;
    private int randNum;
    private int randNumForOperand;
    
    public Medium(ArithemeticGame arithmeticMachine){
        this.game = arithmeticMachine;
        numberGenerator = new Random();
        this.randNum = randNum;
    }

    public int getNum(){
        this.randNum = numberGenerator.nextInt(51);
        return this.randNum;
    }

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

    public void levelUp(){
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }
    
    public void levelDown(){
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());

    }




    
}
