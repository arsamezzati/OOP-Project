package Game;
import Characters.*;
import java.util.Scanner;
public class GameLogic {
    public static void announce(String text){
        System.out.println("***************");
        System.out.println(text);
        System.out.println("***************");
    }
    public static void gameLoop(Player player){
        while (player.getStatus()) {
            announce("Player is Alive");
            announce("Press Enter to continue");
            Scanner sc = new Scanner(System.in);
            String enter = sc.next();
            if (enter.equalsIgnoreCase("exit")){
                player.setStatus(false);
            }

        }
    }
}
