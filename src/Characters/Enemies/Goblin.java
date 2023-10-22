package Characters.Enemies;

import Characters.Enemy;

public class Goblin extends Enemy {

    public Goblin(int level) {
        this.setName("Goblin");
        this.setMaxHealth((int) (40*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(2+level);
    }
}
