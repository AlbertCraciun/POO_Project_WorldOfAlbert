package ro.upb.world.albert;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import ro.upb.world.albert.board.Cell;
import ro.upb.world.albert.board.CellType;
import ro.upb.world.albert.board.Grid;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Game {
    Accounts account;
    Map <CellType, List < String >> story;
    List< List< Cell > > map;

    private static Game gameInstance;
    private Game() {}
    public static Game getInstance() {
        if (gameInstance == null) {
            gameInstance = new Game();
        }
        return gameInstance;
    }

    // upload JSON  &  text / graphic
    public void run() throws IOException {
        account = Game.getInstance().loadAccounts();
        System.out.println("Press T if you want to Test and Play TEXT version" +
                "\n\tor press G if you want to play GRAPHIC-INTERFACE version");
        Scanner key = new Scanner(System.in);
        String enterKey = key.nextLine();
        if(enterKey.equalsIgnoreCase("T")) {
            System.out.println("text");
            map = Grid.getInstance().mapGenerator(5,5);
        }
        if(enterKey.equalsIgnoreCase("G")) {
            System.out.println("GUI");
        }
    }

    public void listOptionForCurrentCell() {

    }

    public void printStory() {

    }

    public Accounts loadAccounts() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        return objectMapper.readValue(Paths.get("src/main/resources/accounts.json").toFile(), Accounts.class);
    }

    public void showMap() {
        for (List<Cell> lst : map) {
            for (Cell cell : lst) {
                System.out.print(cell.getCellContain().toCharacter() + " ");
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getMap() {
        return map;
    }
    public Accounts getAccount() {
        return account;
    }
}
