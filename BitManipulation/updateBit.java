package BitManipulation;

import java.util.Scanner;

public class updateBit {

    public static String toBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static int clearBit(int bitMask, int decimal) {
        int notbitMask = ~(bitMask);
        return decimal & notbitMask;
    }

    public static int setBit(int decimal, int bitMask) {
        return decimal | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        int decimal = sc.nextInt();
        String binary = toBinary(decimal);

        System.out.print("Binary representation of -> " + binary);

        System.out.println();

        System.out.print("Enter operation (0/1): ");
        int operation = sc.nextInt();

        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        if (operation == 0) {
            System.out.print("for 0 output is: " + clearBit(bitMask, decimal));
            System.out.println();
            String binary2 = Integer.toBinaryString(clearBit(bitMask, decimal));
            System.out.print("binary of " + clearBit(bitMask, decimal) + " is " + binary2);
        } else {
            System.out.print("for 1 output is: " + setBit(decimal, bitMask));
            System.out.println();
            String binary2 = Integer.toBinaryString(setBit(decimal, bitMask));
            System.out.print("binary of " + setBit(decimal, bitMask) + " is " + binary2);
        }

    }
}
