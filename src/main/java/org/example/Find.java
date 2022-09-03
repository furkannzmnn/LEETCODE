package org.example;

import java.util.Arrays;

public class Find {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println(new Find().findMin(new int[]{4,5,6,7,0,1,2}));
    }
}
