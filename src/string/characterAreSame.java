package string;

public class characterAreSame {
    public static boolean isCharacterSame(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aga";
        if (isCharacterSame(s)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
