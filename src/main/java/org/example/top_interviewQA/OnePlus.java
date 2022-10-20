package org.example.top_interviewQA;

import java.util.Arrays;
import java.util.Locale;

public class OnePlus { // 3, 9 9,

    public int[] plusOne(int[] digits) {

        StringBuilder builder = new StringBuilder();
        long number;
        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length - 1) {
                final int current = digits[i];
            }
            builder.append(digits[i]).append(",");
        }
        final long i = Long.parseLong(builder.toString().replaceAll(",", ""));
        number = i + 1;
        final String[] split = String.valueOf(number).split("");
        int[] result = new int[split.length];
        for (int j = 0; j < split.length; j++) {
            result[j] = Integer.parseInt(split[j]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new OnePlus().solution(new int[]{9,8,7,6,5,4,3,2,1,9})));
    }

    public int[] solution(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
