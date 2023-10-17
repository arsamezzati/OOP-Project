package Characters;

public class Player extends CharacterStats {
    public Player(String name,int health,int damage){
        this.setName(name);
        this.setAttackDamage(damage);
        this.setMaxHealth(health);
        this.setCurHealth(this.getMaxHealth());
        this.setStatus(true);
    }
}
