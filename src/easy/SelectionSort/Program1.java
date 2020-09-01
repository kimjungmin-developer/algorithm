package easy.SelectionSort;

import java.util.*;

class Program1 {
    public static int[] selectionSort(int[] array) {
        // Write your code here.
        int end = array.length;
        for (int i = 0; i < end; i ++) {
            int smallestIndex = i;
            for (int j = i + 1; j < end; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
        return array;
    }
}
