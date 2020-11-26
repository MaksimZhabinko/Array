package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySortServiceTest {

    int[] arr = {1,7,9,2,5,3,8};
    int[] arrExpected = {1,2,3,5,7,8,9};
    NumberArray numberArray = new NumberArray(arr);
    NumberArray expected = new NumberArray(arrExpected);
    ArraySortService service = new ArraySortService();

    @Test
    public void sortBubble() {
        // When
        NumberArray actual = service.sortBubble(numberArray);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void sortSelection() {
        // When
        NumberArray actual = service.sortSelection(numberArray);
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void sortImperative() {
        // When
        NumberArray actual = service.sortImperative(numberArray);
        // Then
        assertEquals(expected, actual);
    }
}
