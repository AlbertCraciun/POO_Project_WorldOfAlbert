import org.junit.Assert;
import org.junit.Test;
import ro.upb.world.albert.Account;
import ro.upb.world.albert.Accounts;
import ro.upb.world.albert.Game;
import ro.upb.world.albert.character.Character;

import java.io.IOException;

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

        Assert.assertEquals("Odysseus Prisco", character.getName());
        Assert.assertEquals("Warrior", character.getProfession());
        Assert.assertEquals(1, character.getLevel());
        Assert.assertEquals(15, character.getExperience());
        System.out.println(character.getClass().getSimpleName());

    }
}
