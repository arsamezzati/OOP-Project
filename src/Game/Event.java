package Game;
import Characters.Enemy;
import Characters.Player;

import java.util.Random;
public class Event {
    // list of events
    private static final String[] events = {"Shop","Dungeon","Enemy","Fountain","Wisdom","Treasure"};

    public static Event trigger(Player p){
        Random random = new Random();
        int randomNum = random.nextInt(events.length);
        String randomMember = events[randomNum];
        return switch (randomMember) {
            case "Dungeon" -> Dungeon.trigger(p);
            case "Enemy" -> EnemyGenerator.trigger(p);
            default -> throw new IllegalStateException("Unexpected value: " + randomMember);
        };



    }


}
