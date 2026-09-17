package Array2D;

public class Arrays2D {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };

        // Accessing an element
        System.out.println(arr[3][1]);

        // Traversing 2D array
        int a = arr.length;
        int b = arr[0].length;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}