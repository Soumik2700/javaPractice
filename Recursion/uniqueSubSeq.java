package Recursion;

import java.util.HashSet;

public class uniqueSubSeq {
    public static void findSeq(String strn, int index, String newString, HashSet<String> set) {
        if (index == strn.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char character = strn.charAt(index);
        findSeq(strn, index + 1, newString + character, set);
        findSeq(strn, index + 1, newString, set);
    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        findSeq("aaa", 0, "", set);
    }
}
