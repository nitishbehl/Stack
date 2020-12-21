package stack;

import java.util.Stack;

public class ReverseWords {
    public static void reverseWords(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) != ' ') {
                stack.push(str.charAt(i));
                // When we see a space, we print contents of stack.
            } else {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        // Since there may not be space after
        // last word.
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        String str = "Hello World";
        reverseWords(str);
    }
}

