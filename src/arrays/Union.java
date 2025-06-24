package arrays;

import java.util.HashSet;

//Union using HashSet
public class Union {
    public static int doUnion(int[] a, int n, int[] b, int m) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++)
            s.add(a[i]);
        for (int i = 0; i < m; i++)
            s.add(b[i]);
        return s.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        System.out.println(doUnion(a, a.length, b, b.length));
    }
}
