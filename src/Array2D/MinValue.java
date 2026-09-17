package Array2D;

public class MinValue {
    public static void main(String[] args) {

        // Min value
        int arr[][] = {{2, 3, 5}, {7, 8, 9}};

        int minValue = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minValue) {
                    minValue = arr[i][j];
                }
            }
        }

        System.out.println(minValue);
    }
}