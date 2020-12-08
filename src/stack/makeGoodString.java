package stack;

import java.util.Stack;

public class makeGoodString {
    public static String makeGood(String s) {
        if (s.isEmpty()) return s;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);
            if (!stack.isEmpty() && Math.abs(stack.peek() - input) == 32) {
                stack.pop();
            } else {
                stack.push(input);
            }


        }
        char[] res = new char[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            res[index--] = stack.pop();
        }
        return new String(res);


    }

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }

}

//ascii va;ue of a = 97 and A = 65
// 97-65 =32
