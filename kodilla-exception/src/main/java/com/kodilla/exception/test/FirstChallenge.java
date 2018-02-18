package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try{
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
            System.out.println("End of try block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException ocurred in bloc catch");
            System.out.println("You should not divide by zero");
        }
        System.out.println("I have finished try catch");
    }
}

//
//Zauważ, że metoda divide(double a, double b), rzuci wyjątkiem jeżeli będziemy chcieli podzielić przez 0.
// Wykorzystując blok try-catch-finally obsłuż rzucany wyjątek.
//
//Link do repozytorium wklej poniżej i wyślij do mentora. Powodzenia!