package line;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int n) {
        Map<Integer, Integer> result = new HashMap<>();
        String stringValue = String.valueOf(n);
        int count = 0;
        solution(stringValue, count, result);
        int least = Integer.MAX_VALUE;
        for (int i : result.keySet()) {
            if (i <= least) {
                least = i;
            }
        }
        return new int[]{least, result.get(least)};
    }

    private void solution(String stringValue, int count, Map<Integer, Integer> result) {
        int size = stringValue.length();
        if (size < 2) {
            result.put(count, Integer.valueOf(stringValue));
        }
        else {
            for (int i = 0; i < size - 1; i++) {
                int left = Integer.valueOf(stringValue.substring(0, i + 1));
                String stringRight = stringValue.substring(i + 1);
                if (String.valueOf(stringRight.charAt(0)).equals("0")) {
                    continue;
                }
                int right = Integer.valueOf(stringValue.substring(i + 1));
                solution(String.valueOf(left + right), count + 1, result);
            }
        }
    }

//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] result = sol.solution(73425);
//        System.out.println(result);
//    }
}
