package arrays;

import java.util.HashMap;
import java.util.Map;

public class Subset {
    public static boolean isSubset(int[] a, int[] b) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            if (!freq.containsKey(num) || freq.get(num) == 0) {
                return false;
            }
            freq.put(num, freq.get(num) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a, b));
    }

}
