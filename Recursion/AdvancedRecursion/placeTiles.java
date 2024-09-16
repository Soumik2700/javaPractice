package Recursion.AdvancedRecursion;

public class placeTiles {
    public static int countPaths(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // placing vertically
        int countVertical = countPaths(n - m, m);
        // placing horizontally
        int countHorizontal = countPaths(n - 1, m);

        return countVertical + countHorizontal;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int totalPaths = countPaths(n, m);
        System.out.println(totalPaths);
    }
}
