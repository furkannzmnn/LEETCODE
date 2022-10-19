package org.example;

public class PerfectSquare {

    public boolean isPerfectSquare(int num) {
        // 16 -> 4;
        final Double sqrt = Math.sqrt(num);

        try {
            Integer.valueOf(sqrt.intValue());
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PerfectSquare().isPerfectSquare(14));
    }
}
