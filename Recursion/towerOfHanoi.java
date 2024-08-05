package Recursion;

public class towerOfHanoi {

    public static void diskShift(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        diskShift(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        diskShift(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        diskShift(n, "S", "H", "D");
    }
}
