package Items;
import Characters.*;
public class Armor extends ItemsStats{
    public  Armor(String name,int health){
        this.setName(name);
        this.setHealth(health);
        this.setAttackDamge(0);
    }
}
