//Napisz program obliczający wartość średnią 20 elementów tablicy. Pamiętaj:
//•  Elementy tablicy powinny być typu int.
//•  Pamiętaj, że wynik prawdopodobnie nie będzie wartością całkowitą.
//•  Pętla powinna wyświetlić wszystkie elementy tablicy.
//•  Na koniec powinna zostać wyświetlona wartość średniej.

package com.kodilla.collections.myLoop;

import java.util.Scanner;

class MyLoop {

    int numberOfElements;

    public MyLoop(int numberOfElements){
        this.numberOfElements = numberOfElements;
    }

    public int getNumberOfElements(){
        return this.numberOfElements;
    }
}

class App{
    public static void main(String[] args) {

        System.out.println("Enter a nubmer of elements");
        Scanner scanner = new Scanner(System.in);

        MyLoop myLoop = new MyLoop(scanner.nextInt());
        int number = myLoop.getNumberOfElements();
        int numbers[] = new int[number];
        double sum = 0;

        Scanner sc = new Scanner(System.in);

        for (int i=0; i < number; i++){
            System.out.println("Give me a numbmer to put into array");
            numbers[i] = sc.nextInt();
        }

        for (int i=0; i<number; i++){
            System.out.println("number[ "+ i + " ]" + numbers[i]);
            sum += numbers[i];
            System.out.println("Average is" + sum/number);
        }
    }
}
