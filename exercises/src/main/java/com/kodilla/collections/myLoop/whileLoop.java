package com.kodilla.collections.myLoop;

import java.util.Random;

public class whileLoop {
    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;
        int number = 0;

        Random randomGenerator = new Random();

        while (sumA > sumB){
            number++;
            int a = randomGenerator.nextInt(10);
            int b = randomGenerator.nextInt(50);

            sumA+=a;
            sumB+=b;

            System.out.println("przebieg pętli to" + number);
            System.out.println("liczba a to" + a + "liczba b: " + b + "suma a " + sumA + " suma b " + sumB);
        }
    }
}
