package Characters;

public class Enemy extends CharacterStats{
    public Enemy(String name,int health, int damage){
        this.setName(name);
        this.setMaxHealth(health);
        this.setAttackDamage(damage);
        this.setCurHealth(this.getMaxHealth());
    }
}
