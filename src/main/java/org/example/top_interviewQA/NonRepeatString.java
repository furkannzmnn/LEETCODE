package org.example.top_interviewQA;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// easy
public class NonRepeatString {

    public int firstUniqChar(String s) { // L E E T L T A
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new NonRepeatString().firstUniqChar("LEETLTA"));
    }
}
