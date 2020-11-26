package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArraySearchService {
    private static final Logger logger = LogManager.getLogger(ArraySearchService.class);
    private static final int MIN_DIGIT = 100;
    private static final int MAX_DIGIT = 999;

    public int binarySearch(NumberArray numberArray, int numberSearch) {
        int low = 0;
        int high = numberArray.size() - 1;
        int index = 0;

        while (low <= high) {
            int mid = (low + high)/2;
            if (numberArray.get(mid)< numberSearch) {
                low = mid + 1;
            } else if (numberArray.get(mid)> numberSearch) {
                high = mid - 1;
            } else if (numberArray.get(mid) == numberSearch) {
                index = mid;
                break;
            }
        }
        logger.info("binary search array : {}, numberSearch : {}, result : {} ",
                numberArray, numberSearch, index);
        return index;
    }

    public int findMaxElement(NumberArray numberArray) {
        int max = 0;
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i) > max) {
                max = numberArray.get(i);
            }
        }
        logger.info("max : {}, result : {} ", numberArray, max);
        return max;
    }

    public int findMinElement(NumberArray numberArray) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i) < min) {
                min = numberArray.get(i);
            }
        }
        logger.info("min : {}, result : {} ", numberArray, min);
        return min;
    }

    public List<Integer> findPrimeNumbers(NumberArray numberArray) {
        int maxCounter = 2;
        List<Integer> primeArray = new ArrayList<>();
        for (int i = 0; i < numberArray.size(); i++) {
            if(numberArray.get(i) > 1) {
                int count = 0;
                for (int j = 2; j <= numberArray.get(i); j++) {
                    if (numberArray.get(i) % j == 0 && count < maxCounter) {
                        count++;
                    }
                }
                if (count < maxCounter) {
                    primeArray.add(numberArray.get(i));
                }
            }
        }
        logger.info("prime numbers found : {}, result : {} ", numberArray, primeArray);
        return primeArray;
    }

    public List<Integer> findFibonacciNumbers(NumberArray numberArray) {
        List<Integer> fibonacci = new ArrayList<>();
        for (int i = 0; i < numberArray.size(); i++) {
            if (numberArray.get(i) == 1) {
                fibonacci.add(numberArray.get(i));
            }
            int a = 1;
            int b = 1;
            int c = 0;
            while (c < numberArray.get(i)) {
                c = a + b;
                a = b;
                b = c;
            }
            if (c == numberArray.get(i)) {
                fibonacci.add(numberArray.get(i));
            }
        }
        logger.info("fibonacci numbers found : {}, result : {} ", numberArray, fibonacci);
        return fibonacci;
    }

    public List<Integer> findDifferentNumbers(NumberArray numberArray) {
        List<Integer> differentDigitsArray = new ArrayList<>();
        for (int i = 0; i < numberArray.size(); i++) {
            int number = numberArray.get(i);
           if (number >= MIN_DIGIT && number <= MAX_DIGIT) {
               int a = number / 100;
               int b = number / 10 % 10;
               int c = number % 10;
               if ((a != b) && (a != c) && (b != c)) {
                   differentDigitsArray.add(numberArray.get(i));
               }
           }
        }
        logger.info("3 digits numbers found : {}, result : {} ", numberArray, differentDigitsArray);
        return differentDigitsArray;
    }
}
