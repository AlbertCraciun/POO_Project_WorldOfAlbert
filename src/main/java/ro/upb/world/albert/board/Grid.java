package ro.upb.world.albert.board;

import ro.upb.world.albert.character.Character;

import java.util.*;

public class Grid extends ArrayList {
    private static Grid gridInstance;
    public static int width = 5;
    public static int length = 5;
    Character p;
    Cell currentCell;
    List< List< Cell > > map;

    private Grid() {
    }

    static List< List< Cell > > mapGenerator(int width, int length) {
        return null;
    }

    public static Grid getInstance() {
        if (gridInstance == null) {
            gridInstance = new Grid();
        }
        return gridInstance;
    }

    Cell goNorth() {
        return null;
    }
    void goSouth() {

    }
    void goWest() {

    }
    void goEast() {

    }

}
