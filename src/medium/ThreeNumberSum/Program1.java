package medium.ThreeNumberSum;

import java.util.*;

class Program {
    // failed version order does not match
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int newTargetSum = targetSum - array[i];
            Set<Integer> potentials = new HashSet<>();
            for (int j = i + 1; j < array.length; j++) {
                int remainder = newTargetSum - array[j];
                if (potentials.contains(remainder)) {
                    result.add(new Integer[]{array[i], remainder, array[j]});
                }
                potentials.add(array[j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int testNum = 0;
        int[] testArray = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        List<Integer[]> result = Program.threeNumberSum(testArray, testNum);
        System.out.println(result);
    }
}