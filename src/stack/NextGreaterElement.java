package stack;

import java.util.Stack;

public class NextGreaterElement {
    int top;
    int[] nodes;
    int capacity = 10;


    NextGreaterElement() {
        top = 0;
        nodes = new int[capacity];
    }

    public static void nge(int[] array) {
        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (stack.isEmpty()) {
                stack.push(array[i]);
            }
            while (!stack.isEmpty() && stack.peek() < array[i]) {
                System.out.println(stack.peek() + " -> " + array[i]);
                stack.pop();
            }
            stack.push(array[i]);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop() + " -> " + -1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 13, 21, 3};
        nge(arr);
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean isFull() {
        return top == capacity;
    }

    void push(int data) {
        if (isFull()) {
            return;
        }
        nodes[top++] = data;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return nodes[--top];
        }
    }

}
