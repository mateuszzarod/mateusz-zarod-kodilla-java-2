package com.kodilla.exception.com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("Catched an exception something went wrong");
        } finally {
            System.out.println("I'm gonna be here ... always");
        }
    }
}
