package edu.epam.jagged_array.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayService {
    private static final Logger logger = LogManager.getLogger(ArrayService.class);

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        logger.info("Max number: " + max);
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        logger.info("Min number: " + min);
        return min;
    }

    public int findSumNumbers(int[] array) {
        int sum = 0;
        for (Integer num : array) {
            sum += num;
        }
        logger.info("Sum numbers: " + sum);
        return sum;
    }
}
