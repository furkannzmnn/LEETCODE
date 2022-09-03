package org.example;


import java.util.Arrays;
import java.util.HashMap;

public final class SellStock {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int max = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if (prices[i] <= min){
                min = prices[i];
                max = prices[i];
            }

            if(prices[i] > max){
                max = prices[i];
                if(profit < max - min)
                    profit = max - min;
            }
        }
        return profit;
    }

    private boolean isDecreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final SellStock sellStock = new SellStock();
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(sellStock.maxProfit(arr));
    }
}
