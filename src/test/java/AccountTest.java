import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Assert;
import org.junit.Test;

import ro.upb.world.albert.Account;
import ro.upb.world.albert.Account.Information;
import ro.upb.world.albert.Credentials;
import ro.upb.world.albert.InformationBuilder;
import ro.upb.world.albert.character.CharacterFactory;
import ro.upb.world.albert.character.Character;
import ro.upb.world.albert.character.CharacterType;

import java.util.ArrayList;
import java.util.List;

public class AccountTest {

    public static final String NAME = "Albert";
    public static final String COUNTRY = "Romania";

    @Test
    public void testInformationBuilder() {

        Credentials info = new Credentials();
        info.setEmail("email");
        info.setPassword("password");

        List<String> arr = new ArrayList<>();
        arr.add("ceva");

        Information information = new InformationBuilder()
                .setName(NAME)
                .setCountry(COUNTRY)
                .setLoginInfo(info)
                .setFavouritesGames(arr)
                .build();

        Assert.assertEquals(NAME, information.getName());
        Assert.assertEquals(COUNTRY, information.getCountry());
        Assert.assertEquals(info, information.getCredentials());
        Assert.assertEquals(arr, information.getFavorite_games());
    }

    @Test
    public void testWriteAccountAsJson() throws JsonProcessingException {
        Credentials info = new Credentials();
        info.setEmail("email");
        info.setPassword("password");

        List<String> arr = new ArrayList<>();
        arr.add("ceva");

        List <Character> charactersList = new ArrayList<>();
        charactersList.add(CharacterFactory.newCharacter(CharacterType.WARRIOR));
        charactersList.get(0).setName("Albert");
        charactersList.add(CharacterFactory.newCharacter(CharacterType.WARRIOR));
        charactersList.get(1).setName("Iulius");

        Information playerInfo = new InformationBuilder()
                .setName(NAME)
                .setCountry(COUNTRY)
                .setLoginInfo(info)
                .setFavouritesGames(arr)
                .setCharacters(charactersList)
                .build();

        Account account = new Account(playerInfo);

        Assert.assertEquals(playerInfo, account.getPlayerInfo());

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        String json = objectMapper.writeValueAsString(account);
        System.out.println(json);

    }



}
