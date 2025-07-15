package logicBuilding;

public class Fibonacci {
    static int nthFibonacci(int n){
        if (n <= 1) return n;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
    public static void main(String[] args){
        int n = 5;
        int result = nthFibonacci(n);
        System.out.println(result);
    }
}
