package easy.TwoNumberSum;

import java.util.*;

class Solution3 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        int leftPosition = 0;
        int rightPosition = array.length - 1;
        while (rightPosition > leftPosition) {
            int currentSum = array[leftPosition] + array[rightPosition];
            if (currentSum == targetSum) {
                return new int[] {array[leftPosition], array[rightPosition]};
            }
            else if (currentSum > targetSum) {
                rightPosition = rightPosition - 1;
            }
            else if (currentSum < targetSum) {
                leftPosition = leftPosition + 1;
            }
        }
        return new int[0];
    }
}
