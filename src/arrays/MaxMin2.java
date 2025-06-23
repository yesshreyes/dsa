package arrays;

// Sorting

import java.util.Arrays;

public class MaxMin2 {

    static int[] getMinMax(int arr[], int n) {
        Arrays.sort(arr);
        return new int[]{ arr[0], arr[n - 1] };
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;

        int[] minmax = getMinMax(arr, arr_size);
        System.out.println("Minimum element is " + minmax[0]);
        System.out.println("Maximum element is " + minmax[1]);
    }
}
