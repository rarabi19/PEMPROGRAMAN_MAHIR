package Rekursif;

public class faktorial3 {
    public static int getFaktorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFaktorial(f - 1);
        }
    }
    public static void main(String[] args) {
        int result = getFaktorial(20);
        System.out.println("20! = " + result);
    }
}
