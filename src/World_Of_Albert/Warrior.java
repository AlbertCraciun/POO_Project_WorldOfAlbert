package World_Of_Albert;

public class Warrior extends Character{
    int maxWeightInv;

    Warrior() {
        name = "An warrior";
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
        lvl = 0;
        exp = 0;
        coordX = 0;
        coordY = 0;
        maxWeightInv = 6;
    }
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
        lvl = 0;
        exp = 0;
        coordX = 0;
        coordY = 0;
        maxWeightInv = 6;
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
