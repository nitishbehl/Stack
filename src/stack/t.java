package stack;



import java.util.Stack;

public class t {

    public static String removeDuplicates(String S) {
        if (S.isEmpty()) return S;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char input = S.charAt(i);
            if (stack.isEmpty()) {
                stack.push(input);
            } else {
                char topElement = stack.peek();
                if (input == topElement) {
                    stack.pop();
                } else {
                    stack.push(input);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));

    }
}