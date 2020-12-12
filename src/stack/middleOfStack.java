package stack;

public class middleOfStack {
    int top;
    StackNode middle;
    StackNode last;
    boolean flag;

    middleOfStack() {

        top = 0;
        middle = null;
        last = null;
        flag = false;//for even
    }

    public static void main(String[] args) {
        middleOfStack LinkedList = new middleOfStack();

        LinkedList.push(1);
        LinkedList.push(2);
        LinkedList.push(3);
        LinkedList.push(4);
        LinkedList.push(5);
        LinkedList.push(6);
        LinkedList.print();
        System.out.println("Middle Element is " + LinkedList.getMiddle());
    }

    void push(int data) {
        StackNode newNode = new StackNode();
        newNode.data = data;
        if (last == null) {

            last = newNode;
            middle = newNode;
            flag = true;
        } else {
            StackNode temp = last;
            last = newNode;
            temp.next = newNode;
            newNode.previous = temp;
            flag = !flag;

            if (flag) {
                middle = middle.next;
            }
        }
    }

    void print() {
        StackNode temp = last;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.previous;
        }
    }

    int getMiddle() {
        return middle.data;
    }

    static class StackNode {
        int data;
        StackNode next;
        StackNode previous;

        StackNode() {
            previous = null;
            next = null;
        }
    }
}
