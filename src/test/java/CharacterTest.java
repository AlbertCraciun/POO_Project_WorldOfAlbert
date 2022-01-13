import org.junit.Test;
import ro.upb.world.albert.character.Character;
import ro.upb.world.albert.character.CharacterFactory;
import ro.upb.world.albert.character.CharacterType;

public class CharacterTest {

    @Test
    public void testNewCharacter() {
        Character character = CharacterFactory.newCharacter(CharacterType.WARRIOR);
        System.out.println(character.getName());
        System.out.println(character.getProfession());
        System.out.println(character.getClass().getSimpleName());

        System.out.println();

        character.setName("Albert");
        character.setLevel(1);
        character.setExperience(10);
        character.setProfession("Warrior");
        System.out.println(character);

    }
}
