package LinkedList;

import java.util.LinkedList;

public class LinkedListProb1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("5");
        list.add("7");
        list.add("3");
        list.add("8");
        list.add("2");
        list.add("3");

        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
            if (list.get(i) == "7") {
                index = i;
            }
        }

        System.out.println("null");
        System.out.println("7 is present and found at index " + index);
    }
}
