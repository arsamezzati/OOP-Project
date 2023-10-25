package Characters.Enemies;

import Characters.Enemy;

public class BloodQueen extends Enemy {
    public BloodQueen(int level){
        this.setName("Blood Queen");
        this.setMaxHealth((int) (100*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(15+level);
    }
}
