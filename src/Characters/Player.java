package Characters;
import Items.*;
public class Player extends CharacterStats {
    public Player(String name,int health,int damage){
        this.setName(name);
        this.setAttackDamage(damage);
        this.setMaxHealth(health);
        this.setCurHealth(this.getMaxHealth());
        this.setStatus(true);
        this.setLevel(1);
    }
    public void equipItem(ItemsStats Item){
        this.setMaxHealth(this.getMaxHealth() + Item.getHealth());
        this.setAttackDamage(this.getAttackDamage() + Item.getAttackDamge());
    }
    public void unequipItem(ItemsStats Item){
        this.setMaxHealth(this.getMaxHealth() - Item.getHealth());
        this.setAttackDamage(this.getAttackDamage() - Item.getAttackDamge());
    }
}
