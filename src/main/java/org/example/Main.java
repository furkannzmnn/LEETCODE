package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "pwwkew selam ben bir cümleyim";
        //  non split method
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

    }
}
