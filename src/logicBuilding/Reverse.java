package logicBuilding;

public class Reverse {
    static int reverse(int n){
        int rev = 0;
        int digit;
        while (n>0){
            digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num =  1234;
        System.out.println(reverse(num));
    }
}
