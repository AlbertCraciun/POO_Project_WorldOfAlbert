package World_Of_Albert;

public class Cell {
    int cellCoordX;
    int cellCoordY;
    public enum cellType {
        ENEMY, SHOP, FINISH, EMPTY
    }
    CellElement currentCellType;
    int mark;

    Cell() {
        cellCoordX = 0;
        cellCoordY = 0;
        currentCellType = null;
        mark = 0;
    }

}
