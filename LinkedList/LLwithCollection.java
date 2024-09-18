package LinkedList;

import java.util.LinkedList;

public class LLwithCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("my");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("first");
        list.addLast("linked");
        list.addLast("list");

        int size = list.size();

        System.out.println(list);
        System.out.println("size of the list = " + size);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
        System.out.println("Size of the list = " + list.size());

        list.remove(2);
        System.out.println(list);
        System.out.println("Size of the list = " + list.size());

    }
}
