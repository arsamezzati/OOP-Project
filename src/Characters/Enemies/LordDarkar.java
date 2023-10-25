package Characters.Enemies;

import Characters.Enemy;

public class LordDarkar extends Enemy {
    public LordDarkar(int level){
        this.setName("Lord Drakar");
        this.setMaxHealth((int) (100*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(20+level);
    }
}
