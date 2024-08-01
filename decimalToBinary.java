import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        int decimal = sc.nextInt();

        // converting decimal to binary
        String binary = Integer.toBinaryString(decimal);
        System.out.print("Binary conversion of " + decimal + " is " + binary);
    }
}
