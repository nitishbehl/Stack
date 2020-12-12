package stack;


public class linkedList {
    Node top;

    public linkedList() {
        this.top = null;
    }

    public static void main(String[] args) {
        linkedList stackLinkedList = new linkedList();

        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);

        stackLinkedList.print();
    }

    void push(int data) {
        if (top == null) {
            top = new Node(data);
        } else {
            Node currentNode = top;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
        }
    }

    int pop() {
        int value = top.item;
        top = top.next;
        return value;
    }

    private boolean isEmpty() {
        return top == null;
    }

    private void print() {
        while (!isEmpty()) {
            System.out.println(pop());
        }
    }
}
