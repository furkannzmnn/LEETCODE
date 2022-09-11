package org.example;

import java.util.Arrays;

public class MoveToZero {
    private static final byte SECTION = 0;

    public void moveZeroes(int[] nums) {

        int pointerOne = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != SECTION && nums[pointerOne] == SECTION) {
                int temp = nums[i];
                nums[i] = nums[pointerOne];
                nums[pointerOne] = temp;
            }

            if (nums[pointerOne] != SECTION) {
                pointerOne++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        new MoveToZero().moveZeroes(arr);
    }
}
