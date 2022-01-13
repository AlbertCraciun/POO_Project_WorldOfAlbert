package ro.upb.world.albert.character;

public class CharacterFactory {
    public static Character newCharacter(CharacterType characterType) {
        switch (characterType) {
            case WARRIOR: {
                return new Warrior();
            }
            case MAGE: {
                return new Mage();
            }
            case ROGUE: {
                return new Rogue();
            }
            default: {
                return null;
            }
        }
    }
}