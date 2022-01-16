package ro.upb.world.albert.character;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ro.upb.world.albert.spell.Earth;
import ro.upb.world.albert.spell.Fire;
import ro.upb.world.albert.spell.Ice;
import ro.upb.world.albert.spell.Spell;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@JsonIgnoreProperties({"damage"})
public class Rogue extends Character {

    public Rogue() {
        currentHP = maxHP = 100;
        currentMP = maxMP = 100;
        strength = 5;
        charisma = 4;
        dexterity = 10;
        maxWeightInv = 20;
        inv = new Inventory(maxWeightInv);
        profession = "Rogue";
        earthProtection = true;
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
        int coef = strength * 2/10 + charisma + 3/10;
        double x = Math.random();
        if(spellType.equals("basic")) {
            currentHP -= d * x * 10 - coef;
        }
        if(spellType.equals("earth")) {
            System.out.println(getProfession() + " " + getName()
                    + "has a powerful earth protection.");
        }
        if(spellType.equals("fire")) {
            if(x <= 0.5) {
                currentHP -= d - coef;
            }
            if(x > 0.5) {
                currentHP -= d*2 - coef * 2;
            }
        }
        if(spellType.equals("ice")) {
            if(x <= 0.3) {
                currentHP -= d / 2 - - coef;
            }
            if(x > 0.3 && x < 0.7) {
                currentHP -= d;
            }
            if(x > 0.7) {
                currentHP -= d * 2/3 - - coef;
            }
        }
    }
    @Override
    public int getDamage() {
        double x = Math.random();
        int d = dexterity * 5/10 + strength * 3/10 + charisma + 2/10;
        if(x <= 0.3)
            return d*2;
        else
            return d;
    }
    @Override
    public void lvlUP() {
        if(experience % 30 == 0) {
            level++;
            strength += 2;
            dexterity += 3;
            charisma += 1;
            System.out.println("You achieved lvl" + level);
        }
    }

}
