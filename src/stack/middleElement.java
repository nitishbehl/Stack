package stack;

// to ask(doubt)capacity issue
public class middleElement {
    public static void main(String[] arg) {
        stack s1 = new stack(4);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.print(s1.middle());

    }

    public static class stack {
        int top;
        int[] array;

        stack(int capacity) {
            top = 0;
            array = new int[capacity];
        }

        public void push(int x) {
            array[top++] = x;
        }

        public void display() {
            for (int i = top; i > 0; i--) {
                System.out.println(array[i]);
            }
        }

        public void pop() {
            System.out.println(array[top]);
            top--;
        }

        public int middle() {
            int size = array.length;
            if (size % 2 == 0) {
                return array[(size / 2)];
            } else {
                return array[((size + 1) / 2)];
            }
        }
    }
}
