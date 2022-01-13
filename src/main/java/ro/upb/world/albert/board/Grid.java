package ro.upb.world.albert.board;

import ro.upb.world.albert.character.Character;

import java.util.*;

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
        List <Cell> widthList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                widthList.add(new Cell(i, j));
            }
            lengthList.add(widthList);
        }
        return lengthList;
    }

    String goNorth() {
        if(character.Y == 0) {
            return "You can't go north. Chose another direction.";
        }
        character.Y -= 1;
        return currentCell.getCellContain().toCharacter();
    }
    String goSouth() {
        if(character.Y == length) {
            return "You can't go south. Chose another direction.";
        }
        character.Y += 1;
        return currentCell.getCellContain().toCharacter();
    }
    String goWest() {
        if(character.X == 0) {
            return "You can't go west. Chose another direction.";
        }
        character.X -= 1;
        return currentCell.getCellContain().toCharacter();
    }
    String goEast() {
        if(character.X == width) {
            return "You can't go east. Chose another direction.";
        }
        character.X += 1;
        return currentCell.getCellContain().toCharacter();
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
