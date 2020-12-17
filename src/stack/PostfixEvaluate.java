package stack;

import java.util.Stack;

public class PostfixEvaluate {
    public static int postfixEvaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char input = expression.charAt(i);
            // if stack character is operand than push it into the stack
            if (Character.isDigit(input)) {
                stack.push(input - '0');
            }

            // if character is operator pop two element from stack and apply operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (input) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "231*+9-";
        System.out.println("postfix evaluation: " + postfixEvaluate(exp));
    }
}

