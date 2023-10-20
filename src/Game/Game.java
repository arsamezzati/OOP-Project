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
        GameLogic.choice("Enter a number between 1 and 4",4);
        gameLoop(player);
        player.getInfo();

    }
    public static void gameLoop(Player player){
        while (player.getStatus()) {
            player.getInfo();
            Enemy e1 = new Enemy("Asqar",20,1);
            Fight f1 = new Fight(player,e1);
            f1.startFight();
            Scanner sc = new Scanner(System.in);
            String enter = sc.next();
            if (enter.equalsIgnoreCase("exit")){
                player.setStatus(false);
            }

        }
    }

}
