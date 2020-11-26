package edu.epam.array.service;

import edu.epam.array.entity.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortService {
    private static final Logger logger = LogManager.getLogger(ArraySortService.class);

    public NumberArray sortBubble(NumberArray numberArray) {
        logger.info("bubble sort array starts .. {} ", numberArray);
        for (int i = 0; i < numberArray.size() - 1; i++) {
            for (int j = 0; j < numberArray.size() - i - 1; j++) {
                if (numberArray.get(j) > numberArray.get(j + 1)) {
                    int tmp = numberArray.get(j);
                    numberArray.set(j, numberArray.get(j + 1));
                    numberArray.set(j + 1, tmp);
                }
            }
        }
        logger.info("bubble sort array finished .. {} ", numberArray);
        return numberArray;
    }

    public NumberArray sortSelection(NumberArray numberArray) {
        logger.info("selection sort array starts .. {} ", numberArray);
        for (int i = 0; i < numberArray.size(); i++) {
            int min = numberArray.get(i);
            int minI = i;
            for (int j = i+1; j < numberArray.size(); j++) {
                if (numberArray.get(j) < min) {
                    min = numberArray.get(j);
                    minI = j;
                }
            }
            if (i != minI) {
                int tmp = numberArray.get(i);
                numberArray.set(i, numberArray.get(minI));
                numberArray.set(minI, tmp);
            }
        }
        logger.info("selection sort array finished .. {} ", numberArray);
        return numberArray;
    }

    public NumberArray sortImperative(NumberArray numberArray) {
        logger.info("imperative sort array starts .. {} ", numberArray);
        for (int i = 1; i < numberArray.size(); i++) {
            int key = numberArray.get(i);
            int j = i - 1;
            while (j >= 0 && numberArray.get(j) > key) {
                numberArray.set(j + 1, numberArray.get(j));
                j = j - 1;
            }
            numberArray.set(j + 1, key);
        }
        logger.info("imperative sort array finished .. {} ", numberArray);
        return numberArray;
    }
}
