package BitManipulation;

import java.util.Scanner;

public class setBit {

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static void restOperations(int decimal) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position to set Bit Mask: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        int newNumber = decimal | bitMask;

        System.out.print("new number is :" + newNumber);

        String secondBinary = Integer.toBinaryString(newNumber);
        System.out.println();

        System.out.print("Binary of " + newNumber + " is " + secondBinary);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any decimal number: ");
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);

        System.out.print("Binary of " + decimal + " is " + binary);
        System.out.println();

        restOperations(decimal);

    }
}
