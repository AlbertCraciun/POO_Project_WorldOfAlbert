package ro.upb.world.albert;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import ro.upb.world.albert.board.CellType;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Game {
    List < Account > account;
    Map <CellType, List < String >> story;

    private static Game gameInstance;
    private Game() {}
    public static Game getInstance() {
        if (gameInstance == null) {
            gameInstance = new Game();
        }
        return gameInstance;
    }


    // upload JSON  &  text / graphic
    public static void run() {

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
}
