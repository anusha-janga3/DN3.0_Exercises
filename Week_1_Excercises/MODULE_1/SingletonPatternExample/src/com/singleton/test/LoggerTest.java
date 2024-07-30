package com.singleton.test;

import com.singleton.example.Logger;

public class LoggerTest {
    public static void main(String[] args) {
        //To run in src type java com.singleton.test.LoggerTest
        Logger logger1 = Logger.getInstance();
        System.out.println("Logger1 instance: " + logger1);
        logger1.log("This is a log message.");
    }
}
