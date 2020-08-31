package easy.ECommerce;

import java.util.*;

class Solution {

    public int solution(int N, int[][] simulation_data) {
        int arraySize = simulation_data.length;
        List<Integer> result = new ArrayList<>();
        int timeResult = 0;
        for (int i = N; i < arraySize; i ++) {
            if (i == 1) {
                continue;
            }
            int previousStart = simulation_data[i - 1][1];
            int previousEnd = simulation_data[i - 1][2] + previousStart;
            int start = simulation_data[i][1];
            int end = simulation_data[i][2] + start;
            List<Integer> temp = new ArrayList<>();
            for (int j = start; j <= previousEnd; j++) {
                temp.add(j);
            }
            int time = temp.get(temp.size() - 1) - temp.get(0);
            int previousTime = 0;
            if (result.size() > 0) {
                int currentIndex = result.size();
                previousTime = result.get(currentIndex -1);
            }
            int currentTime = time + previousTime;
            result.add(currentTime);
        }
        for (int a = 0; a < result.size(); a++) {
            timeResult = timeResult + result.get(a);
        }
        return timeResult;
    }
}