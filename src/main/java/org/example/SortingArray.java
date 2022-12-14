package org.example;

import java.util.Arrays;

public class SortingArray {
    public int[] sortedSquares(int[] nums) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i] * nums[i];
        }
        Arrays.sort(newArr);
        return newArr;
    }
}
