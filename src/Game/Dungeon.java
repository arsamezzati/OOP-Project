package Game;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Queue;

import Characters.Enemy;
public class Dungeon {
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

}
