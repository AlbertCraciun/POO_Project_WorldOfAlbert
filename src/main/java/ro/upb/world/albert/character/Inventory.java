package ro.upb.world.albert.character;

import ro.upb.world.albert.potions.Potion;
import java.util.*;

public class Inventory {
    List <Potion> potions;
    int maxWeight;
    int coins;

    public Inventory(int maxWeight) {
        potions = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    void addPotion(Potion p) {
        potions.add(p);
        System.out.println(p.name + " added.\n");
        System.out.println("Potions in your inventory: "
                + potions);
    }
    void removePotion(Potion p) {
        potions.remove(p);
        System.out.println(p.name + " used.\n");
        System.out.println("Potions in your inventory:"
                + potions);
    }
    int remainWeight(Character c) {
        int g = 0;
        for (int i = 0; i < potions.size(); i++) {
            g += potions.get(i).getWeight();
        }
        return c.maxWeightInv - g;
    }
}
