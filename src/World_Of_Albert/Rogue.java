package World_Of_Albert;

public class Rogue extends Character{

    Rogue() {
        name = "An warrior";
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
        lvl = 0;
        exp = 0;
        coordX = 0;
        coordY = 0;
        maxWeightInv = 4;
    }
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
        lvl = 0;
        exp = 0;
        coordX = 0;
        coordY = 0;
        maxWeightInv = 4;
    }

    @Override
    public void receiveDamage(int d) {}
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
