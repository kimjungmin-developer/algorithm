package casa;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Problem2 {


    // Complete the braces function below.
    static String[] braces(String[] values) {
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = braces(values[i]);
        }
        return result;
    }

    private static String braces(String value) {
        Deque<Character> stack = new ArrayDeque<>();

        // Traversing the Expression
        for (int i = 0; i < value.length(); i++) {
            char x = value.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return "NO";

            switch (x) {
                case ')':
                    Character a = stack.pop();
                    if (a == '{' || a == '[')
                        return "NO";
                    break;

                case '}':
                    Character b = stack.pop();
                    if (b == '(' || b == '[')
                        return "NO";
                    break;

                case ']':
                    Character c= stack.pop();
                    if (c == '(' || c == '{')
                        return "NO";
                    break;
            }

        }
        if (stack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }
}