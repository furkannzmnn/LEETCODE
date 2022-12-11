package org.example.top_interviewQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Distcnit {

    public static int thirdMax(int[] nums) {
        List<Integer> integers = Arrays.stream(nums)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        int maxSection = 3;

        if (integers.size() < maxSection) {
            return integers.stream()
                    .max((Integer::compareTo))
                    .orElse(0);
        }else  {
            for (int i = 1; i <= maxSection; i++) {
                final Integer max = integers.stream()
                        .max((Integer::compareTo))
                        .orElse(0);
                if (i == 3) {
                    return max;
                }else  {
                    integers.remove(max);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,5,3,5};
        final int i = thirdMax(a);
        System.out.println(i);
    }
}
