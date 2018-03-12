package demoSECA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Game g1 = new Game();
        Player p1 = new Player();
        Record r1 = new Record();

        String input = "";
        String input2 = "";

        do {
            // prompt the game, its returned value, user's input, is assigned to input variable
            input = g1.prompt();

            // if input is "play", game will be played
            if(input.equals("play")){
                // play function called, player's choice among rock, paper, and scissors, will be assigned to input2
                input2 = g1.play();

                // if not typed "quit",
                if(!input2.equals("quit")) { // if user's input is quit, go back to main menu

                    // setting user's pick to player class setter
                    p1.userPick(input2);

                    // computer choose one of three choices
                    g1.computerChoice();

                    // decides winner by comparing user's input and computer's choice
                    g1.winner(p1.getUserInput());

                    // update history in record class
                    r1.updateHistory(g1.getGameStatus(),g1.getPlayerPick(),g1.getComputerChoice());
                }
            // if input is histroy, announcingHistory class will be called
            }else if(input.equals("history")){
                r1.announcingHistory();
            // if user's input is not play, history or quit, it will print out "invalid". Then, game will be prompted again.
            }else if(!(input.equals("play") || input.equals("history") || input.equals("quit"))){
                System.out.println("Invalid input. Try again");
            }

        }while( !input.equals("quit"));   //if input is quit, do while will stop looping.

    }
}
