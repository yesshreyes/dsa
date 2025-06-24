package arrays;

import java.util.Arrays;

public class kthMinMax {
    static void findKthMinMax(int[] arr, int k) {
        Arrays.sort(arr);
        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];
        System.out.println(k + "th Minimum element: " + kthMin);
        System.out.println(k + "th Maximum element: " + kthMax);
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        findKthMinMax(arr, k);
    }
}