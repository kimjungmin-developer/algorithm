package medium.LogestPeak;

import java.util.*;

class Program {
    public static int longestPeak(int[] array) {
        int longest = 0;
        for (int i = 1; i < array.length - 1; i++) {
            int count = 0;
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count = count + 1;
                int toLeft = i - 1;
                int toRight = i + 1;
                int previousLeft = i;
                int previousRight = i;
                while (toLeft >= 0 && array[toLeft] < array[previousLeft]) {
                    toLeft = toLeft - 1;
                    previousLeft = previousLeft - 1;
                    count = count + 1;
                }
                while (toRight <= array.length - 1 && array[toRight] < array[previousRight]) {
                    toRight = toRight + 1;
                    previousRight = previousRight + 1;
                    count = count + 1;
                }
                if (count > longest) {
                    longest = count;
                }
            }
        }
        return longest;
    }
}
