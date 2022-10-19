package org.example;

public final class NimGame {

    public boolean canWinNim(int n) {
        return extracted2(extracted(n));
    }

    private static boolean extracted(int n) {
        return extracted2(extracted1(n % 4 != 0));
    }

    private static boolean extracted1(boolean n) {
        return extracted2(extracted(n));
    }

    private static boolean extracted(boolean n) {
        return extracted2(n);
    }

    private static boolean extracted2(boolean n) {
        return n;
    }

    public static void main(String[] args) {
        NimGame nimGame = new NimGame();
        System.out.println(nimGame.canWinNim(4));
    }

}
