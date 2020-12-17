package stack;

import java.util.Stack;

public class NextSmallerElement {
    int top;
    int[] nodes;
    int capacity = 10;


    NextSmallerElement() {
        top = 0;
        nodes = new int[capacity];
    }

    public static void nse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            }
            while (!stack.isEmpty() && stack.peek() > arr[i]) {
                System.out.println(stack.peek() + " -> " + arr[i]);
                stack.pop();
            }
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> " + -1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 13, 21, 3};
        nse(arr);


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
