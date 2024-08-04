package Recursion;

public class Occurrence {
    static int first = -1;
    static int last = -1;

    public static void fistAndLastOccr(String strn, int index) {
        if (index == strn.length()) {
            System.out.println("First occurrence od a is: " + first);
            System.out.println("last occurrence od a is: " + last);
            return;
        }
        if (strn.charAt(index) == 'j') {
            if (first == -1) {
                first = index;
            }
            last = index;
        }
        fistAndLastOccr(strn, index + 1);
    }

    public static void main(String[] args) {
        String strn = "sjakjvavgjvakadvakj";
        fistAndLastOccr(strn, 0);
    }
}
