//Algorithm for Prefix to Postfix:
//
//        Read the Prefix expression in reverse order (from right to left)
//        If the symbol is an operand, then push it onto the Stack
//        If the symbol is an operator, then pop two operands from the Stack
//        Create a string by concatenating the two operands and the operator after them.
//        string = operand1 + operand2 + operator
//        And push the resultant string back to Stack
//        Repeat the above steps until end of Prefix expression.


package stack;

import java.util.Stack;

public class prefixToPostfix {
    public static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    public static String prefixToPostfix(String expression) {
        Stack<String> stack = new Stack<>();

        //length of the string
        int length = expression.length();

        //reading from right to left
        for (int i = length - 1; i >= 0; i--) {
            //check if symbol is operator
            if (isOperator(expression.charAt(i))) {
                //pop two operand from the stack
                String s1 = stack.peek();
                stack.pop();
                String s2 = stack.peek();
                stack.pop();

                //concat the operand and operator
                String temp = s1 + s2 + expression.charAt(i);

                // push the string back to the stack
                stack.push(temp);
            }

            // if symbol is operand
            else {
                //push operand to the stack
                stack.push(expression.charAt(i) + "");
            }
        }
        //stack fave only postfix expression
        return stack.peek();
    }

    public static void main(String[] args) {
        String pre_exp = "*-A/BC-/AKL";
        System.out.println("Postfix is " + prefixToPostfix(pre_exp));
    }


}
