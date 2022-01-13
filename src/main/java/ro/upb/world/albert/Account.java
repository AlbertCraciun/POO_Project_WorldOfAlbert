package ro.upb.world.albert;

import ro.upb.world.albert.character.Character;
import ro.upb.world.albert.exceptions.InformationIncompleteException;

import java.util.*;

public class Account {

    Information playerInfo;

    public Account(Information playerInfo) {
        this.playerInfo = playerInfo;
    }

    public static class Information {
        private Credentials credentials;
        private List < String > favorite_games;
        private String name;
        private String country;
        private int maps_completed;
        private List <Character> characters;

        //just for unit test
        public Information() {}

        public Information(Credentials credentials, List<String> favorite_games,
                           String name, String country, int maps_completed,
                           List<Character> characters) {
            this.credentials = credentials;
            this.favorite_games = favorite_games;
            this.name = name;
            this.country = country;
            this.maps_completed = maps_completed;
            this.characters = characters;
        }

        public int getMaps_completed() {
            return maps_completed;
        }
        public List<Character> getCharacters() {
            return characters;
        }
        public Credentials getCredentials() {
            return credentials;
        }
        public List<String> getFavorite_games() {
            return favorite_games;
        }
        public String getName() {
            return name;
        }
        public String getCountry() {
            return country;
        }

    }

    public Information getPlayerInfo() {
        return playerInfo;
    }

}
