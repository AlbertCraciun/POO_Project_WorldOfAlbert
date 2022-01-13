package ro.upb.world.albert.spell;

import java.util.concurrent.ThreadLocalRandom;

public class Fire extends Spell {
    public Fire() {
        name = "fire";
        dmg = ThreadLocalRandom.current().nextInt(25, 40 + 1);
        cost = 30;
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
