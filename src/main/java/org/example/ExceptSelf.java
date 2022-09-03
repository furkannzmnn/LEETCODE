package org.example;

import java.util.Arrays;

public class ExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int prod = 1;
        for(int i = 0; i < nums.length; i++) {
            arr[i] = prod;
            prod*=nums[i];
        }
        prod = nums[nums.length-1];
        for(int i = arr.length-2; i >=0 ; i--) {
            arr[i]*=prod;
            prod*=nums[i];
        }


        return arr;
    }

    public static void main(String[] args) {
        final ExceptSelf exceptSelf = new ExceptSelf();
        int[] a = {2, 1, 3, 1,6};

        // [18, 36, 12, 36, 6]

        System.out.println(Arrays.toString(exceptSelf.productExceptSelf(a)));
    }
}
