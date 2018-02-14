package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsImpTest {

    @Test
    public void ArrayOperationsImpTest() {
        //Given
        ArrayOperations operations = new ArrayOperationsImp();
        //When
        double result1 = operations.getAverage(new int[]{100,100});
        double result2 = operations.getAverage(new int[]{200,200});
        //Then
        Assert.assertEquals(100, result1, 0.1);
        Assert.assertEquals(200, result2, 0.1);
    }
}
