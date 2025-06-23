package arrays;

// Reverse an array using temporary array

public class Reverse1 {
    static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
            temp[i] = arr[n- i-1];
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };
        reverseArray(arr);
        for (int j : arr) System.out.print(j + " ");
    }
}