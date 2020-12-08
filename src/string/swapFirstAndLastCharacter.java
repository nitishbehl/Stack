package string;

public class swapFirstAndLastCharacter {
    public static String count(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            // k stores the index of first character and i stores the index of last character
            int k = i;
            while (i < ch.length && ch[i] != ' ')
                i++;
            char temp = ch[k];
            ch[k] = ch[i - 1];
            ch[i - 1] = temp;
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "geeks for geeks";
        System.out.println(count(str));
    }
}
