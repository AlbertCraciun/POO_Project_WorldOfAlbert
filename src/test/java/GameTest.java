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
        Accounts accounts = new Game().loadAccounts();
        Assert.assertEquals(8, accounts.getAccounts().size());

        Account.Information first = accounts.getAccounts().get(0);

        Assert.assertEquals("Marcel", first.getName());
        Assert.assertEquals("Marcel", first.getName());

        Character character = first.getCharacters().get(0);

        Assert.assertEquals("Odysseus Prisco", character.getName());
        //Assert.assertEquals("Odysseus Prisco", character.getName());
        System.out.println(character.getClass().getSimpleName());
    }
}
