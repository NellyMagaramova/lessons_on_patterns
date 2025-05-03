package org.test;


import org.test.auth.UserChecker;
import org.test.strategy.DBAuth;
import org.test.strategy.FileAuth;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        userChecker.check(new DBAuth("jdbc://etc"));
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
    }
}