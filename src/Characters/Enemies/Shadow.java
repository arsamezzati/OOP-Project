package Characters.Enemies;

import Characters.Enemy;

public class Shadow extends Enemy {
    public Shadow(int level){
        this.setName("Shadow");
        this.setMaxHealth((int) (50*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(5+level);
    }
}
