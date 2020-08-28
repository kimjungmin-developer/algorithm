package easy.ProductSum;


import java.util.*;

class Program {
    // Tip: You can use `element instanceof ArrayList` to check whether an item
    // is an array or an integer.
    public static int productSum(List<Object> array) {
        // Write your code here.
        int multiplier = 1;
        int result = productSum(array, multiplier);
        return result;
    }

    private static int productSum(List<Object> array, int multiplier) {
        int result = 0;
        for (Object element: array) {
            if (element instanceof ArrayList) {
                result = result + productSum((ArrayList)element, multiplier + 2);
            }
            else {
                result = result + (int) element;
            }
        }
        result = result * multiplier;
        return result;
    }

    public static void main(String[] args) {
        List<Object> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        List<Object> array1 = new ArrayList<>();
        array1.add(7);
        array1.add(-1);
        array.add(array1);
        array.add(3);
        List<Object> array2 = new ArrayList<>();
        array2.add(-13);
        array2.add(8);
        List<Object> array3 = new ArrayList<>();
        array3.add(6);
        array3.add(array2);
        array3.add(4);
        array.add(array3);

        int result = productSum(array);
        System.out.println(result);
    }
}
