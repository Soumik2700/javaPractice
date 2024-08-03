package Recursion;

public class xPowerNp2 {

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        }
        // if power is even
        if (n % 2 == 0) {
            return calPower(x, n / 2) * calPower(x, n / 2);
        }
        // if power is odd
        else {
            return calPower(x, n / 2) * calPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
