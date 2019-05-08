package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
        List<Integer> expected = new ArrayList<>();
        List<Integer> given = new ArrayList<>();
        expected.add(4);
        expected.add(10);
        given.add(1);
        given.add(4);
        given.add(5);
        given.add(10);
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(given);
        //Then
        assertEquals(expected, actual);
    }
}
