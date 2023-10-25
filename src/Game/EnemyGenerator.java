package Game;

import Characters.Enemies.Goblin;
import Characters.Enemy;
import Characters.Player;
import java.util.Random;
import Characters.Enemies.*;

public class EnemyGenerator extends Event{
    private String[] enemies = {"goblin","Assassin","Shadow","HuntingTroll"};

    public Enemy generateEnemy(Player p){
        Random random = new Random();
        int num = random.nextInt(enemies.length);
        String enemy = enemies[num];
        return switch (enemy) {
            case ("goblin") -> new Goblin(p.getLevel());
            case ("Assassin") -> new Assassin(p.getLevel());
            case ("Shadow") -> new Shadow(p.getLevel());
            case ("HuntingTroll") -> new HuntingTroll(p.getLevel());
            default -> throw new IllegalStateException("Unexpected Value: " + enemy);
        };

    }

}
