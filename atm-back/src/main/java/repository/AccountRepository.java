package repository;

import dto.Account;

import java.util.Set;

public class AccountRepository {

    private Set<Account> accounts;

    public AccountRepository(Set<Account> accounts)
    {
        this.accounts = accounts;
    }

    public Account  geAccountsByClientId(int clientID) {
        return new Account(1,1, 0,0,0);
    }
}
