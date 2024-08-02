package Recursion;

public class factorialMethod2 {
    public static int calFac(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int nextVal = calFac(n - 1);
        int val = n * nextVal;
        return val;
    }

    public static void main(String[] args) {
        int n = 5;
    }

}
