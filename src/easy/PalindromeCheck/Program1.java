package easy.PalindromeCheck;

import java.util.*;

class Program {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int end = str.length() - 1;
        int start = 0;
        while (end > start) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }
}
