package stack;

import java.util.Stack;

public class sortingStack {
    public static Stack<Integer> sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return null;
        }
        Stack<Integer> sortedStack = new Stack<Integer>();
        while (!stack.isEmpty()) {
            int currentData = stack.pop();
            while (!sortedStack.isEmpty() && sortedStack.peek() > currentData) {
                stack.push(sortedStack.pop());
            }
            sortedStack.push(currentData);
        }
        return sortedStack;

    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();
        input.push(5);
        input.push(10);
        input.push(15);
        input.push(11);
        input.push(7);

        System.out.println(sort(input));

    }

}
