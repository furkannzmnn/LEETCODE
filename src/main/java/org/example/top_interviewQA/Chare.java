package org.example.top_interviewQA;

// Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
public class Chare {
    public int titleToNumber(String columnTitle) {

        int value = 0;for (int i = 0; i < columnTitle.length(); i++) {
            int result = columnTitle.charAt(i) - 64;
            value += Math.pow(26, columnTitle.length() - i - 1) * result;
        }
        return value;

    }

    public static void main(String[] args) {
        System.out.println(new Chare().titleToNumber("ZAAAAAAAAAAAXXXXSSAASASZZY"));
    }
}
