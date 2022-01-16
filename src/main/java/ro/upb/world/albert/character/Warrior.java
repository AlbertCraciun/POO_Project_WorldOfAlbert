package ro.upb.world.albert.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ro.upb.world.albert.spell.Earth;
import ro.upb.world.albert.spell.Fire;
import ro.upb.world.albert.spell.Ice;
import ro.upb.world.albert.spell.Spell;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@JsonIgnoreProperties({"damage"})
public class Warrior extends Character {
    public Warrior() {
        currentHP = maxHP = 100;
        currentMP = maxMP = 50;
        strength = 10;
        charisma = 4;
        dexterity = 7;
        maxWeightInv = 30;
        inv = new Inventory(maxWeightInv);
        profession = "Warrior";
        fireProtection = true;
        abilities = new ArrayList<>();
        int numAbilities = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        for (int i = 0; i < numAbilities; i++) {
            double x = Math.random();
            if (x <= 0.33) {
                Spell spell1 = new Earth();
                Spell spell2 = new Fire();
                abilities.add(spell1);
                abilities.add(spell2);
            }
            else if (x <= 0.66) {
                Spell spell1 = new Fire();
                Spell spell2 = new Ice();
                abilities.add(spell1);
                abilities.add(spell2);
            }
            else if (x <= 1) {
                Spell spell1 = new Ice();
                Spell spell2 = new Earth();
                abilities.add(spell1);
                abilities.add(spell2);
            }
        }
    }

    @Override
    public void receiveDamage(int d, String spellType) {
        double x = Math.random();
        int coef = charisma * 2/10 + dexterity + 3/10;
        if(spellType.equals("basic")) {
            currentHP -= d * x * 10 - coef;
        }
        if(spellType.equals("fire")) {
            System.out.println(getProfession() + " " + getName()
                    + "has a powerful fire protection.");
        }
        if(spellType.equals("ice")) {
            if(x <= 0.5) {
                currentHP -= d - coef;
            }
            if(x > 0.5) {
                currentHP -= d*2 - coef * 2;
            }
        }
        if(spellType.equals("earth")) {
            if(x <= 0.3) {
                currentHP -= d / 2 - coef;
            }
            if(x > 0.3 && x < 0.7) {
                currentHP -= d;
            }
            if(x >= 0.7) {
                currentHP -= d * 2/3 - coef;
            }
        }
    }
    @Override
    public int getDamage() {
        double x = Math.random();
        int d = strength * 5/10 + charisma * 3/10 + dexterity + 2/10;
        if(x <= 0.2)
            return d*2;
        else
            return d;
    }
    @Override
    public void lvlUP() {
        if(experience % 30 == 0) {
            level++;
            strength += 3;
            dexterity += 2;
            charisma += 1;
            System.out.println("You achieved lvl" + level);
        }
    }


}
