package com.singleton.example;

public class Logger {
    //To run in src type java com.singleton.example.Logger
    private Logger() {
    }

    private static class LoggerHelper {
        private static final Logger INSTANCE = new Logger();
    }
    public static Logger getInstance() {
        return LoggerHelper.INSTANCE;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
