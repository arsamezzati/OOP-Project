package Items;

public class Weapon extends ItemsStats{
    public Weapon(String name,int attack){
        this.setName(name);
        this.setAttackDamge(attack);
        this.setHealth(0);
    }

}
