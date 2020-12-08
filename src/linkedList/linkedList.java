package linkedList;

public class linkedList {
    Node head; // head of the list

    // to create a list with tree node.
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        //  in this three nodes are allocated. dramatically.

        list.head.next = second;    // link of first node with second
        second.next = third;    // link of second node with third.

        list.push(5);
        list.insertAfter(list.head.next, 6);
        list.append(8);

        list.deleteNode(1);
        list.deleteNodeAtPosition(4);


        list.printList();
    }

    // insert a linked list in front of linked list
    public void push(int newData) {
        // make new node
        Node newNode = new Node(newData);
        // make next of new node as head
        newNode.next = head;
        // move head to new node
        head = newNode;
    }


    // add node at given point
    public void insertAfter(Node prevNode, int newData) {
        // check if node is null
        if (prevNode == null) {
            System.out.println("prevNode can not be null");
        }
        //  make a new node
        Node newNode = new Node(newData);
        // make next of new node as prev node
        newNode.next = prevNode.next;
        // make next of prev node as new node
        prevNode.next = newNode;
    }


    // add node at end
    public void append(int newData) {
        Node newNode = new Node(newData);
        // if linked list is empty then make new node as head
        if (head == null) {
            head = new Node(newData);
        }
        // this node is going to be last soo make next node as null
        newNode.next = null;

        // else traverse till last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // delete a node
    public void deleteNode(int key) {
        // store head node
        Node temp = head, prev = null;

        // if head node itself is the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next;    // change head
        }

        // search for the key to be delete. keep track of the previous node so that we need to
        // change the head(temp.next)
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // if key is not present in a linked list
        if (temp == null) {
            return;
        }
        //unlike node
        prev.next = temp.next;
    }

    // delete node at given position
    void deleteNodeAtPosition(int position) {
        // if linked list is empty
        if (head == null) {
            return;
        }
        // store head;
        Node temp = head;
        // if head needs to be remove
        if (position == 0) {
            head = head.next;   // change head
        }
        // find previous node of node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }


    // to print a list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    static class Node {   // inner class is made static so that main() can access it .
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } //constructor.
    }
}
