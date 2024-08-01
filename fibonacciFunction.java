import java.util.Scanner;

public class fibonacciFunction {

    public static void executeFibonacci(int firstTerm, int secondTerm) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int term = sc.nextInt();

        System.out.print("Fibonacci Series : " + firstTerm + ' ' + secondTerm);

        for (int i = 3; i <= term; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        // sc.close();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first term:");
        int firstTerm = in.nextInt();
        System.out.print("Enter the second term:");
        int secondTerm = in.nextInt();

        executeFibonacci(firstTerm, secondTerm);
    }
}
