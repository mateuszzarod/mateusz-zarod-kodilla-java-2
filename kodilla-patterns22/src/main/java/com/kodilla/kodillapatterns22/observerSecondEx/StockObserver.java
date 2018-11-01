package com.kodilla.kodillapatterns22.observerSecondEx;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double applPrice;
    private double googlPrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++ observerIDTracker;
        System.out.println("new observer: " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.applPrice = aaplPrice;
        this.googlPrice = googPrice;
        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAPPL: " + applPrice + "\nGOOGL: " + googlPrice);
    }
}
