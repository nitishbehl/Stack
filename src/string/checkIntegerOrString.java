package string;
//integer
//Every element should be a valid digit, i.e '0-9'.

//string
//Any one element should be an invalid digit, i.e any symbol other than '0-9'.
public class checkIntegerOrString {
    public static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) == false) {//determines whether a specified character is a digit or not
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "6789.0";
        if (isNumber(str)) {
            System.out.println("integer");
        } else {
            System.out.println("string");
        }
    }
}
