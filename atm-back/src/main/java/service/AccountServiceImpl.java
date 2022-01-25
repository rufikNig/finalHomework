package service;

import lombok.var;
import repository.AccountRepository;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public double getAccountBalance(int clientId, String currency) {
     return 0;
    }

    @Override
    public boolean getMoney(int clientId, BigDecimal amount, String currency) {
        return false;
    }

    @Override
    public boolean saveMoney(int clientId, BigDecimal amount, String currency) {
        return true;
    }

}
