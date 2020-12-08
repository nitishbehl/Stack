package stack;

public class StackLinkedList {

    Node top;

    public StackLinkedList() {
        this.top = null;
    }

    void push(int value) {
        if (top == null) {
            top = new Node(value);
        } else {
            Node currNode = top;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new Node(value);
        }
    }

    int pop() {
        int value = top.item;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }

    private void print() {
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();
    }
}