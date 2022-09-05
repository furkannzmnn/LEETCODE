package org.example;

import java.util.Arrays;

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
       return Arrays.binarySearch(nums, target);
    }

    public int search(int start, int end, int target, int[] nums) {
        if (start > end) {
            return start;
        }

        int mid = (start + end) / 2;

        if(nums[mid]==target){
            return mid;
        }
        else if (nums[mid] < target) {
            return search(mid + 1, end, target, nums);
        }else {
            return search(start, mid - 1, target, nums);
        }
    }

    public static void main(String[] args) {
        final int i = new InsertPosition().searchInsert(new int[]{1}, 0);
        System.out.println(i);
    }
}
