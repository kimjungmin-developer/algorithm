package easy.TwoNumberSum;

class Solution1 {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[] {array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}
