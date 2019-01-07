package com.designPatternsGoF.Strategy.strategy;

import java.io.File;

public class FileAuth implements AuthStrategy {

    private File newFile;

    public FileAuth(File newFile) {
        this.newFile = newFile;
    }

    public boolean checkLogin(String userName, String password) {
        System.out.println("Starting check with a file...");
        return checkFromFile();
    }

    private boolean checkFromFile() {
        System.out.println("Check in progress");
        System.out.println("Status OK, check with file was successful");
        return true;
    }
}
