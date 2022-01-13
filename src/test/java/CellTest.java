import org.junit.Assert;
import org.junit.Test;
import ro.upb.world.albert.board.Cell;
import ro.upb.world.albert.character.Enemy;

import static ro.upb.world.albert.board.CellType.*;

public class CellTest {

    @Test
    public void testNewCell() {
        Cell cell = new Cell();

        Assert.assertEquals(0, cell.getCellX());
        Assert.assertEquals(0, cell.getCellY());
        Assert.assertEquals(false, cell.isMark());
        System.out.println(cell.getCellContain());
        System.out.println(cell.getCellContain().toCharacter());
        System.out.println(cell.getType());
    }

    @Test
    public void testNewSpecificCell() {
        Cell cell = new Cell(ENEMY, 1, 3);
        Cell cell1 = new Cell(EMPTY, 1, 3);
        Cell cell2 = new Cell(SHOP, 1, 3);
        Cell cell3 = new Cell(FINISH, 1, 3);

        Assert.assertEquals(1, cell.getCellX());
        Assert.assertEquals(3, cell.getCellY());
        Assert.assertEquals(false, cell.isMark());
        Assert.assertEquals(ENEMY, cell.getType());

        System.out.println(cell1);
        System.out.println(cell2);
        System.out.println(cell3);

    }
}
