package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.Assert.assertEquals;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> given = new ArrayList<>();
        int expected = 0;
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(given);
        //Then
        assertEquals(expected, actual.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expected = Arrays.asList(4, 10);
        List<Integer> given = Arrays.asList(1, 4, 5, 10);
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(given);
        //Then
        assertEquals(expected, actual);
    }
}
