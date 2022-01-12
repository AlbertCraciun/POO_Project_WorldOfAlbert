package ro.upb.world.albert.potions;

public interface Potion {
    String name = null;
    public int usePotion(int lv);
    public int regenValue();
    public int getPrice();
    public int getWeight();
}
