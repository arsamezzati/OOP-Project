package Game;
import java.util.Scanner;
import Characters.*;
public abstract class Game {
    public static void startGame(){
        GameLogic.announce("Please enter your Character name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Player player = new Player(name,100,20);
        GameLogic.announce("Your Character name is "+player.getName()+".");

    }

}
