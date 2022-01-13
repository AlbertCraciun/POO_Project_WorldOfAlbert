package ro.upb.world.albert.character;

import ro.upb.world.albert.board.CellElement;
import ro.upb.world.albert.spell.Earth;
import ro.upb.world.albert.spell.Fire;
import ro.upb.world.albert.spell.Ice;
import ro.upb.world.albert.spell.Spell;

import java.util.ArrayList;

public class Enemy extends Entity implements CellElement {

    public Enemy() {
        currentHP = maxHP = 100;
        currentMP = maxMP = 70;
        double x = Math.random();
        if(x <= 0.33) {
            fireProtection = true;
        }
        else if(x <= 0.66) {
            iceProtection = true;
        }
        else if(x <= 1) {
            earthProtection = true;
        }
        abilities = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            x = Math.random();
            if (x <= 0.33) {
                Spell spell1 = new Earth();
                Spell spell2 = new Fire();
                abilities.add(spell1);
            }
            else if (x <= 0.66) {
                Spell spell1 = new Fire();
                Spell spell2 = new Ice();
                abilities.add(spell1);
            }
            else if (x <= 1) {
                Spell spell1 = new Ice();
                Spell spell2 = new Earth();
                abilities.add(spell1);
            }
        }
    }

    @Override
    public String toCharacter() {
        return "E";
    }
    @Override
    public void receiveDamage(int d, String type) {
        double x = Math.random();
        if(type.equals("basic")) {
            if (x <= 0.05) {
                currentHP -= d * 3;
            } else if (x <= 0.4) {
                currentHP -= d * 2;
            } else if (x <= 0.5) {
                currentHP -= d * 1.5;
            } else if (x <= 1) {
                currentHP -= d;
            }
        }
        else if(type.equals("fire")) {
            if(fireProtection == true) {
                System.out.println(" This enemy has a powerful fire protection.");
                currentHP -= 1;
            }
            else
                currentHP -= d;
        }
        else if(type.equals("ice")) {
            if(iceProtection == true) {
                System.out.println(" This enemy has a powerful ice protection.");
                currentHP -= 1;
            }
            else
                currentHP -= d;
        }
        else if(type.equals("earth")) {
            if(earthProtection == true) {
                System.out.println(" This enemy has a powerful earth protection.");
                currentHP -= 1;
            }
            else
                currentHP -= d;
        }
    }
    @Override
    public int getDamage() {
        double x = Math.random();
        if (x > 0.5 )
            return (int) (15 + x * 100) / 2;
        else return (int) (15 + x * 100);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "abilities=" + abilities +
                ", currentHP=" + currentHP +
                ", maxHP=" + maxHP +
                ", currentMP=" + currentMP +
                ", maxMP=" + maxMP +
                ", fireProtection=" + fireProtection +
                ", iceProtection=" + iceProtection +
                ", earthProtection=" + earthProtection +
                '}';
    }
}
