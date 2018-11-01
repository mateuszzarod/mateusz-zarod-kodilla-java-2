package com.kodilla.kodillapatterns22.observerSecondEx;

public class Main {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver = new StockObserver(stockGrabber);
        stockGrabber.setAaplPrice(1000);
        stockGrabber.setGoogPrice(230213);
        stockGrabber.setIbmPrice(1231);

    }
}
