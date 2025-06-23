package arrays;

// Reverse an array using Recursion

public class Reverse3 {
    static void reverseArrayRec(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArrayRec(arr, l + 1, r - 1);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        int n = arr.length;
        reverseArrayRec(arr, 0, n - 1);
        for (int j : arr) System.out.print(j + " ");
    }
}