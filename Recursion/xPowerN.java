package Recursion;

public class xPowerN {

    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        }
        int xPowerN = calculatePower(x, n - 1);
        int val = x * xPowerN;
        return val;
    }

    public static void main(String[] args) {
        int x = 3;
        int n = 5;
        int ans = calculatePower(x, n);
        System.out.println(ans);
    }
}
