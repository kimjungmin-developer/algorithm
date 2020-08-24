package easy.TwoNumberSum;

import java.util.*;

class Solution2 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> archive = new HashSet<>();
        for (int i: array) {
            int remainder = targetSum - i;
            if (archive.contains(remainder)) {
                return new int[] {remainder, i};
            }
            else {
                archive.add(i);
            }
        }
        return new int[0];
    }
}
