package Events;
import Characters.Player;
import Game.EnemyGenerator;

import java.util.Random;
public class EventManager {
    // list of events
    private static final String[] events = {"Dungeon","Enemy","Fountain","Treasure"};

    public static EventManager trigger(Player p){
        Random random = new Random();
        int randomNum = random.nextInt(events.length);
        String randomMember = events[randomNum];
        return switch (randomMember) {
            case "Dungeon" -> Dungeon.trigger(p);
            case "Enemy" -> EnemyGenerator.trigger(p);
            case "Fountain"-> Fountain.trigger(p);
            case "Treasure" -> Treasure.trigger(p);
            default -> throw new IllegalStateException("Unexpected value: " + randomMember);

        };



    }


}
