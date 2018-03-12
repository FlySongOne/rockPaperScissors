package demoSECA;

// player class that holds user's input
public class Player {
    private String userInput;
    private String playerName;

    public Player(){
        userInput = "";
        //playerName = "Player";
    }

    // user's input setter
    public void userPick(String userPick){
        userInput = userPick;
    }

    // user's input getter
    public String getUserInput(){
        return userInput;
    }

//    public String getPlayerName(){
//        return playerName;
//    }
}
