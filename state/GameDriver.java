/**
 * Class that contains the contents of the Arithemetic Game
 */

import java.util.Scanner;
public class GameDriver {
    private Scanner reader;
    private ArithemeticGame game;
    private static final String[] mainOptions = {"Answer a Question", "Quit"};

    /**
     * Default constructor that initalizes the private variables
     */
    public GameDriver() {
        reader = new Scanner(System.in);
        game = new ArithemeticGame();
    }

    /**
     * Method that gets user input. If the user inputs 1, the arithemetic game starts and displays a question. If the user inputs 2, the game ends
     */
    public void run() {
        System.out.println("Welcome to our Arithemetic Game");

        while(true) {
            int option = getUserOption();
            
            if(option == 1) {
                game.pressQuestionButton();
            } else if(option == 2){
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Sorry Invalid command");
            }
        }
    }
    /**
     * Gets the user options and prints them out
     * @return
     */
    private int getUserOption(){
        for(int i=0; i < mainOptions.length; i++){
            System.out.println((i+1) + ". " + mainOptions[i]);
        }
        return Integer.parseInt(reader.nextLine());
    }

    /**
     * Runs the driver
     * @param args
     */
    public static void main(String[] args) {
        GameDriver driver = new GameDriver();
        driver.run();
    }
}
