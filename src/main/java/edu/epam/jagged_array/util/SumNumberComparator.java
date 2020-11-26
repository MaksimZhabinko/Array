package edu.epam.jagged_array.util;

import edu.epam.jagged_array.service.ArrayService;

import java.util.Comparator;

public class SumNumberComparator implements Comparator<int[]> {
    ArrayService service = new ArrayService();
    @Override
    public int compare(int[] o1, int[] o2) {
        return service.findSumNumbers(o1) - service.findSumNumbers(o2);
    }
}
