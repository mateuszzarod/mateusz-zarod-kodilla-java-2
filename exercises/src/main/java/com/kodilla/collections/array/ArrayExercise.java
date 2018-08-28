package com.kodilla.collections.array;

//1.  Napisz program przy użyciu listy ArrayList, zawierającej
// kilkanaście ocen z przedmiotu Informatyka w liceum.

//2.  Wypełnij listę przykładowymi ocenami.

//3.  Następnie przy pomocy pętli for oblicz średnią ocenę ucznia (średnia arytmetyczna), ale w
//taki sposób, że pominięte zostaną skrajne oceny - JEDNA najmniejsza i JEDNA największa.


//Oceny największą i najmniejszą należy odnaleźć. Przykładowo - dla ocen:
//1.  3,3,4,4,4,5,5,5,6 - do obliczenia średniej wzięte zostaną oceny: 3,4,4,4,5,5,5
//2.  4,4,4,4,4,4,4 - do obliczenia średniej wzięte zostaną oceny: 4,4,4,4,4

import java.util.*;

public class ArrayExercise {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(2);
        grades.add(2);
        grades.add(1);
        grades.add(7);
        grades.add(5, 1);

        List<Integer> gradesTwo = new ArrayList<>();
        grades.add(5);
        grades.add(1);
        grades.add(4);
        grades.add(2);
        grades.add(7);
        grades.add(5, 1);
        grades.add(10);

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);

        int[] arr = {1,2,3,4,5};
        int arrSec[] = {1,2,3,4,5};

        //two references to a different objects so it won't be the same
        if (arr == arrSec) System.out.println("same");
        else System.out.println("not same");
        if(Arrays.equals(arr, arrSec))
            System.out.println("same");
        else System.out.println("NOT");

       for (int i = 0; i < grades.size(); i++) {
            System.out.println("Element: " + i + "of list is: " + grades.get(i));
        }

        Collections.sort(grades);
        System.out.println(grades);
        grades.remove(grades.size() - 1);

        double sumAll = 0.0;

        for (int grade : grades) {
            sumAll += grade;
            System.out.println("sumof all: " + sumAll);
        }

        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;

        for (int value : grades) {
            System.out.println("Current element: " + value);

            if (value > max) {
                max = value;

            }
            if (value < min) {
                min = value;
            }
        }

        List<Integer> litOfInt = new ArrayList<>();
        for (int copyValue: grades){
            if (copyValue == 1){
               litOfInt.add(copyValue);
            }
        }

        System.out.println("Current max: " + max);
        System.out.println("Current min: " + min);
        grades.remove(max);
        grades.remove(min);

        int sum = 0;

        for (int totalMinMax : grades) {
            sum += totalMinMax;
            System.out.println("before removal: " + sumAll + "min: " + min + "max: " + max + " Sum after removal: " + sum);
        }

/*
        List<Integer> linkedListFilledWithInt = new LinkedList<>();

        for (int n = 0; n < 1000; n++) {
            linkedListFilledWithInt.add(n * 2);
        }
        for (int result : linkedListFilledWithInt) if (result > 10){
            System.out.println(result);
        }
*/
    }
}




