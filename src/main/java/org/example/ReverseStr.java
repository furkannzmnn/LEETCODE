package org.example;

import java.util.Arrays;

public class ReverseStr {

    public String reverseWords(String s) {
        StringBuilder reverseString = new StringBuilder();
        final String[] charArray = s.split(" ");
        for (String value : charArray) {
            reverseString.append(reverseString(value.toCharArray())).append(" ");
        }
        return reverseString.substring(0, reverseString.length() - 1);
    }

    private String reverseString(char[] arr) {
        int i = 0;
        int s = arr.length -1;
        while (i  < s) {
            final char temp = arr[i];
            arr[i] = arr[s];
            arr[s] = temp;
            i++;
            s--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStr().reverseWords("God Ding"));
    }
}
