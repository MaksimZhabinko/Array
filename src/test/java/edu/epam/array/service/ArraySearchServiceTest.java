package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArraySearchServiceTest {

    int[] arr = {1,2,3,4,5,6,7,8,9};
    NumberArray numberArray = new NumberArray(arr);
    ArraySearchService service = new ArraySearchService();

    @Test
    public void binarySearch() {
        // When
        int actual = service.binarySearch(numberArray, 6);
        int expected = 5;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findMaxElement() {
        // When
        int actual = service.findMaxElement(numberArray);
        int expected = 9;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findMinElement() {
        // When
        int actual = service.findMinElement(numberArray);
        int expected = 1;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findPrimeNumbers() {
        // When
        List<Integer> actual = service.findPrimeNumbers(numberArray);
        List<Integer> expected = Arrays.asList(2,3,5,7);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findFibonacciNumbers() {
        // When
        List<Integer> actual = service.findFibonacciNumbers(numberArray);
        List<Integer> expected = Arrays.asList(1,2,3,5,8);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void findDifferentNumbers() {
        // Given
        int[] arr = {123,121,555,666,678};
        NumberArray numberArray = new NumberArray(arr);
        // When
        List<Integer> actual = service.findDifferentNumbers(numberArray);
        List<Integer> expected = Arrays.asList(123,678);
        // Then
        assertEquals(expected, actual);
    }
}
