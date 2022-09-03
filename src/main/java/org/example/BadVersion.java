package org.example;

public class BadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid =  left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean isBadVersion(int n) {
        int bad = 11;
        if (n >= bad) {
            System.out.println("is bad version");
            return true;
        }
        else {
            System.out.println("is good version");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new BadVersion().firstBadVersion(100));
    }
}
