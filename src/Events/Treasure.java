package Events;

import Characters.Player;

public class Treasure extends EventManager{
    public static void trigger(Player p){
        System.out.println("YOU FOUND A TREASURE");

    }
}
