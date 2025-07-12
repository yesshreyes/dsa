package stack;

import java.util.Stack;

public class RedundantBrackets {
    static boolean checkRedundancy(String s) {

        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();

        for (char ch : str) {

            if (ch == ')') {
                char top = st.peek();
                st.pop();

                boolean flag = true;

                while (top != '(') {

                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        flag = false;
                    }

                    top = st.peek();
                    st.pop();
                }

                if (flag) {
                    return true;
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }

    static void findRedundant(String s) {
        boolean res = checkRedundancy(s);
        if (res) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        String s = "((a+b))";
        findRedundant(s);
    }
}
