package medium.MonotonicArray;

import java.util.*;

class Program2 {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                isNonDecreasing = false;
            }
            if (array[i - 1] < array[i]) {
                isNonIncreasing = false;
            }
        }
        return isNonDecreasing || isNonIncreasing;
    }
}

