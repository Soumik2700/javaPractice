import java.util.Scanner;

public class findPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range : ");
        int n = sc.nextInt();

        int count = 0;

        System.out.print("Prime numbers are: ");
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    ++count;
                }
            }
            if (count == 2) {
                System.out.print(i);
                System.out.print(' ');
                count = 0;
            } else {
                count = 0;
            }
        }
    }
}
