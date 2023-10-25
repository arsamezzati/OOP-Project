package Characters.Enemies;

import Characters.Enemy;

public class HuntingTroll extends Enemy {
    public HuntingTroll(int level){
        this.setName("Hunting Troll");
        this.setMaxHealth((int) (40*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(6+level);
    }
}
