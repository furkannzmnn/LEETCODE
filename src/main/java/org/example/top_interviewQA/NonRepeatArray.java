package org.example.top_interviewQA;

import java.util.*;

public class NonRepeatArray {

    public int singleNumber(int[] nums) { // 1, 2, 1, 3, 1, 2

        Map<Integer, Integer> releationalMap = new HashMap<>();

        for (int current : nums) {
            releationalMap.merge(current, 1, (k, v) -> v + 1);
        }

        int index = 0;

        for (Map.Entry<Integer, Integer> each : releationalMap.entrySet()) {
            if (each.getValue() == 1) {
               return each.getKey();
            }
        }

        return 1;
    }

    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0, k; i < nums.length; i++) {
            k = nums[i];
            if (set.contains(k)) {
                set.remove(k);
            }else {
               set.add(k);
            }
        }
        return set.iterator().next();
    }

    public int solution3(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
