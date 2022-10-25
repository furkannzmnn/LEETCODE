package org.example.top_interviewQA;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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

    public static void main(String[] args) {

        AbstractList<Integer> list = new ArrayList<>();
        list.add(1);


    }

    public static void timeArrayList(long startTime , long endTime) {
        long time = endTime - startTime;
        System.out.println("time for arraylist: " + time);
    }

    public static void timeLinkedList(long startTime , long endTime) {
        long time = endTime - startTime;
        System.out.println("time for linkedlist: " + time);
    }
}
