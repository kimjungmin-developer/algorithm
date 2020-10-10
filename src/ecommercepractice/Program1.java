package ecommercepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program1 {
    public int[] solution(int n, int min_position, int max_position, int[] positions) {
        int toDeploy = n - 1;
        int interval = max_position - min_position;
        int distance = interval/toDeploy;
        List<Integer> tempResult = new ArrayList<>();
        Arrays.sort(positions);
        int cursor = 0;
        for (int i = min_position; i <= max_position; i = i + distance) {
            if (cursor <= positions.length -1 && i == positions[cursor]) {
                cursor = cursor + 1;
            }
            else {
                tempResult.add(i);
            }
        }
        //int[] array = list.stream().mapToInt(i->i).toArray();
        int[] finalResult = new int[tempResult.size()];
        for (int i = 0; i < tempResult.size(); i++) {
            finalResult[i] = tempResult.get(i);
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Program1 program1 = new Program1();
        int[] testPositions = new int[]{6, -10, 2, -6};
        int[] result = program1.solution(6, -10, 10, testPositions);
        System.out.println(result);
    }
}
