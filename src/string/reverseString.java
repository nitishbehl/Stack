package string;

import java.lang.*;
import java.io.*;
import java.util.*;

// by stringBuilder method
//public class reverseString {
//    public static void main(String[] args) {
//        String input = "Geeks For Geeks";
//        StringBuilder input1 = new StringBuilder();
//        input1.append(input);
//        input1 = input1.reverse();
//        System.out.println(input1);
//    }
//}

// convert string to character array
public class reverseString {
    public static void main(String[] args) {
        String input = "GeekS For Geek";
        char[] ch = input.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }
    }
}


