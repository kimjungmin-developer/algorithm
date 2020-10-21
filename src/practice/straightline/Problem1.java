package practice.straightline;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int solution(int[][] boxes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] box : boxes) {
            for (int i = 0; i < 2; i++) {
                if (map.containsKey(box[i])) {
                    int current = map.get(box[i]);
                    map.put(box[i], current + 1);
                } else {
                    map.put(box[i], 1);
                }
            }
        }
        int totalCount = boxes.length;
        int evenNumberCount = 0;
        Collection<Integer> values = map.values();
        for (int current : values) {
            if (current % 2 == 0) {
                evenNumberCount = evenNumberCount + (current / 2);
            }
        }
        return totalCount - evenNumberCount;
    }
}