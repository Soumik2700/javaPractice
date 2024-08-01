import java.util.*;

public class functions {
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int a = sc.nextInt();
        System.out.print("Enter Multiplier:");
        int b = sc.nextInt();

        System.out.println("Product : " + multiplyNumbers(a, b));
    }
}