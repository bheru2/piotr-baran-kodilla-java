package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {2, 5, 8, 9, 11};
        double expected = 7.0;
        //When
        double actual = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testGetAverageEmptyArray() {
        //Given
        int[] empty = new int[0];
        double expected = 0.0;
        //When
        double actual = ArrayOperations.getAverage(empty);
        //Then
        assertEquals(expected, actual, 0.001);
    }
}
