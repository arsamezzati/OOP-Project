package Game;

import Characters.Enemies.Goblin;
import Characters.Enemy;
import Characters.Player;
import java.util.Random;
import Characters.Enemies.*;
import Events.EventManager;

public class EnemyGenerator extends EventManager {
    private static final String[] enemies = {"Goblin","Assassin","Shadow","HuntingTroll"};

    public static Enemy generateEnemy(Player p){
        Random random = new Random();
        int num = random.nextInt(enemies.length);
        String enemy = enemies[num];
        return switch (enemy) {
            case ("Goblin") -> new Goblin(p.getLevel());
            case ("Assassin") -> new Assassin(p.getLevel());
            case ("HuntingTroll") -> new HuntingTroll(p.getLevel());
            case "Shadow" -> new Shadow(p.getLevel());
            default -> throw new IllegalStateException("Unexpected Value: " + enemy);
        };

    }

}
