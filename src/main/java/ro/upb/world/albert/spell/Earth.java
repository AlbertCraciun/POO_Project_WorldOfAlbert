package ro.upb.world.albert.spell;

import java.util.concurrent.ThreadLocalRandom;

public class Earth extends Spell {
    public Earth() {
        name = "earth";
        dmg = ThreadLocalRandom.current().nextInt(20, 35 + 1);
        cost = 25;
    }
    @Override
    public int getDmg() {
        return dmg;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
