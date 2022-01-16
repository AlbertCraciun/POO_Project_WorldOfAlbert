package ro.upb.world.albert;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import ro.upb.world.albert.board.Cell;
import ro.upb.world.albert.board.CellType;
import ro.upb.world.albert.board.Grid;
import ro.upb.world.albert.character.Character;
import ro.upb.world.albert.potions.ManaPotion;
import ro.upb.world.albert.potions.Potion;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;

import static ro.upb.world.albert.board.Grid.*;

public class Game {
    public Accounts account;
    public Map <CellType, List < String >> story;
    public List< List< Cell > > map;
    public List< List< String > > encryptedMap;

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
        System.out.println("These are the accounts: ");
        account.showAccounts();
        System.out.println("Chose an account (by pressing a number): ");
        Scanner keyNum = new Scanner(System.in);
        String enterNum = keyNum.nextLine();
        int num = Integer.parseInt(enterNum);
        System.out.println("These are credentials: ");
        Account.Information information = account.getAccounts().get(num);
        information.getCredentials().getEmail();
        information.getCredentials().getPassword();
        System.out.println("These are other info related to this account: ");
        System.out.println("Country: " + information.getCountry() + "\nMaps completed:" + information.getMaps_completed()
                + "\nFavourites games:" + information.getFavorite_games());
        System.out.println("These are the characters available for this account: ");
        information.showCharacters();
        System.out.println("Chose a character (by pressing a number): ");
        Scanner keyNum1 = new Scanner(System.in);
        String enterNum1 = keyNum1.nextLine();
        int num1 = Integer.parseInt(enterNum1);
        Grid.getInstance().setCharacter(information.getCharacters().get(num1));
        System.out.println("You chose:" + information.getCharacters().get(num1).getName());
        System.out.println("These are his all stats: " + information.getCharacters().get(num1));
        System.out.println();
        System.out.println("Press T if you want to Test and Play TEXT version" +
                "\n\tor press G if you want to play GRAPHIC-INTERFACE version");
        Scanner key = new Scanner(System.in);
        String enterKey = key.nextLine();
        if(enterKey.equalsIgnoreCase("T")) {
            System.out.println("Game will start in \"text\" game-mode. Press \"P\" to continue.");
            System.out.println("\nA random generate map with width 5 and length 5 will look like this: ");
            map = Grid.getInstance().mapGenerator(5,5);
            encryptedMap = Game.getInstance().createEncryptedMap();
            encryptedMap.get(0).set(0, "P");
            System.out.println("\n...but for this test we will generate the map given in task: ");
            map = Grid.getInstance().mapGeneratorforHarcodedTest(5, 5);
            Game.getInstance().showEncryptedMap();
            System.out.println("This is your map. Press \"P\" to continue to play a scenario.");
            Scanner keyP = new Scanner(System.in);
            String enterP = keyP.nextLine();
            int k = 0;
            while(enterP.equalsIgnoreCase("P") && k < 3) {
                Grid.getInstance().goEast();
                Game.getInstance().modifyEncryptedMap();
                Game.getInstance().showEncryptedMap();
                k++;
                enterP = keyP.nextLine();
            }
            listOptionForCurrentCell();

        }
        if(enterKey.equalsIgnoreCase("G")) {
            System.out.println("GUI");
            System.out.println("-- IN PROGRESS --");
        }
    }

    public void listOptionForCurrentCell() {
        if(Grid.getInstance().currentCell.getCellContain().toCharacter().equalsIgnoreCase("S")) {
            System.out.println("You found a store. You can buy a potions for regeneration mana or life.");
            System.out.println("What potions do you want?\n1. Mana regen\n2. Life regen\n\t --(press a number) --");
            Scanner keyNum1 = new Scanner(System.in);
            String enterNum1 = keyNum1.nextLine();
            int num1 = Integer.parseInt(enterNum1);
            if(num1 == 1) {
                Potion potion = new ManaPotion();
                System.out.println("You chose to buy potion for mana regen. It costs " + potion.getPrice() +
                        "\nhas a regen value: " + potion.regenValue() +
                        "\nand has a weight" + potion.getWeight());
            }
            else() {

            }
            Scanner keyP = new Scanner(System.in);
            String enterP = keyP.nextLine();
            if(enterP.equalsIgnoreCase("P")) {

            }
        }
        if(Grid.getInstance().currentCell.getCellContain().toCharacter().equalsIgnoreCase("E")) {

        }
        if(Grid.getInstance().currentCell.getCellContain().toCharacter().equalsIgnoreCase("F")) {

        }
    }

    public Accounts loadAccounts() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        return objectMapper.readValue(Paths.get("src/main/resources/accounts.json").toFile(), Accounts.class);
    }

    public List <List <String >> createEncryptedMap() {
        int i, j;
        List< List< String > > lengthList = new ArrayList<>();
        for (i = 0; i < Grid.getLength(); i++) {
            List <String> widthList = new ArrayList<>();
            for (j = 0; j < getWidth(); j++) {
                widthList.add("?");
            }
            lengthList.add(widthList);
        }
        return lengthList;
    }

    public void modifyEncryptedMap() {
        Character character = Grid.getInstance().getCharacter();
        Cell cell = Game.getInstance().getMap().get(character.Y).get(character.X);
        cell.isMark();
        String letter = cell.getCellContain().toCharacter();
        Game.getInstance().getEncryptedMap().get(character.Y).set(character.X, letter);
    }

    public void showEncryptedMap() {
        int i, j;
        for (i = 0; i < Grid.getLength(); i++) {
            for (j = 0; j < Grid.getWidth(); j++) {
                System.out.print(encryptedMap.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    //for test
    public void showMap() {
        int i, j;
        for (i = 0; i < Grid.getLength(); i++) {
            for (j = 0; j < Grid.getWidth(); j++) {
                System.out.print(Game.getInstance().getMap().get(i).get(j).getCellContain().toCharacter() + " ");
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
    public List<List<String>> getEncryptedMap() {
        return encryptedMap;
    }
}
