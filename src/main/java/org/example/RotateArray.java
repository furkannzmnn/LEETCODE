package org.example;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
            final int[] clone = nums.clone();
            for (int j = 0; j < nums.length; j++) {
                int newIdx = (j + k )% nums.length;
                nums[newIdx] = clone[j];
        }
    }

    public static void main(String[] args) {
        final RotateArray rotateArray = new RotateArray();
        int[] arr = {1,2,3,4,5,6,7};
        rotateArray.rotate(arr, 3);
    }
}
