package ro.upb.world.albert;

import java.util.List;

public class Accounts {
    List<Account.Information> accounts;

    public Accounts(List<Account.Information> accounts) {
        this.accounts = accounts;
    }

    public Accounts() {
    }

    public List<Account.Information> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account.Information> accounts) {
        this.accounts = accounts;
    }
}
