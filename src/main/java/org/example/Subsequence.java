package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (list.contains(c)) {
                max = Math.max(max, list.size());
                int index = list.indexOf(c);
                if (index >= 0) {
                    list.subList(0, index + 1).clear();
                }
            }
            list.add(c);
        }
        return Math.max(max, list.size());
    }


    public static void main(String[] args) {
        final Subsequence subsequence = new Subsequence();
        System.out.println(subsequence.lengthOfLongestSubstring("pwwkew"));
    }
}
