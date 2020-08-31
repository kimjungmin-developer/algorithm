package easy.ThreeLargestNumbers;

class Program2 {
    public static int[] findThreeLargestNumbers(int[] array) {
        int[] threeLargest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int number: array) {
            updateLargest(threeLargest, number);
        }
        return threeLargest;
    }

    private static void updateLargest(int[] threeLargest, int number) {
        if (number > threeLargest[2]) {
            shiftAndUpdate(threeLargest, number, 2);
        }
        else if (number > threeLargest[1]) {
            shiftAndUpdate(threeLargest, number, 1);
        }
        else if (number > threeLargest[0]) {
            shiftAndUpdate(threeLargest, number, 0);
        }
    }

    private static void shiftAndUpdate(int[] threeLargest, int number, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                threeLargest[i] = number;
            } else {
                threeLargest[i] = threeLargest[i + 1];
            }
        }
    }
}
