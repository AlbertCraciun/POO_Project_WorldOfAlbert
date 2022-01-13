import org.junit.Assert;
import org.junit.Test;
import ro.upb.world.albert.Account;
import ro.upb.world.albert.Accounts;
import ro.upb.world.albert.Game;
import ro.upb.world.albert.character.Character;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GameTest {

    @Test
    public void testLoadAccounts() throws IOException {
        Accounts accounts = Game.getInstance().loadAccounts();
        Assert.assertEquals(8, accounts.getAccounts().size());

        Account.Information first = accounts.getAccounts().get(0);
        Account.Information second = accounts.getAccounts().get(1);

        Assert.assertEquals("Marcel", first.getName());
        Assert.assertEquals("Romania", first.getCountry());
        Assert.assertEquals("Metin", first.getFavorite_games().get(0));
        Assert.assertEquals("4Story", first.getFavorite_games().get(1));
        Assert.assertEquals("marcel@yahoo.com", first.getCredentials().getEmail());
        Assert.assertEquals("6K7GUxjsAc", first.getCredentials().getPassword());
        Assert.assertEquals("Nawra Ortwin", second.getName());

        Character character = first.getCharacters().get(0);
        //Character character1 = first.getCharacters().get(1);

        Assert.assertEquals("Odysseus Prisco", character.getName());
        //Assert.assertEquals("Warrior", character.getProfession());
        Assert.assertEquals(1, character.getLevel());
        Assert.assertEquals(15, character.getExperience());
        System.out.println(character);
        System.out.println(character.getClass().getSimpleName());

        /*
        Assert.assertEquals("Kameron Neppl", character1.getName());
        Assert.assertEquals("Mage", character1.getProfession());
        Assert.assertEquals(1, character1.getLevel());
        Assert.assertEquals(10, character1.getExperience());
        System.out.println(character1.getClass().getSimpleName());
        */
    }

    @Test
    public void testIfKeyPressed() throws IOException {
        String input = "T";
        InputStream key = new ByteArrayInputStream(input.getBytes());
        System.setIn(key);
        Game.getInstance().run();

        String input1 = "G";
        InputStream key1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(key1);
        Game.getInstance().run();
    }

    @Test
    public void testMapGeneration() throws IOException {
        String input = "T";
        InputStream key = new ByteArrayInputStream(input.getBytes());
        System.setIn(key);
        Game.getInstance().run();
        System.out.println(Game.getInstance().getMap());
        Game.getInstance().showMap();
    }
}
