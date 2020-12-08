package string;

public class nearestApprox {
    public static int round(int n) {
        // Smaller multiple
        int a = (n / 10) * 10;
        //larger multiple
        int b = a + 10;
        if (n - a > b - n) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        int n = 4722;
        System.out.println(round(n));
    }

}
