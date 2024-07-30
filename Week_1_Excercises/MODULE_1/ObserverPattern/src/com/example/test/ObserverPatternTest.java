package com.example.test;

import com.example.observer.MobileApp;
import com.example.observer.Observer;
import com.example.observer.WebApp;
import com.example.stock.StockMarket;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        System.out.println("Setting stock price to 100.00");
        stockMarket.setStockPrice(100.00);

        System.out.println("\nSetting stock price to 150.00");
        stockMarket.setStockPrice(150.00);

        System.out.println("\nDeregistering MobileApp1 and setting stock price to 200.00");
        stockMarket.deregisterObserver(mobileApp1);
        stockMarket.setStockPrice(200.00);
    }
}
