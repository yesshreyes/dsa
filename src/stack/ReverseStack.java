package stack;

import java.util.Stack;

public class ReverseStack {

    public static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            int a = s.pop();
            insertAtBottom(s, x);
            s.push(a);
        }
    }
    public static void reverse(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            reverse(s);
            insertAtBottom(s, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
