package Characters.Enemies;

import Characters.Enemy;

public class Assassin extends Enemy {
    public Assassin(int level){
        this.setName("Assassin");
        this.setMaxHealth((int) (40*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(4+level);
    }
}
