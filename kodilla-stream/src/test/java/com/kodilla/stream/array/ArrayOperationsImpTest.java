package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsImpTest {

    @Test
    public void ArrayOperationsImpTest() {
        //Given
        int[] numbers = {10, 20, 30, 40, 50, 90, 15};
        ArrayOperations operations = new ArrayOperationsImp();

        //When
        double result1 = operations.getAverage(numbers);

        //Then
        Assert.assertEquals(36.42, result1, 0.1);
    }
}
