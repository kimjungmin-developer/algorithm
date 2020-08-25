package easy.ValidateSubsequence;

import java.util.List;

class Solution2 {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int sequenceIndex = 0;
        int sequenceEndCodition = sequence.size();
        for (int i : array) {
            if (sequenceIndex == sequenceEndCodition) {
                break;
            }
            if(i == sequence.get(sequenceIndex)) {
                sequenceIndex  = sequenceIndex + 1;
            }
        }
        return sequenceIndex == sequenceEndCodition;
    }
}
