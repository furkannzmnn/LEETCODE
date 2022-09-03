package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class DublicateContains {

    private int hash;
    private int key;
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        final DublicateContains dublicateContains = new DublicateContains();
        int[] a = {2, 1, 3, 1,6};
        final boolean b = dublicateContains.containsDuplicate(a);
        System.out.println(b);
    }
}
