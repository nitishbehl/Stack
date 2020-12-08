package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class validNumber {
    public static void main(String[] args) {
        String input1 = "abc";
        String input2 = "1234";
        String regex = "[+-]?[0-9][0-9]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(input1);

        // if matches found and equal to input 1
        if (m.find() && m.group().equals(input1)) {
            System.out.println(input1 + " is valid integer");
        } else {
            System.out.println(input1 + " is not a valid integer");
        }

        m = pattern.matcher(input2);
        if (m.find() && m.group().equals(input2)) {
            System.out.println(input2 + " is valid integer");
        } else {
            System.out.println(input2 + " is not a valid integer");
        }

    }
}
