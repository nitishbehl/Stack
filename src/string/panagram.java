package string;
// Given a string check if it is Pangram or not. A pangram is a sentence containing every
// letter in the English Alphabet.

public class panagram {
    public static boolean toCheckPanagram(String str) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            // upper case subtart a to find index

            // if we get uppercase character in a sentence the we have to subtract it from A  its ascii value - 65
            // and if we subtract it then we will get exact value or that uppercase character
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
                //for lowercase
                //same goes fro lower case character
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            else
                // If this character is other than english lowercase and uppercase characters.
                continue;
            mark[index] = true;
        }

        //return false if character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[index] == false)
                return false;
        //if all charcter are present
        return true;


    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        if (toCheckPanagram(str) == true) {
            System.out.print(str + " is a pangram.");
        } else {
            System.out.print(str + " is not a pangram.");
        }
    }

}
