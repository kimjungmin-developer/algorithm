package medium.ThreeNumberSum;

import java.util.*;

class Program2 {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        int end = array.length - 2;
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < end; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    result.add(new Integer[]{array[i], array[left], array[right]});
                    left += 1;
                    right -= 1;
                } else if (currentSum > targetSum) {
                    right -= 1;
                } else if (currentSum < targetSum) {
                    left += 1;
                }
            }
        }
        return result;
    }
}
