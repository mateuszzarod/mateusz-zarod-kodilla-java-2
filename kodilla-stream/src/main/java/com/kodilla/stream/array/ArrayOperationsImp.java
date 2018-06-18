package com.kodilla.stream.array;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsImp implements ArrayOperations {

    @Override
    public double getAverage (int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(operand -> numbers[operand])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(m -> numbers[m])
                .average()
                .getAsDouble();

        return average;
    }
}
