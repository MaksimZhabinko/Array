package edu.epam.jagged_array.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class SortService {
    private static final Logger logger = LogManager.getLogger(SortService.class);

    public int[][] sort(int[][] jaggedArray, Comparator<int[]> comparator, boolean flag) {
        int coefficient = flag ? 1 : -1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                if (coefficient * comparator.compare(jaggedArray[j], jaggedArray[j + 1]) < 0) {
                    swap(jaggedArray, j, j + 1);
                }
            }
        }
        logger.info("Sort jagger array success");
        return jaggedArray;
    }

    public void swap(int[][] array, int row1, int row2) {
        int[] tempArray;
        tempArray = array[row2];
        array[row2] = array[row1];
        array[row1] = tempArray;
    }
}
