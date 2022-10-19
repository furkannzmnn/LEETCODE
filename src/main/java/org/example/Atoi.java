package org.example;

import java.util.List;

public class Atoi {
    public int myAtoi(String s) {
        final char negativePrefix = '-';
        final char positivePrefix = '+';
        boolean isNegative = false;
        String temp = "";
        List<String> digits = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        s = s.trim();

        for (int i = 0; i < s.length(); i++) {
            final char current = s.charAt(i);
            if (current == negativePrefix) {
                isNegative = true;
            } else if (current == positivePrefix) {
                break;
            }

            if (digits.contains(Character.toString(current))) {
                temp += current;
            }
        }
        return isNegative ? Integer.parseInt(temp) * -1 : Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        System.out.println(new Atoi().myAtoi("words and 987"));
    }
}
