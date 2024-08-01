import java.util.Scanner;

public class functionGCD {
    public static void calculateGcd(float a, float b) {
        while (a % b != 0) {
            float gcd = a % b;
            a = b;
            b = gcd;
        }
        System.out.print("GCD = " + b);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number to calculate GCD:");
        float a = sc.nextInt();
        float b = sc.nextInt();

        calculateGcd(a, b);
    }
}
