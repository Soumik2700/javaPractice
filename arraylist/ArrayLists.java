package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> List1 = new ArrayList<String>();

        // adding elements to the list
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.print(list + " ");

        // get elements from the list
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(2, 12);
        System.out.println(list + " ");

        // set element
        list.set(0, 20);
        System.out.println(list + " ");

        // delete element
        list.remove(list.size() - 5); // list.size() this will generate the list size of 11 and the substract it with
                                      // 5 means 6 will be the index value and in this index the element is 5, so the
                                      // 5 will be removed.
        System.out.println(list + " ");

        // size of list
        int size = list.size();
        System.out.println("List size - " + size);

        // sorting in accending order
        Collections.sort(list);
        System.out.println(list);
    }
}
