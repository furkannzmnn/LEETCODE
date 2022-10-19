package org.example;

import java.util.HashSet;
import java.util.Set;

public class Sqrt {
    public int removeDuplicates(int[] nums) {
        Set<Integer> sa = new HashSet<>();
        for (int num : nums) {
            sa.add(num);
        }

        return sa.size();
    }

    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Sqrt().removeDuplicates(a));
    }
}
