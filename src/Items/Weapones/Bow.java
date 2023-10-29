package Items.Weapones;

import Items.Weapon;

public class Bow  extends Weapon {
    public Bow(String name, int attack, int level) {
        super(name, attack + level);
    }
}
