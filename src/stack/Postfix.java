package stack;

import java.util.Stack;

public class Postfix {
    static class Solution {
        public int evaluate(String[] arr) {
            Stack<Integer> stack = new Stack<>();

            for (String token : arr) {
                if (isOperator(token)) {
                    int b = stack.pop();
                    int a = stack.pop();
                    int result = applyOperation(a, b, token);
                    stack.push(result);
                } else {
                    stack.push(Integer.parseInt(token));
                }
            }

            return stack.pop();
        }

        private boolean isOperator(String token) {
            return "+-*/".contains(token);
        }

        private int applyOperation(int a, int b, String op) {
            return switch (op) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default -> throw new IllegalArgumentException("Invalid operator: " + op);
            };
        }
    }

}
