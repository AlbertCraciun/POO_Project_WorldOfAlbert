package ro.upb.world.albert.character;

public class Warrior extends Character {
    int maxWeightInv;

    Warrior(String name) {
        this.name = name;
        fireProtection = true;
        iceProtection = false;
        earthProtection = false;
        strength = 19;
        charisma = 5;
        dexterity = 5;
        maxHP = 130;
        currentHP = maxHP;
        maxMP = 70;
        currentMP = maxMP;
        level = 0;
        experience = 0;
        coordX = 0;
        coordY = 0;
        maxWeightInv = 6;
    }

    public Warrior() {
    }

    @Override
    public void receiveDamage(int d) {
    }
    @Override
    public void getDamage() {
    }
    @Override
    public void lvlUP() {
        if(experience % 30 == 0) {
            level++;
            strength += 1;
            dexterity += 1;
            charisma += 1;
            System.out.println("You achived lvl" + level + ".\n");
        }
    }
}
