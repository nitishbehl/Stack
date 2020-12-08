package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class searchExpression {
    public static void main(String[] args) {
        //create a pattern to be searched
        Pattern pattern = Pattern.compile("ge*");

        //search above pattern in geeksforgeeks.org
        Matcher m = pattern.matcher("geeksforgeeks.org");

        //print starting and ending indexes
        while(m.find()){
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end()-1));
        }
    }
}
