package stack;

public class twoStack {
    int[] node;
    int top1, top2;
    int capacity;

    twoStack(int capacity) {
        node = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    public static void main(String[] args) {

        twoStack ts = new twoStack(10);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());

        System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());
    }

    boolean isFull() {
        if (top1 == top2) {
            return true;
        }
        return false;
    }

    boolean isEmpty1() {
        if (top1 == -1) {
            return true;
        }
        return false;
    }

    boolean isEmpty2() {
        if (top1 == capacity) {
            return true;
        }
        return false;
    }

    //first stack
    void push1(int data) {
        // if array is full
        if (isFull()) {
            System.out.println("overflow");
        } else {
            node[++top1] = data;
        }
    }

    //second stack
    void push2(int data) {
        if (isFull()) {
            System.out.println("overflow");
        } else {
            node[--top2] = data;
        }
    }

    // pop from first stack
    int pop1() {
        if (isEmpty1()) {
            System.out.println("underflow");
        }
        return node[top1--];
    }

    //pop form second stack
    int pop2() {
        if (isEmpty2()) {
            System.out.println("overflow");
        }
        return node[top2++];
    }


}
