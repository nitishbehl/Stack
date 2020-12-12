package stack;

import java.util.Stack;

public class postfix {
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String toPostfix(String expression) {
        //initialize empty string for the output
        String result = new String(" ");

        // initialize empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char input = expression.charAt(i);

            // if scanned character is operand then push it into output
            if (Character.isLetterOrDigit(input)) {
                result = result + input;

                //if character is'(' push it to stack
            } else if (input == '(') {
                stack.push(input);

                //if scanned character is ')' pop it and output in stack until'(' is not encountered
            } else if (input == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    result = result + stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(input) <= precedence(stack.peek())) {
                    result = result + stack.pop();
                }
                stack.push(input);
            }

        }
        // pop aal the operator
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "invalid expression";
            result = result + stack.pop();

        }
        return result;


    }

    public static void main(String[] args) {
        String exp = "a+b*c-d/e";
        System.out.println(toPostfix(exp));
    }

}
