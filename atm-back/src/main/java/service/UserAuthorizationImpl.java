package service;

public class UserAuthorizationImpl implements UserAuthorization{

    @Override
    public boolean checkLogin(int cardNo, int pinCode) {
        return false;
    }

    @Override
    public int getClientId() {
        return 0;
    }
}
