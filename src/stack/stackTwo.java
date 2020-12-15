package stack;


public class stackTwo {
    int[] nodes;
    int top1;
    int top2;
    int capacity;

    stackTwo(int capacity) {
        top1 = -1;
        top2 = capacity;
        nodes = new int[capacity];
    }

    public static void main(String[] args) {
        stackTwo s1 = new stackTwo(10);
        s1.push1(5);
        s1.push2(10);
        s1.push2(15);
        s1.push1(11);
        s1.push2(7);

        System.out.println(s1.pop1());
        System.out.println(s1.pop2());


    }

    void push1(int data) {
        if (top1 == top2) {
            System.out.println("stack is overflow1");
        } else {
            nodes[++top1] = data;
        }

    }

    void push2(int data) {
        if (top1 == top2) {
            System.out.println("stack is overflow2");
        } else {
            nodes[--top2] = data;
        }
    }

    int pop1() {
        if (top1 == -1) {
            System.out.println("stack is underflow");
        }
        return nodes[top1--];
    }

    int pop2() {
        if (top1 == capacity) {
            System.out.println("stack is underflow");
        }
        return nodes[top2++];
    }

}
