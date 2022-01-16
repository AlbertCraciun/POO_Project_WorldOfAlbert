package ro.upb.world.albert.board;

import ro.upb.world.albert.Game;
import ro.upb.world.albert.character.Character;

import java.util.*;

import static ro.upb.world.albert.board.CellType.*;

public class Grid extends ArrayList {
    public static int width;
    public static int length;
    public Character character;
    public Cell currentCell;

    private static Grid gridInstance;
    private Grid() {}
    public static Grid getInstance() {
        if (gridInstance == null) {
            gridInstance = new Grid();
        }
        return gridInstance;
    }

    public List< List< Cell > > mapGenerator(int width, int length) {
        Grid.setWidth(width);
        Grid.setLength(length);
        List< List< Cell > > lengthList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            List <Cell> widthList = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                widthList.add(new Cell(i, j));
            }
            lengthList.add(widthList);
        }
        return lengthList;
    }

    public List< List< Cell > > mapGeneratorforHarcodedTest(int width, int length) {
        Grid.setWidth(width);
        Grid.setLength(length);
        int i, j;
        List< List< Cell > > lengthList = new ArrayList<>();
        List <Cell> widthList0 = new ArrayList<>();
        List <Cell> widthList1 = new ArrayList<>();
        List <Cell> widthList2 = new ArrayList<>();
        List <Cell> widthList3 = new ArrayList<>();
        List <Cell> widthList4 = new ArrayList<>();
        widthList0.add(new Cell(EMPTY,0, 0));
        widthList0.add(new Cell(EMPTY,0, 1));
        widthList0.add(new Cell(EMPTY,0, 2));
        widthList0.add(new Cell(SHOP,0, 3));
        widthList0.add(new Cell(EMPTY,0, 4));
        lengthList.add(widthList0);
        widthList1.add(new Cell(EMPTY,1, 0));
        widthList1.add(new Cell(EMPTY,1, 1));
        widthList1.add(new Cell(EMPTY,1, 2));
        widthList1.add(new Cell(SHOP,1, 3));
        widthList1.add(new Cell(EMPTY,1, 4));
        lengthList.add(widthList1);
        widthList2.add(new Cell(SHOP, 2, 0));
        widthList2.add(new Cell(EMPTY,2, 1));
        widthList2.add(new Cell(EMPTY,2, 2));
        widthList2.add(new Cell(EMPTY,2, 3));
        widthList2.add(new Cell(EMPTY,2, 4));
        lengthList.add(widthList2);
        widthList3.add(new Cell(EMPTY,3, 0));
        widthList3.add(new Cell(EMPTY,3, 1));
        widthList3.add(new Cell(EMPTY,3, 2));
        widthList3.add(new Cell(EMPTY,3, 3));
        widthList3.add(new Cell(ENEMY,3, 4));
        lengthList.add(widthList3);
        widthList4.add(new Cell(EMPTY,4, 0));
        widthList4.add(new Cell(EMPTY,4, 1));
        widthList4.add(new Cell(EMPTY,4, 2));
        widthList4.add(new Cell(EMPTY,4, 3));
        widthList4.add(new Cell(FINISH,4, 4));
        lengthList.add(widthList4);
        return lengthList;
    }

    public String goNorth() {
        if(character.Y == 0 || Game.getInstance().getMap().get(character.Y-1).get(character.X).mark == true) {
            return "You can't go north. Chose another direction.";
        }
        character.Y -= 1;
        currentCell = Game.getInstance().getMap().get(character.Y).get(character.X);
        return Game.getInstance().getMap().get(character.Y).get(character.X).getCellContain().toCharacter();
    }
    public String goSouth() {
        if(character.Y == length || Game.getInstance().getMap().get(character.Y+1).get(character.X).mark == true) {
            return "You can't go south. Chose another direction.";
        }
        character.Y += 1;
        currentCell = Game.getInstance().getMap().get(character.Y).get(character.X);
        return Game.getInstance().getMap().get(character.Y).get(character.X).getCellContain().toCharacter();
    }
    public String goWest() {
        if(character.X == 0 || Game.getInstance().getMap().get(character.Y).get(character.X-1).mark == true) {
            return "You can't go west. Chose another direction.";
        }
        character.X -= 1;
        currentCell = Game.getInstance().getMap().get(character.Y).get(character.X);
        return Game.getInstance().getMap().get(character.Y).get(character.X).getCellContain().toCharacter();
    }
    public String goEast() {
        if(character.X == width || Game.getInstance().getMap().get(character.Y).get(character.X+1).mark == true) {
            return "You can't go east. Chose another direction.";
        }
        character.X += 1;
        currentCell = Game.getInstance().getMap().get(character.Y).get(character.X);
        return Game.getInstance().getMap().get(character.Y).get(character.X).getCellContain().toCharacter();
    }

    public static int getWidth() {
        return width;
    }
    public static void setWidth(int width) {
        Grid.width = width;
    }
    public static int getLength() {
        return length;
    }
    public static void setLength(int length) {
        Grid.length = length;
    }
    public Character getCharacter() {
        return character;
    }
    public void setCharacter(Character character) {
        this.character = character;
    }
    public Cell getCurrentCell() {
        return currentCell;
    }
    public void setCurrentCell(Cell currentCell) {
        this.currentCell = currentCell;
    }
}
