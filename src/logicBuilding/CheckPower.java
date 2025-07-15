package logicBuilding;

public class CheckPower {
    public static boolean isPower(int x, long y) {
        if (x == 1)
            return (y == 1);

        long pow = 1;
        while (pow < y)
            pow *= x;

        return (pow == y);
    }
    public static void main(String[] args) {
        System.out.println(isPower(10, 1));
    }
}