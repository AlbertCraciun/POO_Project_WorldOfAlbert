import org.junit.Assert;
import org.junit.Test;
import ro.upb.world.albert.potions.HealthPotion;
import ro.upb.world.albert.potions.ManaPotion;
import ro.upb.world.albert.potions.Potion;

public class TestPotion {

    @Test
    public void testNewPotion() {
        Potion potion = new HealthPotion();
        Potion potion1 = new ManaPotion();

        Assert.assertEquals(30,potion.getPrice());
        Assert.assertEquals(7,potion1.getWeight());

        System.out.println(potion.regenValue());
        System.out.println(potion1.regenValue());
    }
}
