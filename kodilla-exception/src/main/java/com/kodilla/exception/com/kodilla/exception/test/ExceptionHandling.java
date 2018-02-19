package com.kodilla.exception.com.kodilla.exception.test;

/*Następnie w tym samym pakiecie utwórz klasę ExceptionHandling,
w której obsłużysz błąd zgodnie z dobrymi praktykami wykorzystując
blok try-catch-finally. Stworzony kod prześlij do repozytorium Github.*/

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        // w sumie zrobiłem dokładnie to o co chodziło w poleceniu :)

        try {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e) {
            System.out.println("Catched an exception something went wrong");
        } finally {
            System.out.println("I'm gonna be here ... always");
        }
    }
}
