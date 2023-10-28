package Characters.Enemies;

import Characters.Enemy;

public class Shadow extends Enemy {
    public Shadow(int level){
        super();
        this.setName("Shadow");
        this.setMaxHealth((int) (50*(level)));
        this.setCurHealth((int) (50*(level)));
        this.setLevel(level);
        this.setAttackDamage(5+level);
    }
}
