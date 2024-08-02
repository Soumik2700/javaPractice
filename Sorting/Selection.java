package Sorting;

import java.util.Scanner;

public class Selection {

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array range: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.print("sorted array: ");
        selectionSort(arr);
    }
}
