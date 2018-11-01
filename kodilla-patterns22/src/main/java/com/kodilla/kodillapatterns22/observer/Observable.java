package com.kodilla.kodillapatterns22.observer;

//musi być implementowany przez ForumTopic po to, aby obserwatorzy mogli się
//subskrybować na zmiany w obiektach tej klasy.

public interface Observable {
    //pozwala dowolnemu obserwatorowi na zasubskrybowanie się na
    // zmiany obiektu implemetującego interfejs Observable,
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
