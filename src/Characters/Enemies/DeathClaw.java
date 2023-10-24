package Characters.Enemies;

import Characters.Enemy;

public class DeathClaw  extends Enemy{
    public DeathClaw(int level){
        this.setName("DeathClaw");
        this.setMaxHealth((int) (50*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(3+level);
    }
}
