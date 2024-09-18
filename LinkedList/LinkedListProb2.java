package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Take input range from user
        System.out.println("Enter range start (1-50): ");
        int start = sc.nextInt();
        System.out.println("Enter range end (1-50): ");
        int end = sc.nextInt();
        System.out.println();

        // Add numbers to the linked list within the user-defined range
        for (int i = start; i <= end; i++) {
            list.add(i);
        }

        // Display the list before removal
        System.out.println("Original List: " + list);
        System.out.println();

        // Use iterator to safely remove elements greater than 25
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) > 25) {
                list.remove(i); // Removes the element at index i
            } else {
                i++; // Increment index only if element is not removed
            }
        }

        // Display the list after removal
        System.out.println("List after removing elements greater than 25: " + list);
    }
}
