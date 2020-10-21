package practice.cacao;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        Map<String, Integer> counter = new HashMap<>();
        for (String currentOrder : orders) {
            for (int i = 0; i < currentOrder.length(); i++) {
                String key = String.valueOf(currentOrder.charAt(i));
                if (counter.containsKey(key)) {
                    int current = counter.get(key);
                    counter.put(key, current + 1);
                } else {
                    counter.put(String.valueOf(currentOrder.charAt(i)), 1);
                }
            }
        }
        String[] answer = {};
        return answer;
    }
}
