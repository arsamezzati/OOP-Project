package Events;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Characters.Enemy;
import Characters.Player;
import Game.EnemyGenerator;
import Game.GameLogic;

public class Dungeon extends EventManager {
    public Dungeon(int level){
        this.entryLevel = level;

    }
    private int entryLevel;
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
    public void addEnemy(Enemy enemy){
        this.sideEnemyList.add(enemy);
    }
    public Enemy getNextEnemyList(){
        return this.sideEnemyList.poll();
    }
    public static Dungeon trigger(Player p){
        GameLogic.announce("YOU FOUND A DUNGEON");
        System.out.println("Do you want to explore it?");
        int choice = GameLogic.choice("1) Yes\n2) No",2);
        if (choice == 1){
            Dungeon d = new Dungeon(p.getLevel());



        }
        Scanner sc = new Scanner(System.in);

        return new Dungeon(p.getLevel());
    }
    public void randomGen(Player p){
        Enemy e1 = EnemyGenerator.generateEnemy(p);
        Enemy e2 = EnemyGenerator.generateEnemy(p);
        Enemy e3 = EnemyGenerator.generateEnemy(p);
        this.sideEnemyList.add(e1);
        this.sideEnemyList.add(e2);
        this.sideEnemyList.add(e3);
    }

}
