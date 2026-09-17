package Arrays;

public class MinValue {
    public static void main(String[] args) {

        // Find the minimum value in array
        int arr[] = {3, 5, 7, 89, 10};
        int n = arr.length;

        int minValue = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println(minValue);
    }
}