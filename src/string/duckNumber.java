package string;

//A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers
public class duckNumber {
    public static boolean checkDuck(String num) {
        int i = 0, n = num.length();

        //ignore leading zeros
        while (i < n && num.charAt(i) == '0') {
            i++;
        }

        //checking remaining digits
        while (i < n) {
            if (num.charAt(i) == '0') {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String args[]) {
        String num = "1023";
        if (checkDuck(num))
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }

}
