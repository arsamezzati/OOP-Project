package Events;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Characters.Enemy;
import Characters.Player;
import Game.EnemyGenerator;
import Game.GameLogic;

public class Dungeon extends EventManager {
    public Dungeon(Player p){
        this.entryLevel = p.getLevel();

    }
    private int entryLevel;
    private boolean isRandom;
    public int getEntryLevel(){
        return this.entryLevel;
    }
    public void setEntryLevel(int amount){
        this.entryLevel = amount;
    }
    private String Boss;
    public String getBoss(){
        return this.Boss;
    }
    public void setBoss(String name){
        this.Boss = name;
    }
    private String sideEnemy;
    public String getSideEnemy(){
        return this.sideEnemy;
    }
    public void setSideEnemy(String name){
        this.sideEnemy = name;
    }
    private String loot;
    public String getLoot(){
        return this.loot;
    }
    public void setLoot(String item){
        this.loot = item;
    }
    private Queue<Enemy> enemyBossList = new LinkedList<>();
    private Queue<Enemy> sideEnemyList = new LinkedList<>();
    public Queue<Enemy> getSideEnemyList(){
        return this.sideEnemyList;
    }

    public void addEnemy(Enemy enemy){
        this.sideEnemyList.add(enemy);
    }
    public Enemy seeNextEnemyList(){
        return this.sideEnemyList.poll();
    }
    public Enemy getNextEnemyList(){
        return this.sideEnemyList.peek();
    }
    public static void trigger(Player p) {  // Changed return type to void
        GameLogic.announce("YOU FOUND A DUNGEON");
        int choice = GameLogic.choice("Do you want to explore it?\n1) Yes\n2) No", 2);
        if (choice == 1) {
            Dungeon d = new Dungeon(p);
            d.randomGen(p);
            GameLogic.dungeonLoop(d, p);
        }  // Moved the return statement inside the if block
    }
    public void randomGen(Player p){
        Enemy e1 = EnemyGenerator.generateEnemy(p);

        Enemy e2 = EnemyGenerator.generateEnemy(p);

        Enemy e3 = EnemyGenerator.generateEnemy(p);

        this.sideEnemyList.offer(e1);
        this.sideEnemyList.offer(e2);
        this.sideEnemyList.offer(e3);
    }

}
