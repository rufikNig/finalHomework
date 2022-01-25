package service;

public interface UserAuthorization {
    boolean checkLogin(int cardNo, int pinCode);
    int getClientId();
}
