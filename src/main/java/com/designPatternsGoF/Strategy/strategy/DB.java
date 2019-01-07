package com.designPatternsGoF.Strategy.strategy;

public class DB implements AuthStrategy {

    private Object dbReference;
    private String dbURL;

    public DB(String dbURL) {
        this.dbURL = dbURL;
    }

    private void createConnection(String dbURL) {
        System.out.println("Creating connection with db...");
    }

    public boolean checkLogin(String userName, String password) {
        System.out.println("Checking with database...");

        String userNameHash = getHash(userName);
        String passwordHash = getHash(password);

        return checkUser(userName, password);
    }

    private boolean checkUser(String userName, String password) {
        System.out.println("Status OK, check with DB was successful");
        return true;
    }

    private String getHash(String str) {
        return "7BF234356";
    }
}
