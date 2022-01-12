package ro.upb.world.albert.character;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import ro.upb.world.albert.potions.Potion;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "profession")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Warrior.class, name = "Warrior"),
        @JsonSubTypes.Type(value = Mage.class, name = "Mage"),
        @JsonSubTypes.Type(value = Rogue.class, name = "Rogue")
})
public abstract class Character extends Entity{
    String name;
    int coordX;
    int coordY;
    Inventory inv; //Potion type ?
    int experience;
    int level;
    int strength;
    int charisma;
    int dexterity;
    int maxWeightInv;
    String profession;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public String getProfession() {
        return profession;
    }

    abstract void lvlUP();

    void buyPotion(Potion p) {
        System.out.println("Poțiunea nu a fost cumparata!");
    }
    void addExp(int p) {
        experience += p;
        System.out.println("You got " + p + " xp for" + "[action]" + ".\n");
    }

}
