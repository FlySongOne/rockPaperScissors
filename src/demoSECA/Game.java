package demoSECA;


import java.util.Scanner; // for input

public class Game {


    private String computerChoice;
    private String playerPick;
    private String gameStatus;

    Scanner reader = new Scanner(System.in);

    public Game(){
       computerChoice = "";
       playerPick = "";
       gameStatus ="";
    }
    // this function prints welcome and menu, and asks user to type an input
    // no parameter
    // return input value from user
    public String prompt(){
        String input = "";
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println();
        System.out.println("MAIN MENU");
        System.out.println("==========");
        System.out.println("1. Type 'play' to play");
        System.out.println("2. Type 'history' to view your game history");
        System.out.println("Type 'quit' to stop playing");
        input = reader.next().toLowerCase();   // used toLowerCase() to make an input not case sensitive
        return input;
    }

    // this function prompting for user input
    // no parameter
    // return valid input value
    public String play(){
        boolean invalid = false;
        String input = "";
        System.out.println("Type in 'rock' 'paper' or 'scissors' to play.");
        System.out.println("Type 'quit' to go back to the Main Menu");
        // do while loops runs if input is invalid
        do {
            input = reader.next();
            // validate input, if not rock, paper, scissors and quit, it requests input again.
            if( !((input.equals("rock")) || (input.equals("paper")) || (input.equals("scissors")) || (input.equals("quit")))){
                invalid = true;
                System.out.println("Your input is invalid. Try again");

            }else{
                // if valid value, set invalid variable as false
                invalid = false;
            }

        }while(invalid);

        return input;
    }

    // computer's choice setter : it chooses a random number from 1 to 3 and then set computer's choice variable
    // no parameter
    // no return
    public void computerChoice(){
        int num = (int )(Math.random() * 3 + 1);

        if(num == 1){
            computerChoice = "Rock";
        }else if(num == 2 ){
            computerChoice = "Paper";
        }else if(num == 3 ){
            computerChoice = "Scissors";
        }
        System.out.println("Computer picks: " + computerChoice);
    }

    // computer's choice getter
    public String getComputerChoice(){
        return computerChoice;
    }

    // player's pick getter
    public String getPlayerPick(){
        return playerPick;
    }

    // game status getter
    public String getGameStatus(){
        return gameStatus;
    }

    // the function takes user's input and compares it with computer's choice, then set gameStatus whether player wins,loses or draws.
    // parameter: user's input
    // no return
    public void winner(String userInput) {
        playerPick = userInput;

        if (userInput.equals("rock")) {

            if (computerChoice.equals("Scissors")) {
                System.out.println("You win!");
                gameStatus = "WIN";
            } else if (computerChoice.equals("Paper")) {
                System.out.println("You lose");
                gameStatus= "LOSS";
            } else if (computerChoice.equals("Rock")) {
                System.out.println("Draw!");
                gameStatus = "DRAW";
            }

        } else if (userInput.equals("paper")) {

            if (computerChoice.equals("Scissors")) {
                System.out.println("You lose!");
                gameStatus= "LOSS";
            } else if (computerChoice.equals("Paper")) {
                System.out.println("Draw!");
                gameStatus = "DRAW";
            } else if (computerChoice.equals("Rock")) {
                System.out.println("You win!");
                gameStatus = "WIN";
            }
        } else if (userInput.equals("scissors")) {
            if (computerChoice.equals("Scissors")) {
                System.out.println("Draw!");
                gameStatus = "DRAW";
            } else if (computerChoice.equals("Paper")) {
                System.out.println("You win!");
                gameStatus = "WIN";
            } else if (computerChoice.equals("Rock")) {
                System.out.println("You lose!");
                gameStatus = "LOSS";
            }

        }

    }

}
