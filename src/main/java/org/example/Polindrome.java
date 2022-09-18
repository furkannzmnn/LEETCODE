package org.example;

import java.util.List;

public class Polindrome {

    private static final List<Character> NUMBERS = List.of('0','1','2','3','4','5','6','7','8','9');

    public boolean isPalindrome(int x) {
        final String value = String.valueOf(x);
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            final char last = value.charAt(value.length() - 1 - i);
            if (!NUMBERS.contains(last)) {
                return false;
            }
            reversed.append(last);
        }
        final long parseInt = Long.parseLong(reversed.toString());
        return parseInt == x;
    }

    public static void main(String[] args) {
        Integer.parseInt("-123");
    }
}
