package org.example.top_interviewQA;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MaxArray {

    @Contract(value = "_ -> new", pure = true)
    public static int @NotNull [] find(int @NotNull [] arr) {
        int max = 0;
        int min = 0;
        for (int current : arr) {
            if (current > max) {
                max = current;
            } else if (current < min) {
                min = current;
            }
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] a = {19,  2,  5, 9, 9 ,  0, 1,11, -1};
        int[] ints = find(a);
        System.out.println(Arrays.toString(ints));
    }


}
