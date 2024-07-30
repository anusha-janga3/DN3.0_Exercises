package com.example.stock;

import com.example.observer.Observer;

public interface Stock {
    void registerObserver(Observer o);
    void deregisterObserver(Observer o);
    void notifyObservers();
}
