package ro.upb.world.albert.character;

public class Rogue extends Character {

    Rogue(String name) {
        this.name = name;
        fireProtection = false;
        iceProtection = false;
        earthProtection = true;
        strength = 7;
        charisma = 12;
        dexterity = 18;
        maxHP = 70;
        currentHP = maxHP;
        maxMP = 100;
        currentMP = maxMP;
        level = 0;
        experience = 0;
        coordX = 0;
        coordY = 0;
        maxWeightInv = 4;
    }

    public Rogue() {
    }

    @Override
    public void receiveDamage(int d) {}
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
