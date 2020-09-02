package medium.SmallestDifference;

import java.util.*;

class Program {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int indexOne = 0;
        int indexTwo = 0;
        int[] smallestPair = new int[2];
        while (indexOne < arrayOne.length && indexTwo < arrayTwo.length) {
            int firstNumber = arrayOne[indexOne];
            int secondNumber = arrayTwo[indexTwo];
            if (firstNumber < secondNumber) {
                current = secondNumber - firstNumber;
                indexOne += 1;
            }
            else if (firstNumber > secondNumber) {
                current = firstNumber - secondNumber;
                indexTwo += 1;
            }
            else {
                return new int[]{firstNumber, secondNumber};
            }
            if (smallest > current) {
                smallest = current;
                smallestPair[0] = firstNumber;
                smallestPair[1] = secondNumber;
            }
        }
        return smallestPair;
    }
}
