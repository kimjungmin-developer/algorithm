package easy.ValidateSubsequence;

import java.util.*;

class Solution1 {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int arrayIndex = 0;
        int sequenceIndex = 0;
        int arrayEndCondition = array.size();
        int sequenceEndConditions = sequence.size();
        while (arrayEndCondition > arrayIndex && sequenceEndConditions > sequenceIndex) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex))) {
                sequenceIndex = sequenceIndex + 1;
            }
            arrayIndex = arrayIndex + 1;
        }
        return sequenceIndex == sequenceEndConditions;
    }
}
