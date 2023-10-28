package Characters.Enemies;

import Characters.Enemy;

public class Demogorgon extends Enemy {
    public Demogorgon(int level){
        super();
        this.setName("Demogorgon");
        this.setMaxHealth((int) (50*(level*1)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(7+level);
    }
}
