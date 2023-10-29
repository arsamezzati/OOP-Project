package Items.Weapones;

import Items.Weapon;

public class Pistol extends Weapon {
    public Pistol(String name, int attack, int level) {
        super(name,attack + level);
    }
}
