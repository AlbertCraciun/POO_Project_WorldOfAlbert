package ro.upb.world.albert.board;

public class Cell {
    int cellCoordX;
    int cellCoordY;
    CellElement currentCellType;
    boolean mark;

    Cell(CellElement c) {
        cellCoordX = 0;
        cellCoordY = 0;
        currentCellType = null;
        mark = false;
        currentCellType = c;
    }

}
