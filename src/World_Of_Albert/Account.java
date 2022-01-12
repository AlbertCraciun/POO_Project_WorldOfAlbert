package World_Of_Albert;

import java.util.*;

public class Account {
    class Information {
        private final Credentials loginInfo;
        private final ArrayList < String > favouritesGames;
        private final String name;
        private final String country;

        public String getName() {
            return name;
        }
        public String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return "PlayerInfo:\nName: " + this.name
                    + "\nLogin email: " + this.loginInfo.getEmail()
                    + "\nPassword: ********\n\tlength: " + this.loginInfo.getPassword().length()
                    + "\nCountry: " + this.country
                    + "\nFavourites Games: " + favouritesGames + "\n";
        }

        private Information(InformationBuilder builder) {
            this.loginInfo = builder.loginInfo;
            this.favouritesGames = builder.favouritesGames;
            this.name = builder.name;
            this.country = builder.country;
        }

        public static class InformationBuilder {
            private Credentials loginInfo;
            private ArrayList < String > favouritesGames;
            private final String name;
            private String country;

            public InformationBuilder(String name) {
                this.name = name;
            }
            public InformationBuilder addEmail(String email) {
                loginInfo.setEmail(email);
                return this;
            }
            public InformationBuilder addPasswd(String password) {
                loginInfo.setPassword(password);
                return this;
            }

            public InformationBuilder addCountry(String country) {
                this.country = country;
                return this;
            }

            private void validateInformation(Information i) throws InformationIncompleteException {
                if(i.getName() == null)
                    throw new InformationIncompleteException("name");
                if(i.loginInfo.getEmail() == null)
                    throw new InformationIncompleteException("email");
                if(i.loginInfo.getPassword() == null)
                    throw new InformationIncompleteException("password");
            }
        }
    }

    Information playerInfo;
    List <Character> allCharacters;
    int numberOfPlayedGames = 0;

}
