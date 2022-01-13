import org.junit.Assert;
import org.junit.Test;
import ro.upb.world.albert.spell.Earth;
import ro.upb.world.albert.spell.Spell;

public class SpellTest {

    @Test
    public void testNewSpell() {
        Spell spell = new Earth();
        Assert.assertEquals("earth", spell.getName());
        Assert.assertEquals(25, spell.getCost());
        System.out.println(spell);
    }
}
