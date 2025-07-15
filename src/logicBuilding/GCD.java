package logicBuilding;

public class GCD {
    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println(gcd(a, b));
    }
}
