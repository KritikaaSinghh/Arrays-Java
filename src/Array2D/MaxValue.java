package Array2D;

public class MaxValue {
    public static void main(String[] args) {

        // Max value

        int arr[][] = {{2, 3, 5}, {7, 8, 9}};

        int maxValue = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }

        System.out.println(maxValue);
    }
}