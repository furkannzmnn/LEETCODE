package org.example.top_interviewQA;

public class Palindrome {
    public boolean isPalindrome(String s) {
        final String replacedValue = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        final String nonSpaceValue = replacedValue.replaceAll("\\s", "");

        int right = nonSpaceValue.length() - 1;
        for (int left = 0; left < nonSpaceValue.length(); left++) {
            final char current = nonSpaceValue.charAt(left);
            final char last = nonSpaceValue.charAt(right);
            if (current != last) {
                return false;
            }
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Palindrome().isPalindrome("ab_a"));
    }
}
