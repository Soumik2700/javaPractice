import java.util.Scanner;

public class stringtoInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        String strnum = sc.next();
        int num = Integer.parseInt(strnum);

        System.out.print("After adding 100 with it: " + (num + 100));
    }
}
