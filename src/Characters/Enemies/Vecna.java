package Characters.Enemies;

import Characters.Enemy;

public class Vecna extends Enemy {
    public Vecna(int level){
        this.setName("Vecna");
        this.setMaxHealth((int) (100*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(30+level);
    }
}
