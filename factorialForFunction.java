import java.util.Scanner;

public class factorialForFunction {
    public static int findFactorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        System.out.print("Factorial is : " + findFactorial(n));
    }
}
