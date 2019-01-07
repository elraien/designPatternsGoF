package com.designPatternsGoF.Strategy.startStrategy;

import com.designPatternsGoF.Strategy.authentication.CheckUser;
import com.designPatternsGoF.Strategy.strategy.DB;
import com.designPatternsGoF.Strategy.strategy.FileAuth;

import java.io.File;

public class StartStrategy {
    public static void main(String[] args) {
        CheckUser checkUser = new CheckUser();

        checkUser.check(new FileAuth(new File("c:\\newfile.txt")));

        checkUser.check(new DB("jdbc://smth"));
    }
}
