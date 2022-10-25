package org.example.top_interviewQA;

import java.util.Arrays;

public class Majority {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] ar = {2,2,1,1,1,2,2};
        System.out.println(new Majority().majorityElement(ar));
    }
}
