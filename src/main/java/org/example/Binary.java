package org.example;

public class Binary {
    public int search(int[] nums, int target) {
        int left = 1;
        int right = target;
        while (left < right) {

            int mid = left + (right - left) / 2;
            if (nums[left] == target) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
