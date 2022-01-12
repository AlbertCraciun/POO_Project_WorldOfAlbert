package ro.upb.world.albert.character;

import ro.upb.world.albert.character.Character;
import ro.upb.world.albert.potions.Potion;

import java.util.*;

public class Inventory {
    List potions;
    int maxWeight;
    int coins;
    void addPotion(Potion p) {
        potions.add(p);
        System.out.println(p.name + " added.\n");
        System.out.println("Potions in your inventory: "
                + potions + "\n");
    }
    void removePotion(Potion p) {
        potions.remove(p);
        System.out.println(p.name + " used.\n");
        System.out.println("Potions in your inventory:"
                + potions + "\n");
    }
    int remainWeight(Character c) {
        return c.maxWeightInv - potions.size();
    }
}