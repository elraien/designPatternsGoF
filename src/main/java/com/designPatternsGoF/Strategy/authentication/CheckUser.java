package com.designPatternsGoF.Strategy.authentication;

import com.designPatternsGoF.Strategy.strategy.AuthStrategy;

public class CheckUser {

    private String userName;
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setLogin(String login) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean check(AuthStrategy authStrategy) {
        return authStrategy.checkLogin(userName, password);
    }

}


