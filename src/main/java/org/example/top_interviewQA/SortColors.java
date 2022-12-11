package org.example.top_interviewQA;

import org.example.DublicateSortedList;

import java.util.*;

public class SortColors {
    public void sortColors(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                final int next = nums[j];
                final int current = nums[i];
                if (current > next) {
                    nums[i] = next;
                    nums[j] = current;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};
        new SortColors().sortColors(a);
    }
}
