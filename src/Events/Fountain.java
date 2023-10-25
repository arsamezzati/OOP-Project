package Events;

import Characters.Player;

public class Fountain extends EventManager{
    public static Fountain trigger(Player p){
        System.out.println("You have found a fountain!");
        return new Fountain();

    }
}
