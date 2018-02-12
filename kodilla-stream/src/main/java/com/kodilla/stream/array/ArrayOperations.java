package com.kodilla.stream.array;

/*Metoda getAverage(int[] numbers) powinna:
        - przy pomocy strumienia IntStream oraz metody
        range(int startInclusive, int endExclusive) wyświetlić
        kolejne elementy tablicy, a następnie:
        - przy pomocy drugiego strumienia IntStream oraz metody
        range(int startInclusive, int endExclusive), a także kolektora
        average() obliczyć średnią. Na końcu metoda powinna zwracać średnią
        jako wynik typu double.*/

/*W katalogu src/test/java utwórz pakiet com.kodilla.stream.array z jednym zestawem
        testów ArrayOperationsTestSuite oraz jednym testem testGetAverage().
        Test powinien przygotować tablicę z przykładowymi wartościami typu int
        i wywołać metodę getAverage(int[] numbers) interfejsu ArrayOperations.*/

public interface ArrayOperations {
     double getAverage(int[] numbers);
}

