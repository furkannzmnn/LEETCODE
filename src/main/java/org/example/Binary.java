package org.example;

public class Binary {
    public int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length == 1 ? 1 : nums.length - 1;
        while (right >= left) {
            final int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] > target) {
                right = mid -1;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5};
        final Binary binary = new Binary();
        System.out.println(binary.search(arr, 5));

    }
}
