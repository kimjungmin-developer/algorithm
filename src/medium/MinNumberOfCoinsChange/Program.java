package medium.MinNumberOfCoinsChange;

import java.util.*;

class Program {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int[] candidates = new int[n + 1];
        Arrays.fill(candidates, Integer.MAX_VALUE);
        candidates[0] = 0;
        int currentNumber = 0;
        for (int denom : denoms) {
            for (int i = 0; i < candidates.length; i++) {
                if (denom <= i) {
                    int target = i - denom;
                    if (candidates[target] == Integer.MAX_VALUE) {
                        currentNumber = Integer.MAX_VALUE;
                    }
                    else {
                        currentNumber = 1 + candidates[target];
                    }

                    candidates[i] = Math.min(currentNumber, candidates[i]);
                }
            }
        }
        return candidates[n] != Integer.MAX_VALUE ? candidates[n] : -1;
    }
}