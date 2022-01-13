package ro.upb.world.albert.potions;

public interface Potion {
    String name = null;
    int usePotion(int lv);
    int regenValue();
    int getPrice();
    int getWeight();
}
