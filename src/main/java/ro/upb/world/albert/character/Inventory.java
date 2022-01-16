package ro.upb.world.albert.character;

import ro.upb.world.albert.potions.Potion;
import java.util.*;

public class Inventory {
    Character character;
    List <Potion> potions;
    int maxWeight;
    int coins;

    public Inventory(int maxWeight) {
        potions = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addPotion(Potion p) {
        potions.add(p);
        System.out.println(p.name + " added.\n");
        System.out.println("Potions in your inventory: "
                + potions);
    }
    public void removePotion(Potion p) {
        potions.remove(p);
        System.out.println(p.name + " used.\n");
        System.out.println("Potions in your inventory:"
                + potions);
    }
    public int remainWeight() {
        int g = 0;
        for (int i = 0; i < potions.size(); i++) {
            g += potions.get(i).getWeight();
        }
        return character.maxWeightInv - g;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<Potion> getPotions() {
        return potions;
    }
}
