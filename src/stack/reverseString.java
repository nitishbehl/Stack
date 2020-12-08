package stack;

import java.util.Stack;

public class reverseString {
    public static String reverse(String s) {
        char[] charArr = s.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            stack.push(charArr[i]);
            for (i = 0; i < s.length(); i++) {
                charArr[i] = (char) stack.pop();
            }
        }
        return String.valueOf(charArr);
    }

    public static void main(String[] args) {
        System.out.println(reverse("GeeksForGeeks"));
    }

}
