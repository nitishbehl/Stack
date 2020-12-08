package string;

public class findInitial {
    public static void findInitial(String name) {
        if (name.length() == 0) {
            return;
        }
        System.out.println(Character.toUpperCase(name.charAt(0)));
        // Traverse rest of the string and
        // print the characters after spaces.

        for (int i = 1; i < name.length() - 1; i++) {
            if (name.charAt(i) == ' ') {
                System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
            }
        }
    }

    public static void main(String args[]) {
        String name = "nitish behl";
        findInitial(name);
    }
}

