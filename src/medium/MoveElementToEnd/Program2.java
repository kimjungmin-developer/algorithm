package medium.MoveElementToEnd;

import java.util.*;

class Program2 {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int left = 0;
        int right = array.size() - 1;
        while (left < right) {
            while (left < right && array.get(right) == toMove) {
                right -= 1;
            }
            if (array.get(left) == toMove) {
                swap(array, left, right);
            }
            left += 1;
        }
        return array;
    }

    private static void swap(List<Integer> array, int left, int right) {
        int temp = array.get(left);
        array.set(left, array.get(right));
        array.set(right, temp);
    }
}