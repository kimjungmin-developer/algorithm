package casa;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result1 {

    /*
     * Complete the 'groupSort' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<List<Integer>> groupSort(List<Integer> arr) {

        Map<Integer, Integer> info = new HashMap<>();
        for (int number : arr) {
            if (info.containsKey(number)) {
                info.put(number, info.get(number) + 1);
            }
            else {
                info.put(number, 1);
            }
        }
        List<Integer> values = new ArrayList<>(info.values());
        Collections.sort(values, Collections.reverseOrder());
        Map<Integer, List<Integer>> info2 = new LinkedHashMap<>();
        for (int number : values) {
            info2.put(number, new ArrayList<>());
        }
        Set<Integer>keys = info2.keySet();
        for (int number : keys) {
            for (int number2: info.keySet()) {
                if (info.get(number2) == number) {
                    List<Integer> list = info2.get(number);
                    list.add(number2);
                }
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int number : keys) {
            List<Integer> currentList = info2.get(number);
            for (int number2 : currentList) {
                List<Integer> tempResult = new ArrayList<>();
                tempResult.add(number2);
                tempResult.add(number);
                result.add(tempResult);
            }
        }
        return result;
    }
}


