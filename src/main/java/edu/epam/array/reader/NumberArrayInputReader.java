package edu.epam.array.reader;

import edu.epam.array.entity.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberArrayInputReader {
    private static final Logger logger = LogManager.getLogger(NumberArrayInputReader.class);
    private static final int MIN = 5;
    private static final int MAX = 100;
    private static final int DIFF = MAX - MIN;

    public NumberArray randomNumbers(int size) {
        NumberArray numberArray = new NumberArray(size);
        Random random = new Random();
        for (int i = 0; i < numberArray.size(); i++) {
            numberArray.set(i, random.nextInt(DIFF + 1) - MIN);
        }
        logger.info("array filled: " + numberArray);
        return numberArray;
    }

    public NumberArray readFile(String path) {
        List<Integer> array = new ArrayList<>();
       try {
           BufferedReader reader = new BufferedReader(new FileReader(path));
           String line = reader.readLine();
           while (line != null) {
               String[] numbers = line.split(" ");
               for (String number : numbers) {
                   int num = Integer.parseInt(number);
                   array.add(num);
               }
               line = reader.readLine();
           }
       } catch (FileNotFoundException ex) {
           logger.info("file not found");
       } catch (IOException e) {
           logger.info("file inout error occurred");
       }

       int[] result = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }
        NumberArray numberArray = new NumberArray(result);
        logger.info("Read numbers from file: " + numberArray.toString() + " in the NumberArray");
        return numberArray;
    }
}
