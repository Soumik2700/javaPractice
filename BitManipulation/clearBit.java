package BitManipulation;

import java.util.Scanner;

public class clearBit {
    public static String binaryConversion(int num, String inBinary) {
        return inBinary = Integer.toBinaryString(num);
    }

    public static int clearBit(int num, int notbitMask) {
        return num & notbitMask;
    }

    public static String secondBinaryConversion(int newNumber) {
        return Integer.toBinaryString(newNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any decimal number: ");
        int num = sc.nextInt();
        String inBinary = binaryConversion(num, null);
        System.out.println("In binary digits -> " + inBinary);

        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int notbitMask = ~(bitMask);
        int newNumber = clearBit(num, notbitMask);

        System.out.println("Decimal number is: " + newNumber);
        System.out.print("In binary digits -> " + secondBinaryConversion(newNumber));
    }
}
