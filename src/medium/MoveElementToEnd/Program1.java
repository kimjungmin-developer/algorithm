package medium.MoveElementToEnd;

import java.util.*;

class Program {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int start = 0;
        int end = array.size() - 1;
        Integer[] result = new Integer[array.size()];
        for (int number : array) {
            if (number == toMove) {
                result[end] = number;
                end -= 1;
            }
            else {
                result[start] = number;
                start += 1;
            }
        }
        return Arrays.asList(result);
    }
}