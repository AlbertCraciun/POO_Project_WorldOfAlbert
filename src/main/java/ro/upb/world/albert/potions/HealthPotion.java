package ro.upb.world.albert.potions;

import java.util.concurrent.ThreadLocalRandom;

public class HealthPotion implements Potion{
    int price;
    int weight;
    int regen;

    public HealthPotion() {
        price = 30;
        weight = 5;
        regen = ThreadLocalRandom.current().nextInt(30, 50 + 1);
    }

    @Override
    public int usePotion(int lv) {
        return regenValue() + 10 * lv;
    }
    @Override
    public int regenValue() {
        return regen;
    }
    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public int getWeight() {
        return weight;
    }


}
