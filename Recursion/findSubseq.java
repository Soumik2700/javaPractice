package Recursion;

public class findSubseq {
    public static void subsequences(String strn, int index, String newString) {
        // base case
        if (index == strn.length()) {
            System.out.println(newString);
            return;
        }
        // creating another variable for current char
        char character = strn.charAt(index);
        // if current character adds to the new string
        subsequences(strn, index + 1, newString + character);
        // if current character do not adds to the new string
        subsequences(strn, index + 1, newString);
    }

    public static void main(String[] args) {
        // calling the recursive function to the new function.
        subsequences("abcd", 0, "");
    }
}
