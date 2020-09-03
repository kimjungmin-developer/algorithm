package medium.MonotonicArray;

import java.util.*;

class Program {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        if (array.length < 2) return true;
        int direction = array[1] - array[0];
        for (int i = 0; i < array.length; i++) {
            int current = array[i] - array[i -1];
            if (direction == 0) {
                direction = current;
                continue;
            }
            if (breaksDirection(direction, current)) {
                return false;
            }
        }
        return true;
    }

    private static boolean breaksDirection(int direction, int current) {
        if (direction > 0) return current < 0;
        return current > 0;
    }
}