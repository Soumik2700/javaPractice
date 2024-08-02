package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonaccoSeries(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonaccoSeries(b, c, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1;
        System.out.println("Enter number of terms that you want: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        System.out.print(a + " ");
        System.out.print(b + " ");
        fibonaccoSeries(a, b, n - 2);
    }
}
