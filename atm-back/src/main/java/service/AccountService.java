package service;


import java.math.BigDecimal;

public interface AccountService {
    double getAccountBalance(int clientId, String currency);
    boolean getMoney(int clientId, BigDecimal amount, String currency);
    boolean saveMoney(int clientId, BigDecimal amount, String currency);
}
