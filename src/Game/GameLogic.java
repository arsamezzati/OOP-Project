package Game;
import Characters.*;

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



}
