package easy.CeasarCipher;

import java.util.*;

class Program {
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        int size = str.length();
        char[] chars = new char[size];
        int newKey = key % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < size; i++) {
            chars[i] = getNewLetter(str.charAt(i), key, alphabet);
        }
        return new String(chars);
    }

    private static char getNewLetter(char character, int key, String alphabet) {
        int newLetterCode = alphabet.indexOf(character) + key;
        return alphabet.charAt(newLetterCode % 26);
    }

    public static void main(String[] args) {
        String testString = "xyz";
        String result = Program.caesarCypherEncryptor(testString, 2);
        System.out.println(result);
    }
}
