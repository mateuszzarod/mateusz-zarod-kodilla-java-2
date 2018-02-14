package com.kodilla.stream.array;
import java.util.stream.IntStream;

public class ArrayOperationsImp implements ArrayOperations {

    @Override
    public double getAverage (int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average()
                .getAsDouble();
    }
}