package ro.upb.world.albert.spell;

public abstract class Spell {
    String name;
    int dmg;
    int cost;
    public abstract int getDmg();
    public abstract int getCost();
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Spell{" +
                "name='" + name + '\'' +
                ", dmg=" + dmg +
                ", cost=" + cost +
                '}';
    }
}
