//Algorithm for Prefix to Infix:
//
//        Read the Prefix expression in reverse order (from right to left)
//        If the symbol is an operand, then push it onto the Stack
//        If the symbol is an operator, then pop two operands from the Stack
//        Create a string by concatenating the two operands and the operator between them.
//        string = (operand1 + operator + operand2)
//        And push the resultant string back to Stack
//        Repeat the above steps until end of Prefix expression.


package stack;

import java.util.Stack;

public class prefixToInfix {
    static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    public static String conversion(String str) {
        Stack<String> stack = new Stack<>();

        //find length of expression
        int length = str.length();

        //read from right to left
        for (int i = length - 1; i >= 0; i--) {
            char input = str.charAt(i);
            if (isOperator(input)) {
                String s1 = stack.pop();
                String s2 = stack.pop();

                //contacting the operand and  operator
                String temp = "(" + s1 + input + s2 + ")";
                stack.push(temp);
            } else {
                // to make character to string
                //push resultant string back to stack
                stack.push(input + " ");
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*-A/BC-/AKL";
        System.out.println("Infix is " + conversion(exp));
    }
}
