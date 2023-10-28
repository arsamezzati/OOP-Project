package Game;
import Characters.*;
import Events.Dungeon;
import Events.Fight;

import java.util.InputMismatchException;
import java.util.Scanner;
public class GameLogic {
    public static void announce(String text){
        System.out.println("***************");
        System.out.println(text);
    }

    public static int choice(String question, int choices) {
        announce(question);
        Scanner sc = new Scanner(System.in);
        int choice = -1; // Initializing with an invalid value

        while (choice < 1 || choice > choices) {
            try {
                choice = sc.nextInt();

                if (choice < 1 || choice > choices) {
                    System.out.println("Please enter a number between 1 and " + choices + "!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                sc.next(); // Consume the invalid token to avoid infinite loop
            }
        }
        return choice;
    }
    public static Boolean gameStatus(Player p){
        return p.getStatus();

    }
    public static void dungeonLoop(Dungeon d, Player p){
        while(!d.getSideEnemyList().isEmpty()){

            System.out.println(d.getSideEnemyList());
            Enemy en = d.getNextEnemyList();
            announce("Choose your next move");
            Scanner sc = new Scanner(System.in);
            int choice = choice("1)Fight "+ d.seeNextEnemyList().getName()+"\n2)Quit Dungeon",2);
            switch (choice){
                case (1):

                    en.getInfo();
                    Fight f1 = new Fight(p,en);
                    f1.startFight();
                case 2:
                    break;
            }



        }


    }



}
