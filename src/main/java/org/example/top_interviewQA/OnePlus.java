package org.example.top_interviewQA;

import java.util.Arrays;
import java.util.Locale;

public class OnePlus { // 3, 9 9,

    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            result[0] = 1;
            return result;
        }
        return Arrays.copyOfRange(result, 1, result.length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new OnePlus().solution(new int[]{1,2,34,5,6,6,77,7,77,7,7,7})));
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
