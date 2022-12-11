package org.example.top_interviewQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MinWindow {
    public static String contains(String s, String t) {
        String range = "";
        final String[] targets = t.split("");
        int size = t.length();
        boolean[] targetCheck = new boolean[t.length()];
        String range1 = findRange(s, range, targets, size, targetCheck);

        if (range1 != null) return range1;
        return "";
    }

    private static String findRange(String s, String range, String[] targets, int size, boolean[] targetCheck) {
        for (int i = 0; i < s.length(); i++) {
            final char current = s.charAt(i);
            range += String.valueOf(current);
            for (String s1 : targets) {
                if (Objects.equals(s1, String.valueOf(current))) {
                    if (!isFull(targetCheck)) {
                        targetCheck[--size] = true;
                        if (isFull(targetCheck)) {
                            return range;
                        }
                    } else {
                        return range;
                    }
                }
            }
        }
        return null;
    }

    public static boolean isFull(boolean[] targetCheck) {
        for (boolean b : targetCheck) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(contains("ABXCXXCFABC", "ABC"));
    }
}
