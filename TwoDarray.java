import java.util.Scanner;

public class TwoDarray {
    // function to print the 2D array
    public static void doubleArray(int row, int col, int arr[][]) {

        System.out.println("2D array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // function to search the index of an array element
    public static void arraySearch(int arr[][], int row, int col) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value that you want to search : ");
        int val = sc.nextInt();
        System.out.print("Index value of the searched element is : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == val) {
                    System.out.print("( " + i + " , " + j + " )");
                }
            }
        }
    }

    // main function and calling here all the declaired functions
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.print("Enter 2D Array elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        doubleArray(row, col, arr);
        arraySearch(arr, row, col);
    }
}
