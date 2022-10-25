package org.example.top_interviewQA;

public class Climbing {

    public int climbStairs(int n) {
            if (n == 0) {
                return 0;
            }

            if (n == 1) {
                return 1;
            }

            if (n == 2) {
                return 2;
            }

            return climbStairs(n - 1) +  climbStairs(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(new Climbing().climbStairs(44));
    }
}
/*
           1
          2 2
        3  3  3
 */
