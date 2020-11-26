package edu.epam.jagged_array.service;

import edu.epam.jagged_array.util.MaxNumberComparator;
import edu.epam.jagged_array.util.MinNumberComparator;
import edu.epam.jagged_array.util.SumNumberComparator;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class SortServiceTest {

    SortService service = new SortService();
    int[][] arr = new int[][]{{15,60,25}, {3,1}, {122,10,9}};
    boolean reversTrue = true;
    boolean reversFalse = false;
    Comparator<int[]> comparatorMax = new MaxNumberComparator();
    Comparator<int[]> comparatorMin = new MinNumberComparator();
    Comparator<int[]> comparatorSum = new SumNumberComparator();

    @Test
    public void sortMaxAscending() {
        // When
        int[][] actual = service.sort(arr, comparatorMax, false);
        int[][] expected = new int[][]{{3,1}, {15,60,25}, {122,10,9}};
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sortMaxDescending() {
        // When
        int[][] actual = service.sort(arr, comparatorMax, true);
        int[][] expected = new int[][]{{122,10,9}, {15,60,25}, {3,1}};
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sortMinAscending() {
        // When
        int[][] actual = service.sort(arr, comparatorMin, false);
        int[][] expected = new int[][]{{3,1}, {122,10,9}, {15,60,25}};
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sortMinDescending() {
        // When
        int[][] actual = service.sort(arr, comparatorMin, true);
        int[][] expected = new int[][]{{15,60,25}, {122,10,9}, {3,1}};
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sortSumAscending() {
        // When
        int[][] actual = service.sort(arr, comparatorSum, false);
        int[][] expected = new int[][]{{3,1}, {15,60,25}, {122,10,9}};
        // Then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sortSumDescending() {
        // When
        int[][] actual = service.sort(arr, comparatorSum, true);
        int[][] expected = new int[][]{{122,10,9}, {15,60,25}, {3,1}};
        // Then
        assertArrayEquals(expected, actual);
    }
}
