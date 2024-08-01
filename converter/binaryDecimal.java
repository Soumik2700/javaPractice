package converter;

import java.util.Scanner;

public class binaryDecimal {
    public static int binaryToDecimal(String binaryStr) {
        try {
            return Integer.parseInt(binaryStr, 2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number");
            return -1;
        }
    }

    public static String decimalToBinary(int decimalNum) {
        return Integer.toBinaryString(decimalNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();
        int decimal = binaryToDecimal(binaryStr);
        if (decimal != -1) {
            System.out.println("Binary to Decimal: " + binaryStr + " -> " + decimal);
        }

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNum = scanner.nextInt();
        String binary = decimalToBinary(decimalNum);
        System.out.println("Decimal to Binary: " + decimalNum + " -> " + binary);

        scanner.close();
    }
}
