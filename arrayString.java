import java.util.Scanner;

public class arrayString {
    public static void displayArrayElement(int size, String names[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the names : ");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        for (int j = 0; j < names.length; j++) {
            System.out.println("Here is the names : " + names[j]);
        }
    }

    public static void linearSearchArrayElement(int size, String names[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name you want to search: ");
        String x = sc.next();
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(x)) {
                System.out.print(x + " found at index no " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.print("Cannot found " + x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        displayArrayElement(size, names);
        linearSearchArrayElement(size, names);
    }
}
