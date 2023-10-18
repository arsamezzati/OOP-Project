import java.util.ArrayList;
import java.util.Arrays;
import Characters.Enemy;
public class Dungeons {
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
    private ArrayList<Enemy> enemyBoosList = new ArrayList<Enemy>(Arrays.<Enemy>asList());
    private ArrayList<Enemy> sideEnemyList = new ArrayList<Enemy>(Arrays.<Enemy>asList());
}
