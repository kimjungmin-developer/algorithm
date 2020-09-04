package medium.SpiralTraverse;

import java.util.*;

class Program {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        int startColumn = 0;
        int startRow = 0;
        int endColumn = array[0].length - 1;
        int endRow = array.length - 1;
        List<Integer> result = new ArrayList<>();
        while (startRow <= endRow && startColumn <= endColumn) {
            for (int currentColumn = startColumn; currentColumn <= endColumn; currentColumn++) {
                result.add(array[startRow][currentColumn]);
            }
            for (int currentRow = startRow + 1; currentRow <= endRow; currentRow++) {
                result.add(array[currentRow][endColumn]);
            }
            for (int currentColumn = endColumn - 1; currentColumn >= startColumn; currentColumn--) {
                if (startRow == endRow) break;
                result.add(array[endRow][currentColumn]);
            }
            for (int currentRow = endRow - 1; currentRow > startRow; currentRow--) {
                if (startColumn == endColumn) break;
                result.add(array[currentRow][startColumn]);
            }
            startRow += 1;
            startColumn += 1;
            endRow -= 1;
            endColumn -= 1;
        }
        return result;
    }
}