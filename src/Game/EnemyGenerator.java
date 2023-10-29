package Game;

import Characters.Enemies.*;
import Characters.Enemy;
import Characters.Player;
import Events.EventManager;
import Events.Fight;
import java.util.Random;

public class EnemyGenerator extends EventManager {
    private static final String[] enemies = {"Goblin", "Assassin", "Shadow", "HuntingTroll"};

    public static Enemy generateEnemy(Player p) {
        Random random = new Random();
        int num = random.nextInt(enemies.length);
        String enemy = enemies[num];
        return switch (enemy) {
            case "Goblin" -> new Goblin(p.getLevel());
            case "Assassin" -> new Assassin(p.getLevel());
            case "HuntingTroll" -> new HuntingTroll(p.getLevel());
            case "Shadow" -> new Shadow(p.getLevel());
            default -> throw new IllegalStateException("Unexpected Value: " + enemy);
        };
    }

    public static void handleEnemyEncounter(Player p) {
        Enemy enemy = generateEnemy(p);
        System.out.println("You've encountered a " + enemy.getName() + "!");
        int choice = GameLogic.choice("Do you want to fight?\n1) Yes\n2) No", 2);
        if (choice == 1) {
            Fight fight = new Fight(p, enemy);
            fight.startFight();
        } else {
            System.out.println("You chose to avoid the fight and continue on your journey.");
        }
    }
}
