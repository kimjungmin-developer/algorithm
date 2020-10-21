package practice.ecommerce;

import java.util.*;

public class Program3 {
    public int solution(int k, int[] score) {
        Map<Integer, List<Integer>> scores = new HashMap<>();
        List<Integer> tempResult = new ArrayList<>();
        Set<Integer> tempResult2 = new HashSet<>();
        for (int i = 1; i < score.length; i++) {
            int currentDifference = Math.abs(score[i] - score[i - 1]);
            if (scores.containsKey(currentDifference)) {
                List<Integer> list = scores.get(currentDifference);
                list.add(i);
            }
            else {
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                scores.put(currentDifference, newList);
            }
        }
        Set<Integer> keys = scores.keySet();
        for (int key : keys) {
            List<Integer> currentList = scores.get(key);
            if (currentList.size() >= k) {
                tempResult.addAll(currentList);
            }
        }
        for (int number : tempResult) {
            tempResult2.add(number);
            tempResult2.add(number - 1);
        }
        List<Integer> tempResult3 = new ArrayList<>(tempResult2);
        Integer[] finalResult = new Integer[tempResult2.size()];
        for (int i = 0; i < tempResult3.size(); i++) {
            finalResult[i] = tempResult3.get(i);
        }
        Arrays.sort(finalResult);
        int cursor = 0;
        List<Integer> finalResult2 = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (cursor <= finalResult.length -1 && i == finalResult[cursor]) {
                cursor = cursor + 1;
            }
            else {
                finalResult2.add(i);
            }
        }

        return finalResult2.size();
    }

    public static void main(String[] args) {
        Program3 pro = new Program3();
        int[] testScores = new int[]{1300000000, 700000000, 668239490, 618239490, 568239490, 568239486, 518239486, 157658638, 157658634, 100000000, 100};
        int result = pro.solution(2, testScores);
        System.out.println(result);
    }
}
