package Recursion;

public class stringReverse {
    public static void revProcess(String strn, int index) {
        if (index == 0) {
            System.out.print(strn.charAt(index));
            return;
        }
        System.out.print(strn.charAt(index));
        revProcess(strn, index - 1);
    }

    public static void main(String[] args) {
        String strn = "SOUMIK";
        revProcess(strn, strn.length() - 1);
    }
}
