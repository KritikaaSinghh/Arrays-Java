package Arrays;

public class MaxValue {

    public static void main(String[] args) {

        // Find the max value in array
        int arr[] = {3, 5, 7, 89, 10};
        int n = arr.length;

        int maxValue = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        System.out.println(maxValue);
    }
}