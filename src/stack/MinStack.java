package stack;


public class MinStack {
    int[] array;
    int[] minArray;
    int min = Integer.MAX_VALUE;
    int top;
    int capacity = 5;


    MinStack() {
        top = 0;
        array = new int[capacity];
        minArray = new int[capacity];
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(16);
        stack.push(15);
        stack.push(29);
        stack.push(19);
        stack.push(18);
        System.out.println(stack.getMin());
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
        array[top] = data;

        min = Math.min(data, min);
        minArray[top] = min;
        top++;
    }

    void print() {
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return array[--top];
        }
    }

    int getMin() {
        return minArray[--top];
    }
}
