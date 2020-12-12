package stack;

public class stack {
    int[] nodes;
    int top;


    stack() {
        top = 0;
        nodes = new int[5];
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray();

        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
//        stackArray.push(6);
        stackArray.pop();

        stackArray.print();
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean isFull() {
        return top == 5;
    }

    void push(int data) {
        // check if stack is full if not then increment the top element.
        if (isFull()) {
            return;
        }
        nodes[top++] = data;
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
            return nodes[--top];
        }
    }
}
