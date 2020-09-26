package medium.MaxSubsetNoAdjacent;

import java.util.*;

class Program {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int[] maxSums = array.clone();
        maxSums[1] = Math.max(maxSums[0], maxSums[1]);
        for (int i = 2; i < array.length; i++) {
            maxSums[i] = Math.max(maxSums[i - 1], maxSums[i - 1] + maxSums[i]);
        }
        return maxSums[array.length - 1];
    }
}