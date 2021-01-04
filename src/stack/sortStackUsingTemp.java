package stack;

import java.util.Stack;

public class sortStackUsingTemp {
    // this function returns the sorted stack
    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> stack = new Stack<>();
        // if the input array is not empty then pop the peek element in the temp stack
        while (!input.isEmpty()) {
            int temp = input.pop();

            //while temp stack is not empty  and top of the stack is greater then temp
            while (!stack.isEmpty() && stack.peek() > temp) {

                //pop from temp stack and push it to the input stack
                input.push(stack.pop());
            }
            //otherwise push it to the temp of the stack
            stack.push(temp);
        }
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        System.out.println("input:" + input);
        System.out.print("sorted elements are " + sortStack(input));


    }

}
