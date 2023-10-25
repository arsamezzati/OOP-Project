package Characters.Enemies;

import Characters.Enemy;

public class IceKing extends Enemy {
    public IceKing(int level){
        this.setName("Ice King");
        this.setMaxHealth((int) (100*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(25+level);
    }
}
