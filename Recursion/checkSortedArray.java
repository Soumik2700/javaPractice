package Recursion;

public class checkSortedArray {
    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8 };
        System.out.println(isSorted(arr, 0));
    }
}