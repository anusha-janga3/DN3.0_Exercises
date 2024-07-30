
package com.singleton.app;
import com.singleton.example.Logger;
public class App {
    public static void main(String[] args) {
        //This is main Application
        //To run in src type java com.singleton.app.App
        Logger logger = Logger.getInstance();
        logger.log("Application started.");
        logger.log("Logging an important message.");
        logger.log("Application ended.");
    }
}
