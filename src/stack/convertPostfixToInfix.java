package stack;

import java.util.Stack;

public class convertPostfixToInfix {
        static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') ||(x >= 'A' && x <= 'Z');
    }

    static String getInfix(String exp) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            // Push operands
            if (isOperand(exp.charAt(i))) {
                stack.push(exp.charAt(i) + "");
            }


            // when there is an operator.
            else {
                String s1 = stack.peek();
                stack.pop();
                String s2 = stack.peek();
                stack.pop();
                stack.push("(" + s2 + exp.charAt(i) + s1 + ")");
            }
        }

        // There must be a single element
        // in stack now which is the required
        // infix.
        return stack.peek();
    }

    public static void main(String[] args) {
        String exp = "ab*c+";
        System.out.println(getInfix(exp));
    }

}

