package org.example;

public class StringCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String temp = "";
        for (int i = 0; i <strs.length - 1; i++) {
            String step1 = strs[i];
            String step2 = strs[i + 1];

            char[] stepArrOne = new char[step1.length()];
            for (int j = 0; j < step1.length(); j++) {
                stepArrOne[j] = step1.charAt(j);
            }
            char[] stepArrTwo = new char[step2.length()];
            for (int j = 0; j < step2.length(); j++) {
                stepArrTwo[j] = step2.charAt(j);
            }
            strs = new String[strs.length - 2];
            temp = shorts(stepArrOne, stepArrTwo);
            longestCommonPrefix(strs);
        }
        return temp;
    }

    private String shorts(char[] stepArrOne, char[] stepArrTwo) {
        StringBuilder similarValue = new StringBuilder();
        for (char value : stepArrOne) {
            for (char c : stepArrTwo) {
                if (value == c) {
                    similarValue.append(value);
                }
            }
        }
        return similarValue.toString();
    }

    public static void main(String[] args) {
        final StringCommonPrefix stringCommonPrefix = new StringCommonPrefix();
        String[] ar = {"flower","flow","flight"};
        System.out.println(stringCommonPrefix.longestCommonPrefix(ar));
    }
}
