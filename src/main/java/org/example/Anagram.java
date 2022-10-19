package org.example;

import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        if (a.equalsIgnoreCase(b)) {
            return true;
        }
        final char[] bChar = b.toCharArray();
        final char[] aChar = a.toCharArray();

        char[] reversedB = new char[bChar.length];
        char[] reversedA = new char[a.length()];

        for (int i = 0; i < bChar.length; i++) {
            reversedB[i] = bChar[bChar.length - i - 1];
        }

        if (a.equalsIgnoreCase(String.valueOf(reversedB))) {
            return true;
        }

        for (int i = 0; i < a.length(); i++) {
            reversedA[i] = aChar[aChar.length - i - 1];
        }

        return String.valueOf(reversedA).equalsIgnoreCase(b) || String.valueOf(reversedB).equalsIgnoreCase(String.valueOf(reversedA));

    }


    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "margana"));
    }
}
