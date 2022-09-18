package org.example;

public class Reverseddigit {
    public int reverse(int x) {
        boolean isNegative = false;
        final String of = String.valueOf(x);
        StringBuilder tempDigit = new StringBuilder();
        for (int i = 0; i < of.length(); i++) {
            final char at = of.charAt(of.length() - i - 1);
            if (at == '-') {
                isNegative = true;
                break;
            }
            tempDigit.append(at);
        }

        if (Long.parseLong(tempDigit.toString())  > Integer.MAX_VALUE) {
            return 0;
        }


        return isNegative ?  Integer.parseInt("-" + tempDigit.toString()) : Integer.parseInt(tempDigit.toString());
    }

    public static void main(String[] args) {
        System.out.println(new Reverseddigit().reverse(1534264692));
    }
}
