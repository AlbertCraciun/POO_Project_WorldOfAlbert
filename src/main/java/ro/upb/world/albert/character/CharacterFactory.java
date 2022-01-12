package ro.upb.world.albert.character;

public class CharacterFactory {
    private static CharacterFactory characterFactoryInstance;

    private CharacterFactory() {
    }

    public static CharacterFactory getInstance() {
        if (characterFactoryInstance == null) {
            characterFactoryInstance = new CharacterFactory();
        }
        return characterFactoryInstance;
    }

    public Character newCharacter(CharacterType characterType) {
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