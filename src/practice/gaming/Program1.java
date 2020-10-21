package practice.gaming;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static int solution(int[] array) {
        List<Integer> tempResult = new ArrayList<>();
        int result = 1;
        int cursor = 0;
        int end = 4;
        while (cursor < end) {
            if (cursor == 0 && array[cursor] == 1) {
                tempResult.add(1 + array[cursor + 1]);
                cursor = cursor + 1;
            }
            else if (cursor == 3 && array[cursor] == 1) {
                tempResult.add(1 + array[cursor -1]);
            }
            else if (cursor != 0 && cursor != 3 && array[cursor] == 1) {
                int left = array[cursor - 1];
                int right = array[cursor + 1];
                int result2 = left > right ? left : right;
                if (result2 == right) {
                   cursor = cursor + 1;
                }
                tempResult.add(1 + result2);
            }
            else if (array[cursor] != 1) {
                tempResult.add(array[cursor]);
            }
            cursor = cursor + 1;
        }
        for (int number : tempResult) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = new int[]{4,3,1,2};
        int result = Program1.solution(test);
        System.out.println(result);
    }
}
