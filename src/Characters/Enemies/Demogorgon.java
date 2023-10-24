package Characters.Enemies;

import Characters.Enemy;

public class Demogorgon extends Enemy {
    public Demogorgon(int level){
        this.setName("Demogorgon");
        this.setMaxHealth((int) (50*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(7+level);
    }
}
