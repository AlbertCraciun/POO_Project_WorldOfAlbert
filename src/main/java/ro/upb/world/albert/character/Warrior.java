package ro.upb.world.albert.character;

public class Warrior extends Character {
    int maxWeightInv;

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
