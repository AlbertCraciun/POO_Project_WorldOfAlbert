package ro.upb.world.albert.potions;

public class HealthPotion implements Potion{
    int price;
    int weight;
    int regen;

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