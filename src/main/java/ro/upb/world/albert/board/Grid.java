package ro.upb.world.albert.board;

import ro.upb.world.albert.character.Character;

import java.util.*;

public class Grid extends ArrayList {
    public static int width = 5;
    public static int length = 5;
    Character p;
    Cell currentCell;
    List< List< Cell > > map;

    private static Grid gridInstance;
    private Grid() {}
    static List< List< Cell > > mapGenerator(int width, int length) {
        return null;
    }
    public static Grid getInstance() {
        if (gridInstance == null) {
            gridInstance = new Grid();
        }
        return gridInstance;
    }


    String goNorth() {
        if(p.Y < 0) {
            System.out.println("You can't go north. Chose another direction.");
            return null;
        }
        p.Y -= 1;
        return currentCell.getCellContain().toCharacter();
    }
    String goSouth() {
        p.Y += 1;
        return currentCell.getCellContain().toCharacter();
    }
    String goWest() {
        p.X -= 1;
        return currentCell.getCellContain().toCharacter();
    }
    String goEast() {
        p.X += 1;
        return currentCell.getCellContain().toCharacter();
    }

}
