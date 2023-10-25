package Characters.Enemies;

import Characters.Enemy;
public class LichKing extends Enemy {
    public LichKing(int level){
        this.setName("Lich King");
        this.setMaxHealth((int) (100*(level*0.5)));
        this.setCurHealth(this.getMaxHealth());
        this.setLevel(level);
        this.setAttackDamage(25+level);
    }
}
