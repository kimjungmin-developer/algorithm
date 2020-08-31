package easy.BinarySearch;

import java.util.*;

class Program1 {
    public static int binarySearch(int[] array, int target) {
        // Write your code here.
        return binarySearch(array, 0, array.length - 1, target);
    }

    private static int binarySearch(int[] array, int lowIndex, int highIndex, int target) {
        int middleIndex = (lowIndex + highIndex) / 2;
        int midNumber = array[middleIndex];
        if (lowIndex > highIndex) {
            return -1;
        }
        if (midNumber == target) return middleIndex;
        if (midNumber > target) {
            return binarySearch(array, lowIndex, middleIndex - 1, target);
        }
        if (midNumber < target) {
            return binarySearch(array, middleIndex + 1, highIndex, target)
        }
        return -1;
    }
}

