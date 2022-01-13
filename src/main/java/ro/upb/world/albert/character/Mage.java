package ro.upb.world.albert.character;

public class Mage extends Character {
    int maxWeightInv;

    public Mage() {
    }

    Mage(String name) {
        this.name = name;
        fireProtection = false;
        iceProtection = true;
        earthProtection = false;
        strength = 10;
        charisma = 17;
        dexterity = 10;
        maxHP = 100;
        currentHP = maxHP;
        maxMP = 130;
        currentMP = maxMP;
        level = 0;
        experience = 0;
        X = 0;
        Y = 0;
        maxWeightInv = 2;
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
            System.out.println("You achived lvl" + level);
        }
    }
}
