package mergeAndQuick;

public class mergeSort {
    public static void conquerAproach(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1]; // Corrected the size of the merged array

        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        // for sorting and putting into the merged array
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        // for remaining elements in the left half
        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }

        // for remaining elements in the right half (fixed condition)
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }

        // copy sorted elements back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divideAproach(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divideAproach(arr, si, mid);
        divideAproach(arr, mid + 1, ei);

        conquerAproach(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        divideAproach(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
