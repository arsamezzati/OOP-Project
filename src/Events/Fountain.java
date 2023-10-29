package Events;

import Characters.Player;
import Game.GameLogic;

public class Fountain extends EventManager{
    public static void trigger(Player p){
        GameLogic.announce("You have found a fountain!");
        System.out.println("Do you want to use it to regain your health?");
        int choice = GameLogic.choice("1) Yes\n2) No, Continue your journey",2);
        if (choice == 1){
            p.setCurHealth(p.getMaxHealth());
            System.out.println("your health has been restored!");
        }


    }
}
