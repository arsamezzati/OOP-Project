package Items.Weapones;

import Items.Weapon;

public class Riffle extends Weapon {
    public Riffle(String name, int attack, int level) {
        super(name, attack + level);
    }
}
