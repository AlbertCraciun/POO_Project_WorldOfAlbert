package ro.upb.world.albert.character;

import ro.upb.world.albert.spell.Spell;
import java.util.*;

abstract public class Entity {
    List< Spell > abilities;

    int currentHP;
    int maxHP;
    int currentMP;
    int maxMP;

    boolean fireProtection;
    boolean iceProtection;
    boolean earthProtection;

    public abstract void receiveDamage(int d, String type);
    public abstract int getDamage();
    public void lifeRegen(int hp) {
        if (currentHP + hp >= maxHP) {
            currentHP = maxHP;
        }
        else {
            currentHP += hp;
        }
    }
    public void manaRegen(int mp) {
        if (currentMP + mp >= maxMP) {
            currentMP = maxMP;
        }
        else {
            currentMP += mp;
        }
    }
    public void useSpell(List< Spell > abilities, Enemy enemy) {
        System.out.println(abilities);
        System.out.println("Chose an ability");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        Spell spell = abilities.get(i);
        if( spell.getCost() < currentMP ) {
            enemy.receiveDamage(spell.getDmg(), spell.getName());
        }
        else System.out.println("You don't have enough MP to use this Spell");
    }
}
