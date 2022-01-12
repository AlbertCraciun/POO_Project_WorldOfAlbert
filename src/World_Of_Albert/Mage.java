package World_Of_Albert;

public class Mage extends Character {
    int maxWeightInv;

    Mage() {
        name = "An warrior";
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
        lvl = 0;
        exp = 0;
        coordX = 0;
        coordY = 0;
        maxWeightInv = 2;
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
        lvl = 0;
        exp = 0;
        coordX = 0;
        coordY = 0;
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
        if(exp % 30 == 0) {
            lvl++;
            strength += 1;
            dexterity += 1;
            charisma += 1;
            System.out.println("You achived lvl" + lvl + ".\n");
        }
    }
}
