package Array;

public class FindMaximum {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 10, 12 };

        int ans = maxArray(arr);
        System.out.print(ans);
    }

    static int maxArray(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
