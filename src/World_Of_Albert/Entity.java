package World_Of_Albert;

import java.util.*;

abstract public class Entity {
    List<Spell> abilities;
    int currentHP;
    int maxHP;
    int currentMP;
    int maxMP;
    boolean fireProtection;
    boolean iceProtection;
    boolean earthProtection;

    abstract void receiveDamage(int d);
    abstract void getDamage();

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
    public void useSpell(Spell s, Enemy e) {
    }
}
