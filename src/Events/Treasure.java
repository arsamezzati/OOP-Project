package Events;

import Characters.Player;

public class Treasure extends EventManager{
    public static EventManager trigger(Player p){
        System.out.println("YOU FOUND A TREASURE");
        return new Treasure();
    }
}
