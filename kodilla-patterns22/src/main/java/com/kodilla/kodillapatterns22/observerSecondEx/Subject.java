package com.kodilla.kodillapatterns22.observerSecondEx;

public interface Subject {
    void register(Observer o);
    void notifyObservers();
    void unregister(Observer o);
}
