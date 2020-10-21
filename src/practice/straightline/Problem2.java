package practice.straightline;

import java.util.HashSet;
import java.util.Set;

class Solution2 {
    public int[] solution(int[] ball, int[] order) {
        int[] result = new int[ball.length];
        int resultIndex = 0;
        int ballStart = 0;
        int ballEnd = ball.length - 1;
        Set<Integer> waiting = new HashSet<>();
        for (int currentOrder : order) {
            if (ball[ballStart] == currentOrder) {
                result[resultIndex] = currentOrder;
                resultIndex = resultIndex + 1;
                ballStart = ballStart + 1;
                while (waiting.contains(ball[ballStart]) && resultIndex < ball.length) {
                    result[resultIndex] = ball[ballStart];
                    resultIndex = resultIndex + 1;
                    ballStart = ballStart + 1;
                }
            }
            else if(ball[ballEnd] == currentOrder) {
                result[resultIndex] = currentOrder;
                resultIndex = resultIndex + 1;
                ballEnd = ballEnd - 1;
                while(waiting.contains(ball[ballEnd]) && resultIndex < ball.length) {
                    result[resultIndex] = ball[ballEnd];
                    resultIndex = resultIndex + 1;
                    ballEnd = ballEnd - 1;
                }
            }
            else {
                waiting.add(currentOrder);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int value = Integer.valueOf("00007");
        System.out.println(value);
    }
}
