package Array2D;

import java.util.Scanner;

public class TakingInputOutput {
    public static void main(String[] args) {

        // Taking input

        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Rows " + i + " Columns " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}