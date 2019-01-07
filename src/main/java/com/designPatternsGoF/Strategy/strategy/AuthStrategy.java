package com.designPatternsGoF.Strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String userName, String password);
}
