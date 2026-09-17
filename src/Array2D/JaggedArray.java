package Array2D;

public class JaggedArray {
    public static void main(String[] args) {

        // Jagged array -> different rows have different columns

        int[][] arr = {
                {1, 2},
                {2, 3, 4, 5},
                {3, 4, 5, 6, 7},
                {4}
        };

        int a = arr.length;

        for (int i = 0; i < a; i++) {
            int b = arr[i].length;

            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}