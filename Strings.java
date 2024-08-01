import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name and last name: ");
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName + lastName;
        String sentance = "My name is Soumik Sinha";

        // if (firstName.compareTo(lastName) == 0) {
        // System.out.print("Strings are equal");
        // } else {
        // System.out.print("Strings are not equal");
        // }

        // System.out.println("Testing chatAt: ");
        // for (int i = 0; i < fullName.length(); i++) {
        // System.out.println(i + ". " + fullName.charAt(i));
        // }

        // String name = sentance.substring(11, sentance.length());
        // System.out.print(name);
    }
}