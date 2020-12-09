package stack;

import java.util.Stack;

public class baseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("D")) {
                stack.push(stack.peek() * 2);
                sum = sum + stack.peek();
            } else if (ops[i].equals("C")) {
                sum = sum - stack.pop();
            } else if (ops[i].equals("+")) {
                int top = stack.peek();
                stack.pop();
                int second = stack.peek();
                stack.pop();
                int total = second + top;
                stack.push(second);
                stack.push(total);
                sum = sum + total;
            } else {
                stack.push(Integer.parseInt(ops[i]));
                sum = sum + stack.peek();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('5');
        stack.push('2');
        stack.push('C');
        stack.push('D');
        stack.push('+');

        System.out.println(stack);


    }
}


