package World_Of_Albert;

abstract public class Character extends Entity{
    String name;
    int coordX;
    int coordY;
    Inventory inv; //Potion type ?
    int exp;
    int lvl;
    int strength;
    int charisma;
    int dexterity;
    int maxWeightInv;

    abstract void lvlUP();

    void buyPotion(Potion p) {
        System.out.println("Poțiunea nu a fost cumparata!");
    }
    void addExp(int p) {
        exp += p;
        System.out.println("You got " + p + " xp for" + "[action]" + ".\n");
    }

}
