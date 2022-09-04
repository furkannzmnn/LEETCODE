package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ReverseString {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder output = new StringBuilder();
        StringBuilder sw = new StringBuilder();

        final String[] strings = s.split("-");
        Arrays.sort(strings);
        for (int i = 0; i < strings.length - 1; i++) {
            String temp;
            if (strings[i].length() == k) {
                output.append(strings[i]).append("-");
            } else {
                while (sw.length() != k) {
                    temp = strings[i];
                    final String s1 = strings[i + 1];
                    do {
                        if (sw.length() == k) {
                            break;
                        }
                        for (int j = 0; j < s1.length(); j++) {
                            sw.append(temp).append(strings[i + 1].charAt(j));
                        }
                    } while (sw.length() == k);
                    break;
                }
            }
        }
        output.append(sw);
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().licenseKeyFormatting("5F3Z-2e-9-w", 4));
    }
}
