package org.example;

import java.util.*;

public class FindMax {
    public int findMaxK(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int i : nums) {
            unique.add(i);
        }
        List<Integer> arr = new ArrayList<>();
        unique
                .forEach(current -> {
                    final boolean isNegativeEqual = unique.contains(-1 * current);
                    if (isNegativeEqual) {
                        arr.add(current);
                    }
                });
        return arr.isEmpty() ? -1 : Collections.max(arr);
    }

    public static void main(String[] args) {
        int[] a = {-9, -43, 24, -23, -16, -30, -38, -30};
        final int maxK = new FindMax().findMaxK(a);
        System.out.println(maxK);
    }
}
