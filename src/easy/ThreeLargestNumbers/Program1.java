package easy.ThreeLargestNumbers;

import java.util.*;

class Program1 {
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int first = 0;
        int second = 1;
        int third = 2;
        int[] result = new int[3];
        result[first] = array[first];
        result[second] = array[second];
        result[third] = array[third];

        for (int i : array) {
            if (i > result[first]) {
                int tempSecond = result[first];
                int tempThird = result[second];
                result[first] = i;
                result[second] = tempSecond;
                result[third] = tempThird;
            }
            else if (i > result[second] && i < result[first]) {
                int tempThird = result[second];
                result[second] = i;
                result[third] = tempThird;
            }
            else if(i > result[third] && i < result[second]) {
                result[third] = i;
            }
        }
        return result;
    }
}
