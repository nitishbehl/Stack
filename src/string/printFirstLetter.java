package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//\b matches on a word boundary, i.e., the previous or subsequent character is not a word character
//String group()	Returns the matched sequence captured by the previous match as the string.
public class printFirstLetter {
    public static void printFirst(String str) {
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String s1 = "Geeks for Geeks";
        String s2 = "A Computer Science Portal for Geeks";
        printFirst(s1);
        printFirst(s2);
    }

}
