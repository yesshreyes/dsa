package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Factorial {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 2; i <= n; i++) {
            multiply(result, i);
        }
        Collections.reverse(result);
        return result;
    }
    private static void multiply(ArrayList<Integer> result, int multiplier) {
        int carry = 0;
        for (int i = 0; i < result.size(); i++) {
            int product = result.get(i) * multiplier + carry;
            result.set(i, product % 10);
            carry = product / 10;
        }
        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> result = factorial(n);
        System.out.println(result);
    }
}