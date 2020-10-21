package practice.naver;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[][] blocks) {
        int[][] tempResult = new int[blocks.length][blocks.length];
        for (int i = 0; i < blocks.length; i++) {
            if (i == 0) {
                tempResult[0][0] = blocks[0][1];
            }
            else {
                int startingPoint = blocks[i][0];
                int startingValue = blocks[i][1];
                tempResult[i][startingPoint] = startingValue;
                fillLeft(tempResult, i, startingPoint, startingValue);
                fillRgith(tempResult, i, startingPoint, startingValue);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < tempResult.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                result.add(tempResult[i][j]);
            }
        }
        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;
    }

    private void fillRgith(int[][] tempResult, int i, int startingPoint, int startingValue) {
        while (startingPoint < i) {
            tempResult[i][startingPoint + 1] = tempResult[i -1][startingPoint] - tempResult[i][startingPoint];
            startingPoint = startingPoint + 1;
        }
    }

    private void fillLeft(int[][] tempResult, int i, int startingPoint, int startingValue) {
        while (startingPoint > 0) {
            tempResult[i][startingPoint - 1] = tempResult[i - 1][startingPoint - 1] - tempResult[i][startingPoint];
            startingPoint = startingPoint - 1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] test = new int[][]{{0, 50}, {0, 22}, {2, 10}, {1, 4}, {4, -13}};
        sol.solution(test);
    }
}
