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
    String profession;
    int experience;
    int level;

    int X;
    int Y;

    int strength;
    int charisma;
    int dexterity;
    int maxWeightInv;

    Inventory inv; //Potion type ?

    public Character() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setLevel(int level) {
        this.level = level;
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
    public void buyPotion(Potion p) {
        System.out.println("Poțiunea nu a fost cumparata!");
    }
    public void addExp(int p) {
        experience += p;
        System.out.println("You got " + p + " xp for" + "[action]" + ".\n");
    }

    @Override
    public String toString() {
        return "Character{" +
                "\n\t" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", experience=" + experience +
                ", level=" + level +
                ",\n\t" +
                "strength=" + strength +
                ", charisma=" + charisma +
                ", dexterity=" + dexterity +
                ",\n\t" +
                "fireProtection=" + fireProtection +
                ", iceProtection=" + iceProtection +
                ", earthProtection=" + earthProtection +
                ",\n\t" +
                "maxHP=" + maxHP +
                ", maxMP=" + maxMP +
                ", currentHP=" + currentHP +
                ", currentMP=" + currentMP +
                ",\n\t" +
                "abilities=" + abilities +
                ",\n\t" +
                "X=" + X +
                ", Y=" + Y +
                ",\n\t" +
                "maxWeightInv=" + maxWeightInv +
                ", inv=" + inv +
                '}';
    }
}
