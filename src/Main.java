import Characters.Enemies.*;
import Characters.*;
import Events.Dungeon;
import Events.EventManager;
import Game.*;
import Characters.Enemies.Shadow;
import Items.*;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        Player p = new Player(name,200,30);
        while(GameLogic.gameStatus(p)){
            GameLogic.announce("Choose your next move");
            int choice = GameLogic.choice("1) Explore \n2)Take the easy way out! (Game Over)",2);
            if (choice == 1){
                EventManager.trigger(p);
            }else p.setStatus(false);

        }

    }
}
