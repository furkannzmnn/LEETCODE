package org.example;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int nowSum = numbers[left] + numbers[right];
            if (nowSum == target) {
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }
            if (nowSum > target) {
                right--;
            }else {
                left++;
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2,3,4}, 6)));
    }
}
