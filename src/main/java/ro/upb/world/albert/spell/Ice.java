package ro.upb.world.albert.spell;

import java.util.concurrent.ThreadLocalRandom;

public class Ice extends Spell {
    public Ice() {
        name = "ice";
        dmg = ThreadLocalRandom.current().nextInt(10, 30 + 1);
        cost = 20;
    }
    @Override
    public int getDmg() {
        return dmg;
    }

    @Override
    public int getCost() {
        return 0;
    }
}
