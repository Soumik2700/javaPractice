package Recursion;

public class Factorial {

    public static void printFactorial(int i, int n, int fac) {
        if (i == n) {
            fac *= i;
            System.out.println(fac);
            return;
        }
        fac *= i;
        printFactorial(i - 1, n, fac);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printFactorial(5, 1, 1);
    }
}
