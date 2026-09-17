package Arrays;

public class Multiplication {
    public static void main(String[] args) {

        int arr[] = {2, 4, 10, 50};
        int ans = 1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            ans = ans * arr[i];
        }

        System.out.println(ans);
    }
}