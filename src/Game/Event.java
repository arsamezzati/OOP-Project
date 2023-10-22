package Game;
import java.util.Random;
public class Event {
    // list of events
    private static final String[] events = {"Shop","Dungeon","Enemy","Fountain","Wisdom","Treasure"};

    public static Object randomEvent(){
        Random random = new Random();
        int randomNum = random.nextInt(events.length);
        String randomMember = events[randomNum];
        if (randomMember.equals("Dungeon")){
            Dungeon d = new Dungeon(1);

        } else if (randomMember.equals("Enemy")) {


        }

        return 0;
    }

}
