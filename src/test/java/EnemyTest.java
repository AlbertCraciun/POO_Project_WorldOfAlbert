import org.junit.Test;
import ro.upb.world.albert.character.Enemy;

public class EnemyTest {

    @Test
    public void testNewEnemy() {
        Enemy enemy = new Enemy();
        System.out.println(enemy);
        System.out.println(enemy.getDamage());
        enemy.receiveDamage(15,"basic");
        System.out.println(enemy.toCharacter());
        System.out.println(enemy);
    }
}
