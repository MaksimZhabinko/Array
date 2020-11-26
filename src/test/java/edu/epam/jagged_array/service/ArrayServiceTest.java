package edu.epam.jagged_array.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayServiceTest {

    int[] arr = {15,2,78,24,50,10};
    ArrayService service = new ArrayService();

    @Test
    public void findMaxNumber() {
        // When
        int actual = service.findMaxNumber(arr);
        int expected = 78;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findMinNumber() {
        // When
        int actual = service.findMinNumber(arr);
        int expected = 2;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findSumNumbers() {
        // When
        int actual = service.findSumNumbers(arr);
        int expected = 179;
        // Then
        assertEquals(expected, actual);
    }
}
