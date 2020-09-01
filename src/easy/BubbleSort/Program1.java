package easy.BubbleSort;


import java.util.*;

class Program1 {
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        int count = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - count; i ++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i);
                    isSorted = false;
                }
            }
            count = count + 1;
        }
        return array;
    }

    private static void swap(int[] array, int index) {
        int temp = array[index + 1];
        array[index + 1] = array[index];
        array[index] = temp;
    }
}