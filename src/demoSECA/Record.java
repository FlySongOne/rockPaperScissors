package demoSECA;

import java.util.ArrayList;

// Record class has an ArrayList to hold game history
public class Record extends Game{
    private String gameStatus;
    private String playerPick;
    private String computerChoice;

    public Record(){

        gameStatus = "";
        playerPick = "";
        computerChoice = "";

    }

    ArrayList<String> history = new ArrayList<String>();

    // this function adds a game history to history ArrayList
    // arguments: game winning status, player's pick, and computer's pick
    // No return value
    public void updateHistory(String status, String plyPick, String cptPick ){
        gameStatus = status;
        playerPick = plyPick;
        computerChoice = cptPick;
        // add game status, player's pick and computer's pick to arraylist
        history.add(gameStatus +": " + "Player-" + playerPick+" computer-"+computerChoice);
    }

    // the function prints out history of this game
    // no argument
    // return history ArrayList that has all game history
    public ArrayList<String> announcingHistory(){

        System.out.println("=== GAME HISTORY ===");
        // loop through every element in history arraylist
        for(int i = 0; i < history.size(); i++){
            System.out.println(history.get(i));
        }
        return history;
    }
}
