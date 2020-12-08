package stack;

public class StackArray {
    int[] nodes;
    int top;

    public StackArray(int[] nodes) {
        this.nodes = nodes;
    }

    StackArray() {
        top = 0;
        nodes = new int[5];
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean isFull() {
        return top == 5;
    }

    void push(int data){
        // check if stack is full if not then increment the top element.
        if (isFull()){
            return;
        }
        nodes[top++]=data;
    }

    private void print(){
        while (!isEmpty()){
            System.out.println(pop());
        }
    }


    int pop(){
        if (isEmpty()){
            return -1;
        }else {
            return nodes[--top];
        }
    }
    public static void main(String[] args) {
        StackArray stackArray=new StackArray();

        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
//        stackArray.push(6);
        stackArray.pop();

        stackArray.print();


    }




}