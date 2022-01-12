package ro.upb.world.albert.character;

import ro.upb.world.albert.board.CellElement;

public class Enemy extends Entity implements CellElement {

    public Enemy() {
    }

    @Override
    public String toCharacter() {
        return null;
    }

    @Override
    void receiveDamage(int d) {
    }

    @Override
    void getDamage() {

    }
}
