package stack;

import java.util.Stack;

public class ReverseUsingRecursion {
    public static void insert(Stack<Integer> st, int x) {
        if (st.empty()) {
            st.push(x);
        } else {
            int a = st.peek();
            st.pop();
            insert(st, x);
            st.push(a);
        }
    }

    public static void reverse(Stack<Integer> st) {
        if (!st.empty()) {
            int var = st.peek();
            st.pop();
            reverse(st);
            insert(st, var);
        }
    }

    public static void main(String[] arg) {
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println(s1);
        reverse(s1);
        System.out.println(s1);

    }
}
