import java.util.*;

public class TextGame{

    Player you;
    String location;
    Scanner input = new Scanner(System.in);



    // private void Base(){
    //     //code to be written here
    // }

    public static void main(String[] args){
        //continue code here!

        TextGame game = new TextGame();
        game.you = new Player();
        game.location = "base";

        System.out.println("\n\n\n\n\nHello! Welcome to the game!\nEnter player name here: ");
        game.you.setName(game.input.nextLine());
    }


}