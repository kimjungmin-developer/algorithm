package easy.InsertionSort;

import java.util.*;

class Program1 {
    public static int[] insertionSort(int[] array) {
        // Write your code here.
        int end = array.length;
        for (int i = 0; i < end; i++) {
            int count = i;
            while (count > 0) {
                if (array[count - 1] > array[count]) {
                    swap(array, count);
                }
                count -= 1;
            }
        }
        return array;
    }

    private static void swap(int[] array, int index) {
        int temp = array[index];
        array[index] = array[index - 1];
        array[index -1] = temp;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{8,5,2,9,5,6,3};
        int[] result =  Program1.insertionSort(testArray);
        System.out.println(result);
    }
}
