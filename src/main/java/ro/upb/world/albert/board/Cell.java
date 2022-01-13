package ro.upb.world.albert.board;

import ro.upb.world.albert.character.Enemy;

import static ro.upb.world.albert.board.CellType.*;

public class Cell {
    int cellX;
    int cellY;
    CellElement cellContain;
    CellType type;
    boolean mark;

    public Cell(int x, int y) {
        cellX = x;
        cellY = y;
        double w = Math.random();
        if(w <= 0.2) {
            cellContain = new Shop();
            type = SHOP;
        }
        else if(w <= 0.5) {
            cellContain = new Enemy();
            type = ENEMY;
        }
        else {
            cellContain = new Empty();
            type = EMPTY;
        }
    }
    public Cell(CellType type, int x, int y) {
        cellX = x;
        cellY = y;
        this.type = type;
        if(type.equals(EMPTY)) {
            cellContain = new Empty();
        }
        if(type.equals(ENEMY)) {
            cellContain = new Enemy();
        }
        if(type.equals(SHOP)) {
            cellContain = new Shop();
        }
        if(type.equals(FINISH)) {
            cellContain = new Finish();
        }
    }

    public int getCellX() {
        return cellX;
    }
    public int getCellY() {
        return cellY;
    }
    public CellElement getCellContain() {
        return cellContain;
    }
    public CellType getType() {
        return type;
    }
    public boolean isMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellX=" + cellX +
                ", cellY=" + cellY +
                ", cellContain=" + cellContain.toCharacter() +
                ", type=" + type +
                ", mark=" + mark +
                '}';
    }
}
