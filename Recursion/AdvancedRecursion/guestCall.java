//find the paths to call the guests
package Recursion.AdvancedRecursion;

public class guestCall {
    public static int callPaths(int n) {
        if (n <= 1) {
            return 1;
        }
        // for single call
        int singleCallPaths = callPaths(n - 1);
        // for paring call
        int paringCallPaths = (n - 1) * callPaths(n - 2);

        return singleCallPaths + paringCallPaths;
    }

    public static void main(String[] args) {
        int totalPaths = callPaths(4);
        System.out.println(totalPaths);
    }
}
