package stack;

import java.util.Stack;

public class Reverse {
    class Solution {
        public String reverse(String s) {
            Stack<Character> stack = new Stack<>();

            for (char ch : s.toCharArray()) {
                stack.push(ch);
            }

            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            return reversed.toString();
        }
    }

}
