package ro.upb.world.albert;

import ro.upb.world.albert.character.Character;

import java.util.ArrayList;
import java.util.List;

public class InformationBuilder {
        private Credentials loginInfo;
        private List< String > favouritesGames;
        private String name;
        private String country;
        private int maps_completed;
        private List <Character> characters;

        public InformationBuilder() {
            favouritesGames = new ArrayList<>();
            loginInfo = new Credentials();
        }

        public InformationBuilder setLoginInfo(Credentials loginInfo) {
            this.loginInfo = loginInfo;
            return this;
        }

        public InformationBuilder setFavouritesGames(List<String> favouritesGames) {
            this.favouritesGames = favouritesGames;
            return this;

        }

        public InformationBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public InformationBuilder setCountry(String country) {
            this.country = country;
            return this;

        }

        public InformationBuilder setMaps_completed(int maps_completed) {
            this.maps_completed = maps_completed;
            return this;
        }

        public InformationBuilder setCharacters(List<Character> characters) {
            this.characters = characters;
            return  this;
        }

    public Account.Information build() {
            return new Account.Information(loginInfo, favouritesGames,
                    name, country, maps_completed, characters);
        }
}
