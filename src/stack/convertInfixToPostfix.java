package stack;

import java.util.Stack;

public class convertInfixToPostfix {
    public static int precedence(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            case '(', ')' -> 4;
            default -> -1;
        };
    }

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> Stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char input = expression.charAt(i);

            if (precedence(input) > 0) {
                while (!Stack.isEmpty() && precedence(Stack.peek()) >= precedence(input)) {
                    result.append(Stack.pop());
                }
                Stack.push(input);
            } else if (input == ')') {
                char x = Stack.pop();
                while (x != '(') {
                    result.append(x);
                    x = Stack.pop();
                }
            } else if (input == '(') {
                Stack.push(input);
            } else {
                result.append(input);
            }
        }
        for (int i = 0; i <= Stack.size(); i++) {
            result.append(Stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String expression = "A+B*(C^D-E)";
        System.out.println("infix expression  " + expression);
        System.out.println("postfix expression  " + infixToPostfix(expression));
    }

}
